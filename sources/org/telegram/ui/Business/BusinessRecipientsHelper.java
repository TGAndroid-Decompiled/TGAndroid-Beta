package org.telegram.ui.Business;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.UsersSelectActivity;

public class BusinessRecipientsHelper {
    public boolean bot;
    private TL_account.TL_businessBotRecipients currentValue;
    private boolean doNotExcludeNewChats;
    public boolean exclude;
    public boolean excludeExpanded;
    public int excludeFlags;
    public final BaseFragment fragment;
    public boolean includeExpanded;
    public int includeFlags;
    public final Runnable update;
    public final ArrayList alwaysShow = new ArrayList();
    public final ArrayList neverShow = new ArrayList();
    private int shiftDp = -4;

    public BusinessRecipientsHelper(BaseFragment baseFragment, Runnable runnable) {
        this.fragment = baseFragment;
        this.update = runnable;
    }

    public int getFlags() {
        return this.exclude ? this.excludeFlags : this.includeFlags;
    }

    public boolean hasChanges() {
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.currentValue;
        if (tL_businessBotRecipients == null || tL_businessBotRecipients.exclude_selected != this.exclude || (tL_businessBotRecipients.flags & (-49)) != getFlags()) {
            return true;
        }
        ArrayList arrayList = this.exclude ? this.neverShow : this.alwaysShow;
        if (arrayList.size() != this.currentValue.users.size()) {
            return true;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (!this.currentValue.users.contains(arrayList.get(i))) {
                return true;
            }
        }
        if (this.bot && !this.exclude) {
            if (this.neverShow.size() != this.currentValue.users.size()) {
                return true;
            }
            for (int i2 = 0; i2 < this.neverShow.size(); i2++) {
                if (!this.currentValue.users.contains(this.neverShow.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setValue(TL_account.TL_businessRecipients tL_businessRecipients) {
        this.bot = false;
        if (tL_businessRecipients != null) {
            TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.currentValue = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            this.currentValue = null;
        }
        TL_account.TL_businessBotRecipients tL_businessBotRecipients2 = this.currentValue;
        if (tL_businessBotRecipients2 == null) {
            this.exclude = true;
            this.excludeFlags = 0;
            this.includeFlags = 0;
            this.alwaysShow.clear();
            this.neverShow.clear();
            return;
        }
        boolean z = tL_businessBotRecipients2.exclude_selected;
        this.exclude = z;
        if (z) {
            this.includeFlags = 0;
            this.excludeFlags = tL_businessBotRecipients2.flags & (-49);
            this.alwaysShow.clear();
            this.neverShow.clear();
            this.neverShow.addAll(this.currentValue.users);
            return;
        }
        this.includeFlags = tL_businessBotRecipients2.flags & (-49);
        this.excludeFlags = 0;
        this.alwaysShow.clear();
        this.neverShow.clear();
        this.alwaysShow.addAll(this.currentValue.users);
        this.neverShow.addAll(this.currentValue.exclude_users);
    }

    public void setValue(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.bot = true;
        this.currentValue = tL_businessBotRecipients;
        if (tL_businessBotRecipients == null) {
            this.exclude = true;
            this.excludeFlags = 0;
            this.includeFlags = 0;
            this.alwaysShow.clear();
            this.neverShow.clear();
            return;
        }
        boolean z = tL_businessBotRecipients.exclude_selected;
        this.exclude = z;
        if (z) {
            this.includeFlags = 0;
            this.excludeFlags = tL_businessBotRecipients.flags & (-49);
            this.alwaysShow.clear();
            this.neverShow.clear();
            this.neverShow.addAll(this.currentValue.users);
            return;
        }
        this.includeFlags = tL_businessBotRecipients.flags & (-49);
        this.excludeFlags = 0;
        this.alwaysShow.clear();
        this.neverShow.clear();
        this.alwaysShow.addAll(this.currentValue.users);
        this.neverShow.addAll(this.currentValue.exclude_users);
    }

    public TL_account.TL_businessRecipients getValue() throws NumberFormatException {
        TL_account.TL_businessRecipients tL_businessRecipients = new TL_account.TL_businessRecipients();
        int flags = getFlags();
        tL_businessRecipients.flags = flags & (-49);
        tL_businessRecipients.existing_chats = (flags & 1) != 0;
        tL_businessRecipients.new_chats = (flags & 2) != 0;
        tL_businessRecipients.contacts = (flags & 4) != 0;
        tL_businessRecipients.non_contacts = (flags & 8) != 0;
        boolean z = this.exclude;
        tL_businessRecipients.exclude_selected = z;
        ArrayList arrayList = z ? this.neverShow : this.alwaysShow;
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessRecipients.flags |= 16;
            for (int i = 0; i < arrayList.size(); i++) {
                if (messagesController.getInputUser(((Long) arrayList.get(i)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i));
                } else {
                    tL_businessRecipients.users.add((Long) arrayList.get(i));
                }
            }
        }
        return tL_businessRecipients;
    }

    public TL_account.TL_businessBotRecipients getBotValue() throws NumberFormatException {
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
        int flags = getFlags();
        tL_businessBotRecipients.flags = flags & (-49);
        tL_businessBotRecipients.existing_chats = (flags & 1) != 0;
        tL_businessBotRecipients.new_chats = (flags & 2) != 0;
        tL_businessBotRecipients.contacts = (flags & 4) != 0;
        tL_businessBotRecipients.non_contacts = (flags & 8) != 0;
        boolean z = this.exclude;
        tL_businessBotRecipients.exclude_selected = z;
        ArrayList arrayList = z ? this.neverShow : this.alwaysShow;
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessBotRecipients.flags |= 16;
            for (int i = 0; i < arrayList.size(); i++) {
                if (messagesController.getInputUser(((Long) arrayList.get(i)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i));
                } else {
                    tL_businessBotRecipients.users.add((Long) arrayList.get(i));
                }
            }
        }
        if (!this.exclude) {
            MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessBotRecipients.flags |= 64;
            for (int i2 = 0; i2 < this.neverShow.size(); i2++) {
                if (messagesController2.getInputUser(((Long) this.neverShow.get(i2)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + this.neverShow.get(i2));
                } else {
                    tL_businessBotRecipients.users.add((Long) this.neverShow.get(i2));
                }
            }
        }
        return tL_businessBotRecipients;
    }

    public TL_account.TL_inputBusinessRecipients getInputValue() throws NumberFormatException {
        TL_account.TL_inputBusinessRecipients tL_inputBusinessRecipients = new TL_account.TL_inputBusinessRecipients();
        int flags = getFlags();
        tL_inputBusinessRecipients.flags = flags & (-49);
        tL_inputBusinessRecipients.existing_chats = (flags & 1) != 0;
        tL_inputBusinessRecipients.new_chats = (flags & 2) != 0;
        tL_inputBusinessRecipients.contacts = (flags & 4) != 0;
        tL_inputBusinessRecipients.non_contacts = (flags & 8) != 0;
        boolean z = this.exclude;
        tL_inputBusinessRecipients.exclude_selected = z;
        ArrayList arrayList = z ? this.neverShow : this.alwaysShow;
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessRecipients.flags |= 16;
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.InputUser inputUser = messagesController.getInputUser(((Long) arrayList.get(i)).longValue());
                if (inputUser == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i));
                } else {
                    tL_inputBusinessRecipients.users.add(inputUser);
                }
            }
        }
        return tL_inputBusinessRecipients;
    }

