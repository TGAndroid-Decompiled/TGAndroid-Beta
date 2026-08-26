package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;

public class PrivacyUsersActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public static final int TYPE_BLOCKED = 1;
    public static final int TYPE_FILTER = 2;
    public static final int TYPE_PRIVACY = 0;
    private int blockUserDetailRow;
    private int blockUserRow;
    private boolean blockedUsersActivity;
    private int currentType;
    private PrivacyActivityDelegate delegate;
    private int deleteAllRow;
    private EmptyTextProgressView emptyView;
    private boolean isAlwaysShare;
    private boolean isGroup;
    private LinearLayoutManager layoutManager;
    private RecyclerListView listView;
    private ListAdapter listViewAdapter;
    private int rowCount;
    public int rulesType;
    private ArrayList<Long> uidArray;
    private int usersDetailRow;
    private int usersEndRow;
    private int usersHeaderRow;
    private int usersStartRow;

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        public boolean lambda$onCreateViewHolder$0(ManageChatUserCell manageChatUserCell, boolean z) {
            if (!z) {
                return true;
            }
            PrivacyUsersActivity.this.showUnblockAlert((Long) manageChatUserCell.getTag(), manageChatUserCell);
            return true;
        }

        @Override
        public int getItemCount() {
            return PrivacyUsersActivity.this.rowCount;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == PrivacyUsersActivity.this.deleteAllRow) {
                return 4;
            }
            if (i == PrivacyUsersActivity.this.usersHeaderRow) {
                return 3;
            }
            if (i == PrivacyUsersActivity.this.blockUserRow) {
                return 2;
            }
            return (i == PrivacyUsersActivity.this.blockUserDetailRow || i == PrivacyUsersActivity.this.usersDetailRow) ? 1 : 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 0 || itemViewType == 2 || itemViewType == 4;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            String string2;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                ManageChatUserCell manageChatUserCell = (ManageChatUserCell) viewHolder.itemView;
                long jKeyAt = PrivacyUsersActivity.this.currentType == 1 ? PrivacyUsersActivity.this.getMessagesController().blockePeers.keyAt(i - PrivacyUsersActivity.this.usersStartRow) : ((Long) PrivacyUsersActivity.this.uidArray.get(i - PrivacyUsersActivity.this.usersStartRow)).longValue();
                manageChatUserCell.setTag(Long.valueOf(jKeyAt));
                if (jKeyAt <= 0) {
                    TLRPC.Chat chat = PrivacyUsersActivity.this.getMessagesController().getChat(Long.valueOf(-jKeyAt));
                    if (chat != null) {
                        int i2 = chat.participants_count;
                        if (i2 != 0) {
                            string = LocaleController.formatPluralString("Members", i2, new Object[0]);
                        } else if (chat.has_geo) {
                            string = LocaleController.getString(R.string.MegaLocation);
                        } else {
                            string = !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.MegaPublic);
                        }
                        manageChatUserCell.setData(chat, null, string, i != PrivacyUsersActivity.this.usersEndRow - 1);
                        return;
                    }
                    return;
                }
                TLRPC.User user = PrivacyUsersActivity.this.getMessagesController().getUser(Long.valueOf(jKeyAt));
                if (user != null) {
                    if (user.bot) {
                        StringBuilder sb = new StringBuilder();
                        int i3 = R.string.Bot;
                        sb.append(LocaleController.getString(i3).substring(0, 1).toUpperCase());
                        sb.append(LocaleController.getString(i3).substring(1));
                        string2 = sb.toString();
                    } else {
                        String str = user.phone;
                        string2 = (str == null || str.length() == 0) ? LocaleController.getString(R.string.NumberUnknown) : UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), user.phone, PhoneFormat.getInstance());
                    }
                    manageChatUserCell.setData(user, null, string2, i != PrivacyUsersActivity.this.usersEndRow - 1);
                    return;
                }
                return;
            }
            if (itemViewType == 1) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                if (i != PrivacyUsersActivity.this.blockUserDetailRow) {
                    if (i == PrivacyUsersActivity.this.usersDetailRow) {
                        textInfoPrivacyCell.setFixedSize(12);
                        textInfoPrivacyCell.setText("");
                        return;
                    }
                    return;
                }
                if (PrivacyUsersActivity.this.currentType == 1) {
                    textInfoPrivacyCell.setFixedSize(0);
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                    return;
                } else {
                    textInfoPrivacyCell.setFixedSize(8);
                    textInfoPrivacyCell.setText(null);
                    return;
                }
            }
            if (itemViewType == 2) {
                ManageChatTextCell manageChatTextCell = (ManageChatTextCell) viewHolder.itemView;
                manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                if (PrivacyUsersActivity.this.currentType == 1) {
                    manageChatTextCell.setText(LocaleController.getString(R.string.BlockUser), null, R.drawable.msg_contact_add, false);
                    return;
                } else {
                    manageChatTextCell.setText(LocaleController.getString(R.string.PrivacyAddAnException), null, R.drawable.msg_contact_add, PrivacyUsersActivity.this.uidArray.size() > 0);
                    return;
                }
            }
            if (itemViewType != 3) {
                return;
            }
            HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
            if (i == PrivacyUsersActivity.this.usersHeaderRow) {
                if (PrivacyUsersActivity.this.currentType == 1) {
                    headerCell.setText(LocaleController.formatPluralString("BlockedUsersCount", PrivacyUsersActivity.this.getMessagesController().totalBlockedCount, new Object[0]));
                } else {
                    headerCell.setText(LocaleController.getString(R.string.PrivacyExceptions));
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textInfoPrivacyCell;
            if (i == 0) {
                ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 7, 6, true, null);
                manageChatUserCell.setDelegate(new PhotoViewer$55$$ExternalSyntheticLambda2(this, 19));
                textInfoPrivacyCell = manageChatUserCell;
            } else if (i == 1) {
                textInfoPrivacyCell = new TextInfoPrivacyCell(this.mContext, 24, null);
            } else if (i == 2) {
                textInfoPrivacyCell = new ManageChatTextCell(this.mContext);
            } else if (i != 4) {
                HeaderCell headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteBlueHeader, 21, 11, false);
                headerCell.setHeight(43);
                textInfoPrivacyCell = headerCell;
            } else {
                TextCell textCell = new TextCell(viewGroup.getContext());
                textCell.setText(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                textCell.setColors(-1, Theme.key_text_RedRegular);
                textInfoPrivacyCell = textCell;
            }
            return new RecyclerListView.Holder(textInfoPrivacyCell);
        }
    }

    public interface PrivacyActivityDelegate {
        void didUpdateUserList(ArrayList<Long> arrayList, boolean z);
    }

    public PrivacyUsersActivity() {
        super(null);
        this.currentType = 1;
        this.blockedUsersActivity = true;
    }

    public Integer lambda$createView$0(Integer num) {
        if (num.intValue() == this.deleteAllRow) {
            return Integer.valueOf(Theme.multAlpha(0.12f, Theme.getColor(null, Theme.key_text_RedRegular, false)));
        }
        return null;
    }

    public void lambda$createView$1() {
        this.uidArray.clear();
        updateRows();
        finishFragment();
        PrivacyActivityDelegate privacyActivityDelegate = this.delegate;
        if (privacyActivityDelegate != null) {
            privacyActivityDelegate.didUpdateUserList(this.uidArray, true);
        }
    }

    public void lambda$createView$2(boolean z, boolean z2, ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Long l = (Long) obj;
            if (!this.uidArray.contains(l)) {
                this.uidArray.add(l);
            }
        }
        updateRows();
        PrivacyActivityDelegate privacyActivityDelegate = this.delegate;
        if (privacyActivityDelegate != null) {
            privacyActivityDelegate.didUpdateUserList(this.uidArray, true);
        }
    }

    public void lambda$createView$3(View view, int i) {
        if (i == this.deleteAllRow) {
            AlertDialog alertDialogCreate = AlertsCreator.createSimpleAlert(getContext(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new MainTabsLayout$$ExternalSyntheticLambda0(this, 12), null).create();
            alertDialogCreate.show();
            alertDialogCreate.redPositive();
            return;
        }
        if (i != this.blockUserRow) {
            if (i < this.usersStartRow || i >= this.usersEndRow) {
                return;
            }
            if (this.currentType == 1) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", getMessagesController().blockePeers.keyAt(i - this.usersStartRow));
                presentFragment(new ProfileActivity(bundle));
                return;
            } else {
                Bundle bundle2 = new Bundle();
                long jLongValue = this.uidArray.get(i - this.usersStartRow).longValue();
                if (DialogObject.isUserDialog(jLongValue)) {
                    bundle2.putLong("user_id", jLongValue);
                } else {
                    bundle2.putLong("chat_id", -jLongValue);
                }
                presentFragment(new ProfileActivity(bundle2));
                return;
            }
        }
        if (this.currentType == 1) {
            presentFragment(new DialogOrContactPickerActivity());
            return;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean(this.isAlwaysShare ? "isAlwaysShare" : "isNeverShare", true);
        if (this.isGroup) {
            bundle3.putInt("chatAddType", 1);
        } else if (this.currentType == 2) {
            bundle3.putInt("chatAddType", 2);
        }
        if (this.isAlwaysShare && this.rulesType == 1) {
            bundle3.putBoolean("allowPremium", true);
        } else if (this.rulesType == 12) {
            bundle3.putBoolean("allowMiniapps", true);
        }
        GroupCreateActivity groupCreateActivity = new GroupCreateActivity(bundle3);
        groupCreateActivity.setDelegate(new PrivacyUsersActivity$$ExternalSyntheticLambda4(this));
        presentFragment(groupCreateActivity);
    }

    public boolean lambda$createView$4(View view, int i) {
        int i2 = this.usersStartRow;
        if (i < i2 || i >= this.usersEndRow) {
            return false;
        }
        if (this.currentType == 1) {
            showUnblockAlert(Long.valueOf(getMessagesController().blockePeers.keyAt(i - this.usersStartRow)), view);
        } else {
            showUnblockAlert(this.uidArray.get(i - i2), view);
        }
        return true;
    }

    public void lambda$getThemeDescriptions$7() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof ManageChatUserCell) {
                    ((ManageChatUserCell) childAt).update(0);
                }
            }
        }
    }

    public void lambda$showUnblockAlert$5(Long l) {
        getMessagesController().unblockPeer(l.longValue());
    }

    public void lambda$showUnblockAlert$6(Long l) {
        this.uidArray.remove(l);
        updateRows();
        PrivacyActivityDelegate privacyActivityDelegate = this.delegate;
        if (privacyActivityDelegate != null) {
            privacyActivityDelegate.didUpdateUserList(this.uidArray, false);
        }
        if (this.uidArray.isEmpty()) {
            finishFragment();
        }
    }

    public void showUnblockAlert(final Long l, View view) {
        if (getParentActivity() == null) {
            return;
        }
        final int i = 0;
        ItemOptions itemOptionsAddIf = ItemOptions.makeOptions(this, view).setScrimViewBackground(new ColorDrawable(Theme.getColor(null, Theme.key_windowBackgroundWhite, false))).addIf(this.currentType == 1, 0, LocaleController.getString(R.string.Unblock), new Runnable(this) {
            public final PrivacyUsersActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        this.f$0.lambda$showUnblockAlert$5(l);
                        break;
                    default:
                        this.f$0.lambda$showUnblockAlert$6(l);
                        break;
                }
            }
        });
        int i2 = this.currentType;
        boolean z = i2 != 1;
        int i3 = i2 == 0 ? R.drawable.msg_user_remove : 0;
        final int i4 = 1;
        itemOptionsAddIf.addIf(z, i3, (CharSequence) LocaleController.getString(R.string.Remove), true, new Runnable(this) {
            public final PrivacyUsersActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$showUnblockAlert$5(l);
                        break;
                    default:
                        this.f$0.lambda$showUnblockAlert$6(l);
                        break;
                }
            }
        }).setMinWidth(190).show();
    }

    private void updateRows() {
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
            int size = i3 == 1 ? getMessagesController().blockePeers.size() : this.uidArray.size();
            if (size != 0) {
                int i4 = this.currentType;
                if (i4 == 1) {
                    int i5 = this.rowCount;
                    this.rowCount = i5 + 1;
                    this.usersHeaderRow = i5;
                }
                int i6 = this.rowCount;
                this.usersStartRow = i6;
                int i7 = i6 + size;
                this.usersEndRow = i7;
                int i8 = i7 + 1;
                this.rowCount = i8;
                this.usersDetailRow = i7;
                if (i4 != 1) {
                    this.rowCount = i7 + 2;
                    this.deleteAllRow = i8;
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
            listAdapter.notifyDataSetChanged();
        }
    }

    private void updateVisibleRows(int i) {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null) {
            return;
        }
        int childCount = recyclerListView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.listView.getChildAt(i2);
            if (childAt instanceof ManageChatUserCell) {
                ((ManageChatUserCell) childAt).update(i);
            }
        }
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i = this.currentType;
        if (i == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.BlockedUsers));
        } else if (i == 2) {
            if (this.isAlwaysShare) {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
            }
        } else if (this.isGroup) {
            if (this.isAlwaysShare) {
                this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysAllow));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.NeverAllow));
            }
        } else if (this.isAlwaysShare) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysShareWithTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    PrivacyUsersActivity.this.finishFragment();
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        if (this.currentType == 1) {
            emptyTextProgressView.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            emptyTextProgressView.setText(LocaleController.getString(R.string.NoContacts));
        }
        frameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setItemSelectorColorProvider(new PrivacyUsersActivity$$ExternalSyntheticLambda4(this));
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
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda11(this, 1));
        this.listView.setOnItemLongClickListener(new PrivacyUsersActivity$$ExternalSyntheticLambda4(this));
        if (this.currentType == 1) {
            this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                    if (PrivacyUsersActivity.this.getMessagesController().blockedEndReached) {
                        return;
                    }
                    int iAbs = Math.abs(PrivacyUsersActivity.this.layoutManager.findLastVisibleItemPosition() - PrivacyUsersActivity.this.layoutManager.findFirstVisibleItemPosition()) + 1;
                    int itemCount = recyclerView.getAdapter().getItemCount();
                    if (iAbs <= 0 || PrivacyUsersActivity.this.layoutManager.findLastVisibleItemPosition() < itemCount - 10) {
                        return;
                    }
                    PrivacyUsersActivity.this.getMessagesController().getBlockedPeers(false);
                }
            });
            if (getMessagesController().totalBlockedCount < 0) {
                this.emptyView.showProgress();
            } else {
                this.emptyView.showTextView();
            }
        }
        updateRows();
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.updateInterfaces) {
            if (i == NotificationCenter.blockedUsersDidLoad) {
                this.emptyView.showTextView();
                updateRows();
                return;
            }
            return;
        }
        int iIntValue = ((Integer) objArr[0]).intValue();
        if ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) == 0 && (MessagesController.UPDATE_MASK_NAME & iIntValue) == 0) {
            return;
        }
        updateVisibleRows(iIntValue);
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        IntroActivity$$ExternalSyntheticLambda0 introActivity$$ExternalSyntheticLambda0 = new IntroActivity$$ExternalSyntheticLambda0(this, 29);
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
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusColor"}, null, null, -1, introActivity$$ExternalSyntheticLambda0, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusOnlineColor"}, null, null, -1, introActivity$$ExternalSyntheticLambda0, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueIcon));
        return arrayList;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    public PrivacyUsersActivity loadBlocked() {
        getMessagesController().getBlockedPeers(true);
        return this;
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        if (this.currentType == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.currentType == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    public void setDelegate(PrivacyActivityDelegate privacyActivityDelegate) {
        this.delegate = privacyActivityDelegate;
    }

    public PrivacyUsersActivity(int i, ArrayList<Long> arrayList, boolean z, boolean z2) {
        super(null);
        this.uidArray = arrayList;
        this.isAlwaysShare = z2;
        this.isGroup = z;
        this.blockedUsersActivity = false;
        this.currentType = i;
    }
}
