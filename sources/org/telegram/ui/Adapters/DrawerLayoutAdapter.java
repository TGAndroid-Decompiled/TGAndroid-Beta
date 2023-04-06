package org.telegram.ui.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.DrawerLayoutContainer;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DividerCell;
import org.telegram.ui.Cells.DrawerActionCell;
import org.telegram.ui.Cells.DrawerAddCell;
import org.telegram.ui.Cells.DrawerProfileCell;
import org.telegram.ui.Cells.DrawerUserCell;
import org.telegram.ui.Cells.EmptyCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SideMenultItemAnimator;
public class DrawerLayoutAdapter extends RecyclerListView.SelectionAdapter {
    private boolean accountsShown;
    private boolean hasGps;
    private SideMenultItemAnimator itemAnimator;
    private Context mContext;
    private DrawerLayoutContainer mDrawerLayoutContainer;
    private View.OnClickListener onPremiumDrawableClick;
    public DrawerProfileCell profileCell;
    private ArrayList<Item> items = new ArrayList<>(11);
    private ArrayList<Integer> accountNumbers = new ArrayList<>();

    public DrawerLayoutAdapter(Context context, SideMenultItemAnimator sideMenultItemAnimator, DrawerLayoutContainer drawerLayoutContainer) {
        this.mContext = context;
        this.mDrawerLayoutContainer = drawerLayoutContainer;
        this.itemAnimator = sideMenultItemAnimator;
        boolean z = true;
        this.accountsShown = (UserConfig.getActivatedAccountsCount() <= 1 || !MessagesController.getGlobalMainSettings().getBoolean("accountsShown", true)) ? false : false;
        Theme.createCommonDialogResources(context);
        resetItems();
        try {
            this.hasGps = ApplicationLoader.applicationContext.getPackageManager().hasSystemFeature("android.hardware.location.gps");
        } catch (Throwable unused) {
            this.hasGps = false;
        }
    }

    private int getAccountRowsCount() {
        int size = this.accountNumbers.size() + 1;
        return this.accountNumbers.size() < 4 ? size + 1 : size;
    }

    @Override
    public int getItemCount() {
        int size = this.items.size() + 2;
        return this.accountsShown ? size + getAccountRowsCount() : size;
    }

    public void setAccountsShown(boolean z, boolean z2) {
        if (this.accountsShown == z || this.itemAnimator.isRunning()) {
            return;
        }
        this.accountsShown = z;
        DrawerProfileCell drawerProfileCell = this.profileCell;
        if (drawerProfileCell != null) {
            drawerProfileCell.setAccountsShown(z, z2);
        }
        MessagesController.getGlobalMainSettings().edit().putBoolean("accountsShown", this.accountsShown).commit();
        if (z2) {
            this.itemAnimator.setShouldClipChildren(false);
            if (this.accountsShown) {
                notifyItemRangeInserted(2, getAccountRowsCount());
                return;
            } else {
                notifyItemRangeRemoved(2, getAccountRowsCount());
                return;
            }
        }
        notifyDataSetChanged();
    }

    public boolean isAccountsShown() {
        return this.accountsShown;
    }

    public void setOnPremiumDrawableClick(View.OnClickListener onClickListener) {
        this.onPremiumDrawableClick = onClickListener;
    }