    public TL_account.TL_inputBusinessBotRecipients getBotInputValue() throws NumberFormatException {
        TL_account.TL_inputBusinessBotRecipients tL_inputBusinessBotRecipients = new TL_account.TL_inputBusinessBotRecipients();
        int flags = getFlags();
        tL_inputBusinessBotRecipients.flags = flags & (-49);
        tL_inputBusinessBotRecipients.existing_chats = (flags & 1) != 0;
        tL_inputBusinessBotRecipients.new_chats = (flags & 2) != 0;
        tL_inputBusinessBotRecipients.contacts = (flags & 4) != 0;
        tL_inputBusinessBotRecipients.non_contacts = (flags & 8) != 0;
        boolean z = this.exclude;
        tL_inputBusinessBotRecipients.exclude_selected = z;
        ArrayList arrayList = z ? this.neverShow : this.alwaysShow;
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.InputUser inputUser = messagesController.getInputUser(((Long) arrayList.get(i)).longValue());
                if (inputUser == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i));
                } else {
                    tL_inputBusinessBotRecipients.users.add(inputUser);
                }
            }
        }
        if (!this.exclude) {
            MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessBotRecipients.flags |= 64;
            for (int i2 = 0; i2 < this.neverShow.size(); i2++) {
                TLRPC.InputUser inputUser2 = messagesController2.getInputUser(((Long) this.neverShow.get(i2)).longValue());
                if (inputUser2 == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + this.neverShow.get(i2));
                } else {
                    tL_inputBusinessBotRecipients.exclude_users.add(inputUser2);
                }
            }
        }
        return tL_inputBusinessBotRecipients;
    }

    public boolean validate(UniversalRecyclerView universalRecyclerView) {
        if (this.exclude || !this.alwaysShow.isEmpty() || this.includeFlags != 0) {
            return true;
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        View viewFindViewByItemId = universalRecyclerView.findViewByItemId(101);
        int i = -this.shiftDp;
        this.shiftDp = i;
        AndroidUtilities.shakeViewSpring(viewFindViewByItemId, i);
        universalRecyclerView.smoothScrollToPosition(universalRecyclerView.findPositionByItemId(101));
        return false;
    }

    public void setExclude(boolean z) {
        this.exclude = z;
    }

    public void fillItems(ArrayList arrayList) {
        boolean z;
        int flags = getFlags();
        if (!this.exclude) {
            arrayList.add(UItem.asHeader(LocaleController.getString(R.string.BusinessChatsIncluded)));
            arrayList.add(UItem.asButton(101, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessChatsIncludedAdd)).accent());
            if ((flags & 1) != 0) {
                arrayList.add(UItem.asFilterChat(true, LocaleController.getString(R.string.FilterExistingChats), "existing_chats", 1));
            }
            if ((flags & 2) != 0) {
                arrayList.add(UItem.asFilterChat(true, LocaleController.getString(R.string.FilterNewChats), "new_chats", 2));
            }
            if ((flags & 4) != 0) {
                arrayList.add(UItem.asFilterChat(true, LocaleController.getString(R.string.FilterContacts), "contacts", 4));
            }
            if ((flags & 8) != 0) {
                arrayList.add(UItem.asFilterChat(true, LocaleController.getString(R.string.FilterNonContacts), "non_contacts", 8));
            }
            if (!this.alwaysShow.isEmpty()) {
                int size = (this.includeExpanded || this.alwaysShow.size() < 8) ? this.alwaysShow.size() : Math.min(5, this.alwaysShow.size());
                for (int i = 0; i < size; i++) {
                    arrayList.add(UItem.asFilterChat(true, ((Long) this.alwaysShow.get(i)).longValue()));
                }
                if (size != this.alwaysShow.size()) {
                    arrayList.add(UItem.asButton(102, R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.alwaysShow.size() - 5, new Object[0])).accent());
                }
            }
        }
        boolean z2 = this.bot;
        if (z2 || this.exclude) {
            if (z2) {
                arrayList.add(UItem.asShadow(null));
            }
            arrayList.add(UItem.asHeader(LocaleController.getString(R.string.BusinessChatsExcluded)));
            arrayList.add(UItem.asButton(103, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessChatsExcludedAdd)).accent());
            if (!this.bot || this.exclude) {
                if ((flags & 1) != 0) {
                    z = false;
                    arrayList.add(UItem.asFilterChat(false, LocaleController.getString(R.string.FilterExistingChats), "existing_chats", 1));
                } else {
                    z = false;
                }
                if ((flags & 2) != 0) {
                    arrayList.add(UItem.asFilterChat(z, LocaleController.getString(R.string.FilterNewChats), "new_chats", 2));
                }
                if ((flags & 4) != 0) {
                    arrayList.add(UItem.asFilterChat(z, LocaleController.getString(R.string.FilterContacts), "contacts", 4));
                }
                if ((flags & 8) != 0) {
                    arrayList.add(UItem.asFilterChat(z, LocaleController.getString(R.string.FilterNonContacts), "non_contacts", 8));
                }
            }
            if (this.neverShow.isEmpty()) {
                return;
            }
            int size2 = (this.excludeExpanded || this.neverShow.size() < 8) ? this.neverShow.size() : Math.min(5, this.neverShow.size());
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList.add(UItem.asFilterChat(false, ((Long) this.neverShow.get(i2)).longValue()));
            }
            if (size2 != this.neverShow.size()) {
                arrayList.add(UItem.asButton(104, R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.neverShow.size() - 5, new Object[0])).accent());
            }
        }
    }

    public boolean onClick(final UItem uItem) {
        int i = uItem.id;
        if (i == 101 || i == 103) {
            selectChatsFor(i == 101);
            return true;
        }
        if (i == 102) {
            this.includeExpanded = true;
            this.update.run();
            return true;
        }
        if (i == 104) {
            this.excludeExpanded = true;
            this.update.run();
            return true;
        }
        if (uItem.viewType != 11 || this.fragment == null) {
            return false;
        }
        final boolean z = uItem.include;
        String str = uItem.chatType;
        final int flag = str == null ? 0 : getFlag(str);
        String peerName = flag == 0 ? this.fragment.getMessagesController().getPeerName(uItem.dialogId) : getFlagName(flag);
        BaseFragment baseFragment = this.fragment;
        baseFragment.showDialog(new AlertDialog.Builder(baseFragment.getContext(), this.fragment.getResourceProvider()).setTitle(LocaleController.getString(!z ? R.string.BusinessRecipientsRemoveExcludeTitle : R.string.BusinessRecipientsRemoveIncludeTitle)).setMessage(LocaleController.formatString(!z ? R.string.BusinessRecipientsRemoveExcludeMessage : R.string.BusinessRecipientsRemoveIncludeMessage, peerName)).setPositiveButton(LocaleController.getString(R.string.Remove), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                this.f$0.lambda$onClick$0(flag, z, uItem, alertDialog, i2);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create());
        return true;
    }

    public void lambda$onClick$0(int i, boolean z, UItem uItem, AlertDialog alertDialog, int i2) {
        if (i == 0) {
            (!z ? this.neverShow : this.alwaysShow).remove(Long.valueOf(uItem.dialogId));
        } else if (z) {
            this.includeFlags = (~i) & this.includeFlags;
        } else {
            this.excludeFlags = (~i) & this.excludeFlags;
        }
        this.update.run();
    }

    private int getFlag(String str) {
        str.hashCode();
        switch (str) {
            case "non_contacts":
                return 8;
            case "contacts":
                return 4;
            case "new_chats":
                return 2;
            case "existing_chats":
                return 1;
            default:
                return 0;
        }
    }

    private String getFlagName(int i) {
        if (i == 1) {
            return LocaleController.getString(R.string.FilterExistingChats);
        }
        if (i == 2) {
            return LocaleController.getString(R.string.FilterNewChats);
        }
        if (i == 4) {
            return LocaleController.getString(R.string.FilterContacts);
        }
        return LocaleController.getString(R.string.FilterNonContacts);
    }

    public void doNotExcludeNewChats() {
        this.doNotExcludeNewChats = true;
    }

    private void selectChatsFor(final boolean z) {
        UsersSelectActivity usersSelectActivityAsPrivateChats = new UsersSelectActivity(z, z ? this.alwaysShow : this.neverShow, getFlags()).asPrivateChats();
        usersSelectActivityAsPrivateChats.noChatTypes = (!this.bot || this.exclude || z) ? false : true;
        usersSelectActivityAsPrivateChats.allowSelf = false;
        usersSelectActivityAsPrivateChats.doNotNewChats = !z && this.doNotExcludeNewChats;
        usersSelectActivityAsPrivateChats.setDelegate(new UsersSelectActivity.FilterUsersActivityDelegate() {
            @Override
            public final void didSelectChats(ArrayList arrayList, int i) {
                this.f$0.lambda$selectChatsFor$1(z, arrayList, i);
            }
        });
        this.fragment.presentFragment(usersSelectActivityAsPrivateChats);
    }

    public void lambda$selectChatsFor$1(boolean z, ArrayList arrayList, int i) {
        int i2 = 0;
        if (z) {
            this.includeFlags = i;
            this.alwaysShow.clear();
            this.alwaysShow.addAll(arrayList);
            while (i2 < this.alwaysShow.size()) {
                this.neverShow.remove(this.alwaysShow.get(i2));
                i2++;
            }
        } else {
            this.excludeFlags = i;
            this.neverShow.clear();
            this.neverShow.addAll(arrayList);
            while (i2 < this.neverShow.size()) {
                this.alwaysShow.remove(this.neverShow.get(i2));
                i2++;
            }
        }
        this.update.run();
    }
}
