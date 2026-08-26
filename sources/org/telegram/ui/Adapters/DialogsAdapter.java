package org.telegram.ui.Adapters;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.ComponentDialog$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import com.google.android.gms.internal.mlkit_vision_common.zzkj;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda38;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.DialogMeUrlCell;
import org.telegram.ui.Cells.DialogsEmptyCell;
import org.telegram.ui.Cells.DialogsEmptyCell$$ExternalSyntheticLambda3;
import org.telegram.ui.Cells.DialogsHintCell;
import org.telegram.ui.Cells.DialogsRequestedEmptyCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.RequestPeerRequirementsCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda211;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda271;
import org.telegram.ui.Components.ArchiveHelp;
import org.telegram.ui.Components.BlurredRecyclerView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TextViewSwitcher;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.DialogsActivity$14$$ExternalSyntheticLambda1;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.TopicsFragment;

public class DialogsAdapter extends RecyclerListView.SelectionAdapter implements DialogCell.DialogCellDelegate {
    public static final boolean ALLOW_UPDATE_IN_BACKGROUND = BuildVars.DEBUG_PRIVATE_VERSION;
    public boolean allowForwardAsStories;
    public Drawable arrowDrawable;
    public boolean collapsedView;
    public final long communityId;
    public final int currentAccount;
    public int currentCount;
    public int dialogsCount;
    public boolean dialogsListFrozen;
    public int dialogsType;
    public final int folderId;
    public boolean forceShowEmptyCell;
    public boolean forceUpdatingContacts;
    public boolean hasChatlistHint;
    public boolean hasHints;
    public boolean isCalculatingDiff;
    public boolean isEmpty;
    public final boolean isOnlySelect;
    public boolean isReordering;
    public boolean isTransitionSupport;
    public long lastSortTime;
    public final Context mContext;
    public ArrayList onlineContacts;
    public long openedDialogId;
    public final DialogsActivity parentFragment;
    public final DialogsPreloader preloader;
    public TopicsFragment.AnonymousClass6 pullForegroundDrawable;
    public DialogsActivity.DialogsRecyclerView recyclerListView;
    public final TLRPC.RequestPeerType requestPeerType;
    public final ArrayList selectedDialogs;
    public boolean updateListPending;
    public ArrayList itemInternals = new ArrayList();
    public ArrayList oldItems = new ArrayList();
    public int stableIdPointer = 10;
    public final LongSparseIntArray dialogsStableIds = new LongSparseIntArray();
    public final HashMap dialogsHeaderStableIds = new HashMap();
    public int lastDialogsEmptyType = -1;

    public final class AnonymousClass1 extends DiffUtil {
        public final int $r8$classId;
        public Object this$0;
        public ArrayList val$newItems;

        public AnonymousClass1() {
            this.$r8$classId = 2;
        }

        @Override
        public final boolean areContentsTheSame(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    return ((ItemInternal) ((DialogsAdapter) this.this$0).oldItems.get(i)).viewType == ((ItemInternal) this.val$newItems.get(i2)).viewType;
                case 1:
                    return true;
                case 2:
                    AdapterWithDiffUtils.Item item = (AdapterWithDiffUtils.Item) this.val$newItems.get(i);
                    AdapterWithDiffUtils.Item item2 = (AdapterWithDiffUtils.Item) ((ArrayList) this.this$0).get(i2);
                    if (item.viewType != item2.viewType) {
                        return false;
                    }
                    return item.contentsEquals(item2);
                case 3:
                    return areItemsTheSame(i, i2);
                default:
                    return true;
            }
        }

        @Override
        public final boolean areItemsTheSame(int i, int i2) {
            TLRPC.TL_contact tL_contact;
            String str;
            switch (this.$r8$classId) {
                case 0:
                    ItemInternal itemInternal = (ItemInternal) ((DialogsAdapter) this.this$0).oldItems.get(i);
                    ItemInternal itemInternal2 = (ItemInternal) this.val$newItems.get(i2);
                    int i3 = itemInternal.viewType;
                    if (i3 != itemInternal2.viewType) {
                        return false;
                    }
                    TLRPC.Dialog dialog = itemInternal.dialog;
                    TLRPC.Dialog dialog2 = itemInternal2.dialog;
                    if (i3 == 0) {
                        if (dialog == null || dialog2 == null || dialog.id != dialog2.id || itemInternal.isFolder != itemInternal2.isFolder || itemInternal.isForumCell != itemInternal2.isForumCell || itemInternal.pinned != itemInternal2.pinned) {
                            return false;
                        }
                    } else if (i3 == 14) {
                        if (dialog == null || dialog2 == null || dialog.id != dialog2.id || dialog.isFolder != dialog2.isFolder) {
                            return false;
                        }
                    } else if (i3 == 4) {
                        TLRPC.RecentMeUrl recentMeUrl = itemInternal.recentMeUrl;
                        if (recentMeUrl == null || itemInternal2.recentMeUrl == null || (str = recentMeUrl.url) == null || !str.equals(str)) {
                            return false;
                        }
                    } else if (i3 == 6) {
                        TLRPC.TL_contact tL_contact2 = itemInternal.contact;
                        if (tL_contact2 == null || (tL_contact = itemInternal2.contact) == null || tL_contact2.user_id != tL_contact.user_id) {
                            return false;
                        }
                    } else if (i3 == 5) {
                        if (itemInternal.emptyType != itemInternal2.emptyType) {
                            return false;
                        }
                    } else if (i3 == 10) {
                        return false;
                    }
                    return true;
                case 1:
                    return ((Integer) this.val$newItems.get(i)).equals(((EmojiView.EmojiGridAdapter) this.this$0).rowHashCodes.get(i2));
                case 2:
                    AdapterWithDiffUtils.Item item = (AdapterWithDiffUtils.Item) this.val$newItems.get(i);
                    AdapterWithDiffUtils.Item item2 = (AdapterWithDiffUtils.Item) ((ArrayList) this.this$0).get(i2);
                    if (item.viewType != item2.viewType) {
                        return false;
                    }
                    return item.equals(item2);
                case 3:
                    return Objects.equals(this.val$newItems.get(i), ((RecyclerListView.SectionsAdapter) this.this$0).hashes.get(i2));
                default:
                    return ((Long) this.val$newItems.get(i)).equals(((SelectAnimatedEmojiDialog) this.this$0).rowHashCodes.get(i2));
            }
        }

        @Override
        public final int getNewListSize() {
            switch (this.$r8$classId) {
                case 0:
                    return this.val$newItems.size();
                case 1:
                    return ((EmojiView.EmojiGridAdapter) this.this$0).rowHashCodes.size();
                case 2:
                    return ((ArrayList) this.this$0).size();
                case 3:
                    return ((RecyclerListView.SectionsAdapter) this.this$0).hashes.size();
                default:
                    return ((SelectAnimatedEmojiDialog) this.this$0).rowHashCodes.size();
            }
        }

        @Override
        public final int getOldListSize() {
            switch (this.$r8$classId) {
                case 0:
                    return ((DialogsAdapter) this.this$0).oldItems.size();
                case 1:
                    return this.val$newItems.size();
                case 2:
                    return this.val$newItems.size();
                case 3:
                    return this.val$newItems.size();
                default:
                    return this.val$newItems.size();
            }
        }

