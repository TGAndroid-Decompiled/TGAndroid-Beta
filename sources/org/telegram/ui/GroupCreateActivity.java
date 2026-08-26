package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.WeakHashMap;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline2;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.GroupCreateSectionCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedPaint;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarConstructorFragment;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.FragmentSearchField;
import org.telegram.ui.Components.FragmentSpansContainer;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.Paint.Views.StoryLinkPreviewDialog;
import org.telegram.ui.Components.PermanentLinkBottomSheet;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.TopicsTabsView;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.VideoEditTextureView$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.SendButtonBlockedByTypingView;
import org.telegram.ui.Components.inset.WindowAnimatedInsetsProvider;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.StealthModeAlert;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.PreviewHighlightView;
import org.telegram.ui.community.CommunityEditActivity;

public class GroupCreateActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target, View.OnClickListener, WindowAnimatedInsetsProvider.Listener {
    public final int ADDITIONAL_LIST_HEIGHT_DP;
    public CalendarActivity.AnonymousClass5 actionBarBackgroundView;
    public GroupCreateAdapter adapter;
    public final boolean addToGroup;
    public ArrayList allSpans;
    public final boolean allowMiniApps;
    public final boolean allowPremium;
    public final BoolAnimator animatorCallButtonsVisible;
    public final FactorAnimator animatorSelectorContainerHeight;
    public AnonymousClass7 buttonsContainer;
    public final long channelId;
    public final int chatAddType;
    public final long chatId;
    public final int chatType;
    public GroupCreateSpan currentDeletingSpan;
    public String customTitle;
    public GroupCreateActivityDelegate delegate;
    public ContactsAddActivityDelegate delegate2;
    public boolean doneButtonVisible;
    public StickerEmptyView emptyView;
    public FragmentFloatingButton floatingButton;
    public final boolean forImport;
    public ChatActivity.AnonymousClass27 headerShadowView;
    public ViewGroupPartRenderer iBlur3Capture;
    public final RectF iBlur3PositionActionBar;
    public final RectF iBlur3PositionBottomBar;
    public final ArrayList iBlur3Positions;
    public final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    public LongSparseArray ignoreUsers;
    public int imeInsetAnimatedHeight;
    public TLRPC.ChatFull info;
    public final HashSet initialIds;
    public boolean initialMiniApps;
    public boolean initialPremium;
    public final boolean isAlwaysShare;
    public final boolean isCall;
    public final boolean isNeverShare;
    public LinearLayoutManager layoutManager;
    public RecyclerListView listView;
    public final int maxCount;
    public int maxSize;
    public int navigationBarHeight;
    public final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    public FragmentSearchField searchField;
    public boolean searchWas;
    public boolean searching;
    public LongSparseArray selectedContacts;
    public GroupCreateSpan selectedMiniApps;
    public GroupCreateSpan selectedPremium;
    public PermanentLinkBottomSheet sharedLinkBottomSheet;
    public int shiftDp;
    public boolean showDiscardConfirm;
    public AnonymousClass3 spansContainer;
    public final Rect tmpClipRect;
    public ArrayList toSelectIds;
    public boolean toSelectMiniApps;
    public boolean toSelectPremium;

    public final class AnonymousClass3 extends FragmentSpansContainer {
        public AnonymousClass3(Context context, int i) {
            super(context, i);
        }

        public final void addSpan(GroupCreateSpan groupCreateSpan) {
            this.spansContainer.addSpan(groupCreateSpan);
            GroupCreateActivity groupCreateActivity = GroupCreateActivity.this;
            if (groupCreateActivity.buttonsContainer == null) {
                return;
            }
            groupCreateActivity.animatorCallButtonsVisible.setValue(!groupCreateActivity.selectedContacts.isEmpty(), true);
        }

        public final void removeSpan(GroupCreateSpan groupCreateSpan) {
            GroupCreateActivity groupCreateActivity = GroupCreateActivity.this;
            if (groupCreateSpan == groupCreateActivity.selectedPremium) {
                groupCreateActivity.selectedPremium = null;
            }
            if (groupCreateSpan == groupCreateActivity.selectedMiniApps) {
                groupCreateActivity.selectedMiniApps = null;
            }
            this.spansContainer.removeSpan(groupCreateSpan);
            if (groupCreateActivity.buttonsContainer == null) {
                return;
            }
            groupCreateActivity.animatorCallButtonsVisible.setValue(!groupCreateActivity.selectedContacts.isEmpty(), true);
        }
    }

    public final class AnonymousClass4 implements View.OnKeyListener {
        public final int $r8$classId;
        public final BaseFragment this$0;
        public boolean wasEmpty;

        public AnonymousClass4(int i, BaseFragment baseFragment) {
            this.$r8$classId = i;
            this.this$0 = baseFragment;
        }

