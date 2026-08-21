package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
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
    private int blockUserDetailRow;
    private int blockUserRow;
    private int deleteAllRow;
    private EmptyTextProgressView emptyView;
    private boolean isAlwaysShare;
    private boolean isGroup;
    private LinearLayoutManager layoutManager;
    private RecyclerListView listView;
    private ListAdapter listViewAdapter;
    private int rowCount;
    public int rulesType;
    private ArrayList uidArray;
    private int usersDetailRow;
    private int usersEndRow;
    private int usersHeaderRow;
    private int usersStartRow;
    private int currentType = 1;
    private boolean blockedUsersActivity = true;

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
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
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
        this.listView.setItemSelectorColorProvider(new GenericProvider() {
            @Override
            public final Object provide(Object obj) {
                return PrivacyUsersActivity.m3807$r8$lambda$z89hZfZTBvoBO5XtM69sx9Kyv4(this.f$0, (Integer) obj);
            }
        });
        this.listView.setEmptyView(this.emptyView);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        this.listView.setVerticalScrollBarEnabled(false);
        RecyclerListView recyclerListView3 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listViewAdapter = listAdapter;
        recyclerListView3.setAdapter(listAdapter);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                PrivacyUsersActivity.$r8$lambda$Ifa9XwnvTVB3kCL50YTmAutchQY(this.f$0, view, i2);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i2) {
                return PrivacyUsersActivity.$r8$lambda$_RTLVkn5HvAZRSZ83zslORIzJDE(this.f$0, view, i2);
            }
        });
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

    public static Integer m3807$r8$lambda$z89hZfZTBvoBO5XtM69sx9Kyv4(PrivacyUsersActivity privacyUsersActivity, Integer num) {
        privacyUsersActivity.getClass();
        if (num.intValue() == privacyUsersActivity.deleteAllRow) {
            return Integer.valueOf(Theme.multAlpha(Theme.getColor(Theme.key_text_RedRegular), 0.12f));
        }
        return null;
    }

    public static void $r8$lambda$Ifa9XwnvTVB3kCL50YTmAutchQY(final PrivacyUsersActivity privacyUsersActivity, View view, int i) {
        if (i == privacyUsersActivity.deleteAllRow) {
            AlertDialog alertDialogCreate = AlertsCreator.createSimpleAlert(privacyUsersActivity.getContext(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new Runnable() {
                @Override
                public final void run() {
                    PrivacyUsersActivity.m3808$r8$lambda$86kBhdOdFnUOHGp6EgsghOis38(this.f$0);
                }
            }, null).create();
            alertDialogCreate.show();
            alertDialogCreate.redPositive();
            return;
        }
        if (i == privacyUsersActivity.blockUserRow) {
            if (privacyUsersActivity.currentType == 1) {
                privacyUsersActivity.presentFragment(new DialogOrContactPickerActivity());
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean(privacyUsersActivity.isAlwaysShare ? "isAlwaysShare" : "isNeverShare", true);
            if (privacyUsersActivity.isGroup) {
                bundle.putInt("chatAddType", 1);
            } else if (privacyUsersActivity.currentType == 2) {
                bundle.putInt("chatAddType", 2);
            }
            if (privacyUsersActivity.isAlwaysShare && privacyUsersActivity.rulesType == 1) {
                bundle.putBoolean("allowPremium", true);
            } else if (privacyUsersActivity.rulesType == 12) {
                bundle.putBoolean("allowMiniapps", true);
            }
            GroupCreateActivity groupCreateActivity = new GroupCreateActivity(bundle);
            groupCreateActivity.setDelegate(new GroupCreateActivity.GroupCreateActivityDelegate() {
                @Override
                public final void didSelectUsers(boolean z, boolean z2, ArrayList arrayList) {
                    PrivacyUsersActivity.m3809$r8$lambda$ZVZ8B2d3z9giqJMLYjr0DewVqk(this.f$0, z, z2, arrayList);
                }
            });
            privacyUsersActivity.presentFragment(groupCreateActivity);
            return;
        }
        if (i < privacyUsersActivity.usersStartRow || i >= privacyUsersActivity.usersEndRow) {
            return;
        }
        if (privacyUsersActivity.currentType == 1) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", privacyUsersActivity.getMessagesController().blockePeers.keyAt(i - privacyUsersActivity.usersStartRow));
            privacyUsersActivity.presentFragment(new ProfileActivity(bundle2));
        } else {
            Bundle bundle3 = new Bundle();
            long jLongValue = ((Long) privacyUsersActivity.uidArray.get(i - privacyUsersActivity.usersStartRow)).longValue();
            if (DialogObject.isUserDialog(jLongValue)) {
                bundle3.putLong("user_id", jLongValue);
            } else {
                bundle3.putLong("chat_id", -jLongValue);
            }
            privacyUsersActivity.presentFragment(new ProfileActivity(bundle3));
        }
    }

    public static void m3808$r8$lambda$86kBhdOdFnUOHGp6EgsghOis38(PrivacyUsersActivity privacyUsersActivity) {
        privacyUsersActivity.uidArray.clear();
        privacyUsersActivity.updateRows();
        privacyUsersActivity.finishFragment();
    }

    public static void m3809$r8$lambda$ZVZ8B2d3z9giqJMLYjr0DewVqk(PrivacyUsersActivity privacyUsersActivity, boolean z, boolean z2, ArrayList arrayList) {
        privacyUsersActivity.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Long l = (Long) obj;
            if (!privacyUsersActivity.uidArray.contains(l)) {
                privacyUsersActivity.uidArray.add(l);
            }
        }
        privacyUsersActivity.updateRows();
    }

    public static boolean $r8$lambda$_RTLVkn5HvAZRSZ83zslORIzJDE(PrivacyUsersActivity privacyUsersActivity, View view, int i) {
        int i2 = privacyUsersActivity.usersStartRow;
        if (i < i2 || i >= privacyUsersActivity.usersEndRow) {
            return false;
        }
        if (privacyUsersActivity.currentType == 1) {
            privacyUsersActivity.showUnblockAlert(Long.valueOf(privacyUsersActivity.getMessagesController().blockePeers.keyAt(i - privacyUsersActivity.usersStartRow)), view);
            return true;
        }
        privacyUsersActivity.showUnblockAlert((Long) privacyUsersActivity.uidArray.get(i - i2), view);
        return true;
    }

    public void showUnblockAlert(final Long l, View view) {
        if (getParentActivity() == null) {
            return;
        }
        ItemOptions itemOptionsAddIf = ItemOptions.makeOptions(this, view).setScrimViewBackground(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundWhite))).addIf(this.currentType == 1, 0, LocaleController.getString(R.string.Unblock), new Runnable() {
            @Override
            public final void run() {
                this.f$0.getMessagesController().unblockPeer(l.longValue());
            }
        });
        int i = this.currentType;
        itemOptionsAddIf.addIf(i != 1, i == 0 ? R.drawable.msg_user_remove : 0, (CharSequence) LocaleController.getString(R.string.Remove), true, new Runnable() {
            @Override
            public final void run() {
                PrivacyUsersActivity.$r8$lambda$AU0nTt9lkEiYUkPdPRdK0zjCAZs(this.f$0, l);
            }
        }).setMinWidth(190).show();
    }

    public static void $r8$lambda$AU0nTt9lkEiYUkPdPRdK0zjCAZs(PrivacyUsersActivity privacyUsersActivity, Long l) {
        privacyUsersActivity.uidArray.remove(l);
        privacyUsersActivity.updateRows();
        if (privacyUsersActivity.uidArray.isEmpty()) {
            privacyUsersActivity.finishFragment();
        }
    }

    private void updateRows() {
        int size;
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
            if (i3 == 1) {
                size = getMessagesController().blockePeers.size();
            } else {
                size = this.uidArray.size();
            }
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

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.updateInterfaces) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) == 0 && (MessagesController.UPDATE_MASK_NAME & iIntValue) == 0) {
                return;
            }
            updateVisibleRows(iIntValue);
            return;
        }
        if (i == NotificationCenter.blockedUsersDidLoad) {
            this.emptyView.showTextView();
            updateRows();
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
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            return PrivacyUsersActivity.this.rowCount;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 0 || itemViewType == 2 || itemViewType == 4;
        }

        public static boolean m3811$r8$lambda$4zdDOFOc1rfEsoVRG2n2jTn4dI(ListAdapter listAdapter, ManageChatUserCell manageChatUserCell, boolean z) {
            if (z) {
                PrivacyUsersActivity.this.showUnblockAlert((Long) manageChatUserCell.getTag(), manageChatUserCell);
                return true;
            }
            listAdapter.getClass();
            return true;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textInfoPrivacyCell;
            if (i == 0) {
                ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 7, 6, true);
                manageChatUserCell.setDelegate(new ManageChatUserCell.ManageChatUserCellDelegate() {
                    @Override
                    public final boolean onOptionsButtonCheck(ManageChatUserCell manageChatUserCell2, boolean z) {
                        return PrivacyUsersActivity.ListAdapter.m3811$r8$lambda$4zdDOFOc1rfEsoVRG2n2jTn4dI(this.f$0, manageChatUserCell2, z);
                    }
                });
                textInfoPrivacyCell = manageChatUserCell;
            } else if (i == 1) {
                textInfoPrivacyCell = new TextInfoPrivacyCell(this.mContext);
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

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            String string2;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (i == PrivacyUsersActivity.this.blockUserDetailRow) {
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
                    if (i == PrivacyUsersActivity.this.usersDetailRow) {
                        textInfoPrivacyCell.setFixedSize(12);
                        textInfoPrivacyCell.setText("");
                        return;
                    }
                    return;
                }
                if (itemViewType == 2) {
                    ManageChatTextCell manageChatTextCell = (ManageChatTextCell) viewHolder.itemView;
                    manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                    if (PrivacyUsersActivity.this.currentType != 1) {
                        manageChatTextCell.setText(LocaleController.getString(R.string.PrivacyAddAnException), null, R.drawable.msg_contact_add, PrivacyUsersActivity.this.uidArray.size() > 0);
                        return;
                    } else {
                        manageChatTextCell.setText(LocaleController.getString(R.string.BlockUser), null, R.drawable.msg_contact_add, false);
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
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString(R.string.PrivacyExceptions));
                        return;
                    }
                }
                return;
            }
            ManageChatUserCell manageChatUserCell = (ManageChatUserCell) viewHolder.itemView;
            long jKeyAt = PrivacyUsersActivity.this.currentType == 1 ? PrivacyUsersActivity.this.getMessagesController().blockePeers.keyAt(i - PrivacyUsersActivity.this.usersStartRow) : ((Long) PrivacyUsersActivity.this.uidArray.get(i - PrivacyUsersActivity.this.usersStartRow)).longValue();
            manageChatUserCell.setTag(Long.valueOf(jKeyAt));
            if (jKeyAt > 0) {
                TLRPC.User user = PrivacyUsersActivity.this.getMessagesController().getUser(Long.valueOf(jKeyAt));
                if (user != null) {
                    if (user.bot) {
                        StringBuilder sb = new StringBuilder();
                        int i2 = R.string.Bot;
                        sb.append(LocaleController.getString(i2).substring(0, 1).toUpperCase());
                        sb.append(LocaleController.getString(i2).substring(1));
                        string2 = sb.toString();
                    } else {
                        String str = user.phone;
                        if (str != null && str.length() != 0) {
                            string2 = PhoneFormat.getInstance().format("+" + user.phone);
                        } else {
                            string2 = LocaleController.getString(R.string.NumberUnknown);
                        }
                    }
                    manageChatUserCell.setData(user, null, string2, i != PrivacyUsersActivity.this.usersEndRow - 1);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = PrivacyUsersActivity.this.getMessagesController().getChat(Long.valueOf(-jKeyAt));
            if (chat != null) {
                int i3 = chat.participants_count;
                if (i3 != 0) {
                    string = LocaleController.formatPluralString("Members", i3, new Object[0]);
                } else if (chat.has_geo) {
                    string = LocaleController.getString(R.string.MegaLocation);
                } else if (!ChatObject.isPublic(chat)) {
                    string = LocaleController.getString(R.string.MegaPrivate);
                } else {
                    string = LocaleController.getString(R.string.MegaPublic);
                }
                manageChatUserCell.setData(chat, null, string, i != PrivacyUsersActivity.this.usersEndRow - 1);
            }
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
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                PrivacyUsersActivity.m3810$r8$lambda$n2AHQWXpa1KiiRXGirznhMhlYU(this.f$0);
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ManageChatUserCell.class, ManageChatTextCell.class, HeaderCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueIcon));
        return arrayList;
    }

    public static void m3810$r8$lambda$n2AHQWXpa1KiiRXGirznhMhlYU(PrivacyUsersActivity privacyUsersActivity) {
        RecyclerListView recyclerListView = privacyUsersActivity.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = privacyUsersActivity.listView.getChildAt(i);
                if (childAt instanceof ManageChatUserCell) {
                    ((ManageChatUserCell) childAt).update(0);
                }
            }
        }
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }
}
