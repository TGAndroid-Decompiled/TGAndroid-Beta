package org.telegram.p009ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.PhoneFormat.C0995PhoneFormat;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1133ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.ManageChatTextCell;
import org.telegram.p009ui.Cells.ManageChatUserCell;
import org.telegram.p009ui.Cells.ShadowSectionCell;
import org.telegram.p009ui.Cells.TextCell;
import org.telegram.p009ui.Cells.TextInfoPrivacyCell;
import org.telegram.p009ui.Components.AlertsCreator;
import org.telegram.p009ui.Components.EmptyTextProgressView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.ContactsActivity;
import org.telegram.p009ui.GroupCreateActivity;
import org.telegram.p009ui.PrivacyUsersActivity;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$User;

public class PrivacyUsersActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, ContactsActivity.ContactsActivityDelegate {
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
    private ArrayList<Long> uidArray;
    private int usersDetailRow;
    private int usersEndRow;
    private int usersHeaderRow;
    private int usersStartRow;

    public interface PrivacyActivityDelegate {
        void didUpdateUserList(ArrayList<Long> arrayList, boolean z);
    }

    public PrivacyUsersActivity() {
        this.currentType = 1;
        this.blockedUsersActivity = true;
    }

    public PrivacyUsersActivity(int i, ArrayList<Long> arrayList, boolean z, boolean z2) {
        this.uidArray = arrayList;
        this.isAlwaysShare = z2;
        this.isGroup = z;
        this.blockedUsersActivity = false;
        this.currentType = i;
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
        this.actionBar.setBackButtonImage(C1072R.C1073drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i = this.currentType;
        if (i == 1) {
            this.actionBar.setTitle(LocaleController.getString("BlockedUsers", C1072R.string.BlockedUsers));
        } else if (i == 2) {
            if (this.isAlwaysShare) {
                this.actionBar.setTitle(LocaleController.getString("FilterAlwaysShow", C1072R.string.FilterAlwaysShow));
            } else {
                this.actionBar.setTitle(LocaleController.getString("FilterNeverShow", C1072R.string.FilterNeverShow));
            }
        } else if (this.isGroup) {
            if (this.isAlwaysShare) {
                this.actionBar.setTitle(LocaleController.getString("AlwaysAllow", C1072R.string.AlwaysAllow));
            } else {
                this.actionBar.setTitle(LocaleController.getString("NeverAllow", C1072R.string.NeverAllow));
            }
        } else if (this.isAlwaysShare) {
            this.actionBar.setTitle(LocaleController.getString("AlwaysShareWithTitle", C1072R.string.AlwaysShareWithTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString("NeverShareWithTitle", C1072R.string.NeverShareWithTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new C1133ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    PrivacyUsersActivity.this.finishFragment();
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        if (this.currentType == 1) {
            emptyTextProgressView.setText(LocaleController.getString("NoBlocked", C1072R.string.NoBlocked));
        } else {
            emptyTextProgressView.setText(LocaleController.getString("NoContacts", C1072R.string.NoContacts));
        }
        frameLayout2.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setEmptyView(this.emptyView);
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
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                PrivacyUsersActivity.this.lambda$createView$2(view, i2);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i2) {
                boolean lambda$createView$3;
                lambda$createView$3 = PrivacyUsersActivity.this.lambda$createView$3(view, i2);
                return lambda$createView$3;
            }
        });
        if (this.currentType == 1) {
            this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                    if (PrivacyUsersActivity.this.getMessagesController().blockedEndReached) {
                        return;
                    }
                    int abs = Math.abs(PrivacyUsersActivity.this.layoutManager.findLastVisibleItemPosition() - PrivacyUsersActivity.this.layoutManager.findFirstVisibleItemPosition()) + 1;
                    int itemCount = recyclerView.getAdapter().getItemCount();
                    if (abs <= 0 || PrivacyUsersActivity.this.layoutManager.findLastVisibleItemPosition() < itemCount - 10) {
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

    public void lambda$createView$2(View view, int i) {
        if (i == this.deleteAllRow) {
            AlertDialog create = AlertsCreator.createSimpleAlert(getContext(), LocaleController.getString(C1072R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(C1072R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(C1072R.string.Delete), new Runnable() {
                @Override
                public final void run() {
                    PrivacyUsersActivity.this.lambda$createView$0();
                }
            }, null).create();
            create.show();
            create.redPositive();
        } else if (i == this.blockUserRow) {
            if (this.currentType == 1) {
                presentFragment(new DialogOrContactPickerActivity());
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean(this.isAlwaysShare ? "isAlwaysShare" : "isNeverShare", true);
            if (this.isGroup) {
                bundle.putInt("chatAddType", 1);
            } else if (this.currentType == 2) {
                bundle.putInt("chatAddType", 2);
            }
            GroupCreateActivity groupCreateActivity = new GroupCreateActivity(bundle);
            groupCreateActivity.setDelegate(new GroupCreateActivity.GroupCreateActivityDelegate() {
                @Override
                public final void didSelectUsers(ArrayList arrayList) {
                    PrivacyUsersActivity.this.lambda$createView$1(arrayList);
                }
            });
            presentFragment(groupCreateActivity);
        } else if (i < this.usersStartRow || i >= this.usersEndRow) {
        } else {
            if (this.currentType == 1) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", getMessagesController().blockePeers.keyAt(i - this.usersStartRow));
                presentFragment(new ProfileActivity(bundle2));
                return;
            }
            Bundle bundle3 = new Bundle();
            long longValue = this.uidArray.get(i - this.usersStartRow).longValue();
            if (DialogObject.isUserDialog(longValue)) {
                bundle3.putLong("user_id", longValue);
            } else {
                bundle3.putLong("chat_id", -longValue);
            }
            presentFragment(new ProfileActivity(bundle3));
        }
    }

    public void lambda$createView$0() {
        this.uidArray.clear();
        updateRows();
        finishFragment();
        PrivacyActivityDelegate privacyActivityDelegate = this.delegate;
        if (privacyActivityDelegate != null) {
            privacyActivityDelegate.didUpdateUserList(this.uidArray, true);
        }
    }

    public void lambda$createView$1(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
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

    public boolean lambda$createView$3(View view, int i) {
        int i2 = this.usersStartRow;
        if (i < i2 || i >= this.usersEndRow) {
            return false;
        }
        if (this.currentType == 1) {
            showUnblockAlert(Long.valueOf(getMessagesController().blockePeers.keyAt(i - this.usersStartRow)));
        } else {
            showUnblockAlert(this.uidArray.get(i - i2));
        }
        return true;
    }

    public void setDelegate(PrivacyActivityDelegate privacyActivityDelegate) {
        this.delegate = privacyActivityDelegate;
    }

    public void showUnblockAlert(final Long l) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setItems(this.currentType == 1 ? new CharSequence[]{LocaleController.getString("Unblock", C1072R.string.Unblock)} : new CharSequence[]{LocaleController.getString("Delete", C1072R.string.Delete)}, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                PrivacyUsersActivity.this.lambda$showUnblockAlert$4(l, dialogInterface, i);
            }
        });
        showDialog(builder.create());
    }

    public void lambda$showUnblockAlert$4(Long l, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            if (this.currentType == 1) {
                getMessagesController().unblockPeer(l.longValue());
                return;
            }
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
    }

    private void updateRows() {
        int size;
        this.rowCount = 0;
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
                this.rowCount = i2 + 1;
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
                this.rowCount = i7;
                this.usersEndRow = i7;
                int i8 = i7 + 1;
                this.rowCount = i8;
                this.usersDetailRow = i7;
                if (i4 != 1) {
                    this.rowCount = i8 + 1;
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
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0) {
                return;
            }
            updateVisibleRows(intValue);
        } else if (i == NotificationCenter.blockedUsersDidLoad) {
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

    @Override
    public void didSelectContact(TLRPC$User tLRPC$User, String str, ContactsActivity contactsActivity) {
        if (tLRPC$User == null) {
            return;
        }
        getMessagesController().blockPeer(tLRPC$User.f995id);
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            PrivacyUsersActivity.this = r1;
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

        public boolean lambda$onCreateViewHolder$0(ManageChatUserCell manageChatUserCell, boolean z) {
            if (z) {
                PrivacyUsersActivity.this.showUnblockAlert((Long) manageChatUserCell.getTag());
                return true;
            }
            return true;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            HeaderCell headerCell;
            if (i == 0) {
                ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 7, 6, true);
                manageChatUserCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                manageChatUserCell.setDelegate(new ManageChatUserCell.ManageChatUserCellDelegate() {
                    @Override
                    public final boolean onOptionsButtonCheck(ManageChatUserCell manageChatUserCell2, boolean z) {
                        boolean lambda$onCreateViewHolder$0;
                        lambda$onCreateViewHolder$0 = PrivacyUsersActivity.ListAdapter.this.lambda$onCreateViewHolder$0(manageChatUserCell2, z);
                        return lambda$onCreateViewHolder$0;
                    }
                });
                headerCell = manageChatUserCell;
            } else if (i == 1) {
                headerCell = new TextInfoPrivacyCell(this.mContext);
            } else if (i == 2) {
                FrameLayout manageChatTextCell = new ManageChatTextCell(this.mContext);
                manageChatTextCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                headerCell = manageChatTextCell;
            } else if (i != 4) {
                HeaderCell headerCell2 = new HeaderCell(this.mContext, "windowBackgroundWhiteBlueHeader", 21, 11, false);
                headerCell2.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                headerCell2.setHeight(43);
                headerCell = headerCell2;
            } else {
                TextCell textCell = new TextCell(viewGroup.getContext());
                textCell.setText(LocaleController.getString("NotificationsDeleteAllException", C1072R.string.NotificationsDeleteAllException), false);
                textCell.setColors(null, "windowBackgroundWhiteRedText5");
                textCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                headerCell = textCell;
            }
            return new RecyclerListView.Holder(headerCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            String string2;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType == 2) {
                        ManageChatTextCell manageChatTextCell = (ManageChatTextCell) viewHolder.itemView;
                        manageChatTextCell.setColors("windowBackgroundWhiteBlueIcon", "windowBackgroundWhiteBlueButton");
                        if (PrivacyUsersActivity.this.currentType != 1) {
                            manageChatTextCell.setText(LocaleController.getString("PrivacyAddAnException", C1072R.string.PrivacyAddAnException), null, C1072R.C1073drawable.msg_contact_add, PrivacyUsersActivity.this.uidArray.size() > 0);
                            return;
                        } else {
                            manageChatTextCell.setText(LocaleController.getString("BlockUser", C1072R.string.BlockUser), null, C1072R.C1073drawable.msg_contact_add, false);
                            return;
                        }
                    } else if (itemViewType != 3) {
                        return;
                    } else {
                        HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                        if (i == PrivacyUsersActivity.this.usersHeaderRow) {
                            if (PrivacyUsersActivity.this.currentType == 1) {
                                headerCell.setText(LocaleController.formatPluralString("BlockedUsersCount", PrivacyUsersActivity.this.getMessagesController().totalBlockedCount, new Object[0]));
                                return;
                            } else {
                                headerCell.setText(LocaleController.getString("PrivacyExceptions", C1072R.string.PrivacyExceptions));
                                return;
                            }
                        }
                        return;
                    }
                }
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                if (i == PrivacyUsersActivity.this.blockUserDetailRow) {
                    if (PrivacyUsersActivity.this.currentType == 1) {
                        textInfoPrivacyCell.setFixedSize(0);
                        textInfoPrivacyCell.setText(LocaleController.getString("BlockedUsersInfo", C1072R.string.BlockedUsersInfo));
                    } else {
                        textInfoPrivacyCell.setFixedSize(8);
                        textInfoPrivacyCell.setText(null);
                    }
                    if (PrivacyUsersActivity.this.usersStartRow == -1) {
                        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, C1072R.C1073drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                        return;
                    } else {
                        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, C1072R.C1073drawable.greydivider, "windowBackgroundGrayShadow"));
                        return;
                    }
                } else if (i == PrivacyUsersActivity.this.usersDetailRow) {
                    textInfoPrivacyCell.setFixedSize(12);
                    textInfoPrivacyCell.setText("");
                    textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, C1072R.C1073drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                    return;
                } else {
                    return;
                }
            }
            ManageChatUserCell manageChatUserCell = (ManageChatUserCell) viewHolder.itemView;
            long keyAt = PrivacyUsersActivity.this.currentType == 1 ? PrivacyUsersActivity.this.getMessagesController().blockePeers.keyAt(i - PrivacyUsersActivity.this.usersStartRow) : ((Long) PrivacyUsersActivity.this.uidArray.get(i - PrivacyUsersActivity.this.usersStartRow)).longValue();
            manageChatUserCell.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC$User user = PrivacyUsersActivity.this.getMessagesController().getUser(Long.valueOf(keyAt));
                if (user != null) {
                    if (user.bot) {
                        StringBuilder sb = new StringBuilder();
                        int i2 = C1072R.string.Bot;
                        sb.append(LocaleController.getString("Bot", i2).substring(0, 1).toUpperCase());
                        sb.append(LocaleController.getString("Bot", i2).substring(1));
                        string2 = sb.toString();
                    } else {
                        String str = user.phone;
                        if (str != null && str.length() != 0) {
                            C0995PhoneFormat c0995PhoneFormat = C0995PhoneFormat.getInstance();
                            string2 = c0995PhoneFormat.format("+" + user.phone);
                        } else {
                            string2 = LocaleController.getString("NumberUnknown", C1072R.string.NumberUnknown);
                        }
                    }
                    manageChatUserCell.setData(user, null, string2, i != PrivacyUsersActivity.this.usersEndRow - 1);
                    return;
                }
                return;
            }
            TLRPC$Chat chat = PrivacyUsersActivity.this.getMessagesController().getChat(Long.valueOf(-keyAt));
            if (chat != null) {
                int i3 = chat.participants_count;
                if (i3 != 0) {
                    string = LocaleController.formatPluralString("Members", i3, new Object[0]);
                } else if (chat.has_geo) {
                    string = LocaleController.getString("MegaLocation", C1072R.string.MegaLocation);
                } else if (!ChatObject.isPublic(chat)) {
                    string = LocaleController.getString("MegaPrivate", C1072R.string.MegaPrivate);
                } else {
                    string = LocaleController.getString("MegaPublic", C1072R.string.MegaPublic);
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
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                PrivacyUsersActivity.this.lambda$getThemeDescriptions$5();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ManageChatUserCell.class, ManageChatTextCell.class, HeaderCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "emptyListPlaceholder"));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, "progressCircle"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, "windowBackgroundWhiteGrayText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, "windowBackgroundWhiteBlueText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, null, Theme.avatarDrawables, null, "avatar_text"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundRed"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundOrange"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundViolet"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundGreen"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundCyan"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundBlue"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundPink"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueHeader"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayIcon"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueButton"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueIcon"));
        return arrayList;
    }

    public void lambda$getThemeDescriptions$5() {
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
}
