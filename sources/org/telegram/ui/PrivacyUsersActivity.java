package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;

public final class PrivacyUsersActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public int blockUserDetailRow;
    public int blockUserRow;
    public final boolean blockedUsersActivity;
    public final int currentType;
    public int deleteAllRow;
    public EmptyTextProgressView emptyView;
    public LinearLayoutManager layoutManager;
    public RecyclerListView listView;
    public ListAdapter listViewAdapter;
    public int rowCount;
    public int usersDetailRow;
    public int usersEndRow;
    public int usersHeaderRow;
    public int usersStartRow;

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return PrivacyUsersActivity.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            PrivacyUsersActivity privacyUsersActivity = PrivacyUsersActivity.this;
            if (i == privacyUsersActivity.deleteAllRow) {
                return 4;
            }
            if (i == privacyUsersActivity.usersHeaderRow) {
                return 3;
            }
            if (i == privacyUsersActivity.blockUserRow) {
                return 2;
            }
            return (i == privacyUsersActivity.blockUserDetailRow || i == privacyUsersActivity.usersDetailRow) ? 1 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return i == 0 || i == 2 || i == 4;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            String string2;
            int i2 = viewHolder.mItemViewType;
            PrivacyUsersActivity privacyUsersActivity = PrivacyUsersActivity.this;
            int i3 = privacyUsersActivity.currentType;
            View view = viewHolder.itemView;
            if (i2 != 0) {
                if (i2 == 1) {
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                    if (i != privacyUsersActivity.blockUserDetailRow) {
                        if (i == privacyUsersActivity.usersDetailRow) {
                            textInfoPrivacyCell.setFixedSize(12);
                            textInfoPrivacyCell.setText("");
                            return;
                        }
                        return;
                    }
                    if (i3 == 1) {
                        textInfoPrivacyCell.setFixedSize(0);
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                        return;
                    } else {
                        textInfoPrivacyCell.setFixedSize(8);
                        textInfoPrivacyCell.setText(null);
                        return;
                    }
                }
                if (i2 == 2) {
                    ManageChatTextCell manageChatTextCell = (ManageChatTextCell) view;
                    manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                    if (i3 == 1) {
                        manageChatTextCell.setText(LocaleController.getString(R.string.BlockUser), R.drawable.msg_contact_add, 5, false);
                        return;
                    } else {
                        LocaleController.getString(R.string.PrivacyAddAnException);
                        throw null;
                    }
                }
                if (i2 != 3) {
                    return;
                }
                HeaderCell headerCell = (HeaderCell) view;
                if (i == privacyUsersActivity.usersHeaderRow) {
                    if (i3 == 1) {
                        headerCell.setText(LocaleController.formatPluralString("BlockedUsersCount", privacyUsersActivity.getMessagesController().totalBlockedCount, new Object[0]));
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString(R.string.PrivacyExceptions));
                        return;
                    }
                }
                return;
            }
            ManageChatUserCell manageChatUserCell = (ManageChatUserCell) view;
            if (i3 != 1) {
                throw null;
            }
            long jKeyAt = privacyUsersActivity.getMessagesController().blockePeers.keyAt(i - privacyUsersActivity.usersStartRow);
            manageChatUserCell.setTag(Long.valueOf(jKeyAt));
            if (jKeyAt <= 0) {
                TLRPC.Chat chat = privacyUsersActivity.getMessagesController().getChat(Long.valueOf(-jKeyAt));
                if (chat != null) {
                    int i4 = chat.participants_count;
                    if (i4 != 0) {
                        string = LocaleController.formatPluralString("Members", i4, new Object[0]);
                    } else if (chat.has_geo) {
                        string = LocaleController.getString(R.string.MegaLocation);
                    } else {
                        string = !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.MegaPublic);
                    }
                    manageChatUserCell.setData(chat, null, string, i != privacyUsersActivity.usersEndRow - 1);
                    return;
                }
                return;
            }
            TLRPC.User user = privacyUsersActivity.getMessagesController().getUser(Long.valueOf(jKeyAt));
            if (user != null) {
                if (user.bot) {
                    StringBuilder sb = new StringBuilder();
                    int i5 = R.string.Bot;
                    sb.append(LocaleController.getString(i5).substring(0, 1).toUpperCase());
                    sb.append(LocaleController.getString(i5).substring(1));
                    string2 = sb.toString();
                } else {
                    String str = user.phone;
                    if (str == null || str.length() == 0) {
                        string2 = LocaleController.getString(R.string.NumberUnknown);
                    } else {
                        string2 = UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), user.phone, PhoneFormat.getInstance());
                    }
                }
                manageChatUserCell.setData(user, null, string2, i != privacyUsersActivity.usersEndRow - 1);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            View textInfoPrivacyCell;
            if (i != 0) {
                Context context = this.mContext;
                if (i == 1) {
                    textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
                } else if (i == 2) {
                    textInfoPrivacyCell = new ManageChatTextCell(context);
                } else if (i != 4) {
                    HeaderCell headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteBlueHeader, 21, 11, false);
                    headerCell.setHeight(43);
                    view = headerCell;
                } else {
                    TextCell textCell = new TextCell(viewGroup.getContext());
                    textCell.setText(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    textCell.setColors(-1, Theme.key_text_RedRegular);
                    view = textCell;
                }
                view = textInfoPrivacyCell;
            } else {
                ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 7, 6, true, null);
                manageChatUserCell.setDelegate(new PhotoViewer$$ExternalSyntheticLambda115(this, 26));
                view = manageChatUserCell;
            }
            return new RecyclerListView.Holder(view);
        }
    }

    public PrivacyUsersActivity() {
        super(null);
        this.currentType = 1;
        this.blockedUsersActivity = true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i = this.currentType;
        if (i == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.BlockedUsers));
        } else if (i == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 16));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, null);
        this.emptyView = emptyTextProgressView;
        if (i == 1) {
            emptyTextProgressView.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            emptyTextProgressView.setText(LocaleController.getString(R.string.NoContacts));
        }
        frameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1.0f, -1));
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setItemSelectorColorProvider(new PrivacyUsersActivity$$ExternalSyntheticLambda1(this));
        this.listView.setEmptyView(this.emptyView);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        this.listView.setVerticalScrollBarEnabled(false);
        RecyclerListView recyclerListView3 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listViewAdapter = listAdapter;
        recyclerListView3.setAdapter(listAdapter);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 28));
        this.listView.setOnItemLongClickListener(new PrivacyUsersActivity$$ExternalSyntheticLambda1(this));
        if (i == 1) {
            this.listView.setOnScrollListener(new SettingsActivity.AnonymousClass5(this, 5));
            if (getMessagesController().totalBlockedCount < 0) {
                this.emptyView.showProgress();
            } else {
                this.emptyView.showTextView();
            }
        }
        updateRows$15();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        RecyclerListView recyclerListView;
        if (i != NotificationCenter.updateInterfaces) {
            if (i == NotificationCenter.blockedUsersDidLoad) {
                this.emptyView.showTextView();
                updateRows$15();
                return;
            }
            return;
        }
        int iIntValue = ((Integer) objArr[0]).intValue();
        if (((MessagesController.UPDATE_MASK_AVATAR & iIntValue) == 0 && (MessagesController.UPDATE_MASK_NAME & iIntValue) == 0) || (recyclerListView = this.listView) == null) {
            return;
        }
        int childCount = recyclerListView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.listView.getChildAt(i3);
            if (childAt instanceof ManageChatUserCell) {
                ((ManageChatUserCell) childAt).update(iIntValue);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        QrActivity$$ExternalSyntheticLambda9 qrActivity$$ExternalSyntheticLambda9 = new QrActivity$$ExternalSyntheticLambda9(12, this);
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{ManageChatUserCell.class, ManageChatTextCell.class, HeaderCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.emptyView, 4, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.emptyView, 2048, null, null, null, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusColor"}, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusOnlineColor"}, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueIcon));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        if (this.currentType == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.currentType == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
    }

    public final void showUnblockAlert(Long l, View view) {
        if (getParentActivity() == null) {
            return;
        }
        ItemOptions itemOptions = new ItemOptions(this, view, false, true);
        itemOptions.setScrimViewBackground(new ColorDrawable(Theme.getColor(null, Theme.key_windowBackgroundWhite, false)));
        int i = this.currentType;
        itemOptions.addIf(0, LocaleController.getString(R.string.Unblock), new PhotoViewer$$ExternalSyntheticLambda7(24, this, l), i == 1);
        boolean z = i != 1;
        int i2 = i == 0 ? R.drawable.msg_user_remove : 0;
        String string = LocaleController.getString(R.string.Remove);
        PrivacyUsersActivity$$ExternalSyntheticLambda5 privacyUsersActivity$$ExternalSyntheticLambda5 = new PrivacyUsersActivity$$ExternalSyntheticLambda5(this, l);
        if (z) {
            itemOptions.add(i2, string, privacyUsersActivity$$ExternalSyntheticLambda5, true);
        }
        itemOptions.minWidthDp = 190;
        itemOptions.show();
    }

    public final void updateRows$15() {
        this.rowCount = 0;
        this.blockUserRow = -1;
        this.usersHeaderRow = -1;
        this.blockUserDetailRow = -1;
        this.deleteAllRow = -1;
        if (!this.blockedUsersActivity || getMessagesController().totalBlockedCount >= 0) {
            int i = this.rowCount;
            int i2 = i + 1;
            this.rowCount = i2;
            this.blockUserRow = i;
            int i3 = this.currentType;
            if (i3 == 1) {
                this.rowCount = i + 2;
                this.blockUserDetailRow = i2;
            }
            if (i3 != 1) {
                throw null;
            }
            int size = getMessagesController().blockePeers.size();
            if (size != 0) {
                if (i3 == 1) {
                    int i4 = this.rowCount;
                    this.rowCount = i4 + 1;
                    this.usersHeaderRow = i4;
                }
                int i5 = this.rowCount;
                this.usersStartRow = i5;
                int i6 = i5 + size;
                this.usersEndRow = i6;
                int i7 = i6 + 1;
                this.rowCount = i7;
                this.usersDetailRow = i6;
                if (i3 != 1) {
                    this.rowCount = i6 + 2;
                    this.deleteAllRow = i7;
                }
            } else {
                this.usersHeaderRow = -1;
                this.usersStartRow = -1;
                this.usersEndRow = -1;
                this.usersDetailRow = -1;
                this.deleteAllRow = -1;
            }
        }
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
    }
}
