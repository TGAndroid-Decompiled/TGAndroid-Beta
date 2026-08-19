package org.telegram.ui.Business;

import android.content.Context;
import android.text.TextUtils;
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
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;

public class BusinessRecipientsHelper {
    public final ArrayList alwaysShow;
    public boolean bot;
    public final Context context;
    public final int currentAccount;
    private TL_account.TL_businessBotRecipients currentValue;
    private boolean doNotExcludeNewChats;
    public boolean exclude;
    public boolean excludeExpanded;
    public int excludeFlags;
    public final BaseFragment fragment;
    public boolean includeExpanded;
    public int includeFlags;
    public final ArrayList neverShow;
    public final Theme.ResourcesProvider resourcesProvider;
    private int shiftDp;
    public final Runnable update;

    public BusinessRecipientsHelper(BaseFragment baseFragment, Runnable runnable) {
        this.alwaysShow = new ArrayList();
        this.neverShow = new ArrayList();
        this.shiftDp = -4;
        this.context = baseFragment.getContext();
        this.currentAccount = baseFragment.getCurrentAccount();
        this.fragment = baseFragment;
        this.update = runnable;
        this.resourcesProvider = baseFragment.getResourceProvider();
    }

    public BusinessRecipientsHelper(Context context, int i, Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        this.alwaysShow = new ArrayList();
        this.neverShow = new ArrayList();
        this.shiftDp = -4;
        this.context = context;
        this.currentAccount = i;
        this.fragment = null;
        this.update = runnable;
        this.resourcesProvider = resourcesProvider;
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
            if (this.neverShow.size() != this.currentValue.exclude_users.size()) {
                return true;
            }
            for (int i2 = 0; i2 < this.neverShow.size(); i2++) {
                if (!this.currentValue.exclude_users.contains(this.neverShow.get(i2))) {
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

    public TL_account.TL_businessRecipients getValue() {
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

    public TL_account.TL_businessBotRecipients getBotValue() {
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

    public TL_account.TL_inputBusinessRecipients getInputValue() {
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

    public TL_account.TL_inputBusinessBotRecipients getBotInputValue() {
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

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        fillItems(arrayList, universalAdapter, true);
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter, boolean z) {
        String string;
        String str;
        universalAdapter.whiteSectionStart();
        int flags = getFlags();
        String string2 = "";
        if (!this.exclude) {
            if ((flags & 1) != 0) {
                if (TextUtils.isEmpty("")) {
                    str = "";
                } else {
                    str = ", ";
                }
                string = str + LocaleController.getString(R.string.FilterExistingChats);
            } else {
                string = "";
            }
            if ((flags & 2) != 0) {
                if (!TextUtils.isEmpty(string)) {
                    string = string + ", ";
                }
                string = string + LocaleController.getString(R.string.FilterNewChats);
            }
            if ((flags & 4) != 0) {
                if (!TextUtils.isEmpty(string)) {
                    string = string + ", ";
                }
                string = string + LocaleController.getString(R.string.FilterContacts);
            }
            if ((flags & 8) != 0) {
                if (!TextUtils.isEmpty(string)) {
                    string = string + ", ";
                }
                string = string + LocaleController.getString(R.string.FilterNonContacts);
            }
            if (!this.alwaysShow.isEmpty()) {
                if (!TextUtils.isEmpty(string)) {
                    string = string + " + " + this.alwaysShow.size();
                } else {
                    string = string + LocaleController.formatPluralStringComma("Chats", this.alwaysShow.size());
                }
            }
            if (TextUtils.isEmpty(string)) {
                string = LocaleController.getString(R.string.BusinessChatsIncludedAdd2);
            }
            arrayList.add(UItem.asButton(101, LocaleController.getString(R.string.BusinessChatsIncluded), string).setEnabled(z));
        }
        boolean z2 = this.bot;
        if (z2 || this.exclude) {
            if (!z2 || this.exclude) {
                if ((flags & 1) != 0) {
                    if (!TextUtils.isEmpty("")) {
                        string2 = ", ";
                    }
                    string2 = string2 + LocaleController.getString(R.string.FilterExistingChats);
                }
                if ((flags & 2) != 0) {
                    if (!TextUtils.isEmpty(string2)) {
                        string2 = string2 + ", ";
                    }
                    string2 = string2 + LocaleController.getString(R.string.FilterNewChats);
                }
                if ((flags & 4) != 0) {
                    if (!TextUtils.isEmpty(string2)) {
                        string2 = string2 + ", ";
                    }
                    string2 = string2 + LocaleController.getString(R.string.FilterContacts);
                }
                if ((flags & 8) != 0) {
                    if (!TextUtils.isEmpty(string2)) {
                        string2 = string2 + ", ";
                    }
                    string2 = string2 + LocaleController.getString(R.string.FilterNonContacts);
                }
            }
            if (!this.neverShow.isEmpty()) {
                if (!TextUtils.isEmpty(string2)) {
                    string2 = string2 + " + " + this.neverShow.size();
                } else {
                    string2 = string2 + LocaleController.formatPluralStringComma("Chats", this.neverShow.size());
                }
            }
            if (TextUtils.isEmpty(string2)) {
                string2 = LocaleController.getString(R.string.BusinessChatsExcludedAdd2);
            }
            arrayList.add(UItem.asButton(103, LocaleController.getString(R.string.BusinessChatsExcluded), string2).setEnabled(z));
        }
        universalAdapter.whiteSectionEnd();
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
        if (uItem.viewType != 11) {
            return false;
        }
        final boolean z = uItem.include;
        String str = uItem.chatType;
        final int flag = str == null ? 0 : getFlag(str);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this.context, this.resourcesProvider).setTitle(LocaleController.getString(!z ? R.string.BusinessRecipientsRemoveExcludeTitle : R.string.BusinessRecipientsRemoveIncludeTitle)).setMessage(LocaleController.formatString(!z ? R.string.BusinessRecipientsRemoveExcludeMessage : R.string.BusinessRecipientsRemoveIncludeMessage, flag == 0 ? MessagesController.getInstance(this.currentAccount).getPeerName(uItem.dialogId) : getFlagName(flag))).setPositiveButton(LocaleController.getString(R.string.Remove), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                BusinessRecipientsHelper.$r8$lambda$oaoTiip308WGZj95xjSa6pES1Rc(this.f$0, flag, z, uItem, alertDialog, i2);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
        BaseFragment baseFragment = this.fragment;
        if (baseFragment != null) {
            baseFragment.showDialog(alertDialogCreate);
        } else {
            alertDialogCreate.show();
        }
        return true;
    }

    public static void $r8$lambda$oaoTiip308WGZj95xjSa6pES1Rc(BusinessRecipientsHelper businessRecipientsHelper, int i, boolean z, UItem uItem, AlertDialog alertDialog, int i2) {
        if (i == 0) {
            (!z ? businessRecipientsHelper.neverShow : businessRecipientsHelper.alwaysShow).remove(Long.valueOf(uItem.dialogId));
        } else if (!z) {
            businessRecipientsHelper.excludeFlags = (~i) & businessRecipientsHelper.excludeFlags;
        } else {
            businessRecipientsHelper.includeFlags = (~i) & businessRecipientsHelper.includeFlags;
        }
        businessRecipientsHelper.update.run();
    }

    private int getFlag(String str) {
        str.getClass();
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
                BusinessRecipientsHelper.$r8$lambda$O5IoouW_6i6to5fkYNRYKjbKIPo(this.f$0, z, arrayList, i);
            }
        });
        BaseFragment baseFragment = this.fragment;
        if (baseFragment != null) {
            baseFragment.presentFragment(usersSelectActivityAsPrivateChats);
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        safeLastFragment.showAsSheet(usersSelectActivityAsPrivateChats, bottomSheetParams);
    }

    public static void $r8$lambda$O5IoouW_6i6to5fkYNRYKjbKIPo(BusinessRecipientsHelper businessRecipientsHelper, boolean z, ArrayList arrayList, int i) {
        int i2 = 0;
        if (z) {
            businessRecipientsHelper.includeFlags = i;
            businessRecipientsHelper.alwaysShow.clear();
            businessRecipientsHelper.alwaysShow.addAll(arrayList);
            while (i2 < businessRecipientsHelper.alwaysShow.size()) {
                businessRecipientsHelper.neverShow.remove(businessRecipientsHelper.alwaysShow.get(i2));
                i2++;
            }
        } else {
            businessRecipientsHelper.excludeFlags = i;
            businessRecipientsHelper.neverShow.clear();
            businessRecipientsHelper.neverShow.addAll(arrayList);
            while (i2 < businessRecipientsHelper.neverShow.size()) {
                businessRecipientsHelper.alwaysShow.remove(businessRecipientsHelper.neverShow.get(i2));
                i2++;
            }
        }
        businessRecipientsHelper.update.run();
    }
}
