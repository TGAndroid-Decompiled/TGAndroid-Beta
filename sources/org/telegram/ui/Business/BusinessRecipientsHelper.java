package org.telegram.ui.Business;

import android.content.DialogInterface;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$InputUser;
import org.telegram.tgnet.TLRPC$TL_businessBotRecipients;
import org.telegram.tgnet.TLRPC$TL_businessRecipients;
import org.telegram.tgnet.TLRPC$TL_inputBusinessBotRecipients;
import org.telegram.tgnet.TLRPC$TL_inputBusinessRecipients;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.UsersSelectActivity;
public class BusinessRecipientsHelper {
    public boolean bot;
    private TLRPC$TL_businessBotRecipients currentValue;
    private boolean doNotExcludeNewChats;
    public boolean exclude;
    public boolean excludeExpanded;
    public int excludeFlags;
    public final BaseFragment fragment;
    public boolean includeExpanded;
    public int includeFlags;
    public final Runnable update;
    public final ArrayList<Long> alwaysShow = new ArrayList<>();
    public final ArrayList<Long> neverShow = new ArrayList<>();
    private int shiftDp = -4;

    public BusinessRecipientsHelper(BaseFragment baseFragment, Runnable runnable) {
        this.fragment = baseFragment;
        this.update = runnable;
    }

    public int getFlags() {
        return this.exclude ? this.excludeFlags : this.includeFlags;
    }