    @Override
    public void notifyDataSetChanged() {
        resetItems();
        super.notifyDataSetChanged();
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return itemViewType == 3 || itemViewType == 4 || itemViewType == 5 || itemViewType == 6;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        if (i == 0) {
            DrawerProfileCell drawerProfileCell = new DrawerProfileCell(this.mContext, this.mDrawerLayoutContainer) {
                @Override
                protected void onPremiumClick() {
                    if (DrawerLayoutAdapter.this.onPremiumDrawableClick != null) {
                        DrawerLayoutAdapter.this.onPremiumDrawableClick.onClick(this);
                    }
                }
            };
            this.profileCell = drawerProfileCell;
            view = drawerProfileCell;
        } else if (i == 2) {
            view = new DividerCell(this.mContext);
        } else if (i == 3) {
            view = new DrawerActionCell(this.mContext);
        } else if (i == 4) {
            view = new DrawerUserCell(this.mContext);
        } else if (i == 5) {
            view = new DrawerAddCell(this.mContext);
        } else {
            view = new EmptyCell(this.mContext, AndroidUtilities.dp(8.0f));
        }
        view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new RecyclerListView.Holder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 0) {
            ((DrawerProfileCell) viewHolder.itemView).setUser(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId())), this.accountsShown);
        } else if (itemViewType != 3) {
            if (itemViewType != 4) {
                return;
            }
            ((DrawerUserCell) viewHolder.itemView).setAccount(this.accountNumbers.get(i - 2).intValue());
        } else {
            DrawerActionCell drawerActionCell = (DrawerActionCell) viewHolder.itemView;
            int i2 = i - 2;
            if (this.accountsShown) {
                i2 -= getAccountRowsCount();
            }
            this.items.get(i2).bind(drawerActionCell);
            drawerActionCell.setPadding(0, 0, 0, 0);
        }
    }

    @Override
    public int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        int i2 = i - 2;
        if (this.accountsShown) {
            if (i2 < this.accountNumbers.size()) {
                return 4;
            }
            if (this.accountNumbers.size() < 4) {
                if (i2 == this.accountNumbers.size()) {
                    return 5;
                }
                if (i2 == this.accountNumbers.size() + 1) {
                    return 2;
                }
            } else if (i2 == this.accountNumbers.size()) {
                return 2;
            }
            i2 -= getAccountRowsCount();
        }
        return (i2 < 0 || i2 >= this.items.size() || this.items.get(i2) == null) ? 2 : 3;
    }

    public void swapElements(int i, int i2) {
        int i3 = i - 2;
        int i4 = i2 - 2;
        if (i3 < 0 || i4 < 0 || i3 >= this.accountNumbers.size() || i4 >= this.accountNumbers.size()) {
            return;
        }
        UserConfig userConfig = UserConfig.getInstance(this.accountNumbers.get(i3).intValue());
        UserConfig userConfig2 = UserConfig.getInstance(this.accountNumbers.get(i4).intValue());
        int i5 = userConfig.loginTime;
        userConfig.loginTime = userConfig2.loginTime;
        userConfig2.loginTime = i5;
        userConfig.saveConfig(false);
        userConfig2.saveConfig(false);
        Collections.swap(this.accountNumbers, i3, i4);
        notifyItemMoved(i, i2);
    }

    private void resetItems() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        this.accountNumbers.clear();
        for (int i9 = 0; i9 < 4; i9++) {
            if (UserConfig.getInstance(i9).isClientActivated()) {
                this.accountNumbers.add(Integer.valueOf(i9));
            }
        }
        Collections.sort(this.accountNumbers, DrawerLayoutAdapter$$ExternalSyntheticLambda0.INSTANCE);
        this.items.clear();
        if (UserConfig.getInstance(UserConfig.selectedAccount).isClientActivated()) {
            int eventType = Theme.getEventType();
            if (eventType == 0) {
                i = R.drawable.msg_groups_ny;
                i2 = R.drawable.msg_contacts_ny;
                i3 = R.drawable.msg_calls_ny;
                i4 = R.drawable.msg_saved_ny;
                i5 = R.drawable.msg_settings_ny;
                i6 = R.drawable.msg_invite_ny;
                i7 = R.drawable.msg_help_ny;
                i8 = R.drawable.msg_nearby_ny;
            } else if (eventType == 1) {
                i = R.drawable.msg_groups_14;
                i2 = R.drawable.msg_contacts_14;
                i3 = R.drawable.msg_calls_14;
                i4 = R.drawable.msg_saved_14;
                i5 = R.drawable.msg_settings_14;
                i6 = R.drawable.msg_secret_ny;
                i7 = R.drawable.msg_help;
                i8 = R.drawable.msg_secret_14;
            } else if (eventType == 2) {
                i = R.drawable.msg_groups_hw;
                i2 = R.drawable.msg_contacts_hw;
                i3 = R.drawable.msg_calls_hw;
                i4 = R.drawable.msg_saved_hw;
                i5 = R.drawable.msg_settings_hw;
                i6 = R.drawable.msg_invite_hw;
                i7 = R.drawable.msg_help_hw;
                i8 = R.drawable.msg_secret_hw;
            } else {
                i = R.drawable.msg_groups;
                i2 = R.drawable.msg_contacts;
                i3 = R.drawable.msg_calls;
                i4 = R.drawable.msg_saved;
                i5 = R.drawable.msg_settings_old;
                i6 = R.drawable.msg_invite;
                i7 = R.drawable.msg_help;
                i8 = R.drawable.msg_nearby;
            }
            UserConfig userConfig = UserConfig.getInstance(UserConfig.selectedAccount);
            if (userConfig != null && userConfig.isPremium()) {
                if (userConfig.getEmojiStatus() != null) {
                    this.items.add(new Item(15, LocaleController.getString("ChangeEmojiStatus", R.string.ChangeEmojiStatus), 0, R.raw.emoji_status_change_to_set));
                } else {
                    this.items.add(new Item(15, LocaleController.getString("SetEmojiStatus", R.string.SetEmojiStatus), 0, R.raw.emoji_status_set_to_change));
                }
                this.items.add(null);
            }
            this.items.add(new Item(2, LocaleController.getString("NewGroup", R.string.NewGroup), i));
            this.items.add(new Item(6, LocaleController.getString("Contacts", R.string.Contacts), i2));
            this.items.add(new Item(10, LocaleController.getString("Calls", R.string.Calls), i3));
            if (this.hasGps) {
                this.items.add(new Item(12, LocaleController.getString("PeopleNearby", R.string.PeopleNearby), i8));
            }
            this.items.add(new Item(11, LocaleController.getString("SavedMessages", R.string.SavedMessages), i4));
            this.items.add(new Item(8, LocaleController.getString("Settings", R.string.Settings), i5));
            this.items.add(null);
            this.items.add(new Item(7, LocaleController.getString("InviteFriends", R.string.InviteFriends), i6));
            this.items.add(new Item(13, LocaleController.getString("TelegramFeatures", R.string.TelegramFeatures), i7));
        }
    }

    public static int lambda$resetItems$0(Integer num, Integer num2) {
        long j = UserConfig.getInstance(num.intValue()).loginTime;
        long j2 = UserConfig.getInstance(num2.intValue()).loginTime;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    public int getId(int i) {
        Item item;
        int i2 = i - 2;
        if (this.accountsShown) {
            i2 -= getAccountRowsCount();
        }
        if (i2 < 0 || i2 >= this.items.size() || (item = this.items.get(i2)) == null) {
            return -1;
        }
        return item.id;
    }

    public int getFirstAccountPosition() {
        return !this.accountsShown ? -1 : 2;
    }

    public int getLastAccountPosition() {
        if (this.accountsShown) {
            return this.accountNumbers.size() + 1;
        }
        return -1;
    }

    public static class Item {
        public int icon;
        public int id;
        public int lottieIcon;
        public String text;

        public Item(int i, String str, int i2) {
            this.icon = i2;
            this.id = i;
            this.text = str;
        }

        public Item(int i, String str, int i2, int i3) {
            this.icon = i2;
            this.lottieIcon = i3;
            this.id = i;
            this.text = str;
        }

        public void bind(DrawerActionCell drawerActionCell) {
            drawerActionCell.setTextAndIcon(this.id, this.text, this.icon, this.lottieIcon);
        }
    }
}
