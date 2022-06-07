package org.telegram.ui.Adapters;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$RecentMeUrl;
import org.telegram.tgnet.TLRPC$TL_contact;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Cells.ArchiveHintCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.DialogMeUrlCell;
import org.telegram.ui.Cells.DialogsEmptyCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.BlurredRecyclerView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PullForegroundDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.DialogsActivity;

public class DialogsAdapter extends RecyclerListView.SelectionAdapter {
    private ArchiveHintCell archiveHintCell;
    private Drawable arrowDrawable;
    private int currentAccount;
    private int currentCount;
    private int dialogsCount;
    private boolean dialogsListFrozen;
    private int dialogsType;
    private int folderId;
    private boolean forceShowEmptyCell;
    private boolean forceUpdatingContacts;
    private boolean hasHints;
    private boolean isOnlySelect;
    private boolean isReordering;
    public int lastDialogsEmptyType = -1;
    private long lastSortTime;
    private Context mContext;
    private ArrayList<TLRPC$TL_contact> onlineContacts;
    private long openedDialogId;
    private DialogsActivity parentFragment;
    private DialogsPreloader preloader;
    private int prevContactsCount;
    private int prevDialogsCount;
    private PullForegroundDrawable pullForegroundDrawable;
    private ArrayList<Long> selectedDialogs;
    private boolean showArchiveHint;