        @Override
        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            switch (this.$r8$classId) {
                case 0:
                    if (i != 67) {
                        return false;
                    }
                    int action = keyEvent.getAction();
                    GroupCreateActivity groupCreateActivity = (GroupCreateActivity) this.this$0;
                    if (action == 0) {
                        this.wasEmpty = groupCreateActivity.searchField.editText.length() == 0;
                        return false;
                    }
                    if (keyEvent.getAction() != 1 || !this.wasEmpty || groupCreateActivity.allSpans.isEmpty()) {
                        return false;
                    }
                    groupCreateActivity.spansContainer.removeSpan((GroupCreateSpan) zziq.m(1, groupCreateActivity.allSpans));
                    groupCreateActivity.updateHint();
                    groupCreateActivity.checkVisibleRows();
                    return true;
                default:
                    if (i != 67) {
                        return false;
                    }
                    int action2 = keyEvent.getAction();
                    UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.this$0;
                    if (action2 == 0) {
                        this.wasEmpty = usersSelectActivity.editText.length() == 0;
                        return false;
                    }
                    if (keyEvent.getAction() != 1 || !this.wasEmpty) {
                        return false;
                    }
                    ArrayList arrayList = usersSelectActivity.allSpans;
                    if (arrayList.isEmpty()) {
                        return false;
                    }
                    GroupCreateSpan groupCreateSpan = (GroupCreateSpan) zziq.m(1, arrayList);
                    usersSelectActivity.spansContainer.removeSpan(groupCreateSpan);
                    if (usersSelectActivity.type == 2) {
                        if (groupCreateSpan.getUid() == -9223372036854775800L) {
                            usersSelectActivity.filterFlags &= -2;
                        } else if (groupCreateSpan.getUid() == -9223372036854775799L) {
                            usersSelectActivity.filterFlags &= -3;
                        } else if (groupCreateSpan.getUid() == Long.MIN_VALUE) {
                            usersSelectActivity.filterFlags &= -5;
                        } else if (groupCreateSpan.getUid() == -9223372036854775807L) {
                            usersSelectActivity.filterFlags &= -9;
                        }
                    } else if (groupCreateSpan.getUid() == Long.MIN_VALUE) {
                        usersSelectActivity.filterFlags = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.filterFlags;
                    } else if (groupCreateSpan.getUid() == -9223372036854775807L) {
                        usersSelectActivity.filterFlags = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.filterFlags;
                    } else if (groupCreateSpan.getUid() == -9223372036854775806L) {
                        usersSelectActivity.filterFlags = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.filterFlags;
                    } else if (groupCreateSpan.getUid() == -9223372036854775805L) {
                        usersSelectActivity.filterFlags = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.filterFlags;
                    } else if (groupCreateSpan.getUid() == -9223372036854775804L) {
                        usersSelectActivity.filterFlags = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.filterFlags;
                    } else if (groupCreateSpan.getUid() == -9223372036854775803L) {
                        usersSelectActivity.filterFlags = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.filterFlags;
                    } else if (groupCreateSpan.getUid() == -9223372036854775802L) {
                        usersSelectActivity.filterFlags = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.filterFlags;
                    } else if (groupCreateSpan.getUid() == -9223372036854775801L) {
                        usersSelectActivity.filterFlags = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.filterFlags;
                    }
                    usersSelectActivity.updateHint$2();
                    usersSelectActivity.checkVisibleRows$2();
                    return true;
            }
        }
    }

    public final class Comparator implements java.util.Comparator {
        public static String getName(TLObject tLObject) {
            if (!(tLObject instanceof TLRPC.User)) {
                return tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "";
            }
            TLRPC.User user = (TLRPC.User) tLObject;
            return ContactsController.formatName(user.first_name, user.last_name);
        }

        @Override
        public final int compare(Object obj, Object obj2) {
            return getName((TLObject) obj).compareTo(getName((TLObject) obj2));
        }
    }

    public interface ContactsAddActivityDelegate {
        void didSelectUsers(int i, ArrayList arrayList);

        void needAddBot(TLRPC.User user);
    }

    public interface GroupCreateActivityDelegate {
        void didSelectUsers(ArrayList arrayList, boolean z, boolean z2);
    }

    public final class GroupCreateAdapter extends RecyclerListView.FastScrollAdapter {
        public final Context context;
        public int createCallLinkRow;
        public int currentItemsCount;
        public int firstSectionRow;
        public int inviteViaLink;
        public int miniAppsRow;
        public int noContactsStubRow;
        public int premiumRow;
        public final SearchAdapterHelper searchAdapterHelper;
        public Runnable searchRunnable;
        public boolean searching;
        public int userTypesHeaderRow;
        public int usersStartRow;
        public ArrayList searchResult = new ArrayList();
        public ArrayList searchResultNames = new ArrayList();
        public final ArrayList contacts = new ArrayList();

        public final class AnonymousClass1 extends StickerEmptyView {
            public final int $r8$classId;

            public AnonymousClass1(int i, Theme.ResourcesProvider resourcesProvider, Context context, View view, int i2) {
                super(i, resourcesProvider, context, view);
                this.$r8$classId = i2;
            }

            @Override
            public final void onAttachedToWindow() {
                switch (this.$r8$classId) {
                    case 0:
                        super.onAttachedToWindow();
                        this.stickerView.getImageReceiver().startAnimation();
                        break;
                    default:
                        super.onAttachedToWindow();
                        this.stickerView.getImageReceiver().startAnimation();
                        break;
                }
            }
        }

        public GroupCreateAdapter(Context context) {
            TLRPC.Chat chat;
            TLRPC.User user;
            this.context = context;
            HashSet hashSet = new HashSet();
            ArrayList<TLRPC.TL_contact> arrayList = GroupCreateActivity.this.getContactsController().contacts;
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.User user2 = GroupCreateActivity.this.getMessagesController().getUser(Long.valueOf(arrayList.get(i).user_id));
                if (user2 != null && !user2.self && !user2.deleted) {
                    this.contacts.add(user2);
                    hashSet.add(Long.valueOf(user2.id));
                }
            }
            boolean z = GroupCreateActivity.this.isNeverShare;
            boolean z2 = GroupCreateActivity.this.isCall;
            if (z || GroupCreateActivity.this.isAlwaysShare || z2) {
                ArrayList<TLRPC.Dialog> allDialogs = GroupCreateActivity.this.getMessagesController().getAllDialogs();
                if (z2) {
                    int size = allDialogs.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        TLRPC.Dialog dialog = allDialogs.get(i2);
                        if (DialogObject.isUserDialog(dialog.id) && !hashSet.contains(Long.valueOf(dialog.id)) && (user = GroupCreateActivity.this.getMessagesController().getUser(Long.valueOf(dialog.id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.id) && !MessagesController.isSupportUser(user)) {
                            this.contacts.add(user);
                            hashSet.add(Long.valueOf(user.id));
                        }
                    }
                } else {
                    int size2 = allDialogs.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        TLRPC.Dialog dialog2 = allDialogs.get(i3);
                        if (DialogObject.isChatDialog(dialog2.id) && (chat = GroupCreateActivity.this.getMessagesController().getChat(Long.valueOf(-dialog2.id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                            this.contacts.add(chat);
                        }
                    }
                }
                Collections.sort(this.contacts, new Comparator());
                TLObject tLObject = null;
                int i4 = 0;
                while (i4 < this.contacts.size()) {
                    TLObject tLObject2 = (TLObject) this.contacts.get(i4);
                    if (tLObject != null) {
                        String name = Comparator.getName(tLObject);
                        String strSubstring = TextUtils.isEmpty(name) ? "" : name.substring(0, 1);
                        String name2 = Comparator.getName(tLObject2);
                        if (!strSubstring.equals(TextUtils.isEmpty(name2) ? "" : name2.substring(0, 1))) {
                            ArrayList arrayList2 = this.contacts;
                            String name3 = Comparator.getName(tLObject2);
                            arrayList2.add(i4, new Letter(TextUtils.isEmpty(name3) ? "" : name3.substring(0, 1)));
                        }
                    } else {
                        ArrayList arrayList3 = this.contacts;
                        String name4 = Comparator.getName(tLObject2);
                        arrayList3.add(i4, new Letter(TextUtils.isEmpty(name4) ? "" : name4.substring(0, 1)));
                    }
                    i4++;
                    tLObject = tLObject2;
                }
            }
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(false);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.delegate = new VideoEditTextureView$$ExternalSyntheticLambda1(this, 27);
        }

        @Override
        public final int getItemCount() {
            int i;
            this.noContactsStubRow = -1;
            this.userTypesHeaderRow = -1;
            this.createCallLinkRow = -1;
            this.firstSectionRow = -1;
            this.premiumRow = -1;
            this.miniAppsRow = -1;
            if (this.searching) {
                int size = this.searchResult.size();
                SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
                int size2 = searchAdapterHelper.localServerSearch.size();
                int size3 = searchAdapterHelper.globalSearch.size();
                int i2 = size + size2;
                if (size3 != 0) {
                    i2 += size3 + 1;
                }
                this.currentItemsCount = i2;
                return i2;
            }
            GroupCreateActivity groupCreateActivity = GroupCreateActivity.this;
            if (groupCreateActivity.isCall) {
                this.createCallLinkRow = 0;
                i = 1;
            } else {
                i = 0;
            }
            if (groupCreateActivity.allowPremium) {
                int i3 = i + 1;
                this.firstSectionRow = i;
                this.userTypesHeaderRow = i;
                i += 2;
                this.premiumRow = i3;
            } else if (groupCreateActivity.allowMiniApps) {
                int i4 = i + 1;
                this.firstSectionRow = i;
                this.userTypesHeaderRow = i;
                i += 2;
                this.miniAppsRow = i4;
            } else {
                this.firstSectionRow = i;
            }
            this.usersStartRow = i;
            int size4 = this.contacts.size() + i;
            if (groupCreateActivity.addToGroup) {
                long j = groupCreateActivity.chatId;
                if (j != 0) {
                    this.inviteViaLink = ChatObject.canUserDoAdminAction(groupCreateActivity.getMessagesController().getChat(Long.valueOf(j)), 3) ? 1 : 0;
                } else {
                    long j2 = groupCreateActivity.channelId;
                    if (j2 != 0) {
                        TLRPC.Chat chat = groupCreateActivity.getMessagesController().getChat(Long.valueOf(j2));
                        this.inviteViaLink = (!ChatObject.canUserDoAdminAction(chat, 3) || ChatObject.isPublic(chat)) ? 0 : 2;
                    } else {
                        this.inviteViaLink = 0;
                    }
                }
                if (this.inviteViaLink != 0) {
                    this.usersStartRow++;
                    size4++;
                }
            }
            if (size4 == 0) {
                this.noContactsStubRow = 0;
                size4++;
            }
            this.currentItemsCount = size4;
            return size4;
        }

        @Override
        public final int getItemViewType(int i) {
            if (this.searching) {
                return i == this.searchAdapterHelper.localServerSearch.size() + this.searchResult.size() ? 0 : 1;
            }
            if (i == this.createCallLinkRow) {
                return 2;
            }
            if (i == this.userTypesHeaderRow) {
                return 0;
            }
            if (i == this.premiumRow || i == this.miniAppsRow) {
                return 1;
            }
            if (this.inviteViaLink != 0 && i == 0) {
                return 2;
            }
            if (this.noContactsStubRow == i) {
                return 3;
            }
            int i2 = i - this.usersStartRow;
            if (i2 < 0) {
                return 1;
            }
            ArrayList arrayList = this.contacts;
            return (i2 >= arrayList.size() || !(arrayList.get(i - this.usersStartRow) instanceof Letter)) ? 1 : 0;
        }

        @Override
        public final String getLetter(int i) {
            String str;
            String str2;
            if (this.searching || i < this.usersStartRow) {
                return null;
            }
            ArrayList arrayList = this.contacts;
            int size = arrayList.size();
            int i2 = this.usersStartRow;
            if (i >= size + i2) {
                return null;
            }
            TLObject tLObject = (TLObject) arrayList.get(i - i2);
            if (tLObject instanceof Letter) {
                return ((Letter) tLObject).letter;
            }
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                str = user.first_name;
                str2 = user.last_name;
            } else {
                str = ((TLRPC.Chat) tLObject).title;
                str2 = "";
            }
            if (LocaleController.nameDisplayOrder == 1) {
                if (!TextUtils.isEmpty(str)) {
                    return str.substring(0, 1).toUpperCase();
                }
                if (!TextUtils.isEmpty(str2)) {
                    return str2.substring(0, 1).toUpperCase();
                }
            } else {
                if (!TextUtils.isEmpty(str2)) {
                    return str2.substring(0, 1).toUpperCase();
                }
                if (!TextUtils.isEmpty(str)) {
                    return str.substring(0, 1).toUpperCase();
                }
            }
            return "";
        }

        @Override
        public final void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = (int) (getItemCount() * f);
            iArr[1] = 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.mItemViewType == 0) {
                return false;
            }
            GroupCreateActivity groupCreateActivity = GroupCreateActivity.this;
            if (groupCreateActivity.ignoreUsers == null) {
                return true;
            }
            View view = viewHolder.itemView;
            if (!(view instanceof GroupCreateUserCell)) {
                return true;
            }
            Object object = ((GroupCreateUserCell) view).getObject();
            return !(object instanceof TLRPC.User) || groupCreateActivity.ignoreUsers.indexOfKey(((TLRPC.User) object).id) < 0;
        }

        @Override
        public final void notifyDataSetChanged() {
            this.mObservable.notifyChanged();
            GroupCreateActivity.this.updateEditTextHint();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLObject tLObject;
            CharSequence charSequence;
            long j;
            LongSparseArray longSparseArray;
            boolean z;
            String publicUsername;
            int i2 = viewHolder.mItemViewType;
            ArrayList arrayList = this.contacts;
            GroupCreateActivity groupCreateActivity = GroupCreateActivity.this;
            View view = viewHolder.itemView;
            if (i2 == 0) {
                GraySectionCell graySectionCell = (GraySectionCell) view;
                if (this.searching) {
                    graySectionCell.setText(LocaleController.getString(R.string.GlobalSearch));
                } else if (i == this.userTypesHeaderRow) {
                    graySectionCell.setText(LocaleController.getString(R.string.PrivacyUserTypes));
                } else {
                    int i3 = i - this.usersStartRow;
                    if (i3 >= 0 && i3 < arrayList.size()) {
                        TLObject tLObject2 = (TLObject) arrayList.get(i - this.usersStartRow);
                        if (tLObject2 instanceof Letter) {
                            graySectionCell.setText(((Letter) tLObject2).letter.toUpperCase());
                        }
                    }
                }
                if (i == this.firstSectionRow) {
                    graySectionCell.setRightText((groupCreateActivity.selectedPremium == null && groupCreateActivity.selectedContacts.isEmpty()) ? "" : LocaleController.getString(R.string.DeselectAll), new OAuthSheet$$ExternalSyntheticLambda4(this, 2));
                    return;
                }
                return;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                TextCell textCell = (TextCell) view;
                if (i == this.createCallLinkRow) {
                    textCell.setTextAndIcon(R.drawable.menu_link_create2, (CharSequence) LocaleController.getString(R.string.GroupCallCreateLink), false);
                    textCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                    return;
                } else if (this.inviteViaLink == 2) {
                    textCell.setTextAndIcon(R.drawable.msg_link2, (CharSequence) LocaleController.getString(R.string.ChannelInviteViaLink), false);
                    textCell.setColors(Theme.key_windowBackgroundWhiteGrayIcon, Theme.key_windowBackgroundWhiteBlackText);
                    return;
                } else {
                    textCell.setTextAndIcon(R.drawable.msg_link2, (CharSequence) LocaleController.getString(R.string.InviteToGroupByLink), false);
                    textCell.setColors(Theme.key_windowBackgroundWhiteGrayIcon, Theme.key_windowBackgroundWhiteBlackText);
                    return;
                }
            }
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
            CharSequence charSequence2 = null;
            if (this.searching) {
                int size = this.searchResult.size();
                SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
                int size2 = searchAdapterHelper.globalSearch.size();
                ArrayList arrayList2 = searchAdapterHelper.localServerSearch;
                int size3 = arrayList2.size();
                if (i >= 0 && i < size) {
                    tLObject = (TLObject) this.searchResult.get(i);
                } else if (i < size || i >= size3 + size) {
                    tLObject = (i <= size + size3 || i > (size2 + size) + size3) ? null : (TLObject) searchAdapterHelper.globalSearch.get(((i - size) - size3) - 1);
                } else {
                    tLObject = (TLObject) arrayList2.get(i - size);
                }
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.User) {
                        publicUsername = ((TLRPC.User) tLObject).username;
                    } else if (!(tLObject instanceof TLRPC.Chat)) {
                        return;
                    } else {
                        publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) tLObject);
                    }
                    if (i < size) {
                        charSequence = (CharSequence) this.searchResultNames.get(i);
                        if (charSequence == null || TextUtils.isEmpty(publicUsername)) {
                            charSequence2 = charSequence;
                            charSequence = null;
                        } else {
                            if (!charSequence.toString().startsWith("@" + publicUsername)) {
                                charSequence2 = charSequence;
                                charSequence = null;
                            }
                        }
                    } else if (i > size && !TextUtils.isEmpty(publicUsername)) {
                        String strSubstring = searchAdapterHelper.lastFoundUsername;
                        if (strSubstring.startsWith("@")) {
                            strSubstring = strSubstring.substring(1);
                        }
                        try {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            spannableStringBuilder.append((CharSequence) "@");
                            spannableStringBuilder.append((CharSequence) publicUsername);
                            int iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, strSubstring);
                            if (iIndexOfIgnoreCase != -1) {
                                int length = strSubstring.length();
                                if (iIndexOfIgnoreCase == 0) {
                                    length++;
                                } else {
                                    iIndexOfIgnoreCase++;
                                }
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false)), iIndexOfIgnoreCase, length + iIndexOfIgnoreCase, 33);
                            }
                            charSequence = spannableStringBuilder;
                        } catch (Exception unused) {
                            charSequence = publicUsername;
                        }
                    }
                }
                groupCreateUserCell.setObject(tLObject, charSequence2, charSequence);
                if (tLObject instanceof TLRPC.User) {
                    j = ((TLRPC.User) tLObject).id;
                } else if (tLObject instanceof TLRPC.Chat) {
                    j = -((TLRPC.Chat) tLObject).id;
                } else {
                    j = 0;
                }
                if (j != 0) {
                    longSparseArray = groupCreateActivity.ignoreUsers;
                    if (longSparseArray == null && longSparseArray.indexOfKey(j) >= 0) {
                        groupCreateUserCell.setChecked(true, false);
                        groupCreateUserCell.setCheckBoxEnabled(false);
                        return;
                    }
                    if (groupCreateActivity.selectedContacts.indexOfKey(j) >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    groupCreateUserCell.setChecked(z, false);
                    groupCreateUserCell.setCheckBoxEnabled(true);
                }
            }
            if (i == this.premiumRow) {
                groupCreateUserCell.currentPremium = true;
                groupCreateUserCell.currentObject = "premium";
                groupCreateUserCell.avatarImageView.setImageDrawable(new CombinedDrawable(new TextCell.AnonymousClass2(new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient2, Theme.key_premiumGradient1, -1, -1, null), 2), groupCreateUserCell.getContext().getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0));
                groupCreateUserCell.nameTextView.setText(LocaleController.getString(R.string.PrivacyPremium), false);
                SimpleTextView simpleTextView = groupCreateUserCell.statusTextView;
                int i4 = Theme.key_windowBackgroundWhiteGrayText;
                simpleTextView.setTag(Integer.valueOf(i4));
                if (groupCreateUserCell.forceDarkTheme) {
                    i4 = Theme.key_voipgroup_lastSeenText;
                }
                simpleTextView.setTextColor(Theme.getColor(i4, groupCreateUserCell.resourcesProvider));
                simpleTextView.setEmojiColor(simpleTextView.getTextColor());
                simpleTextView.setText(LocaleController.getString(R.string.PrivacyPremiumText), false);
                groupCreateUserCell.setChecked(groupCreateActivity.selectedPremium != null, false);
                return;
            }
            if (i == this.miniAppsRow) {
                groupCreateUserCell.currentMiniapps = true;
                groupCreateUserCell.currentObject = "miniapps";
                BackupImageView backupImageView = groupCreateUserCell.avatarImageView;
                groupCreateUserCell.getContext();
                backupImageView.setImageDrawable(GroupCreateUserCell.makeMiniAppsDrawable(false));
                groupCreateUserCell.nameTextView.setText(LocaleController.getString(R.string.PrivacyMiniapps), false);
                SimpleTextView simpleTextView2 = groupCreateUserCell.statusTextView;
                int i5 = Theme.key_windowBackgroundWhiteGrayText;
                simpleTextView2.setTag(Integer.valueOf(i5));
                if (groupCreateUserCell.forceDarkTheme) {
                    i5 = Theme.key_voipgroup_lastSeenText;
                }
                simpleTextView2.setTextColor(Theme.getColor(i5, groupCreateUserCell.resourcesProvider));
                simpleTextView2.setEmojiColor(simpleTextView2.getTextColor());
                simpleTextView2.setText(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                groupCreateUserCell.setChecked(groupCreateActivity.selectedMiniApps != null, false);
                return;
            }
            tLObject = (TLObject) arrayList.get(i - this.usersStartRow);
            charSequence = null;
            groupCreateUserCell.setObject(tLObject, charSequence2, charSequence);
            if (tLObject instanceof TLRPC.User) {
                j = ((TLRPC.User) tLObject).id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j = -((TLRPC.Chat) tLObject).id;
            } else {
                j = 0;
            }
            if (j != 0) {
                longSparseArray = groupCreateActivity.ignoreUsers;
                if (longSparseArray == null) {
                }
                if (groupCreateActivity.selectedContacts.indexOfKey(j) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                groupCreateUserCell.setChecked(z, false);
                groupCreateUserCell.setCheckBoxEnabled(true);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View groupCreateUserCell;
            Theme.ResourcesProvider resourcesProvider = null;
            boolean z = false;
            Context context = this.context;
            if (i == 0) {
                groupCreateUserCell = new GraySectionCell(context, 16, null);
            } else if (i == 1) {
                groupCreateUserCell = new GroupCreateUserCell(1, 0, this.context, null, false, false);
            } else if (i != 3) {
                groupCreateUserCell = new TextCell(context);
            } else {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(0, resourcesProvider, context, z ? 1 : 0, 0);
                anonymousClass1.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                anonymousClass1.subtitle.setVisibility(8);
                anonymousClass1.title.setText(LocaleController.getString(R.string.NoContacts));
                anonymousClass1.setAnimateLayoutChange(true);
                groupCreateUserCell = anonymousClass1;
            }
            return new RecyclerListView.Holder(groupCreateUserCell);
        }

        @Override
        public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof GroupCreateUserCell) {
                ((GroupCreateUserCell) view).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }

        public final void searchDialogs(String str) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            this.searchResult.clear();
            this.searchResultNames.clear();
            this.searchAdapterHelper.mergeResults(null, null);
            SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
            GroupCreateActivity groupCreateActivity = GroupCreateActivity.this;
            searchAdapterHelper.queryServerSearch(null, true, groupCreateActivity.isAlwaysShare || groupCreateActivity.isNeverShare, false, false, false, 0L, false, 0, 0, 0L, null);
            notifyDataSetChanged();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda1 groupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda1 = new GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda1(this, str, 0);
            this.searchRunnable = groupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda1;
            dispatchQueue.postRunnable(groupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda1, 300L);
        }
    }

    public final class Letter extends TLRPC.TL_contact {
        public final String letter;

        public Letter(String str) {
            this.letter = str;
        }
    }

    public GroupCreateActivity(Bundle bundle) {
        super(bundle);
        int i = Build.VERSION.SDK_INT;
        this.ADDITIONAL_LIST_HEIGHT_DP = i >= 31 ? 48 : 0;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorSelectorContainerHeight = new FactorAnimator(3, this, cubicBezierInterpolator, 350L);
        this.animatorCallButtonsVisible = new BoolAnimator(4, this, cubicBezierInterpolator, 350L, false);
        this.selectedContacts = new LongSparseArray();
        this.allSpans = new ArrayList();
        this.initialIds = new HashSet();
        this.shiftDp = -4;
        this.tmpClipRect = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        RectF rectF2 = new RectF();
        this.iBlur3PositionBottomBar = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        int i2 = bundle.getInt("chatType", 0);
        this.chatType = i2;
        this.forImport = bundle.getBoolean("forImport", false);
        boolean z = bundle.getBoolean("isAlwaysShare", false);
        this.isAlwaysShare = z;
        boolean z2 = bundle.getBoolean("isNeverShare", false);
        this.isNeverShare = z2;
        boolean z3 = bundle.getBoolean("isCall", false);
        this.isCall = z3;
        boolean z4 = bundle.getBoolean("addToGroup", false);
        this.addToGroup = z4;
        this.chatAddType = bundle.getInt("chatAddType", 0);
        this.allowPremium = bundle.getBoolean("allowPremium", false);
        this.allowMiniApps = bundle.getBoolean("allowMiniapps", false);
        this.chatId = bundle.getLong("chatId");
        this.channelId = bundle.getLong("channelId");
        if (z || z2 || z4) {
            this.maxCount = 0;
        } else if (z3) {
            this.maxCount = getMessagesController().conferenceCallSizeLimit - 1;
        } else {
            this.maxCount = i2 == 0 ? getMessagesController().maxMegagroupCount : getMessagesController().maxBroadcastCount;
        }
        if (i >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(false);
            this.iBlur3SourceGlassFrosted = new BlurredBackgroundSourceRenderNode(null);
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
        }
    }

    public static void access$3700(GroupCreateActivity groupCreateActivity, Canvas canvas, RectF rectF, Paint paint) {
        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT < 29 || !SharedConfig.chatBlurEnabled() || (blurredBackgroundSourceRenderNode = groupCreateActivity.iBlur3SourceGlassFrosted) == null) {
            return;
        }
        blurredBackgroundSourceRenderNode.draw(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
        int alpha = paint.getAlpha();
        paint.setAlpha(178);
        canvas.drawRect(rectF, paint);
        paint.setAlpha(alpha);
    }

    public final void blur3_InvalidateBlur$5() {
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
        if (Build.VERSION.SDK_INT < 31 || (downscaleScrollableNoiseSuppressor = this.scrollableViewNoiseSuppressor) == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        int iDp2 = AndroidUtilities.dp(48.0f) + this.maxSize;
        RectF rectF = this.iBlur3PositionActionBar;
        rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + iDp2);
        float f = -iDp;
        rectF.inset(0.0f, f);
        if (this.buttonsContainer != null) {
            RectF rectF2 = this.iBlur3PositionBottomBar;
            rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.buttonsContainer.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
            rectF2.inset(0.0f, f);
        }
        downscaleScrollableNoiseSuppressor.setupRenderNodes((this.buttonsContainer == null || this.animatorCallButtonsVisible.floatValue <= 0.0f) ? 1 : 2, this.iBlur3Positions);
        downscaleScrollableNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override
    public final boolean canBeginSlide() {
        return checkDiscard$3(true);
    }

    public final boolean checkDiscard$3(boolean z) {
        boolean z2;
        if (this.showDiscardConfirm) {
            HashSet<Long> hashSet = new HashSet();
            for (int i = 0; i < this.selectedContacts.size(); i++) {
                hashSet.add(Long.valueOf(this.selectedContacts.keyAt(i)));
            }
            boolean z3 = this.initialPremium;
            boolean z4 = this.selectedPremium == null;
            HashSet hashSet2 = this.initialIds;
            if (z3 == z4) {
                z2 = true;
            } else if (this.initialMiniApps == (this.selectedMiniApps == null) || hashSet.size() != hashSet2.size()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                for (Long l : hashSet) {
                    l.getClass();
                    if (!hashSet2.contains(l)) {
                        z2 = true;
                        break;
                    }
                }
            }
            if (z2) {
                if (z) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                    String string = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string;
                    alertDialog.message = LocaleController.getString(R.string.PrivacySettingsChangedAlert);
                    builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new GroupCreateActivity$$ExternalSyntheticLambda0(this, 3));
                    builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new GroupCreateActivity$$ExternalSyntheticLambda0(this, 1));
                    showDialog(alertDialog);
                }
                return false;
            }
        }
        return true;
    }

    public final void checkUi_bottomButtons() {
        AnonymousClass7 anonymousClass7 = this.buttonsContainer;
        if (anonymousClass7 == null) {
            return;
        }
        float f = this.animatorCallButtonsVisible.floatValue;
        anonymousClass7.setTranslationY((1.0f - f) * AndroidUtilities.dp(12.0f));
        this.buttonsContainer.setAlpha(f);
        this.buttonsContainer.setVisibility(f > 0.0f ? 0 : 8);
    }

    public final void checkUi_listClip$1() {
        if (this.listView.hasActiveEdgeEffects()) {
            this.listView.setClipBounds(null);
            return;
        }
        int iDp = (int) ((AndroidUtilities.dp(76.0f) + this.navigationBarHeight) * this.animatorCallButtonsVisible.floatValue);
        int i = this.ADDITIONAL_LIST_HEIGHT_DP;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i + 48) + ((int) this.animatorSelectorContainerHeight.factor);
        int measuredWidth = this.listView.getMeasuredWidth();
        int iM = RichMessageLayout$$ExternalSyntheticOutline2.m(this.listView.getMeasuredHeight(), i, iDp);
        Rect rect = this.tmpClipRect;
        rect.set(0, measuredHeight, measuredWidth, iM);
        this.listView.setClipBounds(rect);
    }

    public final void checkUi_listViewPadding$3() {
        int iDp = this.isCall ? AndroidUtilities.dp(76.0f) : 0;
        RecyclerListView recyclerListView = this.listView;
        int i = this.ADDITIONAL_LIST_HEIGHT_DP;
        recyclerListView.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i + 48) + ((int) this.animatorSelectorContainerHeight.factor), 0, AndroidUtilities.dp(i) + this.navigationBarHeight + iDp);
        this.emptyView.setPadding(0, 0, 0, this.navigationBarHeight);
    }

    public final void checkVisibleRows() {
        long j;
        int childCount = this.listView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof GroupCreateUserCell) {
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) childAt;
                Object object = groupCreateUserCell.getObject();
                if (object instanceof TLRPC.User) {
                    j = ((TLRPC.User) object).id;
                } else if (object instanceof TLRPC.Chat) {
                    j = -((TLRPC.Chat) object).id;
                } else {
                    boolean z = object instanceof String;
                    if (z && "premium".equalsIgnoreCase((String) object)) {
                        groupCreateUserCell.setChecked(this.selectedPremium != null, true);
                        groupCreateUserCell.setCheckBoxEnabled(true);
                    } else if (z && "miniapps".equalsIgnoreCase((String) object)) {
                        groupCreateUserCell.setChecked(this.selectedMiniApps != null, true);
                        groupCreateUserCell.setCheckBoxEnabled(true);
                    } else {
                        j = 0;
                    }
                }
                if (j != 0) {
                    LongSparseArray longSparseArray = this.ignoreUsers;
                    if (longSparseArray == null || longSparseArray.indexOfKey(j) < 0) {
                        groupCreateUserCell.setChecked(this.selectedContacts.indexOfKey(j) >= 0, true);
                        groupCreateUserCell.setCheckBoxEnabled(true);
                    } else {
                        groupCreateUserCell.setChecked(true, false);
                        groupCreateUserCell.setCheckBoxEnabled(false);
                    }
                }
            } else if (childAt instanceof GraySectionCell) {
                this.listView.getClass();
                if (RecyclerView.getChildAdapterPosition(childAt) == this.adapter.firstSectionRow) {
                    ((GraySectionCell) childAt).setRightText((this.selectedPremium == null && this.selectedContacts.isEmpty()) ? "" : LocaleController.getString(R.string.DeselectAll), new GroupCreateActivity$$ExternalSyntheticLambda1(this, 1));
                }
            }
        }
    }

    @Override
    public final ActionBar createActionBar(Context context) {
        ActionBar actionBarCreateActionBar = super.createActionBar(context);
        actionBarCreateActionBar.setAddToContainer(false);
        return actionBarCreateActionBar;
    }

    @Override
    public final View createView(Context context) {
        boolean z;
        LoginActivity.AnonymousClass4 anonymousClass4;
        ArrayList arrayList;
        int i;
        FragmentFloatingButton fragmentFloatingButton;
        LaunchActivity launchActivity;
        int i2 = 3;
        int i3 = 22;
        int i4 = 5;
        int i5 = 0;
        this.searching = false;
        this.searchWas = false;
        this.allSpans.clear();
        this.selectedContacts.clear();
        this.currentDeletingSpan = null;
        boolean z2 = this.addToGroup;
        int i6 = this.chatType;
        int i7 = 2;
        if (i6 == 2) {
            this.doneButtonVisible = true;
        } else {
            this.doneButtonVisible = !z2;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean zIsEmpty = TextUtils.isEmpty(this.customTitle);
        boolean z3 = this.isNeverShare;
        boolean z4 = this.isAlwaysShare;
        boolean z5 = this.isCall;
        if (!zIsEmpty) {
            this.actionBar.setTitle(this.customTitle);
        } else {
            if (i6 != 2) {
                if (z5) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.NewCall));
                } else if (z2) {
                    z = z2;
                    if (this.channelId != 0) {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
                    } else {
                        this.actionBar.setTitle(LocaleController.getString(R.string.GroupAddMembers));
                    }
                } else {
                    z = z2;
                    int i8 = this.chatAddType;
                    if (z4) {
                        if (i8 == 2) {
                            this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
                        } else if (i8 == 1) {
                            this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysAllow));
                        } else {
                            this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysShareWithTitle));
                        }
                    } else if (!z3) {
                        this.actionBar.setTitle(LocaleController.getString(i6 == 0 ? R.string.NewGroup : R.string.NewBroadcastList));
                    } else if (i8 == 2) {
                        this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
                    } else if (i8 == 1) {
                        this.actionBar.setTitle(LocaleController.getString(R.string.NeverAllow));
                    } else {
                        this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
                    }
                }
                this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 21));
                this.searchField = new FragmentSearchField(context, this.resourceProvider);
                anonymousClass4 = new LoginActivity.AnonymousClass4(this, context, i4);
                this.fragmentView = anonymousClass4;
                anonymousClass4.setFocusableInTouchMode(true);
                anonymousClass4.setDescendantFocusability(131072);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(context, this.currentAccount);
                this.spansContainer = anonymousClass3;
                anonymousClass3.setDelegate(new GroupCreateActivity$$ExternalSyntheticLambda0(this, i5));
                this.spansContainer.getSpansContainer().setOnClickListener(new GroupCreateActivity$$ExternalSyntheticLambda1(this, i5));
                AnonymousClass3 anonymousClass5 = this.spansContainer;
                this.selectedContacts = anonymousClass5.selectedContacts;
                this.allSpans = anonymousClass5.allSpans;
                updateEditTextHint();
                this.searchField.editText.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(this, 15));
                this.searchField.editText.setOnKeyListener(new AnonymousClass4(i5, this));
                this.searchField.editText.addTextChangedListener(new ArticleViewer.AnonymousClass16(this, i3));
                arrayList = this.toSelectIds;
                if (arrayList != null) {
                    select(arrayList, this.toSelectPremium, this.toSelectMiniApps);
                }
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
                flickerLoadingView.setViewType(6);
                flickerLoadingView.showDate = false;
                StickerEmptyView stickerEmptyView = new StickerEmptyView(1, null, context, flickerLoadingView);
                this.emptyView = stickerEmptyView;
                stickerEmptyView.addView(flickerLoadingView);
                this.emptyView.showProgress(true, false);
                this.emptyView.title.setText(LocaleController.getString(R.string.NoResult));
                anonymousClass4.addView(this.emptyView);
                this.layoutManager = new LinearLayoutManager(1, false);
                RecyclerListView recyclerListView = new RecyclerListView(context, null);
                this.listView = recyclerListView;
                recyclerListView.setFastScrollEnabled(0);
                this.listView.setEmptyView(this.emptyView);
                RecyclerListView recyclerListView2 = this.listView;
                GroupCreateAdapter groupCreateAdapter = new GroupCreateAdapter(context);
                this.adapter = groupCreateAdapter;
                recyclerListView2.setAdapter(groupCreateAdapter);
                this.listView.setLayoutManager(this.layoutManager);
                this.listView.setVerticalScrollBarEnabled(false);
                this.listView.setClipToPadding(false);
                RecyclerListView recyclerListView3 = this.listView;
                if (LocaleController.isRTL) {
                    i = 1;
                } else {
                    i = 2;
                }
                recyclerListView3.setVerticalScrollbarPosition(i);
                RecyclerListView recyclerListView4 = this.listView;
                float f = -this.ADDITIONAL_LIST_HEIGHT_DP;
                anonymousClass4.addView(recyclerListView4, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, f, 0.0f, f));
                this.listView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(16, this, context));
                this.listView.setOnScrollListener(new LocationActivity.AnonymousClass10(this, i3));
                RecyclerListView recyclerListView5 = this.listView;
                recyclerListView5.animateEmptyView = true;
                recyclerListView5.emptyViewAnimationType = 0;
                fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider, false);
                this.floatingButton = fragmentFloatingButton;
                if (!z3 || z4 || z) {
                    fragmentFloatingButton.imageView.setImageResource(R.drawable.floating_check);
                } else {
                    BackDrawable backDrawable = new BackDrawable(false);
                    backDrawable.arrowRotation = 180;
                    backDrawable.invalidateSelf();
                    this.floatingButton.imageView.setImageDrawable(backDrawable);
                }
                if (!z5) {
                    anonymousClass4.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParams());
                }
                this.floatingButton.setOnClickListener(new GroupCreateActivity$$ExternalSyntheticLambda1(this, i7));
                this.floatingButton.animatorButtonVisible.setValue(this.doneButtonVisible, false);
                this.floatingButton.setContentDescription(LocaleController.getString(R.string.Next));
                if (z5) {
                    this.buttonsContainer = new AnonymousClass7(this, context);
                    View view = new View(context);
                    view.setBackgroundColor(Theme.getColor(Theme.key_divider, this.resourceProvider));
                    this.buttonsContainer.addView(view, LayoutHelper.createFrame(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
                    this.buttonsContainer.addView(linearLayout, LayoutHelper.createFrame(-1, -2, 87));
                    ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, this.resourceProvider, true);
                    buttonWithCounterView.setRoundRadius(24);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "x  ");
                    spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.profile_phone), 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
                    buttonWithCounterView.setText(spannableStringBuilder, false, true);
                    linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 1.0f, 119, 0, 0, 6, 0));
                    buttonWithCounterView.setOnClickListener(new GroupCreateActivity$$ExternalSyntheticLambda1(this, i2));
                    ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, this.resourceProvider, true);
                    buttonWithCounterView2.setRoundRadius(24);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) "x  ");
                    spannableStringBuilder2.setSpan(new ColoredImageSpan(R.drawable.profile_video), 0, 1, 33);
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
                    buttonWithCounterView2.setText(spannableStringBuilder2, false, true);
                    linearLayout.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48, 1.0f, 119, 6, 0, 0, 0));
                    buttonWithCounterView2.setOnClickListener(new GroupCreateActivity$$ExternalSyntheticLambda1(this, 4));
                    anonymousClass4.addView(this.buttonsContainer, LayoutHelper.createFrame(-1, -2, 87));
                    checkUi_bottomButtons();
                }
                updateHint();
                CalendarActivity.AnonymousClass5 anonymousClass6 = new CalendarActivity.AnonymousClass5(this, context);
                this.actionBarBackgroundView = anonymousClass6;
                anonymousClass4.addView(anonymousClass6, LayoutHelper.createFrame(-1, 0, 48));
                anonymousClass4.addView(this.actionBar);
                anonymousClass4.addView(this.searchField, LayoutHelper.createFrame(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                anonymousClass4.addView(this.spansContainer);
                RecyclerListView recyclerListView6 = this.listView;
                Objects.requireNonNull(recyclerListView6);
                this.iBlur3Capture = new ViewGroupPartRenderer(recyclerListView6, anonymousClass4, new TopicsFragment$$ExternalSyntheticLambda7(recyclerListView6, 3));
                this.listView.addEdgeEffectListener(new GroupCreateActivity$$ExternalSyntheticLambda7(this, i5));
                ChatActivity.AnonymousClass27 anonymousClass27 = new ChatActivity.AnonymousClass27(context, this.parentLayout);
                this.headerShadowView = anonymousClass27;
                ((BoolAnimator) anonymousClass27.this$0).setValue(false, false);
                anonymousClass4.addView(this.headerShadowView, LayoutHelper.createFrame(-1, 5, 48));
                launchActivity = LaunchActivity.instance;
                if (launchActivity != null) {
                    launchActivity.rootAnimatedInsetsListener.listeners.add(this);
                }
                View view2 = this.fragmentView;
                GroupCreateActivity$$ExternalSyntheticLambda0 groupCreateActivity$$ExternalSyntheticLambda0 = new GroupCreateActivity$$ExternalSyntheticLambda0(this, 2);
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view2, groupCreateActivity$$ExternalSyntheticLambda0);
                return this.fragmentView;
            }
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
        }
        z = z2;
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 21));
        this.searchField = new FragmentSearchField(context, this.resourceProvider);
        anonymousClass4 = new LoginActivity.AnonymousClass4(this, context, i4);
        this.fragmentView = anonymousClass4;
        anonymousClass4.setFocusableInTouchMode(true);
        anonymousClass4.setDescendantFocusability(131072);
        AnonymousClass3 anonymousClass7 = new AnonymousClass3(context, this.currentAccount);
        this.spansContainer = anonymousClass7;
        anonymousClass7.setDelegate(new GroupCreateActivity$$ExternalSyntheticLambda0(this, i5));
        this.spansContainer.getSpansContainer().setOnClickListener(new GroupCreateActivity$$ExternalSyntheticLambda1(this, i5));
        AnonymousClass3 anonymousClass8 = this.spansContainer;
        this.selectedContacts = anonymousClass8.selectedContacts;
        this.allSpans = anonymousClass8.allSpans;
        updateEditTextHint();
        this.searchField.editText.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(this, 15));
        this.searchField.editText.setOnKeyListener(new AnonymousClass4(i5, this));
        this.searchField.editText.addTextChangedListener(new ArticleViewer.AnonymousClass16(this, i3));
        arrayList = this.toSelectIds;
        if (arrayList != null) {
            select(arrayList, this.toSelectPremium, this.toSelectMiniApps);
        }
        FlickerLoadingView flickerLoadingView2 = new FlickerLoadingView(context, null);
        flickerLoadingView2.setViewType(6);
        flickerLoadingView2.showDate = false;
        StickerEmptyView stickerEmptyView2 = new StickerEmptyView(1, null, context, flickerLoadingView2);
        this.emptyView = stickerEmptyView2;
        stickerEmptyView2.addView(flickerLoadingView2);
        this.emptyView.showProgress(true, false);
        this.emptyView.title.setText(LocaleController.getString(R.string.NoResult));
        anonymousClass4.addView(this.emptyView);
        this.layoutManager = new LinearLayoutManager(1, false);
        RecyclerListView recyclerListView7 = new RecyclerListView(context, null);
        this.listView = recyclerListView7;
        recyclerListView7.setFastScrollEnabled(0);
        this.listView.setEmptyView(this.emptyView);
        RecyclerListView recyclerListView8 = this.listView;
        GroupCreateAdapter groupCreateAdapter2 = new GroupCreateAdapter(context);
        this.adapter = groupCreateAdapter2;
        recyclerListView8.setAdapter(groupCreateAdapter2);
        this.listView.setLayoutManager(this.layoutManager);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setClipToPadding(false);
        RecyclerListView recyclerListView9 = this.listView;
        if (LocaleController.isRTL) {
            i = 1;
        } else {
            i = 2;
        }
        recyclerListView9.setVerticalScrollbarPosition(i);
        RecyclerListView recyclerListView10 = this.listView;
        float f2 = -this.ADDITIONAL_LIST_HEIGHT_DP;
        anonymousClass4.addView(recyclerListView10, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, f2, 0.0f, f2));
        this.listView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(16, this, context));
        this.listView.setOnScrollListener(new LocationActivity.AnonymousClass10(this, i3));
        RecyclerListView recyclerListView11 = this.listView;
        recyclerListView11.animateEmptyView = true;
        recyclerListView11.emptyViewAnimationType = 0;
        fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider, false);
        this.floatingButton = fragmentFloatingButton;
        if (z3) {
            fragmentFloatingButton.imageView.setImageResource(R.drawable.floating_check);
        } else {
            fragmentFloatingButton.imageView.setImageResource(R.drawable.floating_check);
        }
        if (!z5) {
            anonymousClass4.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParams());
        }
        this.floatingButton.setOnClickListener(new GroupCreateActivity$$ExternalSyntheticLambda1(this, i7));
        this.floatingButton.animatorButtonVisible.setValue(this.doneButtonVisible, false);
        this.floatingButton.setContentDescription(LocaleController.getString(R.string.Next));
        if (z5) {
            this.buttonsContainer = new AnonymousClass7(this, context);
            View view3 = new View(context);
            view3.setBackgroundColor(Theme.getColor(Theme.key_divider, this.resourceProvider));
            this.buttonsContainer.addView(view3, LayoutHelper.createFrame(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            linearLayout2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.buttonsContainer.addView(linearLayout2, LayoutHelper.createFrame(-1, -2, 87));
            ButtonWithCounterView buttonWithCounterView3 = new ButtonWithCounterView(context, this.resourceProvider, true);
            buttonWithCounterView3.setRoundRadius(24);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) "x  ");
            spannableStringBuilder3.setSpan(new ColoredImageSpan(R.drawable.profile_phone), 0, 1, 33);
            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            buttonWithCounterView3.setText(spannableStringBuilder3, false, true);
            linearLayout2.addView(buttonWithCounterView3, LayoutHelper.createLinear(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            buttonWithCounterView3.setOnClickListener(new GroupCreateActivity$$ExternalSyntheticLambda1(this, i2));
            ButtonWithCounterView buttonWithCounterView4 = new ButtonWithCounterView(context, this.resourceProvider, true);
            buttonWithCounterView4.setRoundRadius(24);
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            spannableStringBuilder4.append((CharSequence) "x  ");
            spannableStringBuilder4.setSpan(new ColoredImageSpan(R.drawable.profile_video), 0, 1, 33);
            spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            buttonWithCounterView4.setText(spannableStringBuilder4, false, true);
            linearLayout2.addView(buttonWithCounterView4, LayoutHelper.createLinear(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            buttonWithCounterView4.setOnClickListener(new GroupCreateActivity$$ExternalSyntheticLambda1(this, 4));
            anonymousClass4.addView(this.buttonsContainer, LayoutHelper.createFrame(-1, -2, 87));
            checkUi_bottomButtons();
        }
        updateHint();
        CalendarActivity.AnonymousClass5 anonymousClass9 = new CalendarActivity.AnonymousClass5(this, context);
        this.actionBarBackgroundView = anonymousClass9;
        anonymousClass4.addView(anonymousClass9, LayoutHelper.createFrame(-1, 0, 48));
        anonymousClass4.addView(this.actionBar);
        anonymousClass4.addView(this.searchField, LayoutHelper.createFrame(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        anonymousClass4.addView(this.spansContainer);
        RecyclerListView recyclerListView12 = this.listView;
        Objects.requireNonNull(recyclerListView12);
        this.iBlur3Capture = new ViewGroupPartRenderer(recyclerListView12, anonymousClass4, new TopicsFragment$$ExternalSyntheticLambda7(recyclerListView12, 3));
        this.listView.addEdgeEffectListener(new GroupCreateActivity$$ExternalSyntheticLambda7(this, i5));
        ChatActivity.AnonymousClass27 anonymousClass28 = new ChatActivity.AnonymousClass27(context, this.parentLayout);
        this.headerShadowView = anonymousClass28;
        ((BoolAnimator) anonymousClass28.this$0).setValue(false, false);
        anonymousClass4.addView(this.headerShadowView, LayoutHelper.createFrame(-1, 5, 48));
        launchActivity = LaunchActivity.instance;
        if (launchActivity != null) {
            launchActivity.rootAnimatedInsetsListener.listeners.add(this);
        }
        View view4 = this.fragmentView;
        GroupCreateActivity$$ExternalSyntheticLambda0 groupCreateActivity$$ExternalSyntheticLambda1 = new GroupCreateActivity$$ExternalSyntheticLambda0(this, 2);
        WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view4, groupCreateActivity$$ExternalSyntheticLambda1);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.contactsDidLoad) {
            GroupCreateAdapter groupCreateAdapter = this.adapter;
            if (groupCreateAdapter != null) {
                groupCreateAdapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (i != NotificationCenter.updateInterfaces) {
            if (i == NotificationCenter.chatDidCreated) {
                removeSelfFromStack();
            }
        } else if (this.listView != null) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            int childCount = this.listView.getChildCount();
            if ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) == 0 && (MessagesController.UPDATE_MASK_NAME & iIntValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & iIntValue) == 0) {
                return;
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.listView.getChildAt(i3);
                if (childAt instanceof GroupCreateUserCell) {
                    ((GroupCreateUserCell) childAt).update(iIntValue);
                }
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final View getAnimatedInsetsTargetView() {
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 28);
        View view = this.fragmentView;
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(view, 1, null, null, null, null, i));
        ActionBar actionBar = this.actionBar;
        int i2 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, 1, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.spansContainer, 32768, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollActive));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollInactive));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.emptyView, 4, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.emptyView, 2048, null, null, null, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{GroupCreateSectionCell.class}, null, null, null, Theme.key_graySection));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GroupCreateSectionCell.class}, new String[]{"drawable"}, null, null, -1, null, Theme.key_groupcreate_sectionShadow));
        int i3 = Theme.key_groupcreate_sectionText;
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateSectionCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_checkbox));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_checkboxDisabled));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_checkboxCheck));
        arrayList.add(new ThemeDescription(this.listView, 262148, new Class[]{GroupCreateUserCell.class}, new String[]{"statusTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueText));
        int i4 = Theme.key_windowBackgroundWhiteGrayText;
        arrayList.add(new ThemeDescription(this.listView, 262148, new Class[]{GroupCreateUserCell.class}, new String[]{"statusTextView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GroupCreateUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundCyan));
        int i5 = Theme.key_avatar_backgroundBlue;
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, i5));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.spansContainer.getSpansContainer(), 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanBackground));
        arrayList.add(new ThemeDescription(this.spansContainer.getSpansContainer(), 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanText));
        arrayList.add(new ThemeDescription(this.spansContainer.getSpansContainer(), 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanDelete));
        arrayList.add(new ThemeDescription(this.spansContainer.getSpansContainer(), 0, new Class[]{GroupCreateSpan.class}, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.emptyView.title, 4, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.emptyView.subtitle, 4, null, null, null, null, i4));
        PermanentLinkBottomSheet permanentLinkBottomSheet = this.sharedLinkBottomSheet;
        if (permanentLinkBottomSheet != null) {
            arrayList.addAll(permanentLinkBottomSheet.getThemeDescriptions());
        }
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$4$1(Context context, View view, int i) {
        long j;
        int i2 = 3;
        int i3 = 1;
        GroupCreateAdapter groupCreateAdapter = this.adapter;
        if (i == groupCreateAdapter.createCallLinkRow) {
            int i4 = this.currentAccount;
            Theme.ResourcesProvider resourcesProvider = this.resourceProvider;
            GroupCreateActivity$$ExternalSyntheticLambda7 groupCreateActivity$$ExternalSyntheticLambda7 = new GroupCreateActivity$$ExternalSyntheticLambda7(this, i3);
            AlertDialog alertDialog = new AlertDialog(context, 3, null);
            AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i4).sendRequest(createconferencecall, new GroupCallSheet$$ExternalSyntheticLambda0(i4, alertDialog, context, resourcesProvider, groupCreateActivity$$ExternalSyntheticLambda7, 4));
            return;
        }
        long j2 = this.channelId;
        if (i == 0 && groupCreateAdapter.inviteViaLink != 0 && !groupCreateAdapter.searching) {
            PermanentLinkBottomSheet permanentLinkBottomSheet = new PermanentLinkBottomSheet(context, this, this.info, this.chatId, j2 != 0);
            this.sharedLinkBottomSheet = permanentLinkBottomSheet;
            showDialog(permanentLinkBottomSheet);
            return;
        }
        if (view instanceof GroupCreateUserCell) {
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
            if (groupCreateUserCell.currentPremium) {
                GroupCreateSpan groupCreateSpan = this.selectedPremium;
                if (groupCreateSpan == null) {
                    GroupCreateSpan groupCreateSpan2 = new GroupCreateSpan(this.searchField.editText.getContext(), "premium");
                    this.selectedPremium = groupCreateSpan2;
                    this.spansContainer.addSpan(groupCreateSpan2);
                    this.selectedPremium.setOnClickListener(this);
                } else {
                    this.spansContainer.removeSpan(groupCreateSpan);
                    this.selectedPremium = null;
                }
                checkVisibleRows();
                return;
            }
            if (groupCreateUserCell.currentMiniapps) {
                GroupCreateSpan groupCreateSpan3 = this.selectedMiniApps;
                if (groupCreateSpan3 == null) {
                    GroupCreateSpan groupCreateSpan4 = new GroupCreateSpan(this.searchField.editText.getContext(), "miniapps");
                    this.selectedMiniApps = groupCreateSpan4;
                    this.spansContainer.addSpan(groupCreateSpan4);
                    this.selectedMiniApps.setOnClickListener(this);
                } else {
                    this.spansContainer.removeSpan(groupCreateSpan3);
                    this.selectedMiniApps = null;
                }
                checkVisibleRows();
                return;
            }
            Object object = groupCreateUserCell.getObject();
            boolean z = object instanceof TLRPC.User;
            if (z) {
                j = ((TLRPC.User) object).id;
            } else if (!(object instanceof TLRPC.Chat)) {
                return;
            } else {
                j = -((TLRPC.Chat) object).id;
            }
            LongSparseArray longSparseArray = this.ignoreUsers;
            if (longSparseArray == null || longSparseArray.indexOfKey(j) < 0) {
                if (groupCreateUserCell.premiumBlocked) {
                    int i5 = -this.shiftDp;
                    this.shiftDp = i5;
                    AndroidUtilities.shakeViewSpring(groupCreateUserCell, i5);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    String userName = j >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j))) : "";
                    (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() ? BulletinFactory.of(this).createSimpleBulletinWithIconSize(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : BulletinFactory.of(this).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), new GroupCreateActivity$$ExternalSyntheticLambda7(this, i2), LocaleController.getString(R.string.UserBlockedNonPremiumButton))).show();
                    return;
                }
                GroupCreateSpan groupCreateSpan5 = (GroupCreateSpan) this.selectedContacts.get(j);
                if (groupCreateSpan5 != null) {
                    this.spansContainer.removeSpan(groupCreateSpan5);
                } else {
                    int i6 = this.maxCount;
                    if (i6 != 0 && this.selectedContacts.size() == i6) {
                        return;
                    }
                    if (this.chatType == 0 && this.selectedContacts.size() == getMessagesController().maxGroupCount) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                        String string = LocaleController.getString(R.string.AppName);
                        AlertDialog alertDialog2 = builder.alertDialog;
                        alertDialog2.title = string;
                        alertDialog2.message = LocaleController.getString(R.string.SoftUserLimitAlert);
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                        showDialog(alertDialog2);
                        return;
                    }
                    if (z) {
                        TLRPC.User user = (TLRPC.User) object;
                        if (this.addToGroup && user.bot) {
                            if (j2 == 0 && user.bot_nochats) {
                                try {
                                    BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.BotCantJoinGroups), null).show();
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            if (j2 != 0) {
                                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j2));
                                AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
                                boolean zCanAddAdmins = ChatObject.canAddAdmins(chat);
                                AlertDialog alertDialog3 = builder2.alertDialog;
                                if (zCanAddAdmins) {
                                    alertDialog3.title = LocaleController.getString(R.string.AddBotAdminAlert);
                                    alertDialog3.message = LocaleController.getString(R.string.AddBotAsAdmin);
                                    builder2.setPositiveButton(LocaleController.getString(R.string.AddAsAdmin), new DialogsActivity$$ExternalSyntheticLambda89(11, this, user));
                                    builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                } else {
                                    alertDialog3.message = LocaleController.getString(R.string.CantAddBotAsAdmin);
                                    builder2.setPositiveButton(LocaleController.getString(R.string.OK), null);
                                }
                                showDialog(alertDialog3);
                                return;
                            }
                        }
                        getMessagesController().putUser(user, !this.searching);
                    } else if (object instanceof TLRPC.Chat) {
                        getMessagesController().putChat((TLRPC.Chat) object, !this.searching);
                    }
                    GroupCreateSpan groupCreateSpan6 = new GroupCreateSpan(this.searchField.editText.getContext(), object);
                    this.spansContainer.addSpan(groupCreateSpan6);
                    groupCreateSpan6.setOnClickListener(this);
                }
                updateHint();
                if (this.searching || this.searchWas) {
                    AndroidUtilities.showKeyboard(this.searchField.editText);
                } else {
                    checkVisibleRows();
                }
                if (this.searchField.editText.length() > 0) {
                    this.searchField.editText.setText((CharSequence) null);
                }
            }
        }
    }

    @Override
    public final void onAnimatedInsetsChanged(WindowInsetsCompat windowInsetsCompat) {
        int i = windowInsetsCompat.mImpl.getInsets(8).bottom;
        this.imeInsetAnimatedHeight = i;
        FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
        if (fragmentFloatingButton != null) {
            fragmentFloatingButton.setTranslationY(-Math.max(this.navigationBarHeight, i));
        }
    }

    @Override
    public final void onAnimatedInsetsFinished() {
    }

    @Override
    public final void onAnimatedInsetsStarted() {
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (checkDiscard$3(z)) {
            return super.onBackPressed(z);
        }
        return false;
    }

    public void onCallUsersSelected(HashSet hashSet) {
    }

    @Override
    public final void onClick(View view) {
        GroupCreateSpan groupCreateSpan = (GroupCreateSpan) view;
        if (groupCreateSpan.deleting) {
            this.currentDeletingSpan = null;
            this.spansContainer.removeSpan(groupCreateSpan);
            updateHint();
            checkVisibleRows();
            return;
        }
        GroupCreateSpan groupCreateSpan2 = this.currentDeletingSpan;
        if (groupCreateSpan2 != null) {
            groupCreateSpan2.cancelDeleteAnimation();
        }
        this.currentDeletingSpan = groupCreateSpan;
        groupCreateSpan.startDeleteAnimation();
    }

    public final boolean onDonePressed() {
        boolean zIsEmpty = this.selectedContacts.isEmpty();
        boolean z = this.addToGroup;
        int i = this.chatType;
        if (!zIsEmpty || i == 2 || !z) {
            long j = this.chatId;
            if (!z) {
                if (i == 2) {
                    ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                    for (int i2 = 0; i2 < this.selectedContacts.size(); i2++) {
                        TLRPC.InputUser inputUser = getMessagesController().getInputUser(getMessagesController().getUser(Long.valueOf(this.selectedContacts.keyAt(i2))));
                        if (inputUser != null) {
                            arrayList.add(inputUser);
                        }
                    }
                    getMessagesController().addUsersToChannel(j, arrayList, null);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j);
                    bundle.putBoolean("just_created_chat", true);
                    presentFragment(new ChatActivity(bundle), true);
                    return true;
                }
                if (this.doneButtonVisible) {
                    if (z) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i3 = 0; i3 < this.selectedContacts.size(); i3++) {
                            arrayList2.add(getMessagesController().getUser(Long.valueOf(this.selectedContacts.keyAt(i3))));
                        }
                        ContactsAddActivityDelegate contactsAddActivityDelegate = this.delegate2;
                        if (contactsAddActivityDelegate != null) {
                            contactsAddActivityDelegate.didSelectUsers(0, arrayList2);
                        }
                        finishFragment();
                        return true;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (int i4 = 0; i4 < this.selectedContacts.size(); i4++) {
                        arrayList3.add(Long.valueOf(this.selectedContacts.keyAt(i4)));
                    }
                    if (this.isAlwaysShare || this.isNeverShare) {
                        GroupCreateActivityDelegate groupCreateActivityDelegate = this.delegate;
                        if (groupCreateActivityDelegate != null) {
                            groupCreateActivityDelegate.didSelectUsers(arrayList3, this.selectedPremium != null, this.selectedMiniApps != null);
                        }
                        finishFragment();
                        return true;
                    }
                    Bundle bundle2 = new Bundle();
                    int size = arrayList3.size();
                    long[] jArr = new long[size];
                    for (int i5 = 0; i5 < size; i5++) {
                        jArr[i5] = ((Long) arrayList3.get(i5)).longValue();
                    }
                    bundle2.putLongArray("result", jArr);
                    bundle2.putInt("chatType", i);
                    bundle2.putBoolean("forImport", this.forImport);
                    presentFragment(new GroupCreateFinalActivity(bundle2));
                    return true;
                }
            } else if (getParentActivity() != null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                String pluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", this.selectedContacts.size(), new Object[0]);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = pluralString;
                StringBuilder sb = new StringBuilder();
                for (int i6 = 0; i6 < this.selectedContacts.size(); i6++) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.selectedContacts.keyAt(i6)));
                    if (user != null) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append("**");
                        sb.append(ContactsController.formatName(user.first_name, user.last_name));
                        sb.append("**");
                    }
                }
                MessagesController messagesController = getMessagesController();
                if (j == 0) {
                    j = this.channelId;
                }
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j));
                if (this.selectedContacts.size() > 5) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", this.selectedContacts.size(), chat != null ? chat.title : "")));
                    String str = String.format("%d", Integer.valueOf(this.selectedContacts.size()));
                    int iIndexOf = TextUtils.indexOf(spannableStringBuilder, str);
                    if (iIndexOf >= 0) {
                        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), iIndexOf, str.length() + iIndexOf, 33);
                    }
                    alertDialog.message = spannableStringBuilder;
                } else {
                    alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddMembersAlertNamesText, sb, chat != null ? chat.title : ""));
                }
                CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
                if (!ChatObject.isChannel(chat)) {
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 1, 17, false, this.resourceProvider);
                    checkBoxCellArr[0] = checkBoxCell;
                    checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
                    checkBoxCellArr[0].setMultiline(true);
                    if (this.selectedContacts.size() == 1) {
                        checkBoxCellArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddOneMemberForwardMessages, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.selectedContacts.keyAt(0)))))), "", true, false, false);
                    } else {
                        checkBoxCellArr[0].setText(LocaleController.getString(R.string.AddMembersForwardMessages), "", true, false, false);
                    }
                    checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    linearLayout.addView(checkBoxCellArr[0], LayoutHelper.createLinear(-1, -2));
                    checkBoxCellArr[0].setOnClickListener(new ProfileActivity$$ExternalSyntheticLambda60(checkBoxCellArr, 4));
                    builder.setView(linearLayout);
                }
                builder.setPositiveButton(LocaleController.getString(R.string.Add), new DialogsActivity$$ExternalSyntheticLambda89(12, this, checkBoxCellArr));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i != 3) {
            if (i == 4) {
                checkUi_bottomButtons();
                checkUi_listClip$1();
                return;
            }
            return;
        }
        int paddingTop = this.listView.getPaddingTop();
        checkUi_listViewPadding$3();
        FragmentSearchField fragmentSearchField = this.searchField;
        FactorAnimator factorAnimator2 = this.animatorSelectorContainerHeight;
        fragmentSearchField.setTranslationY(factorAnimator2.factor);
        checkUi_listClip$1();
        this.headerShadowView.setTranslationY(AndroidUtilities.dp(48.0f) + factorAnimator2.factor);
        this.actionBarBackgroundView.invalidate();
        int paddingTop2 = this.listView.getPaddingTop();
        if (paddingTop2 == paddingTop || ((BoolAnimator) this.headerShadowView.this$0).value) {
            return;
        }
        this.listView.scrollBy(0, paddingTop - paddingTop2);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.contactsDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.chatDidCreated);
        getUserConfig().loadGlobalTTl();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatDidCreated);
    }

    public final void select(ArrayList arrayList, boolean z, boolean z2) {
        GroupCreateSpan groupCreateSpan;
        GroupCreateSpan groupCreateSpan2;
        HashSet hashSet = this.initialIds;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.initialPremium = z;
        this.initialMiniApps = z2;
        AnonymousClass3 anonymousClass3 = this.spansContainer;
        if (anonymousClass3 == null) {
            this.toSelectIds = arrayList;
            this.toSelectPremium = z;
            this.toSelectMiniApps = z2;
            return;
        }
        if (z && this.selectedPremium == null) {
            GroupCreateSpan groupCreateSpan3 = new GroupCreateSpan(getParentActivity(), "premium");
            this.selectedPremium = groupCreateSpan3;
            this.spansContainer.addSpan(groupCreateSpan3);
            this.selectedPremium.setOnClickListener(this);
        } else if (!z && (groupCreateSpan = this.selectedPremium) != null) {
            anonymousClass3.removeSpan(groupCreateSpan);
            this.selectedPremium = null;
        }
        if (z2 && this.selectedMiniApps == null) {
            GroupCreateSpan groupCreateSpan4 = new GroupCreateSpan(getParentActivity(), "miniApps");
            this.selectedMiniApps = groupCreateSpan4;
            this.spansContainer.addSpan(groupCreateSpan4);
            this.selectedMiniApps.setOnClickListener(this);
        } else if (!z2 && (groupCreateSpan2 = this.selectedMiniApps) != null) {
            this.spansContainer.removeSpan(groupCreateSpan2);
            this.selectedMiniApps = null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Long l = (Long) obj;
            long jLongValue = l.longValue();
            Object chat = jLongValue < 0 ? getMessagesController().getChat(Long.valueOf(-jLongValue)) : getMessagesController().getUser(l);
            if (chat != null) {
                GroupCreateSpan groupCreateSpan5 = new GroupCreateSpan(getParentActivity(), chat);
                this.spansContainer.addSpan(groupCreateSpan5);
                groupCreateSpan5.setOnClickListener(this);
            }
        }
        FragmentSpansContainer.SpansContainer spansContainer = this.spansContainer.spansContainer;
        AnimatorSet animatorSet = spansContainer.currentAnimation;
        if (animatorSet != null && animatorSet.isRunning()) {
            spansContainer.currentAnimation.setupEndValues();
            spansContainer.currentAnimation.cancel();
        }
        AndroidUtilities.updateVisibleRows(this.listView);
    }

    public final void showItemsAnimated$1(int i) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.listView, new OAuthSheet$$ExternalSyntheticLambda17(this, i, 15));
    }

    public final void updateEditTextHint() {
        GroupCreateAdapter groupCreateAdapter;
        UsersSelectActivity.AnonymousClass4 anonymousClass4 = this.searchField.editText;
        if (anonymousClass4 == null) {
            return;
        }
        if (this.chatType == 2) {
            anonymousClass4.setHint(LocaleController.getString(R.string.AddMutual));
            return;
        }
        if (this.addToGroup || ((groupCreateAdapter = this.adapter) != null && groupCreateAdapter.noContactsStubRow == 0)) {
            anonymousClass4.setHint(LocaleController.getString(R.string.SearchForPeople));
            return;
        }
        if (this.isAlwaysShare || this.isNeverShare) {
            anonymousClass4.setHint(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        } else if (this.isCall) {
            anonymousClass4.setHint(LocaleController.getString(R.string.NewCallSearch));
        } else {
            anonymousClass4.setHint(LocaleController.getString(R.string.SendMessageTo));
        }
    }

    public final void updateHint() {
        boolean z = this.isAlwaysShare;
        int i = this.chatType;
        boolean z2 = this.addToGroup;
        if (!z && !this.isNeverShare && !z2) {
            if (i == 2) {
                this.actionBar.setSubtitle(LocaleController.formatPluralString("Members", this.selectedContacts.size(), new Object[0]));
            } else {
                boolean zIsEmpty = this.selectedContacts.isEmpty();
                int i2 = this.maxCount;
                if (zIsEmpty) {
                    this.actionBar.setSubtitle(LocaleController.formatString(R.string.MembersCountZero, LocaleController.formatPluralString("Members", i2 + (this.isCall ? 1 : 0), new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", this.selectedContacts.size()), Integer.valueOf(this.selectedContacts.size()), Integer.valueOf(i2)));
                }
            }
        }
        if (i == 2 || !z2) {
            return;
        }
        if (this.doneButtonVisible && this.allSpans.isEmpty()) {
            this.floatingButton.animatorButtonVisible.setValue(false, true);
            this.doneButtonVisible = false;
        } else {
            if (this.doneButtonVisible || this.allSpans.isEmpty()) {
                return;
            }
            this.floatingButton.animatorButtonVisible.setValue(true, true);
            this.doneButtonVisible = true;
        }
    }

    public final class AnonymousClass7 extends FrameLayout {
        public final int $r8$classId;
        public final Object paint;
        public final Object rectTmp;
        public final Object this$0;

        public AnonymousClass7(Context context) {
            super(context);
            this.$r8$classId = 7;
            setClipChildren(false);
            AnimatedTextView animatedTextView = new AnimatedTextView(context, true, false, false);
            this.paint = animatedTextView;
            animatedTextView.setTypeface(AndroidUtilities.bold());
            animatedTextView.setTextSize(AndroidUtilities.dp(13.0f));
            animatedTextView.setTextColor(-1);
            animatedTextView.setGravity(17);
            addView(animatedTextView, LayoutHelper.createFrame(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
            TextView textView = new TextView(context);
            this.rectTmp = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1879048193);
            textView.setGravity(17);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
            AnimatedTextView animatedTextView2 = new AnimatedTextView(context, false, false, false);
            this.this$0 = animatedTextView2;
            animatedTextView2.setTypeface(AndroidUtilities.bold());
            animatedTextView2.setTextColor(-1);
            animatedTextView2.setGravity(5);
            animatedTextView2.getDrawable().centerY = true;
            animatedTextView2.setTextSize(AndroidUtilities.dp(11.0f));
            animatedTextView2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
            animatedTextView2.setSizeableBackground(new StarGiftSheet.RoundRectStrokeDrawable(AndroidUtilities.dp(10.0f), 285212671));
            addView(animatedTextView2, LayoutHelper.createFrame(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            float f;
            float f2;
            float f3;
            float f4;
            Object obj = this.rectTmp;
            Object obj2 = this.this$0;
            Object obj3 = this.paint;
            switch (this.$r8$classId) {
                case 0:
                    Paint paint = (Paint) obj3;
                    GroupCreateActivity groupCreateActivity = (GroupCreateActivity) obj2;
                    paint.setColor(groupCreateActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                    canvas.save();
                    canvas.translate(0.0f, -getTop());
                    RectF rectF = (RectF) obj;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    rectF.offset(0.0f, getTop());
                    GroupCreateActivity.access$3700(groupCreateActivity, canvas, rectF, paint);
                    canvas.restore();
                    super.dispatchDraw(canvas);
                    break;
                case 2:
                    Paint paint2 = (Paint) obj3;
                    int i = Theme.default_shadow_color;
                    paint2.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), Theme.default_shadow_color);
                    paint2.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, ((AvatarConstructorFragment) obj2).getResourceProvider()));
                    paint2.setAlpha((int) (getAlpha() * 255.0f));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    Path path = (Path) obj;
                    path.rewind();
                    path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                    canvas.drawPath(path, paint2);
                    super.dispatchDraw(canvas);
                    break;
                case 6:
                    TopicsTabsView.VerticalTabView verticalTabView = (TopicsTabsView.VerticalTabView) obj2;
                    float fIsNotEmpty = verticalTabView.counterText.isNotEmpty();
                    boolean z = fIsNotEmpty > 0.0f;
                    float fLerp = AndroidUtilities.lerp(0.5f, 1.0f, fIsNotEmpty) * verticalTabView.countScale;
                    float fDp = AndroidUtilities.dp(10.0f);
                    float fDp2 = AndroidUtilities.dp(8.33f);
                    float width = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                    float fDp3 = AndroidUtilities.dp(12.0f);
                    float fMax = Math.max(fDp2 + fDp2, verticalTabView.counterText.getCurrentWidth() + AndroidUtilities.dp(10.0f));
                    if (z) {
                        f4 = fDp3;
                        f2 = fDp2;
                        f3 = width;
                        f = fLerp;
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    } else {
                        f = fLerp;
                        f2 = fDp2;
                        f3 = width;
                        f4 = fDp3;
                    }
                    super.dispatchDraw(canvas);
                    if (z) {
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        float f5 = fMax / 2.0f;
                        rectF3.set((f3 - f5) - AndroidUtilities.dp(1.33f), f4 - fDp, f5 + f3 + AndroidUtilities.dp(1.33f), f4 + fDp);
                        AndroidUtilities.scaleRect(rectF3, fIsNotEmpty);
                        float f6 = fDp * fIsNotEmpty;
                        canvas.drawRoundRect(rectF3, f6, f6, (Paint) obj3);
                        canvas.restore();
                    }
                    if (fIsNotEmpty > 0.0f) {
                        canvas.save();
                        canvas.scale(f, f, f3, f4);
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        float f7 = fMax / 2.0f;
                        rectF4.set(f3 - f7, f4 - f2, f3 + f7, f4 + f2);
                        AnimatedPaint animatedPaint = (AnimatedPaint) obj;
                        animatedPaint.setColor(Theme.multAlpha(fIsNotEmpty, animatedPaint.color.set(Theme.getColor(verticalTabView.counterBackgroundColorKey, animatedPaint.resourcesProvider), false)));
                        canvas.drawRoundRect(rectF4, f2, f2, animatedPaint);
                        verticalTabView.counterText.setBounds(rectF4);
                        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = verticalTabView.counterText;
                        animatedTextDrawable.alpha = (int) (fIsNotEmpty * 255.0f);
                        animatedTextDrawable.draw(canvas);
                        canvas.restore();
                    }
                    break;
                case 10:
                    super.dispatchDraw(canvas);
                    Paint paint3 = (Paint) obj3;
                    paint3.setColor(-1);
                    PreviewHighlightView previewHighlightView = (PreviewHighlightView) obj2;
                    float width2 = ((getWidth() - (AndroidUtilities.dpf2(5.0f) * 2.0f)) - AndroidUtilities.dpf2((previewHighlightView.storiesCount - 1) * 2)) / previewHighlightView.storiesCount;
                    float fDpf2 = AndroidUtilities.dpf2(5.0f);
                    int i2 = 0;
                    while (i2 < previewHighlightView.storiesCount) {
                        RectF rectF5 = (RectF) obj;
                        rectF5.set(fDpf2, AndroidUtilities.dpf2(8.0f), fDpf2 + width2, AndroidUtilities.dpf2(10.0f));
                        paint3.setAlpha(i2 < previewHighlightView.storiesCount - 1 ? 255 : 133);
                        canvas.drawRoundRect(rectF5, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(1.0f), paint3);
                        fDpf2 += AndroidUtilities.dpf2(2.0f) + width2;
                        i2++;
                    }
                    break;
                default:
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public void draw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 4:
                    canvas.save();
                    canvas.clipPath((Path) this.paint);
                    super.draw(canvas);
                    canvas.restore();
                    break;
                default:
                    super.draw(canvas);
                    break;
            }
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            switch (this.$r8$classId) {
                case 5:
                    StoryLinkPreviewDialog storyLinkPreviewDialog = (StoryLinkPreviewDialog) this.this$0;
                    if (view != storyLinkPreviewDialog.linkView) {
                        return super.drawChild(canvas, view, j);
                    }
                    canvas.save();
                    canvas.translate(((AnimatedFloat) this.rectTmp).set(view.getX(), false), ((AnimatedFloat) this.paint).set(view.getY(), false));
                    storyLinkPreviewDialog.linkView.drawInternal(canvas);
                    canvas.restore();
                    return true;
                case 8:
                    if (((StarsIntroActivity.StarsTransactionView) this.this$0).imageViewCount > 1) {
                        Paint paint = (Paint) this.paint;
                        paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, (Theme.ResourcesProvider) this.rectTmp));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                        rectF.inset(-AndroidUtilities.dp(1.66f), -AndroidUtilities.dp(1.66f));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                    }
                    return super.drawChild(canvas, view, j);
                case 11:
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    CommunityEditActivity communityEditActivity = (CommunityEditActivity) this.this$0;
                    if (view == communityEditActivity.listView) {
                        int i = Theme.key_windowBackgroundGray;
                        int themedColor = communityEditActivity.getThemedColor(i);
                        GradientProtectionDrawable gradientProtectionDrawable = (GradientProtectionDrawable) this.rectTmp;
                        gradientProtectionDrawable.setColor(themedColor);
                        gradientProtectionDrawable.setBounds(0, 0, getWidth(), AndroidUtilities.statusBarHeight);
                        gradientProtectionDrawable.draw(canvas);
                        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(AndroidUtilities.navigationBarHeight);
                        if (navigationBarThirdButtonsFactor > 0.0f) {
                            GradientProtectionDrawable gradientProtectionDrawable2 = (GradientProtectionDrawable) this.paint;
                            gradientProtectionDrawable2.setAlpha((int) (navigationBarThirdButtonsFactor * 255.0f));
                            gradientProtectionDrawable2.setColor(communityEditActivity.getThemedColor(i));
                            gradientProtectionDrawable2.setBounds(0, getHeight() - AndroidUtilities.navigationBarHeight, getWidth(), getHeight());
                            gradientProtectionDrawable2.draw(canvas);
                        }
                    }
                    return zDrawChild;
                default:
                    return super.drawChild(canvas, view, j);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 1:
                    super.onDraw(canvas);
                    int color = Theme.getColor(null, Theme.key_text_RedRegular, false);
                    Paint paint = (Paint) this.paint;
                    paint.setColor(color);
                    canvas.save();
                    float measuredWidth = getMeasuredWidth();
                    TextPaint textPaint = (TextPaint) this.this$0;
                    canvas.translate((measuredWidth - textPaint.measureText("500")) - AndroidUtilities.dp(8.0f), AndroidUtilities.dpf2(7.0f));
                    RectF rectF = (RectF) this.rectTmp;
                    rectF.set(0.0f, 0.0f, textPaint.measureText("500"), textPaint.getTextSize());
                    rectF.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(3.0f));
                    float textSize = (textPaint.getTextSize() / 2.0f) + AndroidUtilities.dp(3.0f);
                    canvas.drawRoundRect(rectF, textSize, textSize, paint);
                    canvas.drawText("500", 0.0f, textPaint.getTextSize() - AndroidUtilities.dpf2(2.0f), textPaint);
                    canvas.restore();
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 4:
                    super.onMeasure(i, i2);
                    Path path = (Path) this.paint;
                    path.rewind();
                    RectF rectF = (RectF) this.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                    StoryLinkPreviewDialog.AnonymousClass5 anonymousClass5 = ((StoryLinkPreviewDialog) this.this$0).linkView;
                    if (anonymousClass5 != null) {
                        anonymousClass5.setMaxWidth(getMeasuredWidth() - AndroidUtilities.dp(32.0f));
                    }
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public boolean verifyDrawable(Drawable drawable) {
            switch (this.$r8$classId) {
                case 6:
                    return ((TopicsTabsView.VerticalTabView) this.this$0).counterText == drawable || super.verifyDrawable(drawable);
                default:
                    return super.verifyDrawable(drawable);
            }
        }

        public AnonymousClass7(Context context, Paint paint, TextPaint textPaint) {
            super(context);
            this.$r8$classId = 1;
            this.paint = paint;
            this.this$0 = textPaint;
            this.rectTmp = new RectF();
        }

        public AnonymousClass7(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
            super(context);
            this.$r8$classId = 12;
            BackupImageView backupImageView = new BackupImageView(context);
            this.rectTmp = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(23.0f));
            addView(backupImageView, LayoutHelper.createFrame(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
            if (z) {
                addView(new SendButtonBlockedByTypingView(context, resourcesProvider), LayoutHelper.createFrame(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
            }
            TextView textView = new TextView(context);
            this.paint = textView;
            zzkh.m(16.0f, textView);
            textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            textView.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.this$0 = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            textView2.setSingleLine(true);
            textView2.setEllipsize(truncateAt);
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
        }

        public AnonymousClass7(AvatarConstructorFragment avatarConstructorFragment, Activity activity) {
            super(activity);
            this.$r8$classId = 2;
            this.this$0 = avatarConstructorFragment;
            this.rectTmp = new Path();
            this.paint = new Paint(1);
        }

        public AnonymousClass7(LinkActionView linkActionView, final Context context) {
            super(context);
            this.$r8$classId = 3;
            this.this$0 = linkActionView;
            AvatarsImageView avatarsImageView = new AvatarsImageView(context) {
                @Override
                public final void onMeasure(int i, int i2) {
                    int iMin = Math.min(3, ((LinkActionView) this.this$1.this$0).usersCount);
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(iMin == 0 ? 0 : zzkv.m(iMin, 1, 20, 32)), 1073741824), i2);
                }
            };
            this.paint = avatarsImageView;
            LinearLayout linearLayoutM = zzkf.m(context, 0);
            addView(linearLayoutM, LayoutHelper.createFrame(-2, -1, 1));
            TextView textView = new TextView(context);
            this.rectTmp = textView;
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            linearLayoutM.addView(avatarsImageView, LayoutHelper.createLinear(-2, -1));
            linearLayoutM.addView(textView, LayoutHelper.createLinear(-2, -2, 16));
            setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            avatarsImageView.avatarsDrawable.commitTransition(false, true);
        }

        public AnonymousClass7(StoryLinkPreviewDialog storyLinkPreviewDialog, Context context, int i) {
            super(context);
            this.$r8$classId = i;
            switch (i) {
                case 5:
                    this.this$0 = storyLinkPreviewDialog;
                    super(context);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                    this.rectTmp = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
                    this.paint = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
                    break;
                default:
                    this.this$0 = storyLinkPreviewDialog;
                    this.paint = new Path();
                    this.rectTmp = new RectF();
                    break;
            }
        }

        public AnonymousClass7(TopicsTabsView.VerticalTabView verticalTabView, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.$r8$classId = 6;
            this.this$0 = verticalTabView;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.rectTmp = new AnimatedPaint(resourcesProvider, this);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            verticalTabView.counterText.setCallback(this);
        }

        public AnonymousClass7(GroupCreateActivity groupCreateActivity, Context context) {
            super(context);
            this.$r8$classId = 0;
            this.this$0 = groupCreateActivity;
            this.rectTmp = new RectF();
            this.paint = new Paint(1);
        }

        public AnonymousClass7(StarsIntroActivity.StarsTransactionView starsTransactionView, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.$r8$classId = 8;
            this.this$0 = starsTransactionView;
            this.rectTmp = resourcesProvider;
            this.paint = new Paint(1);
        }

        public AnonymousClass7(StealthModeAlert stealthModeAlert, Context context) {
            super(context);
            this.$r8$classId = 9;
            ImageView imageView = new ImageView(context);
            this.this$0 = imageView;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_featuredStickers_addButton, false), PorterDuff.Mode.MULTIPLY));
            addView(imageView, LayoutHelper.createFrame(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.rectTmp = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, ((BottomSheet) stealthModeAlert).resourcesProvider));
            textView.setTextSize(1, 14.0f);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.paint = textView2;
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, ((BottomSheet) stealthModeAlert).resourcesProvider));
            textView2.setTextSize(1, 14.0f);
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
        }

        public AnonymousClass7(PreviewHighlightView previewHighlightView, Context context) {
            super(context);
            this.$r8$classId = 10;
            this.this$0 = previewHighlightView;
            this.rectTmp = new RectF();
            this.paint = new Paint(1);
        }

        public AnonymousClass7(CommunityEditActivity communityEditActivity, Context context) {
            super(context);
            this.$r8$classId = 11;
            this.this$0 = communityEditActivity;
            this.rectTmp = new GradientProtectionDrawable(2);
            this.paint = new GradientProtectionDrawable(8);
        }
    }
}