    public boolean hasChanges() {
        TLRPC$TL_businessBotRecipients tLRPC$TL_businessBotRecipients = this.currentValue;
        if (tLRPC$TL_businessBotRecipients != null && tLRPC$TL_businessBotRecipients.exclude_selected == this.exclude && (tLRPC$TL_businessBotRecipients.flags & (-49)) == getFlags()) {
            ArrayList<Long> arrayList = this.exclude ? this.neverShow : this.alwaysShow;
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
        return true;
    }

    public void setValue(TLRPC$TL_businessRecipients tLRPC$TL_businessRecipients) {
        this.bot = false;
        if (tLRPC$TL_businessRecipients != null) {
            TLRPC$TL_businessBotRecipients tLRPC$TL_businessBotRecipients = new TLRPC$TL_businessBotRecipients();
            this.currentValue = tLRPC$TL_businessBotRecipients;
            tLRPC$TL_businessBotRecipients.flags = tLRPC$TL_businessRecipients.flags;
            tLRPC$TL_businessBotRecipients.existing_chats = tLRPC$TL_businessRecipients.existing_chats;
            tLRPC$TL_businessBotRecipients.new_chats = tLRPC$TL_businessRecipients.new_chats;
            tLRPC$TL_businessBotRecipients.contacts = tLRPC$TL_businessRecipients.contacts;
            tLRPC$TL_businessBotRecipients.non_contacts = tLRPC$TL_businessRecipients.non_contacts;
            tLRPC$TL_businessBotRecipients.exclude_selected = tLRPC$TL_businessRecipients.exclude_selected;
            tLRPC$TL_businessBotRecipients.users = tLRPC$TL_businessRecipients.users;
        } else {
            this.currentValue = null;
        }
        TLRPC$TL_businessBotRecipients tLRPC$TL_businessBotRecipients2 = this.currentValue;
        if (tLRPC$TL_businessBotRecipients2 == null) {
            this.exclude = true;
            this.excludeFlags = 0;
            this.includeFlags = 0;
            this.alwaysShow.clear();
            this.neverShow.clear();
            return;
        }
        boolean z = tLRPC$TL_businessBotRecipients2.exclude_selected;
        this.exclude = z;
        if (z) {
            this.includeFlags = 0;
            this.excludeFlags = tLRPC$TL_businessBotRecipients2.flags & (-49);
            this.alwaysShow.clear();
            this.neverShow.clear();
            this.neverShow.addAll(this.currentValue.users);
            return;
        }
        this.includeFlags = tLRPC$TL_businessBotRecipients2.flags & (-49);
        this.excludeFlags = 0;
        this.alwaysShow.clear();
        this.neverShow.clear();
        this.alwaysShow.addAll(this.currentValue.users);
        this.neverShow.addAll(this.currentValue.exclude_users);
    }

    public void setValue(TLRPC$TL_businessBotRecipients tLRPC$TL_businessBotRecipients) {
        this.bot = true;
        this.currentValue = tLRPC$TL_businessBotRecipients;
        if (tLRPC$TL_businessBotRecipients == null) {
            this.exclude = true;
            this.excludeFlags = 0;
            this.includeFlags = 0;
            this.alwaysShow.clear();
            this.neverShow.clear();
            return;
        }
        boolean z = tLRPC$TL_businessBotRecipients.exclude_selected;
        this.exclude = z;
        if (z) {
            this.includeFlags = 0;
            this.excludeFlags = tLRPC$TL_businessBotRecipients.flags & (-49);
            this.alwaysShow.clear();
            this.neverShow.clear();
            this.neverShow.addAll(this.currentValue.users);
            return;
        }
        this.includeFlags = tLRPC$TL_businessBotRecipients.flags & (-49);
        this.excludeFlags = 0;
        this.alwaysShow.clear();
        this.neverShow.clear();
        this.alwaysShow.addAll(this.currentValue.users);
        this.neverShow.addAll(this.currentValue.exclude_users);
    }

    public TLRPC$TL_businessRecipients getValue() {
        TLRPC$TL_businessRecipients tLRPC$TL_businessRecipients = new TLRPC$TL_businessRecipients();
        int flags = getFlags();
        tLRPC$TL_businessRecipients.flags = flags & (-49);
        tLRPC$TL_businessRecipients.existing_chats = (flags & 1) != 0;
        tLRPC$TL_businessRecipients.new_chats = (flags & 2) != 0;
        tLRPC$TL_businessRecipients.contacts = (flags & 4) != 0;
        tLRPC$TL_businessRecipients.non_contacts = (flags & 8) != 0;
        boolean z = this.exclude;
        tLRPC$TL_businessRecipients.exclude_selected = z;
        ArrayList<Long> arrayList = z ? this.neverShow : this.alwaysShow;
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tLRPC$TL_businessRecipients.flags |= 16;
            for (int i = 0; i < arrayList.size(); i++) {
                if (messagesController.getInputUser(arrayList.get(i).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i));
                } else {
                    tLRPC$TL_businessRecipients.users.add(arrayList.get(i));
                }
            }
        }
        return tLRPC$TL_businessRecipients;
    }

    public TLRPC$TL_businessBotRecipients getBotValue() {
        TLRPC$TL_businessBotRecipients tLRPC$TL_businessBotRecipients = new TLRPC$TL_businessBotRecipients();
        int flags = getFlags();
        tLRPC$TL_businessBotRecipients.flags = flags & (-49);
        tLRPC$TL_businessBotRecipients.existing_chats = (flags & 1) != 0;
        tLRPC$TL_businessBotRecipients.new_chats = (flags & 2) != 0;
        tLRPC$TL_businessBotRecipients.contacts = (flags & 4) != 0;
        tLRPC$TL_businessBotRecipients.non_contacts = (flags & 8) != 0;
        boolean z = this.exclude;
        tLRPC$TL_businessBotRecipients.exclude_selected = z;
        ArrayList<Long> arrayList = z ? this.neverShow : this.alwaysShow;
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tLRPC$TL_businessBotRecipients.flags |= 16;
            for (int i = 0; i < arrayList.size(); i++) {
                if (messagesController.getInputUser(arrayList.get(i).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i));
                } else {
                    tLRPC$TL_businessBotRecipients.users.add(arrayList.get(i));
                }
            }
        }
        if (!this.exclude) {
            MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
            tLRPC$TL_businessBotRecipients.flags |= 64;
            for (int i2 = 0; i2 < this.neverShow.size(); i2++) {
                if (messagesController2.getInputUser(this.neverShow.get(i2).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + this.neverShow.get(i2));
                } else {
                    tLRPC$TL_businessBotRecipients.users.add(this.neverShow.get(i2));
                }
            }
        }
        return tLRPC$TL_businessBotRecipients;
    }

    public TLRPC$TL_inputBusinessRecipients getInputValue() {
        TLRPC$TL_inputBusinessRecipients tLRPC$TL_inputBusinessRecipients = new TLRPC$TL_inputBusinessRecipients();
        int flags = getFlags();
        tLRPC$TL_inputBusinessRecipients.flags = flags & (-49);
        tLRPC$TL_inputBusinessRecipients.existing_chats = (flags & 1) != 0;
        tLRPC$TL_inputBusinessRecipients.new_chats = (flags & 2) != 0;
        tLRPC$TL_inputBusinessRecipients.contacts = (flags & 4) != 0;
        tLRPC$TL_inputBusinessRecipients.non_contacts = (flags & 8) != 0;
        boolean z = this.exclude;
        tLRPC$TL_inputBusinessRecipients.exclude_selected = z;
        ArrayList<Long> arrayList = z ? this.neverShow : this.alwaysShow;
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tLRPC$TL_inputBusinessRecipients.flags |= 16;
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC$InputUser inputUser = messagesController.getInputUser(arrayList.get(i).longValue());
                if (inputUser == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i));
                } else {
                    tLRPC$TL_inputBusinessRecipients.users.add(inputUser);
                }
            }
        }
        return tLRPC$TL_inputBusinessRecipients;
    }

    public TLRPC$TL_inputBusinessBotRecipients getBotInputValue() {
        TLRPC$TL_inputBusinessBotRecipients tLRPC$TL_inputBusinessBotRecipients = new TLRPC$TL_inputBusinessBotRecipients();
        int flags = getFlags();
        tLRPC$TL_inputBusinessBotRecipients.flags = flags & (-49);
        tLRPC$TL_inputBusinessBotRecipients.existing_chats = (flags & 1) != 0;
        tLRPC$TL_inputBusinessBotRecipients.new_chats = (flags & 2) != 0;
        tLRPC$TL_inputBusinessBotRecipients.contacts = (flags & 4) != 0;
        tLRPC$TL_inputBusinessBotRecipients.non_contacts = (flags & 8) != 0;
        boolean z = this.exclude;
        tLRPC$TL_inputBusinessBotRecipients.exclude_selected = z;
        ArrayList<Long> arrayList = z ? this.neverShow : this.alwaysShow;
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tLRPC$TL_inputBusinessBotRecipients.flags |= 16;
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC$InputUser inputUser = messagesController.getInputUser(arrayList.get(i).longValue());
                if (inputUser == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i));
                } else {
                    tLRPC$TL_inputBusinessBotRecipients.users.add(inputUser);
                }
            }
        }
        if (!this.exclude) {
            MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
            tLRPC$TL_inputBusinessBotRecipients.flags |= 64;
            for (int i2 = 0; i2 < this.neverShow.size(); i2++) {
                TLRPC$InputUser inputUser2 = messagesController2.getInputUser(this.neverShow.get(i2).longValue());
                if (inputUser2 == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + this.neverShow.get(i2));
                } else {
                    tLRPC$TL_inputBusinessBotRecipients.exclude_users.add(inputUser2);
                }
            }
        }
        return tLRPC$TL_inputBusinessBotRecipients;
    }

    public boolean validate(UniversalRecyclerView universalRecyclerView) {
        if (!this.exclude && this.alwaysShow.isEmpty() && this.includeFlags == 0) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View findViewByItemId = universalRecyclerView.findViewByItemId(101);
            int i = -this.shiftDp;
            this.shiftDp = i;
            AndroidUtilities.shakeViewSpring(findViewByItemId, i);
            universalRecyclerView.smoothScrollToPosition(universalRecyclerView.findPositionByItemId(101));
            return false;
        }
        return true;
    }

    public void setExclude(boolean z) {
        this.exclude = z;
    }

    public void fillItems(ArrayList<UItem> arrayList) {
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
                    arrayList.add(UItem.asFilterChat(true, this.alwaysShow.get(i).longValue()));
                }
                if (size != this.alwaysShow.size()) {
                    arrayList.add(UItem.asButton((int) R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.alwaysShow.size() - 5, new Object[0])).accent());
                }
            }
        }
        boolean z2 = this.bot;
        if (z2 || this.exclude) {
            if (z2) {
                arrayList.add(UItem.asShadow(null));
            }
            arrayList.add(UItem.asHeader(LocaleController.getString(R.string.BusinessChatsExcluded)));
            arrayList.add(UItem.asButton((int) R.styleable.AppCompatTheme_textAppearanceListItem, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessChatsExcludedAdd)).accent());
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
                arrayList.add(UItem.asFilterChat(false, this.neverShow.get(i2).longValue()));
            }
            if (size2 != this.neverShow.size()) {
                arrayList.add(UItem.asButton((int) R.styleable.AppCompatTheme_textAppearanceListItemSecondary, R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.neverShow.size() - 5, new Object[0])).accent());
            }
        }
    }

    public boolean onClick(final UItem uItem) {
        int i = uItem.id;
        if (i == 101 || i == 103) {
            selectChatsFor(i == 101);
            return true;
        } else if (i == 102) {
            this.includeExpanded = true;
            this.update.run();
            return true;
        } else if (i == 104) {
            this.excludeExpanded = true;
            this.update.run();
            return true;
        } else if (uItem.viewType != 11 || this.fragment == null) {
            return false;
        } else {
            final boolean z = uItem.include;
            String str = uItem.chatType;
            final int flag = str == null ? 0 : getFlag(str);
            String peerName = flag == 0 ? this.fragment.getMessagesController().getPeerName(uItem.dialogId) : getFlagName(flag);
            BaseFragment baseFragment = this.fragment;
            baseFragment.showDialog(new AlertDialog.Builder(baseFragment.getContext(), this.fragment.getResourceProvider()).setTitle(LocaleController.getString(!z ? R.string.BusinessRecipientsRemoveExcludeTitle : R.string.BusinessRecipientsRemoveIncludeTitle)).setMessage(LocaleController.formatString(!z ? R.string.BusinessRecipientsRemoveExcludeMessage : R.string.BusinessRecipientsRemoveIncludeMessage, peerName)).setPositiveButton(LocaleController.getString(R.string.Remove), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    BusinessRecipientsHelper.this.lambda$onClick$0(flag, z, uItem, dialogInterface, i2);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create());
            return true;
        }
    }

    public void lambda$onClick$0(int i, boolean z, UItem uItem, DialogInterface dialogInterface, int i2) {
        if (i == 0) {
            (!z ? this.neverShow : this.alwaysShow).remove(Long.valueOf(uItem.dialogId));
        } else if (!z) {
            this.excludeFlags = (i ^ (-1)) & this.excludeFlags;
        } else {
            this.includeFlags = (i ^ (-1)) & this.includeFlags;
        }
        this.update.run();
    }

    private int getFlag(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1197490811:
                if (str.equals("non_contacts")) {
                    c = 0;
                    break;
                }
                break;
            case -567451565:
                if (str.equals("contacts")) {
                    c = 1;
                    break;
                }
                break;
            case -268161860:
                if (str.equals("new_chats")) {
                    c = 2;
                    break;
                }
                break;
            case 151051367:
                if (str.equals("existing_chats")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 8;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return 1;
            default:
                return 0;
        }
    }

    private String getFlagName(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    return LocaleController.getString(R.string.FilterContacts);
                }
                return LocaleController.getString(R.string.FilterNonContacts);
            }
            return LocaleController.getString(R.string.FilterNewChats);
        }
        return LocaleController.getString(R.string.FilterExistingChats);
    }

    public void doNotExcludeNewChats() {
        this.doNotExcludeNewChats = true;
    }

    private void selectChatsFor(final boolean z) {
        UsersSelectActivity asPrivateChats = new UsersSelectActivity(z, z ? this.alwaysShow : this.neverShow, getFlags()).asPrivateChats();
        boolean z2 = true;
        asPrivateChats.noChatTypes = (!this.bot || this.exclude || z) ? false : true;
        asPrivateChats.allowSelf = false;
        asPrivateChats.doNotNewChats = (z || !this.doNotExcludeNewChats) ? false : false;
        asPrivateChats.setDelegate(new UsersSelectActivity.FilterUsersActivityDelegate() {
            @Override
            public final void didSelectChats(ArrayList arrayList, int i) {
                BusinessRecipientsHelper.this.lambda$selectChatsFor$1(z, arrayList, i);
            }
        });
        this.fragment.presentFragment(asPrivateChats);
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