    public DialogsAdapter(DialogsActivity dialogsActivity, Context context, int i, int i2, boolean z, ArrayList<Long> arrayList, int i3) {
        this.mContext = context;
        this.parentFragment = dialogsActivity;
        this.dialogsType = i;
        this.folderId = i2;
        this.isOnlySelect = z;
        this.hasHints = i2 == 0 && i == 0 && !z;
        this.selectedDialogs = arrayList;
        this.currentAccount = i3;
        if (i2 == 1) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            this.showArchiveHint = globalMainSettings.getBoolean("archivehint", true);
            globalMainSettings.edit().putBoolean("archivehint", false).commit();
        }
        if (i2 == 0) {
            this.preloader = new DialogsPreloader();
        }
    }

    public void setOpenedDialogId(long j) {
        this.openedDialogId = j;
    }

    public void onReorderStateChanged(boolean z) {
        this.isReordering = z;
    }

    public int fixPosition(int i) {
        int i2;
        if (this.hasHints) {
            i -= MessagesController.getInstance(this.currentAccount).hintDialogs.size() + 2;
        }
        return (this.showArchiveHint || (i2 = this.dialogsType) == 11 || i2 == 13) ? i - 2 : i2 == 12 ? i - 1 : i;
    }

    public boolean isDataSetChanged() {
        int i = this.currentCount;
        return i != getItemCount() || i == 1;
    }

    public void setDialogsType(int i) {
        this.dialogsType = i;
        notifyDataSetChanged();
    }

    public int getDialogsType() {
        return this.dialogsType;
    }

    public int getDialogsCount() {
        return this.dialogsCount;
    }

    @Override
    public int getItemCount() {
        int i;
        int i2;
        int i3;
        int i4;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        int size = this.parentFragment.getDialogsArray(this.currentAccount, this.dialogsType, this.folderId, this.dialogsListFrozen).size();
        this.dialogsCount = size;
        boolean z = false;
        boolean z2 = true;
        if (!this.forceUpdatingContacts && !this.forceShowEmptyCell && (i3 = this.dialogsType) != 7 && i3 != 8 && i3 != 11 && size == 0 && ((i4 = this.folderId) != 0 || messagesController.isLoadingDialogs(i4) || !MessagesController.getInstance(this.currentAccount).isDialogsEndReached(this.folderId))) {
            this.onlineContacts = null;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("DialogsAdapter dialogsCount=" + this.dialogsCount + " dialogsType=" + this.dialogsType + " isLoadingDialogs=" + messagesController.isLoadingDialogs(this.folderId) + " isDialogsEndReached=" + MessagesController.getInstance(this.currentAccount).isDialogsEndReached(this.folderId));
            }
            if (this.folderId != 1 || !this.showArchiveHint) {
                this.currentCount = 0;
                return 0;
            }
            this.currentCount = 2;
            return 2;
        } else if (this.dialogsCount != 0 || !messagesController.isLoadingDialogs(this.folderId)) {
            int i5 = this.dialogsCount;
            int i6 = this.dialogsType;
            if (i6 == 7 || i6 == 8 ? i5 == 0 : !(messagesController.isDialogsEndReached(this.folderId) && this.dialogsCount != 0)) {
                i5++;
            }
            if (this.hasHints) {
                i5 += messagesController.hintDialogs.size() + 2;
            } else if (this.dialogsType == 0 && (i2 = this.folderId) == 0 && messagesController.isDialogsEndReached(i2)) {
                if (ContactsController.getInstance(this.currentAccount).contacts.isEmpty() && !ContactsController.getInstance(this.currentAccount).doneLoadingContacts && !this.forceUpdatingContacts) {
                    this.onlineContacts = null;
                    if (BuildVars.LOGS_ENABLED) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("DialogsAdapter loadingContacts=");
                        if (!ContactsController.getInstance(this.currentAccount).contacts.isEmpty() || ContactsController.getInstance(this.currentAccount).doneLoadingContacts) {
                            z2 = false;
                        }
                        sb.append(z2);
                        sb.append("dialogsCount=");
                        sb.append(this.dialogsCount);
                        sb.append(" dialogsType=");
                        sb.append(this.dialogsType);
                        FileLog.d(sb.toString());
                    }
                    this.currentCount = 0;
                    return 0;
                } else if (messagesController.getAllFoldersDialogsCount() <= 10 && ContactsController.getInstance(this.currentAccount).doneLoadingContacts && !ContactsController.getInstance(this.currentAccount).contacts.isEmpty()) {
                    if (!(this.onlineContacts != null && this.prevDialogsCount == this.dialogsCount && this.prevContactsCount == ContactsController.getInstance(this.currentAccount).contacts.size())) {
                        ArrayList<TLRPC$TL_contact> arrayList = new ArrayList<>(ContactsController.getInstance(this.currentAccount).contacts);
                        this.onlineContacts = arrayList;
                        this.prevContactsCount = arrayList.size();
                        this.prevDialogsCount = messagesController.dialogs_dict.size();
                        long j = UserConfig.getInstance(this.currentAccount).clientUserId;
                        int size2 = this.onlineContacts.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            long j2 = this.onlineContacts.get(i7).user_id;
                            if (j2 == j || messagesController.dialogs_dict.get(j2) != null) {
                                this.onlineContacts.remove(i7);
                                i7--;
                                size2--;
                            }
                            i7++;
                        }
                        if (this.onlineContacts.isEmpty()) {
                            this.onlineContacts = null;
                        }
                        sortOnlineContacts(false);
                        if (this.parentFragment.getContactsAlpha() == 0.0f) {
                            registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
                                @Override
                                public void onChanged() {
                                    DialogsAdapter.this.parentFragment.setContactsAlpha(0.0f);
                                    DialogsAdapter.this.parentFragment.animateContactsAlpha(1.0f);
                                    DialogsAdapter.this.unregisterAdapterDataObserver(this);
                                }
                            });
                        }
                    }
                    ArrayList<TLRPC$TL_contact> arrayList2 = this.onlineContacts;
                    if (arrayList2 != null) {
                        i5 += arrayList2.size() + 2;
                        z = true;
                    }
                }
            }
            int i8 = this.folderId;
            if (i8 == 0 && !z && this.dialogsCount == 0 && this.forceUpdatingContacts) {
                i5 += 3;
            }
            if (i8 == 0 && this.onlineContacts != null && !z) {
                this.onlineContacts = null;
            }
            if (i8 == 1 && this.showArchiveHint) {
                i5 += 2;
            }
            if (i8 == 0 && (i = this.dialogsCount) != 0) {
                i5++;
                if (i > 10 && this.dialogsType == 0) {
                    i5++;
                }
            }
            int i9 = this.dialogsType;
            if (i9 == 11 || i9 == 13) {
                i5 += 2;
            } else if (i9 == 12) {
                i5++;
            }
            this.currentCount = i5;
            return i5;
        } else {
            this.currentCount = 0;
            return 0;
        }
    }

    public TLObject getItem(int i) {
        int i2;
        int i3;
        ArrayList<TLRPC$TL_contact> arrayList = this.onlineContacts;
        if (arrayList == null || ((i3 = this.dialogsCount) != 0 && i < i3)) {
            if (this.showArchiveHint || (i2 = this.dialogsType) == 11 || i2 == 13) {
                i -= 2;
            } else if (i2 == 12) {
                i--;
            }
            ArrayList<TLRPC$Dialog> dialogsArray = this.parentFragment.getDialogsArray(this.currentAccount, this.dialogsType, this.folderId, this.dialogsListFrozen);
            if (this.hasHints) {
                int size = MessagesController.getInstance(this.currentAccount).hintDialogs.size() + 2;
                if (i < size) {
                    return MessagesController.getInstance(this.currentAccount).hintDialogs.get(i - 1);
                }
                i -= size;
            }
            if (i < 0 || i >= dialogsArray.size()) {
                return null;
            }
            return dialogsArray.get(i);
        }
        int i4 = i3 == 0 ? i - 3 : i - (i3 + 2);
        if (i4 < 0 || i4 >= arrayList.size()) {
            return null;
        }
        return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.onlineContacts.get(i4).user_id));
    }

    public void sortOnlineContacts(boolean z) {
        if (this.onlineContacts == null) {
            return;
        }
        if (!z || SystemClock.elapsedRealtime() - this.lastSortTime >= 2000) {
            this.lastSortTime = SystemClock.elapsedRealtime();
            try {
                final int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                Collections.sort(this.onlineContacts, new Comparator() {
                    @Override
                    public final int compare(Object obj, Object obj2) {
                        int lambda$sortOnlineContacts$0;
                        lambda$sortOnlineContacts$0 = DialogsAdapter.lambda$sortOnlineContacts$0(MessagesController.this, currentTime, (TLRPC$TL_contact) obj, (TLRPC$TL_contact) obj2);
                        return lambda$sortOnlineContacts$0;
                    }
                });
                if (z) {
                    notifyDataSetChanged();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static int lambda$sortOnlineContacts$0(org.telegram.messenger.MessagesController r2, int r3, org.telegram.tgnet.TLRPC$TL_contact r4, org.telegram.tgnet.TLRPC$TL_contact r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Adapters.DialogsAdapter.lambda$sortOnlineContacts$0(org.telegram.messenger.MessagesController, int, org.telegram.tgnet.TLRPC$TL_contact, org.telegram.tgnet.TLRPC$TL_contact):int");
    }

    public void setDialogsListFrozen(boolean z) {
        this.dialogsListFrozen = z;
    }

    public ViewPager getArchiveHintCellPager() {
        ArchiveHintCell archiveHintCell = this.archiveHintCell;
        if (archiveHintCell != null) {
            return archiveHintCell.getViewPager();
        }
        return null;
    }

    public void updateHasHints() {
        this.hasHints = this.folderId == 0 && this.dialogsType == 0 && !this.isOnlySelect && !MessagesController.getInstance(this.currentAccount).hintDialogs.isEmpty();
    }

    @Override
    public void notifyDataSetChanged() {
        updateHasHints();
        super.notifyDataSetChanged();
    }

    @Override
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        if (view instanceof DialogCell) {
            DialogCell dialogCell = (DialogCell) view;
            dialogCell.onReorderStateChanged(this.isReordering, false);
            dialogCell.setDialogIndex(fixPosition(viewHolder.getAdapterPosition()));
            dialogCell.checkCurrentDialogIndex(this.dialogsListFrozen);
            dialogCell.setChecked(this.selectedDialogs.contains(Long.valueOf(dialogCell.getDialogId())), false);
        }
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return (itemViewType == 1 || itemViewType == 5 || itemViewType == 3 || itemViewType == 8 || itemViewType == 7 || itemViewType == 9 || itemViewType == 10 || itemViewType == 11 || itemViewType == 13) ? false : true;
    }

    public void lambda$onCreateViewHolder$1(View view) {
        MessagesController.getInstance(this.currentAccount).hintDialogs.clear();
        MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ?? r1;
        View view;
        switch (i) {
            case 0:
                if (this.dialogsType != 2) {
                    r1 = new DialogCell(this.parentFragment, this.mContext, true, false, this.currentAccount, null);
                    r1.setArchivedPullAnimation(this.pullForegroundDrawable);
                    r1.setPreloader(this.preloader);
                    break;
                } else {
                    r1 = new ProfileSearchCell(this.mContext);
                    break;
                }
            case 1:
            case 13:
                r1 = new FlickerLoadingView(this.mContext);
                r1.setIsSingleCell(true);
                int i2 = i == 13 ? 18 : 7;
                r1.setViewType(i2);
                if (i2 == 18) {
                    r1.setIgnoreHeightCheck(true);
                }
                if (i == 13) {
                    r1.setItemsCount((int) ((AndroidUtilities.displaySize.y * 0.5f) / AndroidUtilities.dp(64.0f)));
                    break;
                }
                break;
            case 2:
                r1 = new HeaderCell(this.mContext);
                r1.setText(LocaleController.getString("RecentlyViewed", R.string.RecentlyViewed));
                TextView textView = new TextView(this.mContext);
                textView.setTextSize(1, 15.0f);
                textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlueHeader"));
                textView.setText(LocaleController.getString("RecentlyViewedHide", R.string.RecentlyViewedHide));
                int i3 = 3;
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                if (!LocaleController.isRTL) {
                    i3 = 5;
                }
                r1.addView(textView, LayoutHelper.createFrame(-1, -1.0f, i3 | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        DialogsAdapter.this.lambda$onCreateViewHolder$1(view2);
                    }
                });
                break;
            case 3:
                FrameLayout frameLayout = new FrameLayout(this, this.mContext) {
                    @Override
                    protected void onMeasure(int i4, int i5) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
                    }
                };
                frameLayout.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
                View view2 = new View(this.mContext);
                view2.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, (int) R.drawable.greydivider, "windowBackgroundGrayShadow"));
                frameLayout.addView(view2, LayoutHelper.createFrame(-1, -1.0f));
                r1 = frameLayout;
                break;
            case 4:
                r1 = new DialogMeUrlCell(this.mContext);
                break;
            case 5:
                r1 = new DialogsEmptyCell(this.mContext);
                break;
            case 6:
                r1 = new UserCell(this.mContext, 8, 0, false);
                break;
            case 7:
                r1 = new HeaderCell(this.mContext);
                r1.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
                break;
            case 8:
                view = new ShadowSectionCell(this.mContext);
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor("windowBackgroundGray")), Theme.getThemedDrawable(this.mContext, (int) R.drawable.greydivider, "windowBackgroundGrayShadow"));
                combinedDrawable.setFullsize(true);
                view.setBackgroundDrawable(combinedDrawable);
                r1 = view;
                break;
            case 9:
                r1 = new ArchiveHintCell(this.mContext);
                this.archiveHintCell = r1;
                break;
            case 10:
                r1 = new LastEmptyView(this.mContext);
                break;
            case 11:
                view = new TextInfoPrivacyCell(this.mContext) {
                    private long lastUpdateTime;
                    private float moveProgress;
                    private int movement;
                    private int originalX;
                    private int originalY;

                    @Override
                    protected void afterTextDraw() {
                        if (DialogsAdapter.this.arrowDrawable != null) {
                            Rect bounds = DialogsAdapter.this.arrowDrawable.getBounds();
                            Drawable drawable = DialogsAdapter.this.arrowDrawable;
                            int i4 = this.originalX;
                            drawable.setBounds(i4, this.originalY, bounds.width() + i4, this.originalY + bounds.height());
                        }
                    }

                    @Override
                    protected void onTextDraw() {
                        if (DialogsAdapter.this.arrowDrawable != null) {
                            Rect bounds = DialogsAdapter.this.arrowDrawable.getBounds();
                            int dp = (int) (this.moveProgress * AndroidUtilities.dp(3.0f));
                            this.originalX = bounds.left;
                            this.originalY = bounds.top;
                            DialogsAdapter.this.arrowDrawable.setBounds(this.originalX + dp, this.originalY + AndroidUtilities.dp(1.0f), this.originalX + dp + bounds.width(), this.originalY + AndroidUtilities.dp(1.0f) + bounds.height());
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            long j = elapsedRealtime - this.lastUpdateTime;
                            if (j > 17) {
                                j = 17;
                            }
                            this.lastUpdateTime = elapsedRealtime;
                            if (this.movement == 0) {
                                float f = this.moveProgress + (((float) j) / 664.0f);
                                this.moveProgress = f;
                                if (f >= 1.0f) {
                                    this.movement = 1;
                                    this.moveProgress = 1.0f;
                                }
                            } else {
                                float f2 = this.moveProgress - (((float) j) / 664.0f);
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
                CombinedDrawable combinedDrawable2 = new CombinedDrawable(new ColorDrawable(Theme.getColor("windowBackgroundGray")), Theme.getThemedDrawable(this.mContext, (int) R.drawable.greydivider, "windowBackgroundGrayShadow"));
                combinedDrawable2.setFullsize(true);
                view.setBackgroundDrawable(combinedDrawable2);
                r1 = view;
                break;
            case 12:
            default:
                r1 = new TextCell(this.mContext);
                break;
            case 14:
                r1 = new HeaderCell(this.mContext, "key_graySectionText", 16, 0, false);
                r1.setHeight(32);
                r1.setClickable(false);
                break;
        }
        r1.setLayoutParams(new RecyclerView.LayoutParams(-1, i == 5 ? -1 : -2));
        return new RecyclerListView.Holder(r1);
    }

    public int dialogsEmptyType() {
        int i = this.dialogsType;
        return (i == 7 || i == 8) ? MessagesController.getInstance(this.currentAccount).isDialogsEndReached(this.folderId) ? 2 : 3 : this.onlineContacts != null ? 1 : 0;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TLRPC$Chat tLRPC$Chat;
        String str;
        TLRPC$Chat chat;
        int i2;
        int itemViewType = viewHolder.getItemViewType();
        String str2 = null;
        boolean z = false;
        if (itemViewType == 0) {
            TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) getItem(i);
            TLRPC$Dialog tLRPC$Dialog2 = (TLRPC$Dialog) getItem(i + 1);
            int i3 = this.dialogsType;
            if (i3 == 2) {
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) viewHolder.itemView;
                long dialogId = profileSearchCell.getDialogId();
                if (tLRPC$Dialog.id != 0) {
                    TLRPC$Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-tLRPC$Dialog.id));
                    tLRPC$Chat = (chat2 == null || chat2.migrated_to == null || (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chat2.migrated_to.channel_id))) == null) ? chat2 : chat;
                } else {
                    tLRPC$Chat = null;
                }
                if (tLRPC$Chat != null) {
                    str2 = tLRPC$Chat.title;
                    if (!ChatObject.isChannel(tLRPC$Chat) || tLRPC$Chat.megagroup) {
                        int i4 = tLRPC$Chat.participants_count;
                        if (i4 != 0) {
                            str = LocaleController.formatPluralStringComma("Members", i4);
                        } else if (tLRPC$Chat.has_geo) {
                            str = LocaleController.getString("MegaLocation", R.string.MegaLocation);
                        } else if (TextUtils.isEmpty(tLRPC$Chat.username)) {
                            str = LocaleController.getString("MegaPrivate", R.string.MegaPrivate).toLowerCase();
                        } else {
                            str = LocaleController.getString("MegaPublic", R.string.MegaPublic).toLowerCase();
                        }
                    } else {
                        int i5 = tLRPC$Chat.participants_count;
                        if (i5 != 0) {
                            str = LocaleController.formatPluralStringComma("Subscribers", i5);
                        } else if (TextUtils.isEmpty(tLRPC$Chat.username)) {
                            str = LocaleController.getString("ChannelPrivate", R.string.ChannelPrivate).toLowerCase();
                        } else {
                            str = LocaleController.getString("ChannelPublic", R.string.ChannelPublic).toLowerCase();
                        }
                    }
                } else {
                    str = "";
                }
                String str3 = str;
                String str4 = str2;
                profileSearchCell.useSeparator = tLRPC$Dialog2 != null;
                profileSearchCell.setData(tLRPC$Chat, null, str4, str3, false, false);
                boolean contains = this.selectedDialogs.contains(Long.valueOf(profileSearchCell.getDialogId()));
                if (dialogId == profileSearchCell.getDialogId()) {
                    z = true;
                }
                profileSearchCell.setChecked(contains, z);
            } else {
                DialogCell dialogCell = (DialogCell) viewHolder.itemView;
                dialogCell.useSeparator = tLRPC$Dialog2 != null;
                dialogCell.fullSeparator = tLRPC$Dialog.pinned && tLRPC$Dialog2 != null && !tLRPC$Dialog2.pinned;
                if (i3 == 0 && AndroidUtilities.isTablet()) {
                    dialogCell.setDialogSelected(tLRPC$Dialog.id == this.openedDialogId);
                }
                dialogCell.setChecked(this.selectedDialogs.contains(Long.valueOf(tLRPC$Dialog.id)), false);
                dialogCell.setDialog(tLRPC$Dialog, this.dialogsType, this.folderId);
                DialogsPreloader dialogsPreloader = this.preloader;
                if (dialogsPreloader != null && i < 10) {
                    dialogsPreloader.add(tLRPC$Dialog.id);
                }
            }
        } else if (itemViewType == 14) {
            HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
            headerCell.setTextSize(14.0f);
            headerCell.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
            headerCell.setBackgroundColor(Theme.getColor("graySection"));
            int i6 = ((DialogsActivity.DialogsHeader) getItem(i)).headerType;
            if (i6 == 0) {
                headerCell.setText(LocaleController.getString("MyChannels", R.string.MyChannels));
            } else if (i6 == 1) {
                headerCell.setText(LocaleController.getString("MyGroups", R.string.MyGroups));
            } else if (i6 == 2) {
                headerCell.setText(LocaleController.getString("FilterGroups", R.string.FilterGroups));
            }
        } else if (itemViewType == 4) {
            ((DialogMeUrlCell) viewHolder.itemView).setRecentMeUrl((TLRPC$RecentMeUrl) getItem(i));
        } else if (itemViewType == 5) {
            DialogsEmptyCell dialogsEmptyCell = (DialogsEmptyCell) viewHolder.itemView;
            int i7 = this.lastDialogsEmptyType;
            int dialogsEmptyType = dialogsEmptyType();
            this.lastDialogsEmptyType = dialogsEmptyType;
            dialogsEmptyCell.setType(dialogsEmptyType);
            int i8 = this.dialogsType;
            if (!(i8 == 7 || i8 == 8)) {
                dialogsEmptyCell.setOnUtyanAnimationEndListener(new Runnable() {
                    @Override
                    public final void run() {
                        DialogsAdapter.this.lambda$onBindViewHolder$2();
                    }
                });
                dialogsEmptyCell.setOnUtyanAnimationUpdateListener(new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        DialogsAdapter.this.lambda$onBindViewHolder$3((Float) obj);
                    }
                });
                if (!dialogsEmptyCell.isUtyanAnimationTriggered() && this.dialogsCount == 0) {
                    this.parentFragment.setContactsAlpha(0.0f);
                    this.parentFragment.setScrollDisabled(true);
                }
                if (this.onlineContacts == null || i7 != 0) {
                    if (this.forceUpdatingContacts) {
                        if (this.dialogsCount == 0) {
                            dialogsEmptyCell.startUtyanCollapseAnimation(false);
                        }
                    } else if (dialogsEmptyCell.isUtyanAnimationTriggered() && this.lastDialogsEmptyType == 0) {
                        dialogsEmptyCell.startUtyanExpandAnimation();
                    }
                } else if (!dialogsEmptyCell.isUtyanAnimationTriggered()) {
                    dialogsEmptyCell.startUtyanCollapseAnimation(true);
                }
            }
        } else if (itemViewType == 6) {
            ((UserCell) viewHolder.itemView).setData(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.onlineContacts.get(this.dialogsCount == 0 ? i - 3 : (i - i2) - 2).user_id)), null, null, 0);
        } else if (itemViewType == 7) {
            HeaderCell headerCell2 = (HeaderCell) viewHolder.itemView;
            int i9 = this.dialogsType;
            if (i9 != 11 && i9 != 12 && i9 != 13) {
                headerCell2.setText(LocaleController.getString((this.dialogsCount != 0 || !this.forceUpdatingContacts) ? R.string.YourContacts : R.string.ConnectingYourContacts));
            } else if (i == 0) {
                headerCell2.setText(LocaleController.getString("ImportHeader", R.string.ImportHeader));
            } else {
                headerCell2.setText(LocaleController.getString("ImportHeaderContacts", R.string.ImportHeaderContacts));
            }
        } else if (itemViewType == 11) {
            TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
            textInfoPrivacyCell.setText(LocaleController.getString("TapOnThePencil", R.string.TapOnThePencil));
            if (this.arrowDrawable == null) {
                Drawable drawable = this.mContext.getResources().getDrawable(R.drawable.arrow_newchat);
                this.arrowDrawable = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteGrayText4"), PorterDuff.Mode.MULTIPLY));
            }
            TextView textView = textInfoPrivacyCell.getTextView();
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.arrowDrawable, (Drawable) null);
            textView.getLayoutParams().width = -2;
        } else if (itemViewType == 12) {
            TextCell textCell = (TextCell) viewHolder.itemView;
            textCell.setColors("windowBackgroundWhiteBlueText4", "windowBackgroundWhiteBlueText4");
            String string = LocaleController.getString("CreateGroupForImport", R.string.CreateGroupForImport);
            if (this.dialogsCount != 0) {
                z = true;
            }
            textCell.setTextAndIcon(string, R.drawable.msg_groups_create, z);
            textCell.setIsInDialogs();
            textCell.setOffsetFromImage(75);
        }
        if (i >= this.dialogsCount + 1) {
            viewHolder.itemView.setAlpha(1.0f);
        }
    }

    public void lambda$onBindViewHolder$2() {
        this.parentFragment.setScrollDisabled(false);
    }

    public void lambda$onBindViewHolder$3(Float f) {
        this.parentFragment.setContactsAlpha(f.floatValue());
    }

    public void setForceUpdatingContacts(boolean z) {
        this.forceUpdatingContacts = z;
    }

    @Override
    public int getItemViewType(int i) {
        int i2;
        int i3 = this.dialogsCount;
        if (i3 != 0 || !this.forceUpdatingContacts) {
            if (this.onlineContacts != null) {
                if (i3 == 0) {
                    if (i == 0) {
                        return 5;
                    }
                    if (i == 1) {
                        return 8;
                    }
                    return i == 2 ? 7 : 6;
                } else if (i < i3) {
                    return 0;
                } else {
                    if (i == i3) {
                        return 8;
                    }
                    if (i == i3 + 1) {
                        return 7;
                    }
                    return i == this.currentCount - 1 ? 10 : 6;
                }
            } else if (this.hasHints) {
                int size = MessagesController.getInstance(this.currentAccount).hintDialogs.size();
                int i4 = size + 2;
                if (i >= i4) {
                    i -= i4;
                } else if (i == 0) {
                    return 2;
                } else {
                    return i == size + 1 ? 3 : 4;
                }
            } else {
                if (!this.showArchiveHint) {
                    int i5 = this.dialogsType;
                    if (i5 == 11 || i5 == 13) {
                        if (i == 0) {
                            return 7;
                        }
                        if (i == 1) {
                            return 12;
                        }
                    } else if (i5 == 12) {
                        if (i == 0) {
                            return 7;
                        }
                        i--;
                    }
                } else if (i == 0) {
                    return 9;
                } else {
                    if (i == 1) {
                        return 8;
                    }
                }
                i -= 2;
            }
        } else if (i == 0) {
            return 5;
        } else {
            if (i == 1) {
                return 8;
            }
            if (i == 2) {
                return 7;
            }
            if (i == 3) {
                return 13;
            }
        }
        int i6 = this.folderId;
        if (i6 == 0 && this.dialogsCount > 10 && i == this.currentCount - 2 && this.dialogsType == 0) {
            return 11;
        }
        int size2 = this.parentFragment.getDialogsArray(this.currentAccount, this.dialogsType, i6, this.dialogsListFrozen).size();
        if (i == size2) {
            if (this.forceShowEmptyCell || (i2 = this.dialogsType) == 7 || i2 == 8 || MessagesController.getInstance(this.currentAccount).isDialogsEndReached(this.folderId)) {
                return size2 == 0 ? 5 : 10;
            }
            return 1;
        } else if (i > size2) {
            return 10;
        } else {
            return (this.dialogsType != 2 || !(getItem(i) instanceof DialogsActivity.DialogsHeader)) ? 0 : 14;
        }
    }

    @Override
    public void notifyItemMoved(int i, int i2) {
        char c = 0;
        ArrayList<TLRPC$Dialog> dialogsArray = this.parentFragment.getDialogsArray(this.currentAccount, this.dialogsType, this.folderId, false);
        int fixPosition = fixPosition(i);
        int fixPosition2 = fixPosition(i2);
        TLRPC$Dialog tLRPC$Dialog = dialogsArray.get(fixPosition);
        TLRPC$Dialog tLRPC$Dialog2 = dialogsArray.get(fixPosition2);
        int i3 = this.dialogsType;
        if (i3 == 7 || i3 == 8) {
            MessagesController.DialogFilter[] dialogFilterArr = MessagesController.getInstance(this.currentAccount).selectedDialogFilter;
            if (this.dialogsType == 8) {
                c = 1;
            }
            MessagesController.DialogFilter dialogFilter = dialogFilterArr[c];
            int i4 = dialogFilter.pinnedDialogs.get(tLRPC$Dialog.id);
            dialogFilter.pinnedDialogs.put(tLRPC$Dialog.id, dialogFilter.pinnedDialogs.get(tLRPC$Dialog2.id));
            dialogFilter.pinnedDialogs.put(tLRPC$Dialog2.id, i4);
        } else {
            int i5 = tLRPC$Dialog.pinnedNum;
            tLRPC$Dialog.pinnedNum = tLRPC$Dialog2.pinnedNum;
            tLRPC$Dialog2.pinnedNum = i5;
        }
        Collections.swap(dialogsArray, fixPosition, fixPosition2);
        super.notifyItemMoved(i, i2);
    }

    public void setArchivedPullDrawable(PullForegroundDrawable pullForegroundDrawable) {
        this.pullForegroundDrawable = pullForegroundDrawable;
    }

    public void didDatabaseCleared() {
        DialogsPreloader dialogsPreloader = this.preloader;
        if (dialogsPreloader != null) {
            dialogsPreloader.clear();
        }
    }

    public void resume() {
        DialogsPreloader dialogsPreloader = this.preloader;
        if (dialogsPreloader != null) {
            dialogsPreloader.resume();
        }
    }

    public void pause() {
        DialogsPreloader dialogsPreloader = this.preloader;
        if (dialogsPreloader != null) {
            dialogsPreloader.pause();
        }
    }

    public static class DialogsPreloader {
        int currentRequestCount;
        int networkRequestCount;
        boolean resumed;
        HashSet<Long> dialogsReadyMap = new HashSet<>();
        HashSet<Long> preloadedErrorMap = new HashSet<>();
        HashSet<Long> loadingDialogs = new HashSet<>();
        ArrayList<Long> preloadDialogsPool = new ArrayList<>();
        Runnable clearNetworkRequestCount = new Runnable() {
            @Override
            public final void run() {
                DialogsAdapter.DialogsPreloader.this.lambda$new$0();
            }
        };

        private boolean preloadIsAvilable() {
            return false;
        }

        public void updateList() {
        }

        public void lambda$new$0() {
            this.networkRequestCount = 0;
            start();
        }

        public void add(long j) {
            if (!isReady(j) && !this.preloadedErrorMap.contains(Long.valueOf(j)) && !this.loadingDialogs.contains(Long.valueOf(j)) && !this.preloadDialogsPool.contains(Long.valueOf(j))) {
                this.preloadDialogsPool.add(Long.valueOf(j));
                start();
            }
        }

        public void start() {
            if (preloadIsAvilable() && this.resumed && !this.preloadDialogsPool.isEmpty() && this.currentRequestCount < 4 && this.networkRequestCount <= 6) {
                long longValue = this.preloadDialogsPool.remove(0).longValue();
                this.currentRequestCount++;
                this.loadingDialogs.add(Long.valueOf(longValue));
                MessagesController.getInstance(UserConfig.selectedAccount).ensureMessagesLoaded(longValue, 0, new AnonymousClass1(longValue));
            }
        }

        public class AnonymousClass1 implements MessagesController.MessagesLoadedCallback {
            final long val$dialog_id;

            AnonymousClass1(long j) {
                this.val$dialog_id = j;
            }

            @Override
            public void onMessagesLoaded(final boolean z) {
                final long j = this.val$dialog_id;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        DialogsAdapter.DialogsPreloader.AnonymousClass1.this.lambda$onMessagesLoaded$0(z, j);
                    }
                });
            }

            public void lambda$onMessagesLoaded$0(boolean z, long j) {
                DialogsPreloader dialogsPreloader;
                if (!z) {
                    DialogsPreloader dialogsPreloader2 = DialogsPreloader.this;
                    int i = dialogsPreloader2.networkRequestCount + 1;
                    dialogsPreloader2.networkRequestCount = i;
                    if (i >= 6) {
                        AndroidUtilities.cancelRunOnUIThread(dialogsPreloader2.clearNetworkRequestCount);
                        AndroidUtilities.runOnUIThread(DialogsPreloader.this.clearNetworkRequestCount, 60000L);
                    }
                }
                if (DialogsPreloader.this.loadingDialogs.remove(Long.valueOf(j))) {
                    DialogsPreloader.this.dialogsReadyMap.add(Long.valueOf(j));
                    DialogsPreloader.this.updateList();
                    dialogsPreloader.currentRequestCount--;
                    DialogsPreloader.this.start();
                }
            }

            @Override
            public void onError() {
                final long j = this.val$dialog_id;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        DialogsAdapter.DialogsPreloader.AnonymousClass1.this.lambda$onError$1(j);
                    }
                });
            }

            public void lambda$onError$1(long j) {
                DialogsPreloader dialogsPreloader;
                if (DialogsPreloader.this.loadingDialogs.remove(Long.valueOf(j))) {
                    DialogsPreloader.this.preloadedErrorMap.add(Long.valueOf(j));
                    dialogsPreloader.currentRequestCount--;
                    DialogsPreloader.this.start();
                }
            }
        }

        public boolean isReady(long j) {
            return this.dialogsReadyMap.contains(Long.valueOf(j));
        }

        public void remove(long j) {
            this.preloadDialogsPool.remove(Long.valueOf(j));
        }

        public void clear() {
            this.dialogsReadyMap.clear();
            this.preloadedErrorMap.clear();
            this.loadingDialogs.clear();
            this.preloadDialogsPool.clear();
            this.currentRequestCount = 0;
            this.networkRequestCount = 0;
            AndroidUtilities.cancelRunOnUIThread(this.clearNetworkRequestCount);
            updateList();
        }

        public void resume() {
            this.resumed = true;
            start();
        }

        public void pause() {
            this.resumed = false;
        }
    }

    public int getCurrentCount() {
        return this.currentCount;
    }

    public void setForceShowEmptyCell(boolean z) {
        this.forceShowEmptyCell = z;
    }

    public class LastEmptyView extends View {
        public boolean moving;

        public LastEmptyView(Context context) {
            super(context);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = DialogsAdapter.this.parentFragment.getDialogsArray(DialogsAdapter.this.currentAccount, DialogsAdapter.this.dialogsType, DialogsAdapter.this.folderId, DialogsAdapter.this.dialogsListFrozen).size();
            int i3 = 0;
            boolean z = DialogsAdapter.this.dialogsType == 0 && MessagesController.getInstance(DialogsAdapter.this.currentAccount).dialogs_dict.get(DialogObject.makeFolderDialogId(1)) != null;
            View view = (View) getParent();
            int i4 = view instanceof BlurredRecyclerView ? ((BlurredRecyclerView) view).blurTopPadding : 0;
            int paddingTop = view.getPaddingTop() - i4;
            if (size != 0 && (paddingTop != 0 || z)) {
                int size2 = View.MeasureSpec.getSize(i2);
                if (size2 == 0) {
                    size2 = view.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - (Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0);
                }
                int i5 = size2 - i4;
                int dp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f);
                int i6 = (size * dp) + (size - 1);
                if (DialogsAdapter.this.onlineContacts != null) {
                    i6 += (DialogsAdapter.this.onlineContacts.size() * AndroidUtilities.dp(58.0f)) + (DialogsAdapter.this.onlineContacts.size() - 1) + AndroidUtilities.dp(52.0f);
                }
                int i7 = z ? dp + 1 : 0;
                if (i6 < i5) {
                    int i8 = (i5 - i6) + i7;
                    if (paddingTop == 0 || (i8 = i8 - AndroidUtilities.statusBarHeight) >= 0) {
                        i3 = i8;
                    }
                } else {
                    int i9 = i6 - i5;
                    if (i9 < i7) {
                        int i10 = i7 - i9;
                        if (paddingTop != 0) {
                            i10 -= AndroidUtilities.statusBarHeight;
                        }
                        if (i10 >= 0) {
                            i3 = i10;
                        }
                    }
                }
            }
            setMeasuredDimension(View.MeasureSpec.getSize(i), i3);
        }
    }
}