        public AnonymousClass1(Object obj, ArrayList arrayList, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$newItems = arrayList;
        }
    }

    public final class AnonymousClass3 extends DialogsRequestedEmptyCell {
        public AnonymousClass3(Context context) {
            super(context);
        }
    }

    public final class DialogsPreloader {
        public final HashSet dialogsReadyMap = new HashSet();
        public final HashSet preloadedErrorMap = new HashSet();
        public final HashSet loadingDialogs = new HashSet();
        public final ArrayList preloadDialogsPool = new ArrayList();
        public final ComponentDialog$$ExternalSyntheticLambda1 clearNetworkRequestCount = new ComponentDialog$$ExternalSyntheticLambda1(this, 28);
    }

    public final class LastEmptyView extends FrameLayout {
        public boolean moving;

        public LastEmptyView(Context context) {
            super(context);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int currentActionBarHeight;
            int i3;
            DialogsAdapter dialogsAdapter = DialogsAdapter.this;
            int size = dialogsAdapter.itemInternals.size();
            int i4 = dialogsAdapter.folderId;
            boolean z = i4 == 0 && dialogsAdapter.dialogsType == 0 && MessagesController.getInstance(dialogsAdapter.currentAccount).dialogs_dict.get(DialogObject.makeFolderDialogId(1)) != null;
            View view = (View) getParent();
            int i5 = view instanceof BlurredRecyclerView ? ((BlurredRecyclerView) view).blurTopPadding : 0;
            boolean z2 = dialogsAdapter.collapsedView;
            int paddingTop = view.getPaddingTop();
            int paddingBottom = view.getPaddingBottom();
            int i6 = paddingTop - i5;
            if (i4 == 1 && size == 1 && ((ItemInternal) dialogsAdapter.itemInternals.get(0)).viewType == 19) {
                currentActionBarHeight = View.MeasureSpec.getSize(i2);
                if (currentActionBarHeight == 0) {
                    currentActionBarHeight = view.getMeasuredHeight();
                }
                if (currentActionBarHeight == 0) {
                    currentActionBarHeight = (AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                }
                if (dialogsAdapter.parentFragment.hasStories) {
                    currentActionBarHeight += AndroidUtilities.dp(81.0f);
                }
            } else if (size == 0 || (i6 == 0 && !z)) {
                currentActionBarHeight = 0;
            } else {
                int size2 = View.MeasureSpec.getSize(i2);
                if (size2 == 0) {
                    size2 = view.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                }
                int i7 = size2 - i5;
                int iDp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f);
                int iDp2 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    if (((ItemInternal) dialogsAdapter.itemInternals.get(i8)).viewType == 0) {
                        if (!((ItemInternal) dialogsAdapter.itemInternals.get(i8)).isForumCell || z2) {
                            iDp2 += iDp;
                        } else {
                            iDp2 += AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 86.0f : 91.0f);
                        }
                    } else if (((ItemInternal) dialogsAdapter.itemInternals.get(i8)).viewType == 1) {
                        iDp2 += iDp;
                    }
                }
                int iM = (size - 1) + iDp2;
                ArrayList arrayList = dialogsAdapter.onlineContacts;
                if (arrayList != null) {
                    iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m((dialogsAdapter.onlineContacts.size() - 1) + (AndroidUtilities.dp(58.0f) * arrayList.size()), 52.0f, iM);
                }
                int i9 = z ? iDp + 1 : 0;
                if (iM < i7) {
                    currentActionBarHeight = ((i7 - iM) + i9) - paddingBottom;
                    if (i6 != 0) {
                        currentActionBarHeight -= AndroidUtilities.statusBarHeight;
                        if (!z2 && !dialogsAdapter.isTransitionSupport) {
                            currentActionBarHeight -= ActionBar.getCurrentActionBarHeight();
                            if (getParent() instanceof DialogsActivity.DialogsRecyclerView) {
                                i3 = ((DialogsActivity.DialogsRecyclerView) getParent()).additionalPadding;
                                currentActionBarHeight -= i3;
                            }
                        } else if (z2) {
                            currentActionBarHeight -= i6;
                        }
                    }
                } else {
                    int i10 = iM - i7;
                    if (i10 < i9) {
                        currentActionBarHeight = (i9 - i10) - paddingBottom;
                        if (i6 != 0) {
                            currentActionBarHeight -= AndroidUtilities.statusBarHeight;
                            if (!z2 && !dialogsAdapter.isTransitionSupport) {
                                currentActionBarHeight -= ActionBar.getCurrentActionBarHeight();
                                if (getParent() instanceof DialogsActivity.DialogsRecyclerView) {
                                    i3 = ((DialogsActivity.DialogsRecyclerView) getParent()).additionalPadding;
                                    currentActionBarHeight -= i3;
                                }
                            } else if (z2) {
                                currentActionBarHeight -= i6;
                            }
                        }
                    } else {
                        currentActionBarHeight = 0;
                    }
                }
            }
            int iDp3 = currentActionBarHeight >= 0 ? currentActionBarHeight : 0;
            if (dialogsAdapter.isTransitionSupport) {
                iDp3 += AndroidUtilities.dp(1000.0f);
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iDp3, 1073741824));
        }
    }

    public DialogsAdapter(DialogsActivity dialogsActivity, Context context, int i, int i2, boolean z, ArrayList arrayList, int i3, TLRPC.RequestPeerType requestPeerType) {
        this.mContext = context;
        this.parentFragment = dialogsActivity;
        this.dialogsType = i;
        this.folderId = i2;
        this.isOnlySelect = z;
        this.hasHints = i2 == 0 && i == 0 && !z;
        this.selectedDialogs = arrayList;
        this.currentAccount = i3;
        this.communityId = dialogsActivity.communityId;
        if (i2 == 0) {
            this.preloader = new DialogsPreloader();
        }
        this.requestPeerType = requestPeerType;
    }

    @Override
    public final boolean canClickButtonInside() {
        return this.selectedDialogs.isEmpty();
    }

    public final int dialogsEmptyType() {
        int i = this.dialogsType;
        int i2 = this.folderId;
        if (i == 7 || i == 8) {
            return MessagesController.getInstance(this.currentAccount).isDialogsEndReached(i2) ? 2 : 3;
        }
        if (i2 == 1) {
            return 2;
        }
        return this.onlineContacts != null ? 1 : 0;
    }

    public final int fixPosition(int i) {
        if (this.hasChatlistHint) {
            i--;
        }
        if (this.hasHints) {
            i = zzki.m(2, i, MessagesController.getInstance(this.currentAccount).hintDialogs);
        }
        if (this.allowForwardAsStories && this.dialogsType == 3) {
            i--;
        }
        int i2 = this.dialogsType;
        if (i2 == 11 || i2 == 13) {
            return i - 2;
        }
        return i2 == 12 ? i - 1 : i;
    }

    public final MessagesController.DialogFilter getCurrentFilter() {
        int i = this.dialogsType;
        if (i == 7 || i == 8) {
            return MessagesController.getInstance(this.currentAccount).selectedDialogFilter[this.dialogsType - 7];
        }
        return null;
    }

    public final Object getItem(int i) {
        if (i >= 0 && i < this.itemInternals.size()) {
            ItemInternal itemInternal = (ItemInternal) this.itemInternals.get(i);
            String str = itemInternal.title;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = itemInternal.chat;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = itemInternal.user;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = itemInternal.dialog;
            if (dialog != null) {
                return dialog;
            }
            TLRPC.TL_contact tL_contact = itemInternal.contact;
            if (tL_contact != null) {
                return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = itemInternal.recentMeUrl;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    @Override
    public final int getItemCount() {
        int size = this.itemInternals.size();
        this.currentCount = size;
        return size;
    }

    @Override
    public final long getItemId(int i) {
        return ((ItemInternal) this.itemInternals.get(i)).stableId;
    }

    @Override
    public final int getItemViewType(int i) {
        return ((ItemInternal) this.itemInternals.get(i)).viewType;
    }

    @Override
    public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int i = viewHolder.mItemViewType;
        return (i == 1 || i == 5 || i == 3 || i == 8 || i == 7 || i == 10 || i == 11 || i == 13 || i == 15 || i == 16 || i == 18 || i == 19 || i == 20) ? false : true;
    }

    @Override
    public void notifyDataSetChanged() {
        if (this.isCalculatingDiff) {
            this.itemInternals = new ArrayList();
        }
        this.isCalculatingDiff = false;
        updateItemList();
        this.mObservable.notifyChanged();
    }

    @Override
    public final void notifyItemMoved(int i, int i2) {
        this.mObservable.notifyItemMoved(i, i2);
    }

    public void onArchiveSettingsClick() {
    }

    @Override
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        int i2;
        TLRPC.Chat chat;
        CharSequence charSequence;
        TLRPC.Dialog dialog;
        Object obj;
        CharSequence charSequence2;
        CharSequence lowerCase;
        int i3;
        String string;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i4 = 1;
        int i5 = viewHolder.mItemViewType;
        int i6 = this.currentAccount;
        DialogsActivity dialogsActivity = this.parentFragment;
        View view = viewHolder.itemView;
        if (i5 == 0) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) getItem(i);
            Object item = getItem(i + 1);
            TLRPC.Dialog dialog3 = item instanceof TLRPC.Dialog ? (TLRPC.Dialog) item : null;
            int i7 = this.dialogsType;
            ArrayList arrayList = this.selectedDialogs;
            if (i7 == 2 || i7 == 15) {
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) view;
                long dialogId = profileSearchCell.getDialogId();
                if (dialog2.id != 0) {
                    str = "Members";
                    chat = MessagesController.getInstance(i6).getChat(Long.valueOf(-dialog2.id));
                    if (chat == null || chat.migrated_to == null) {
                        i2 = i6;
                    } else {
                        i2 = i6;
                        TLRPC.Chat chat2 = MessagesController.getInstance(i6).getChat(Long.valueOf(chat.migrated_to.channel_id));
                        if (chat2 != null) {
                            chat = chat2;
                        }
                    }
                } else {
                    str = "Members";
                    i2 = i6;
                    chat = null;
                }
                if (chat != null) {
                    CharSequence charSequence3 = chat.title;
                    if (!ChatObject.isChannel(chat) || chat.megagroup) {
                        int i8 = chat.participants_count;
                        if (i8 != 0) {
                            lowerCase = LocaleController.formatPluralStringComma(str, i8);
                        } else if (chat.has_geo) {
                            lowerCase = LocaleController.getString(R.string.MegaLocation);
                        } else {
                            lowerCase = !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase();
                        }
                    } else {
                        int i9 = chat.participants_count;
                        lowerCase = i9 != 0 ? LocaleController.formatPluralStringComma("Subscribers", i9) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                    }
                    charSequence2 = charSequence3;
                    charSequence = lowerCase;
                    dialog = dialog3;
                    obj = chat;
                } else {
                    TLRPC.User user = MessagesController.getInstance(i2).getUser(Long.valueOf(dialog2.id));
                    if (user != null) {
                        CharSequence userName = UserObject.getUserName(user);
                        CharSequence string2 = UserObject.isReplyUser(user) ? "" : user.bot ? LocaleController.getString(R.string.Bot) : LocaleController.formatUserStatus(i2, user);
                        TLRPC.Dialog dialog4 = dialog3;
                        obj = user;
                        dialog = dialog4;
                        charSequence2 = userName;
                        charSequence = string2;
                    } else {
                        charSequence = "";
                        dialog = dialog3;
                        obj = null;
                        charSequence2 = null;
                    }
                }
                profileSearchCell.useSeparator = dialog != null;
                profileSearchCell.setData(obj, null, charSequence2, charSequence, false, false);
                profileSearchCell.setChecked(arrayList.contains(Long.valueOf(profileSearchCell.getDialogId())), dialogId == profileSearchCell.getDialogId());
            } else {
                DialogCell dialogCell = (DialogCell) view;
                dialogCell.isHiddenInCommunity = this.communityId != 0 && ChatObject.isHiddenInCommunity(i6, dialog2.id);
                dialogCell.useSeparator = false;
                dialogCell.fullSeparator = false;
                if (this.dialogsType == 0 && AndroidUtilities.isTablet()) {
                    dialogCell.setDialogSelected(dialog2.id == this.openedDialogId);
                }
                dialogCell.setChecked(arrayList.contains(Long.valueOf(dialog2.id)), false);
                if (i == 1 && dialogsActivity != null && dialogsActivity.isReplyTo && dialogsActivity.replyMessageAuthor != 0 && dialog2.top_message == 0) {
                    MessagesController.DialogFilter currentFilter = getCurrentFilter();
                    if (currentFilter == null || currentFilter.isDefault()) {
                        dialogCell.setCustomMessage(DialogObject.getStatus(dialogsActivity.replyMessageAuthor));
                    } else {
                        dialogCell.setCustomMessage(null);
                    }
                } else if (i == 1 && dialogsActivity != null && this.dialogsType == 3 && dialogsActivity.forwardOriginalChannel != 0 && dialog2.top_message == 0) {
                    MessagesController.DialogFilter currentFilter2 = getCurrentFilter();
                    if (currentFilter2 == null || currentFilter2.isDefault()) {
                        dialogCell.setCustomMessage(DialogObject.getStatus(dialogsActivity.forwardOriginalChannel));
                    } else {
                        dialogCell.setCustomMessage(null);
                    }
                } else {
                    dialogCell.setCustomMessage(null);
                }
                dialogCell.setDialog(dialog2, this.dialogsType, this.folderId);
                if (dialogCell.getMeasuredHeight() > 0 && dialogCell.getMeasuredHeight() != dialogCell.computeHeight()) {
                    dialogCell.requestLayout();
                }
                boolean z = dialogCell.collapsed;
                boolean z2 = this.collapsedView;
                if (z != z2) {
                    dialogCell.collapsed = z2;
                    dialogCell.requestLayout();
                }
                DialogsPreloader dialogsPreloader = this.preloader;
                if (dialogsPreloader != null && i < 10) {
                    long j = dialog2.id;
                    if (!dialogsPreloader.dialogsReadyMap.contains(Long.valueOf(j)) && !dialogsPreloader.preloadedErrorMap.contains(Long.valueOf(j)) && !dialogsPreloader.loadingDialogs.contains(Long.valueOf(j))) {
                        ArrayList arrayList2 = dialogsPreloader.preloadDialogsPool;
                        if (!arrayList2.contains(Long.valueOf(j))) {
                            arrayList2.add(Long.valueOf(j));
                        }
                    }
                }
            }
            if (i >= this.dialogsCount + 1) {
                view.setAlpha(1.0f);
            }
        }
        if (i5 == 4) {
            ((DialogMeUrlCell) view).setRecentMeUrl((TLRPC.RecentMeUrl) getItem(i));
        } else if (i5 == 5) {
            DialogsEmptyCell dialogsEmptyCell = (DialogsEmptyCell) view;
            int i10 = this.lastDialogsEmptyType;
            int iDialogsEmptyType = dialogsEmptyType();
            this.lastDialogsEmptyType = iDialogsEmptyType;
            if (dialogsEmptyCell.currentType != iDialogsEmptyType) {
                dialogsEmptyCell.currentType = iDialogsEmptyType;
                TextView textView = dialogsEmptyCell.titleView;
                RLottieImageView rLottieImageView = dialogsEmptyCell.imageView;
                if (iDialogsEmptyType == 0 || iDialogsEmptyType == 1) {
                    i3 = R.raw.utyan_newborn;
                    string = LocaleController.getString(R.string.NoChatsHelp);
                    textView.setText(LocaleController.getString(R.string.NoChats));
                } else if (iDialogsEmptyType != 2) {
                    rLottieImageView.setAutoRepeat(true);
                    i3 = R.raw.filter_new;
                    string = LocaleController.getString(R.string.FilterAddingChatsInfo);
                    textView.setText(LocaleController.getString(R.string.FilterAddingChats));
                } else {
                    rLottieImageView.setAutoRepeat(false);
                    i3 = R.raw.filter_no_chats;
                    if (this.isOnlySelect) {
                        textView.setText(LocaleController.getString(R.string.FilterNoChatsToForward));
                        string = LocaleController.getString(R.string.FilterNoChatsToForwardInfo);
                    } else {
                        textView.setText(LocaleController.getString(R.string.FilterNoChatsToDisplay));
                        string = LocaleController.getString(R.string.FilterNoChatsToDisplayInfo);
                    }
                }
                String strReplace = string;
                TextViewSwitcher textViewSwitcher = dialogsEmptyCell.subtitleView;
                if (i3 != 0) {
                    rLottieImageView.setVisibility(0);
                    if (dialogsEmptyCell.currentType == 1) {
                        if (dialogsEmptyCell.utyanAnimationTriggered) {
                            dialogsEmptyCell.utyanCollapseProgress = 1.0f;
                            String string3 = LocaleController.getString(R.string.NoChatsContactsHelp);
                            if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                                string3 = string3.replace('\n', ' ');
                            }
                            textViewSwitcher.setText(string3, true, false);
                            dialogsEmptyCell.requestLayout();
                        } else {
                            dialogsEmptyCell.startUtyanCollapseAnimation(true);
                        }
                    }
                    if (dialogsEmptyCell.prevIcon != i3) {
                        rLottieImageView.setAnimation(i3, 100, 100, null);
                        rLottieImageView.playAnimation();
                        dialogsEmptyCell.prevIcon = i3;
                    }
                } else {
                    rLottieImageView.setVisibility(8);
                }
                if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                    strReplace = strReplace.replace('\n', ' ');
                }
                textViewSwitcher.setText(strReplace, false, false);
            }
            int i11 = this.dialogsType;
            if (i11 != 7 && i11 != 8) {
                dialogsEmptyCell.setOnUtyanAnimationEndListener(new DialogsAdapter$$ExternalSyntheticLambda1(this, objArr2 == true ? 1 : 0));
                dialogsEmptyCell.setOnUtyanAnimationUpdateListener(new ChatActivity$$ExternalSyntheticLambda211(this, i4));
                if (!dialogsEmptyCell.utyanAnimationTriggered && this.dialogsCount == 0) {
                    dialogsActivity.setContactsAlpha(0.0f);
                    for (DialogsActivity.ViewPage viewPage : dialogsActivity.viewPages) {
                        ((LinearLayoutManager) viewPage.listView.getLayoutManager()).mDisableScroll = true;
                    }
                }
                if (this.onlineContacts == null || i10 != 0) {
                    if (this.forceUpdatingContacts) {
                        if (this.dialogsCount == 0) {
                            dialogsEmptyCell.startUtyanCollapseAnimation(false);
                        }
                    } else if (dialogsEmptyCell.utyanAnimationTriggered && this.lastDialogsEmptyType == 0) {
                        ValueAnimator valueAnimator = dialogsEmptyCell.utyanAnimator;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        dialogsEmptyCell.utyanAnimationTriggered = false;
                        ValueAnimator duration = ValueAnimator.ofFloat(dialogsEmptyCell.utyanCollapseProgress, 0.0f).setDuration(250L);
                        dialogsEmptyCell.utyanAnimator = duration;
                        duration.setInterpolator(Easings.easeOutQuad);
                        dialogsEmptyCell.utyanAnimator.addUpdateListener(new DialogsEmptyCell$$ExternalSyntheticLambda3(dialogsEmptyCell, 1));
                        dialogsEmptyCell.utyanAnimator.addListener(new DialogsEmptyCell.AnonymousClass1(dialogsEmptyCell, objArr == true ? 1 : 0));
                        dialogsEmptyCell.utyanAnimator.start();
                    }
                } else if (!dialogsEmptyCell.utyanAnimationTriggered) {
                    dialogsEmptyCell.startUtyanCollapseAnimation(true);
                }
            }
        } else if (i5 == 6) {
            ((UserCell) view).setData((TLRPC.User) getItem(i), null, null, false);
        } else if (i5 == 7) {
            HeaderCell headerCell = (HeaderCell) view;
            int i12 = this.dialogsType;
            if (i12 != 11 && i12 != 12 && i12 != 13) {
                headerCell.setText(LocaleController.getString((this.dialogsCount == 0 && this.forceUpdatingContacts) ? R.string.ConnectingYourContacts : R.string.YourContacts));
            } else if (i == 0) {
                headerCell.setText(LocaleController.getString(R.string.ImportHeader));
            } else {
                headerCell.setText(LocaleController.getString(R.string.ImportHeaderContacts));
            }
        } else if (i5 != 11) {
            TLRPC.RequestPeerType requestPeerType = this.requestPeerType;
            if (i5 != 12) {
                switch (i5) {
                    case 14:
                        HeaderCell headerCell2 = (HeaderCell) view;
                        headerCell2.setTextSize(14.0f);
                        headerCell2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false));
                        headerCell2.setBackgroundColor(Theme.getColor(null, Theme.key_graySection, false));
                        int i13 = ((DialogsActivity.DialogsHeader) getItem(i)).headerType;
                        if (i13 == 0) {
                            headerCell2.setText(LocaleController.getString(R.string.MyChannels));
                        } else if (i13 == 1) {
                            headerCell2.setText(LocaleController.getString(R.string.MyGroups));
                        } else if (i13 == 2) {
                            headerCell2.setText(LocaleController.getString(R.string.FilterGroups));
                        }
                        break;
                    case 15:
                        ((RequestPeerRequirementsCell) view).set(requestPeerType);
                        break;
                    case 16:
                        ((DialogsRequestedEmptyCell) view).set(requestPeerType);
                        break;
                    case 17:
                        DialogsHintCell dialogsHintCell = (DialogsHintCell) view;
                        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = ((ItemInternal) this.itemInternals.get(i)).chatlistUpdates;
                        if (tL_chatlists_chatlistUpdates != null) {
                            int size = tL_chatlists_chatlistUpdates.missing_peers.size();
                            dialogsHintCell.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("FolderUpdatesTitle", size, new Object[0]), Theme.key_windowBackgroundWhiteValueText, 0, null), LocaleController.formatPluralString("FolderUpdatesSubtitle", size, new Object[0]), true, false);
                        }
                        break;
                    default:
                        switch (i5) {
                            case 20:
                                GraySectionCell graySectionCell = (GraySectionCell) view;
                                if (dialogsActivity == null || !dialogsActivity.isReplyTo) {
                                    if (this.dialogsType == 3) {
                                        if (i == 0) {
                                            graySectionCell.setText(LocaleController.getString(R.string.ForwardDialogYourChannel));
                                        } else {
                                            graySectionCell.setText(LocaleController.getString(R.string.ReplyDialogYourChats));
                                        }
                                    }
                                } else if (i == 0) {
                                    graySectionCell.setText(LocaleController.getString(R.string.ReplyDialogMessageAuthor));
                                } else {
                                    graySectionCell.setText(LocaleController.getString(R.string.ReplyDialogYourChats));
                                }
                                break;
                            case 21:
                                DialogCell dialogCell2 = (DialogCell) view;
                                DialogCell.CustomDialog customDialog = new DialogCell.CustomDialog();
                                customDialog.name = LocaleController.getString(R.string.StoriesForwardTitle);
                                customDialog.message = LocaleController.getString(R.string.StoriesForwardText);
                                dialogCell2.useSeparator = false;
                                dialogCell2.fullSeparator = false;
                                dialogCell2.setDialog(customDialog);
                                if (dialogCell2.getMeasuredHeight() > 0 && dialogCell2.getMeasuredHeight() != dialogCell2.computeHeight()) {
                                    dialogCell2.requestLayout();
                                }
                                break;
                            case 22:
                                ((HeaderCell) view).setText((String) getItem(i));
                                break;
                            case 23:
                                Object item2 = getItem(i);
                                DialogCell dialogCell3 = (DialogCell) view;
                                if (item2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat3 = (TLRPC.Chat) item2;
                                    dialogCell3.isHiddenInCommunity = ChatObject.isHiddenInCommunity(i6, chat3);
                                    dialogCell3.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat3.participants_count, new Object[0]));
                                    dialogCell3.setDialog(-chat3.id, null, 0, false, false);
                                } else {
                                    TLRPC.User user2 = (TLRPC.User) item2;
                                    dialogCell3.isHiddenInCommunity = ChatObject.isHiddenInCommunity(i6, user2);
                                    dialogCell3.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
                                    dialogCell3.setDialog(user2.id, null, 0, false, false);
                                }
                                break;
                        }
                        break;
                }
            } else {
                if (!(view instanceof TextCell)) {
                    return;
                }
                TextCell textCell = (TextCell) view;
                int i14 = Theme.key_windowBackgroundWhiteBlueText4;
                textCell.setColors(i14, i14);
                if (requestPeerType == null) {
                    textCell.setTextAndIcon(R.drawable.msg_groups_create, LocaleController.getString(R.string.CreateGroupForImport), this.dialogsCount != 0);
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    textCell.setTextAndIcon(R.drawable.msg_channel_create, (CharSequence) LocaleController.getString(R.string.CreateChannelForThis), true);
                } else {
                    textCell.setTextAndIcon(R.drawable.msg_groups_create, (CharSequence) LocaleController.getString(R.string.CreateGroupForThis), true);
                }
                textCell.inDialogs = true;
                textCell.setOffsetFromImage(75);
            }
        } else {
            TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
            textInfoPrivacyCell.setText(LocaleController.getString(R.string.TapOnThePencilButton));
            if (this.arrowDrawable == null) {
                Drawable drawable = this.mContext.getResources().getDrawable(R.drawable.arrow_newchat);
                this.arrowDrawable = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false), PorterDuff.Mode.MULTIPLY));
            }
            LinkSpanDrawable.LinksTextView textView2 = textInfoPrivacyCell.getTextView();
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (dialogsActivity == null || !dialogsActivity.storiesEnabled) ? this.arrowDrawable : null, (Drawable) null);
            textView2.getLayoutParams().width = -2;
        }
        if (i >= this.dialogsCount + 1) {
            view.setAlpha(1.0f);
        }
    }

    @Override
    public void onButtonClicked(DialogCell dialogCell) {
    }

    @Override
    public void onButtonLongPress(DialogCell dialogCell) {
    }

    public void onCreateGroupForThisClick() {
    }

    @Override
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ?? flickerLoadingView;
        Object graySectionCell;
        long j = this.communityId;
        Context context = this.mContext;
        switch (i) {
            case 0:
            case 21:
                int i2 = this.dialogsType;
                if (i2 == 2 || i2 == 15) {
                    flickerLoadingView = new ProfileSearchCell(context, null);
                } else {
                    DialogCell dialogCell = new DialogCell(this.parentFragment, this.mContext, false, this.currentAccount, null);
                    if (showOpenBotButton()) {
                        DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda6 = new DialogCell$$ExternalSyntheticLambda6(this, 1);
                        dialogCell.allowBotOpenButton = true;
                        dialogCell.onOpenButtonClick = dialogCell$$ExternalSyntheticLambda6;
                    }
                    dialogCell.setArchivedPullAnimation(this.pullForegroundDrawable);
                    dialogCell.setPreloader(this.preloader);
                    dialogCell.setDialogCellDelegate(this);
                    dialogCell.setIsTransitionSupport(this.isTransitionSupport);
                    if (i == 21) {
                        ShareDialogCell.RepostStoryDrawable repostStoryDrawable = new ShareDialogCell.RepostStoryDrawable(dialogCell.getContext(), dialogCell, false, R.drawable.forward_to_stories, dialogCell.resourcesProvider);
                        dialogCell = dialogCell;
                        dialogCell.repostStoryDrawable = repostStoryDrawable;
                        dialogCell.isShareToStoryCell = true;
                    }
                    if (j != 0) {
                        dialogCell.insideCommunityList = true;
                    }
                    flickerLoadingView = dialogCell;
                }
                if (this.dialogsType == 15) {
                    flickerLoadingView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                }
                break;
            case 1:
            case 13:
                flickerLoadingView = new FlickerLoadingView(context, null);
                flickerLoadingView.setIsSingleCell(true);
                int i3 = i == 13 ? 18 : 7;
                flickerLoadingView.setViewType(i3);
                if (i3 == 18) {
                    flickerLoadingView.setIgnoreHeightCheck(true);
                }
                if (i == 13) {
                    flickerLoadingView.setItemsCount((int) ((AndroidUtilities.displaySize.y * 0.5f) / AndroidUtilities.dp(64.0f)));
                }
                break;
            case 2:
                HeaderCell headerCell = new HeaderCell(context);
                headerCell.setText(LocaleController.getString(R.string.RecentlyViewed));
                TextView textView = new TextView(context);
                zzkk.m(15.0f, 1, textView);
                textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueHeader, false));
                textView.setText(LocaleController.getString(R.string.RecentlyViewedHide));
                textView.setGravity(16 | (LocaleController.isRTL ? 3 : 5));
                headerCell.addView(textView, LayoutHelper.createFrame(-1, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda38(this, 3));
                graySectionCell = headerCell;
                flickerLoadingView = graySectionCell;
                break;
            case 3:
                flickerLoadingView = new PhotoViewer.AnonymousClass19(context, 2);
                flickerLoadingView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
                View view = new View(context);
                view.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                flickerLoadingView.addView(view, LayoutHelper.createFrame(-1.0f, -1));
                break;
            case 4:
                flickerLoadingView = new DialogMeUrlCell(context);
                break;
            case 5:
                flickerLoadingView = new DialogsEmptyCell(context);
                break;
            case 6:
                flickerLoadingView = new UserCell(8, 0, this.mContext, null, false, false);
                break;
            case 7:
                flickerLoadingView = new HeaderCell(context);
                DialogsActivity dialogsActivity = this.parentFragment;
                if (dialogsActivity == null || !dialogsActivity.isReplyTo) {
                    flickerLoadingView.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
                }
                break;
            case 8:
                flickerLoadingView = new ShadowSectionCell(context, (Object) null);
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(null, Theme.key_windowBackgroundGray, false)), Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                combinedDrawable.fullSize = true;
                flickerLoadingView.setBackgroundDrawable(combinedDrawable);
                break;
            case 9:
            case 12:
            default:
                flickerLoadingView = new TextCell(context);
                if (this.dialogsType == 15) {
                    flickerLoadingView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                }
                break;
            case 10:
                flickerLoadingView = new LastEmptyView(context);
                break;
            case 11:
                flickerLoadingView = new TextInfoPrivacyCell(context) {
                    public long lastUpdateTime;
                    public float moveProgress;
                    public int movement;
                    public int originalX;
                    public int originalY;

                    @Override
                    public final void afterTextDraw() {
                        DialogsAdapter dialogsAdapter = DialogsAdapter.this;
                        Drawable drawable = dialogsAdapter.arrowDrawable;
                        if (drawable != null) {
                            Rect bounds = drawable.getBounds();
                            Drawable drawable2 = dialogsAdapter.arrowDrawable;
                            int i4 = this.originalX;
                            drawable2.setBounds(i4, this.originalY, bounds.width() + i4, bounds.height() + this.originalY);
                        }
                    }

                    @Override
                    public final void onTextDraw() {
                        DialogsAdapter dialogsAdapter = DialogsAdapter.this;
                        Drawable drawable = dialogsAdapter.arrowDrawable;
                        if (drawable != null) {
                            Rect bounds = drawable.getBounds();
                            int iDp = (int) (this.moveProgress * AndroidUtilities.dp(3.0f));
                            int i4 = bounds.left;
                            this.originalX = i4;
                            int i5 = bounds.top;
                            this.originalY = i5;
                            dialogsAdapter.arrowDrawable.setBounds(i4 + iDp, AndroidUtilities.dp(1.0f) + i5, bounds.width() + this.originalX + iDp, bounds.height() + AndroidUtilities.dp(1.0f) + this.originalY);
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            long j2 = jElapsedRealtime - this.lastUpdateTime;
                            if (j2 > 17) {
                                j2 = 17;
                            }
                            this.lastUpdateTime = jElapsedRealtime;
                            if (this.movement == 0) {
                                float f = (j2 / 664.0f) + this.moveProgress;
                                this.moveProgress = f;
                                if (f >= 1.0f) {
                                    this.movement = 1;
                                    this.moveProgress = 1.0f;
                                }
                            } else {
                                float f2 = this.moveProgress - (j2 / 664.0f);
                                this.moveProgress = f2;
                                if (f2 <= 0.0f) {
                                    this.movement = 0;
                                    this.moveProgress = 0.0f;
                                }
                            }
                            getTextView().invalidate();
                        }
                    }
                };
                CombinedDrawable combinedDrawable2 = new CombinedDrawable(new ColorDrawable(Theme.getColor(null, Theme.key_windowBackgroundGray, false)), Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                combinedDrawable2.fullSize = true;
                flickerLoadingView.setBackgroundDrawable(combinedDrawable2);
                break;
            case 14:
                HeaderCell headerCell2 = new HeaderCell(this.mContext, Theme.key_graySectionText, 16, 0, false);
                headerCell2.setHeight(32);
                headerCell2.setClickable(false);
                flickerLoadingView = headerCell2;
                break;
            case 15:
                flickerLoadingView = new RequestPeerRequirementsCell(context);
                break;
            case 16:
                flickerLoadingView = new AnonymousClass3(context);
                break;
            case 17:
                flickerLoadingView = new DialogsHintCell(context);
                break;
            case 18:
                flickerLoadingView = new PaymentFormActivity.AnonymousClass2(context, 3);
                break;
            case 19:
                flickerLoadingView = new LastEmptyView(context);
                flickerLoadingView.addView(new ArchiveHelp(this.currentAccount, this.mContext, new DialogsAdapter$$ExternalSyntheticLambda1(this, 1), null, null), LayoutHelper.createFrame(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                graySectionCell = new GraySectionCell(context, 16, null);
                flickerLoadingView = graySectionCell;
                break;
            case 22:
                flickerLoadingView = new HeaderCell(context);
                break;
            case 23:
                DialogCell dialogCell2 = new DialogCell(this.parentFragment, this.mContext, false, this.currentAccount, null);
                if (j != 0) {
                    dialogCell2.insideCommunityList = true;
                    dialogCell2.insideCommunityListNoDialog = true;
                }
                flickerLoadingView = dialogCell2;
                break;
        }
        flickerLoadingView.setLayoutParams(new RecyclerView.LayoutParams(-1, (i == 5 || i == 19) ? -1 : -2));
        return new RecyclerListView.Holder(flickerLoadingView);
    }

    public void onOpenBot(TLRPC.User user) {
    }

    @Override
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        if (view instanceof DialogCell) {
            DialogCell dialogCell = (DialogCell) view;
            dialogCell.onReorderStateChanged(this.isReordering, false);
            dialogCell.setChecked(this.selectedDialogs.contains(Long.valueOf(dialogCell.getDialogId())), false);
        }
    }

    @Override
    public final void openHiddenStories() {
        StoriesController storiesController = MessagesController.getInstance(this.currentAccount).getStoriesController();
        if (storiesController.hiddenListStories.isEmpty()) {
            return;
        }
        ArrayList arrayList = storiesController.hiddenListStories;
        boolean z = storiesController.getUnreadState(0, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i)).peer);
            if (!z || storiesController.getUnreadState(0, peerDialogId) != 0) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        this.parentFragment.getOrCreateStoryViewer().open(UserConfig.selectedAccount, this.mContext, null, arrayList2, 0, null, null, new StoriesListPlaceProvider(this.recyclerListView, true), false);
    }

    @Override
    public final void openStory(DialogCell dialogCell) {
        int i = this.currentAccount;
        MessagesController.getInstance(i);
        if (MessagesController.getInstance(i).getStoriesController().hasStories(dialogCell.getDialogId())) {
            DialogsActivity dialogsActivity = this.parentFragment;
            dialogsActivity.getOrCreateStoryViewer().getClass();
            dialogsActivity.getOrCreateStoryViewer().open(dialogsActivity.getParentActivity(), dialogCell.getDialogId(), new StoriesListPlaceProvider((RecyclerListView) dialogCell.getParent(), false));
        }
    }

    public final void setAllowForwardAsStories(boolean z) {
        this.allowForwardAsStories = z;
    }

    public final void setArchivedPullDrawable(TopicsFragment.AnonymousClass6 anonymousClass6) {
        this.pullForegroundDrawable = anonymousClass6;
    }

    public final void setCollapsedView(RecyclerListView recyclerListView, boolean z) {
        this.collapsedView = z;
        for (int i = 0; i < recyclerListView.getChildCount(); i++) {
            if (recyclerListView.getChildAt(i) instanceof DialogCell) {
                ((DialogCell) recyclerListView.getChildAt(i)).collapsed = z;
            }
        }
        for (int i2 = 0; i2 < recyclerListView.getCachedChildCount(); i2++) {
            if (recyclerListView.getCachedChildAt(i2) instanceof DialogCell) {
                ((DialogCell) recyclerListView.getCachedChildAt(i2)).collapsed = z;
            }
        }
        for (int i3 = 0; i3 < recyclerListView.getHiddenChildCount(); i3++) {
            if (recyclerListView.getHiddenChildAt(i3) instanceof DialogCell) {
                ((DialogCell) recyclerListView.getHiddenChildAt(i3)).collapsed = z;
            }
        }
        for (int i4 = 0; i4 < recyclerListView.getAttachedScrapChildCount(); i4++) {
            if (recyclerListView.getAttachedScrapChildAt(i4) instanceof DialogCell) {
                ((DialogCell) recyclerListView.getAttachedScrapChildAt(i4)).collapsed = z;
            }
        }
    }

    public final void setForceShowEmptyCell(boolean z) {
        this.forceShowEmptyCell = z;
    }

    public final void setOpenedDialogId(long j) {
        this.openedDialogId = j;
    }

    public final void setRecyclerListView(DialogsActivity.DialogsRecyclerView dialogsRecyclerView) {
        this.recyclerListView = dialogsRecyclerView;
    }

    @Override
    public final void showChatPreview(DialogCell dialogCell) {
        this.parentFragment.showChatPreview(dialogCell);
    }

    public boolean showOpenBotButton() {
        return false;
    }

    public final void sortOnlineContacts(boolean z) {
        int i = this.currentAccount;
        if (this.onlineContacts != null) {
            if (!z || SystemClock.elapsedRealtime() - this.lastSortTime >= 2000) {
                this.lastSortTime = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
                    Collections.sort(this.onlineContacts, new DialogsAdapter$$ExternalSyntheticLambda0(MessagesController.getInstance(i), currentTime, 0));
                    if (z) {
                        notifyDataSetChanged();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final void updateHasHints() {
        this.hasHints = this.folderId == 0 && this.dialogsType == 0 && !this.isOnlySelect && !MessagesController.getInstance(this.currentAccount).hintDialogs.isEmpty();
    }

    public final void updateItemList() {
        ArrayList dialogsArray;
        long j;
        TLRPC.Dialog tL_dialog;
        boolean z;
        int i;
        TL_chatlists.TL_chatlists_chatlistUpdates chatlistFolderUpdates;
        TLRPC.RequestPeerType requestPeerType;
        int i2;
        int i3;
        boolean z2;
        int i4;
        ItemInternal itemInternal;
        TLRPC.Dialog dialog;
        int i5;
        int i6;
        int i7;
        TLRPC.Dialog tL_dialog2;
        ArrayList<MessagesController.CommunityPeerDialog> arrayList;
        String string;
        int i8 = this.currentAccount;
        long j2 = this.communityId;
        if (j2 != 0) {
            this.itemInternals.clear();
            updateHasHints();
            MessagesController.CommunityPeersDialog communityPeersDialogBuildCommunityPeers = MessagesController.getInstance(i8).buildCommunityPeers(j2);
            this.dialogsCount = communityPeersDialogBuildCommunityPeers.getDialogsCount();
            this.isEmpty = false;
            int i9 = this.dialogsType == 3 ? 2 : 4;
            for (int i10 = 0; i10 < i9; i10++) {
                if (i10 == 0) {
                    arrayList = communityPeersDialogBuildCommunityPeers.chatsYouAreIn;
                    string = LocaleController.getString(R.string.CommunitySectionChatsYouAreIn);
                } else if (i10 == 1) {
                    arrayList = communityPeersDialogBuildCommunityPeers.chatsYouCanView;
                    string = LocaleController.getString(R.string.CommunitySectionChatsYouCanView);
                } else if (i10 == 2) {
                    arrayList = communityPeersDialogBuildCommunityPeers.chatsYouCanJoin;
                    string = LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin);
                } else {
                    arrayList = communityPeersDialogBuildCommunityPeers.chatsOther;
                    string = LocaleController.getString(R.string.CommunitySectionHiddenChats);
                }
                if (!arrayList.isEmpty()) {
                    this.itemInternals.add(new ItemInternal(this, string));
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessagesController.CommunityPeerDialog communityPeerDialog = arrayList.get(i11);
                        TLRPC.Dialog dialog2 = communityPeerDialog.dialog;
                        if (dialog2 != null) {
                            this.itemInternals.add(new ItemInternal(this, 0, dialog2));
                        } else {
                            TLRPC.Chat chat = communityPeerDialog.chat;
                            if (chat != null) {
                                this.itemInternals.add(new ItemInternal(this, chat));
                            } else {
                                TLRPC.User user = communityPeerDialog.user;
                                if (user != null) {
                                    this.itemInternals.add(new ItemInternal(this, user));
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        this.itemInternals.clear();
        updateHasHints();
        MessagesController messagesController = MessagesController.getInstance(i8);
        int i12 = this.folderId;
        DialogsActivity dialogsActivity = this.parentFragment;
        if (j2 != 0) {
            dialogsArray = messagesController.getDialogsByCommunity(j2);
        } else {
            dialogsArray = dialogsActivity.getDialogsArray(i8, this.dialogsType, i12, this.dialogsListFrozen);
            if (dialogsArray == null) {
                dialogsArray = new ArrayList();
            }
        }
        int size = dialogsArray.size();
        this.dialogsCount = size;
        this.isEmpty = false;
        if (size == 0 && dialogsActivity.isArchive()) {
            zzkj.m(this, 19, this.itemInternals);
            return;
        }
        if (this.hasHints || this.dialogsType != 0 || i12 != 0 || !messagesController.isDialogsEndReached(i12) || this.forceUpdatingContacts) {
            j = 0;
        } else if (messagesController.getAllFoldersDialogsCount() > 10 || !ContactsController.getInstance(i8).doneLoadingContacts || ContactsController.getInstance(i8).contacts.isEmpty()) {
            j = 0;
            this.onlineContacts = null;
        } else {
            j = 0;
            this.onlineContacts = new ArrayList(ContactsController.getInstance(i8).contacts);
            long j3 = UserConfig.getInstance(i8).clientUserId;
            int size2 = this.onlineContacts.size();
            int i13 = 0;
            while (i13 < size2) {
                long j4 = ((TLRPC.TL_contact) this.onlineContacts.get(i13)).user_id;
                if (j4 == j3 || messagesController.dialogs_dict.get(j4) != null) {
                    this.onlineContacts.remove(i13);
                    i13--;
                    size2--;
                }
                i13++;
            }
            if (this.onlineContacts.isEmpty()) {
                this.onlineContacts = null;
            } else {
                sortOnlineContacts(false);
            }
        }
        MessagesController.DialogFilter currentFilter = getCurrentFilter();
        if ((currentFilter != null && !currentFilter.isDefault()) || dialogsActivity == null || !dialogsActivity.isReplyTo || dialogsActivity.replyMessageAuthor == j) {
            if ((currentFilter == null || currentFilter.isDefault()) && dialogsActivity != null && this.dialogsType == 3 && dialogsActivity.forwardOriginalChannel != j) {
                zzkj.m(this, 20, this.itemInternals);
                int i14 = 0;
                while (true) {
                    if (i14 >= dialogsArray.size()) {
                        tL_dialog2 = null;
                        break;
                    } else {
                        if (dialogsArray.get(i14).id == dialogsActivity.forwardOriginalChannel) {
                            tL_dialog2 = dialogsArray.get(i14);
                            break;
                        }
                        i14++;
                    }
                }
                if (tL_dialog2 == null) {
                    tL_dialog2 = new TLRPC.TL_dialog();
                    tL_dialog2.id = dialogsActivity.forwardOriginalChannel;
                }
                z = false;
                this.itemInternals.add(new ItemInternal(this, 0, tL_dialog2));
                zzkj.m(this, 20, this.itemInternals);
            }
            this.hasChatlistHint = z;
            i = this.dialogsType;
            if ((i != 7 || i == 8) && currentFilter != null && currentFilter.isChatlist()) {
                messagesController.checkChatlistFolderUpdate(currentFilter.id, false);
                chatlistFolderUpdates = messagesController.getChatlistFolderUpdates(currentFilter.id);
                if (chatlistFolderUpdates != null && chatlistFolderUpdates.missing_peers.size() > 0) {
                    this.hasChatlistHint = true;
                    this.itemInternals.add(new ItemInternal(this, chatlistFolderUpdates));
                }
            }
            requestPeerType = this.requestPeerType;
            if (requestPeerType != null) {
                zzkj.m(this, 15, this.itemInternals);
            }
            if (!this.collapsedView || this.isTransitionSupport) {
                for (i2 = 0; i2 < dialogsArray.size(); i2++) {
                    if (this.dialogsType == 2 || !(dialogsArray.get(i2) instanceof DialogsActivity.DialogsHeader)) {
                        this.itemInternals.add(new ItemInternal(this, 0, dialogsArray.get(i2)));
                    } else {
                        this.itemInternals.add(new ItemInternal(this, 14, dialogsArray.get(i2)));
                    }
                }
                zzkj.m(this, 10, this.itemInternals);
            }
            if (this.dialogsCount != 0 || !this.forceUpdatingContacts) {
                ArrayList arrayList2 = this.onlineContacts;
                if (arrayList2 != null && !arrayList2.isEmpty() && (i3 = this.dialogsType) != 7 && i3 != 8) {
                    if (this.dialogsCount == 0) {
                        this.isEmpty = true;
                        if (requestPeerType != null) {
                            zzkj.m(this, 16, this.itemInternals);
                        } else {
                            this.itemInternals.add(new ItemInternal(this, dialogsEmptyType(), 0));
                        }
                        zzkj.m(this, 8, this.itemInternals);
                        zzkj.m(this, 7, this.itemInternals);
                    } else {
                        for (int i15 = 0; i15 < dialogsArray.size(); i15++) {
                            this.itemInternals.add(new ItemInternal(this, 0, dialogsArray.get(i15)));
                        }
                        zzkj.m(this, 8, this.itemInternals);
                        zzkj.m(this, 7, this.itemInternals);
                    }
                    for (int i16 = 0; i16 < this.onlineContacts.size(); i16++) {
                        this.itemInternals.add(new ItemInternal(this, (TLRPC.TL_contact) this.onlineContacts.get(i16)));
                    }
                    zzkj.m(this, 10, this.itemInternals);
                    z2 = true;
                } else if (this.hasHints) {
                    int size3 = MessagesController.getInstance(i8).hintDialogs.size();
                    zzkj.m(this, 2, this.itemInternals);
                    for (int i17 = 0; i17 < size3; i17++) {
                        this.itemInternals.add(new ItemInternal(this, MessagesController.getInstance(i8).hintDialogs.get(i17)));
                    }
                    zzkj.m(this, 3, this.itemInternals);
                } else {
                    int i18 = this.dialogsType;
                    if (i18 == 11 || i18 == 13) {
                        zzkj.m(this, 7, this.itemInternals);
                        zzkj.m(this, 12, this.itemInternals);
                    } else if (i18 == 12) {
                        zzkj.m(this, 7, this.itemInternals);
                    }
                }
                if (((requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) && this.dialogsCount > 0) {
                    zzkj.m(this, 12, this.itemInternals);
                }
                if (this.allowForwardAsStories && this.dialogsType == 3) {
                    zzkj.m(this, 21, this.itemInternals);
                }
                if (!z2) {
                    for (i5 = 0; i5 < dialogsArray.size(); i5++) {
                        if (this.dialogsType == 2 || !(dialogsArray.get(i5) instanceof DialogsActivity.DialogsHeader)) {
                            this.itemInternals.add(new ItemInternal(this, 0, dialogsArray.get(i5)));
                        } else {
                            this.itemInternals.add(new ItemInternal(this, 14, dialogsArray.get(i5)));
                        }
                    }
                    if (j2 == 0 || this.forceShowEmptyCell || (i7 = this.dialogsType) == 7 || i7 == 8 || MessagesController.getInstance(i8).isDialogsEndReached(i12)) {
                        i6 = this.dialogsCount;
                        if (i6 == 0) {
                            this.isEmpty = true;
                            if (requestPeerType != null) {
                                zzkj.m(this, 16, this.itemInternals);
                            } else {
                                this.itemInternals.add(new ItemInternal(this, dialogsEmptyType(), 0));
                            }
                        } else {
                            if (i12 == 0 && i6 > 10 && this.dialogsType == 0) {
                                zzkj.m(this, 11, this.itemInternals);
                            }
                            zzkj.m(this, 10, this.itemInternals);
                        }
                    } else {
                        if (this.dialogsCount != 0) {
                            zzkj.m(this, 1, this.itemInternals);
                        }
                        zzkj.m(this, 10, this.itemInternals);
                    }
                }
                if (messagesController.hiddenUndoChats.isEmpty()) {
                    return;
                }
                i4 = 0;
                while (i4 < this.itemInternals.size()) {
                    itemInternal = (ItemInternal) this.itemInternals.get(i4);
                    if (itemInternal.viewType != 0 && (dialog = itemInternal.dialog) != null && messagesController.isHiddenByUndo(dialog.id)) {
                        this.itemInternals.remove(i4);
                        i4--;
                    }
                    i4++;
                }
                return;
            }
            this.isEmpty = true;
            if (requestPeerType != null) {
                zzkj.m(this, 16, this.itemInternals);
            } else {
                this.itemInternals.add(new ItemInternal(this, dialogsEmptyType(), 0));
            }
            zzkj.m(this, 8, this.itemInternals);
            zzkj.m(this, 7, this.itemInternals);
            zzkj.m(this, 13, this.itemInternals);
            z2 = false;
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                zzkj.m(this, 12, this.itemInternals);
            } else {
                zzkj.m(this, 12, this.itemInternals);
            }
            if (this.allowForwardAsStories) {
                zzkj.m(this, 21, this.itemInternals);
            }
            if (!z2) {
                while (i5 < dialogsArray.size()) {
                    if (this.dialogsType == 2) {
                        this.itemInternals.add(new ItemInternal(this, 0, dialogsArray.get(i5)));
                    } else {
                        this.itemInternals.add(new ItemInternal(this, 0, dialogsArray.get(i5)));
                    }
                }
                if (j2 == 0) {
                    i6 = this.dialogsCount;
                    if (i6 == 0) {
                        this.isEmpty = true;
                        if (requestPeerType != null) {
                            zzkj.m(this, 16, this.itemInternals);
                        } else {
                            this.itemInternals.add(new ItemInternal(this, dialogsEmptyType(), 0));
                        }
                    } else {
                        if (i12 == 0) {
                            zzkj.m(this, 11, this.itemInternals);
                        }
                        zzkj.m(this, 10, this.itemInternals);
                    }
                } else {
                    i6 = this.dialogsCount;
                    if (i6 == 0) {
                        this.isEmpty = true;
                        if (requestPeerType != null) {
                            zzkj.m(this, 16, this.itemInternals);
                        } else {
                            this.itemInternals.add(new ItemInternal(this, dialogsEmptyType(), 0));
                        }
                    } else {
                        if (i12 == 0) {
                            zzkj.m(this, 11, this.itemInternals);
                        }
                        zzkj.m(this, 10, this.itemInternals);
                    }
                }
            }
            if (messagesController.hiddenUndoChats.isEmpty()) {
                i4 = 0;
                while (i4 < this.itemInternals.size()) {
                    itemInternal = (ItemInternal) this.itemInternals.get(i4);
                    if (itemInternal.viewType != 0) {
                    }
                    i4++;
                }
                return;
            }
            return;
        }
        zzkj.m(this, 20, this.itemInternals);
        int i19 = 0;
        while (true) {
            if (i19 >= dialogsArray.size()) {
                tL_dialog = null;
                break;
            } else {
                if (dialogsArray.get(i19).id == dialogsActivity.replyMessageAuthor) {
                    tL_dialog = dialogsArray.get(i19);
                    break;
                }
                i19++;
            }
        }
        if (tL_dialog == null) {
            tL_dialog = new TLRPC.TL_dialog();
            tL_dialog.id = dialogsActivity.replyMessageAuthor;
        }
        this.itemInternals.add(new ItemInternal(this, 0, tL_dialog));
        zzkj.m(this, 20, this.itemInternals);
        z = false;
        this.hasChatlistHint = z;
        i = this.dialogsType;
        if (i != 7) {
            messagesController.checkChatlistFolderUpdate(currentFilter.id, false);
            chatlistFolderUpdates = messagesController.getChatlistFolderUpdates(currentFilter.id);
            if (chatlistFolderUpdates != null) {
                this.hasChatlistHint = true;
                this.itemInternals.add(new ItemInternal(this, chatlistFolderUpdates));
            }
        } else {
            messagesController.checkChatlistFolderUpdate(currentFilter.id, false);
            chatlistFolderUpdates = messagesController.getChatlistFolderUpdates(currentFilter.id);
            if (chatlistFolderUpdates != null) {
                this.hasChatlistHint = true;
                this.itemInternals.add(new ItemInternal(this, chatlistFolderUpdates));
            }
        }
        requestPeerType = this.requestPeerType;
        if (requestPeerType != null) {
            zzkj.m(this, 15, this.itemInternals);
        }
        if (this.collapsedView) {
        }
        while (i2 < dialogsArray.size()) {
            if (this.dialogsType == 2) {
                this.itemInternals.add(new ItemInternal(this, 0, dialogsArray.get(i2)));
            } else {
                this.itemInternals.add(new ItemInternal(this, 0, dialogsArray.get(i2)));
            }
        }
        zzkj.m(this, 10, this.itemInternals);
    }

    public final void updateList(DialogsActivity$14$$ExternalSyntheticLambda1 dialogsActivity$14$$ExternalSyntheticLambda1) {
        if (this.isCalculatingDiff) {
            this.updateListPending = true;
            return;
        }
        this.isCalculatingDiff = true;
        ArrayList arrayList = new ArrayList();
        this.oldItems = arrayList;
        arrayList.addAll(this.itemInternals);
        updateItemList();
        ArrayList arrayList2 = new ArrayList(this.itemInternals);
        ArrayList arrayList3 = this.oldItems;
        this.itemInternals = arrayList3;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, arrayList2, 0);
        if (arrayList3.size() >= 50 && ALLOW_UPDATE_IN_BACKGROUND) {
            Utilities.searchQueue.postRunnable(new ChatActivity$$ExternalSyntheticLambda271(this, anonymousClass1, dialogsActivity$14$$ExternalSyntheticLambda1, arrayList2, 11));
            return;
        }
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(anonymousClass1, true);
        this.isCalculatingDiff = false;
        if (dialogsActivity$14$$ExternalSyntheticLambda1 != null) {
            dialogsActivity$14$$ExternalSyntheticLambda1.run();
        }
        this.itemInternals = arrayList2;
        diffResultCalculateDiff.dispatchUpdatesTo(new GroupCallActivity.UpdateCallback(this, 1));
    }

    public final class ItemInternal extends AdapterWithDiffUtils.Item {
        public final TLRPC.Chat chat;
        public final TL_chatlists.TL_chatlists_chatlistUpdates chatlistUpdates;
        public final TLRPC.TL_contact contact;
        public final TLRPC.Dialog dialog;
        public final int emptyType;
        public final boolean isFolder;
        public final boolean isForumCell;
        public final boolean pinned;
        public final TLRPC.RecentMeUrl recentMeUrl;
        public final int stableId;
        public final String title;
        public final TLRPC.User user;

        public ItemInternal(DialogsAdapter dialogsAdapter, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
            super(17, true);
            this.chatlistUpdates = tL_chatlists_chatlistUpdates;
            int i = dialogsAdapter.stableIdPointer;
            dialogsAdapter.stableIdPointer = i + 1;
            this.stableId = i;
        }

        public final int hashCode() {
            return Objects.hash(this.dialog, this.chat, this.recentMeUrl, this.contact, this.title);
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, String str) {
            super(22, false);
            Integer num = (Integer) dialogsAdapter.dialogsHeaderStableIds.get(str);
            if (num != null) {
                this.stableId = num.intValue();
            } else {
                int i = dialogsAdapter.stableIdPointer;
                dialogsAdapter.stableIdPointer = i + 1;
                this.stableId = i;
                dialogsAdapter.dialogsHeaderStableIds.put(str, Integer.valueOf(i));
            }
            this.title = str;
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, TLRPC.User user) {
            super(23, false);
            this.user = user;
            int i = dialogsAdapter.dialogsStableIds.get(user.id, -1);
            if (i >= 0) {
                this.stableId = i;
                return;
            }
            int i2 = dialogsAdapter.stableIdPointer;
            dialogsAdapter.stableIdPointer = i2 + 1;
            this.stableId = i2;
            dialogsAdapter.dialogsStableIds.put(user.id, i2);
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, TLRPC.Chat chat) {
            super(23, false);
            this.chat = chat;
            int i = dialogsAdapter.dialogsStableIds.get(-chat.id, -1);
            if (i >= 0) {
                this.stableId = i;
                return;
            }
            int i2 = dialogsAdapter.stableIdPointer;
            dialogsAdapter.stableIdPointer = i2 + 1;
            this.stableId = i2;
            dialogsAdapter.dialogsStableIds.put(-chat.id, i2);
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, int i, TLRPC.Dialog dialog) {
            super(i, true);
            this.dialog = dialog;
            if (dialog != null) {
                int i2 = dialogsAdapter.dialogsStableIds.get(dialog.id, -1);
                if (i2 >= 0) {
                    this.stableId = i2;
                } else {
                    int i3 = dialogsAdapter.stableIdPointer;
                    dialogsAdapter.stableIdPointer = i3 + 1;
                    this.stableId = i3;
                    dialogsAdapter.dialogsStableIds.put(dialog.id, i3);
                }
            } else if (i == 19) {
                this.stableId = 5;
            } else {
                int i4 = dialogsAdapter.stableIdPointer;
                dialogsAdapter.stableIdPointer = i4 + 1;
                this.stableId = i4;
            }
            if (dialog != null) {
                int i5 = dialogsAdapter.dialogsType;
                int i6 = dialogsAdapter.currentAccount;
                if (i5 != 7 && i5 != 8) {
                    this.pinned = dialog.pinned;
                } else {
                    MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i6).selectedDialogFilter[dialogsAdapter.dialogsType == 8 ? (char) 1 : (char) 0];
                    this.pinned = dialogFilter != null && dialogFilter.pinnedDialogs.indexOfKey(dialog.id) >= 0;
                }
                this.isFolder = dialog.isFolder;
                this.isForumCell = MessagesController.getInstance(i6).isForum(dialog.id);
            }
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, TLRPC.RecentMeUrl recentMeUrl) {
            super(4, true);
            this.recentMeUrl = recentMeUrl;
            int i = dialogsAdapter.stableIdPointer;
            dialogsAdapter.stableIdPointer = i + 1;
            this.stableId = i;
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, int i) {
            super(i, true);
            this.emptyType = i;
            if (i == 10) {
                this.stableId = 1;
            } else {
                if (i == 19) {
                    this.stableId = 5;
                    return;
                }
                int i2 = dialogsAdapter.stableIdPointer;
                dialogsAdapter.stableIdPointer = i2 + 1;
                this.stableId = i2;
            }
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, int i, int i2) {
            super(5, true);
            this.emptyType = i;
            int i3 = dialogsAdapter.stableIdPointer;
            dialogsAdapter.stableIdPointer = i3 + 1;
            this.stableId = i3;
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, TLRPC.TL_contact tL_contact) {
            super(6, true);
            this.contact = tL_contact;
            if (tL_contact != null) {
                int i = dialogsAdapter.dialogsStableIds.get(tL_contact.user_id, -1);
                if (i > 0) {
                    this.stableId = i;
                    return;
                }
                int i2 = dialogsAdapter.stableIdPointer;
                dialogsAdapter.stableIdPointer = i2 + 1;
                this.stableId = i2;
                dialogsAdapter.dialogsStableIds.put(tL_contact.user_id, i2);
                return;
            }
            int i3 = dialogsAdapter.stableIdPointer;
            dialogsAdapter.stableIdPointer = i3 + 1;
            this.stableId = i3;
        }
    }
}
