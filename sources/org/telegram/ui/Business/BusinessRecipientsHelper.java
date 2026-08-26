package org.telegram.ui.Business;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzhp;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda25;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;

public final class BusinessRecipientsHelper {
    public final ArrayList alwaysShow;
    public boolean bot;
    public final Context context;
    public final int currentAccount;
    public TL_account.TL_businessBotRecipients currentValue;
    public boolean doNotExcludeNewChats;
    public boolean exclude;
    public int excludeFlags;
    public final BaseFragment fragment;
    public int includeFlags;
    public final ArrayList neverShow;
    public final Theme.ResourcesProvider resourcesProvider;
    public int shiftDp;
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

    public final void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter, boolean z) {
        String string;
        universalAdapter.whiteSectionStart();
        int flags = getFlags();
        String strM = "";
        if (!this.exclude) {
            if ((flags & 1) != 0) {
                string = NotificationsController$$ExternalSyntheticOutline1.m(DiffUtil.m(!TextUtils.isEmpty("") ? ", " : ""), R.string.FilterExistingChats);
            } else {
                string = "";
            }
            if ((flags & 2) != 0) {
                if (!TextUtils.isEmpty(string)) {
                    string = zzhp.m(string, ", ");
                }
                string = NotificationsController$$ExternalSyntheticOutline1.m(DiffUtil.m(string), R.string.FilterNewChats);
            }
            if ((flags & 4) != 0) {
                if (!TextUtils.isEmpty(string)) {
                    string = zzhp.m(string, ", ");
                }
                string = NotificationsController$$ExternalSyntheticOutline1.m(DiffUtil.m(string), R.string.FilterContacts);
            }
            if ((flags & 8) != 0) {
                if (!TextUtils.isEmpty(string)) {
                    string = zzhp.m(string, ", ");
                }
                string = NotificationsController$$ExternalSyntheticOutline1.m(DiffUtil.m(string), R.string.FilterNonContacts);
            }
            ArrayList arrayList2 = this.alwaysShow;
            if (!arrayList2.isEmpty()) {
                if (TextUtils.isEmpty(string)) {
                    StringBuilder sbM = DiffUtil.m(string);
                    sbM.append(LocaleController.formatPluralStringComma("Chats", arrayList2.size()));
                    string = sbM.toString();
                } else {
                    StringBuilder sbM2 = Log.m(string, " + ");
                    sbM2.append(arrayList2.size());
                    string = sbM2.toString();
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
                    strM = NotificationsController$$ExternalSyntheticOutline1.m(DiffUtil.m(TextUtils.isEmpty("") ? "" : ", "), R.string.FilterExistingChats);
                }
                if ((flags & 2) != 0) {
                    if (!TextUtils.isEmpty(strM)) {
                        strM = zzhp.m(strM, ", ");
                    }
                    strM = NotificationsController$$ExternalSyntheticOutline1.m(DiffUtil.m(strM), R.string.FilterNewChats);
                }
                if ((flags & 4) != 0) {
                    if (!TextUtils.isEmpty(strM)) {
                        strM = zzhp.m(strM, ", ");
                    }
                    strM = NotificationsController$$ExternalSyntheticOutline1.m(DiffUtil.m(strM), R.string.FilterContacts);
                }
                if ((flags & 8) != 0) {
                    if (!TextUtils.isEmpty(strM)) {
                        strM = zzhp.m(strM, ", ");
                    }
                    strM = NotificationsController$$ExternalSyntheticOutline1.m(DiffUtil.m(strM), R.string.FilterNonContacts);
                }
            }
            ArrayList arrayList3 = this.neverShow;
            if (!arrayList3.isEmpty()) {
                if (TextUtils.isEmpty(strM)) {
                    StringBuilder sbM3 = DiffUtil.m(strM);
                    sbM3.append(LocaleController.formatPluralStringComma("Chats", arrayList3.size()));
                    strM = sbM3.toString();
                } else {
                    StringBuilder sbM4 = Log.m(strM, " + ");
                    sbM4.append(arrayList3.size());
                    strM = sbM4.toString();
                }
            }
            if (TextUtils.isEmpty(strM)) {
                strM = LocaleController.getString(R.string.BusinessChatsExcludedAdd2);
            }
            arrayList.add(UItem.asButton(103, LocaleController.getString(R.string.BusinessChatsExcluded), strM).setEnabled(z));
        }
        universalAdapter.whiteSectionEnd();
    }

    public final TL_account.TL_inputBusinessBotRecipients getBotInputValue() {
        TL_account.TL_inputBusinessBotRecipients tL_inputBusinessBotRecipients = new TL_account.TL_inputBusinessBotRecipients();
        int flags = getFlags();
        tL_inputBusinessBotRecipients.flags = flags & (-49);
        tL_inputBusinessBotRecipients.existing_chats = (flags & 1) != 0;
        tL_inputBusinessBotRecipients.new_chats = (flags & 2) != 0;
        tL_inputBusinessBotRecipients.contacts = (flags & 4) != 0;
        tL_inputBusinessBotRecipients.non_contacts = (flags & 8) != 0;
        boolean z = this.exclude;
        tL_inputBusinessBotRecipients.exclude_selected = z;
        ArrayList arrayList = this.neverShow;
        ArrayList arrayList2 = z ? arrayList : this.alwaysShow;
        if (!arrayList2.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i = 0; i < arrayList2.size(); i++) {
                TLRPC.InputUser inputUser = messagesController.getInputUser(((Long) arrayList2.get(i)).longValue());
                if (inputUser == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList2.get(i));
                } else {
                    tL_inputBusinessBotRecipients.users.add(inputUser);
                }
            }
        }
        if (!this.exclude) {
            MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessBotRecipients.flags |= 64;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLRPC.InputUser inputUser2 = messagesController2.getInputUser(((Long) arrayList.get(i2)).longValue());
                if (inputUser2 == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i2));
                } else {
                    tL_inputBusinessBotRecipients.exclude_users.add(inputUser2);
                }
            }
        }
        return tL_inputBusinessBotRecipients;
    }

    public final TL_account.TL_businessBotRecipients getBotValue() {
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
        int flags = getFlags();
        tL_businessBotRecipients.flags = flags & (-49);
        tL_businessBotRecipients.existing_chats = (flags & 1) != 0;
        tL_businessBotRecipients.new_chats = (flags & 2) != 0;
        tL_businessBotRecipients.contacts = (flags & 4) != 0;
        tL_businessBotRecipients.non_contacts = (flags & 8) != 0;
        boolean z = this.exclude;
        tL_businessBotRecipients.exclude_selected = z;
        ArrayList arrayList = this.neverShow;
        ArrayList arrayList2 = z ? arrayList : this.alwaysShow;
        if (!arrayList2.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessBotRecipients.flags |= 16;
            for (int i = 0; i < arrayList2.size(); i++) {
                if (messagesController.getInputUser(((Long) arrayList2.get(i)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList2.get(i));
                } else {
                    tL_businessBotRecipients.users.add((Long) arrayList2.get(i));
                }
            }
        }
        if (!this.exclude) {
            MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessBotRecipients.flags |= 64;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (messagesController2.getInputUser(((Long) arrayList.get(i2)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i2));
                } else {
                    tL_businessBotRecipients.users.add((Long) arrayList.get(i2));
                }
            }
        }
        return tL_businessBotRecipients;
    }

    public final int getFlags() {
        return this.exclude ? this.excludeFlags : this.includeFlags;
    }

    public final TL_account.TL_inputBusinessRecipients getInputValue() {
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

    public final TL_account.TL_businessRecipients getValue() {
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

    public final boolean hasChanges() {
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.currentValue;
        if (tL_businessBotRecipients == null || tL_businessBotRecipients.exclude_selected != this.exclude || (tL_businessBotRecipients.flags & (-49)) != getFlags()) {
            return true;
        }
        boolean z = this.exclude;
        ArrayList arrayList = this.neverShow;
        ArrayList arrayList2 = z ? arrayList : this.alwaysShow;
        if (arrayList2.size() != this.currentValue.users.size()) {
            return true;
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            if (!this.currentValue.users.contains(arrayList2.get(i))) {
                return true;
            }
        }
        if (this.bot && !this.exclude) {
            if (arrayList.size() != this.currentValue.exclude_users.size()) {
                return true;
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (!this.currentValue.exclude_users.contains(arrayList.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean onClick(final UItem uItem) {
        final int i;
        String string;
        int i2 = uItem.id;
        BaseFragment baseFragment = this.fragment;
        boolean z = false;
        if (i2 == 101 || i2 == 103) {
            boolean z2 = i2 == 101;
            UsersSelectActivity usersSelectActivityAsPrivateChats = new UsersSelectActivity(z2, z2 ? this.alwaysShow : this.neverShow, getFlags()).asPrivateChats();
            usersSelectActivityAsPrivateChats.noChatTypes = (!this.bot || this.exclude || z2) ? false : true;
            usersSelectActivityAsPrivateChats.allowSelf = false;
            if (!z2 && this.doNotExcludeNewChats) {
                z = true;
            }
            usersSelectActivityAsPrivateChats.doNotNewChats = z;
            usersSelectActivityAsPrivateChats.setDelegate(new ChatMessageCell$$ExternalSyntheticLambda25(this, z2));
            if (baseFragment != null) {
                baseFragment.presentFragment(usersSelectActivityAsPrivateChats);
                return true;
            }
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment == null) {
                return true;
            }
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            safeLastFragment.showAsSheet(usersSelectActivityAsPrivateChats, bottomSheetParams);
            return true;
        }
        Runnable runnable = this.update;
        if (i2 == 102) {
            runnable.run();
            return true;
        }
        if (i2 == 104) {
            runnable.run();
            return true;
        }
        if (uItem.viewType != 11) {
            return false;
        }
        final boolean z3 = uItem.include;
        String str = uItem.chatType;
        if (str != null) {
            switch (str) {
                case "non_contacts":
                    i = 8;
                    break;
                case "contacts":
                    i = 4;
                    break;
                case "new_chats":
                    i = 2;
                    break;
                case "existing_chats":
                    i = 1;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            i = 0;
        }
        if (i == 0) {
            string = MessagesController.getInstance(this.currentAccount).getPeerName(uItem.dialogId);
        } else if (i == 1) {
            string = LocaleController.getString(R.string.FilterExistingChats);
        } else if (i != 2) {
            string = i != 4 ? LocaleController.getString(R.string.FilterNonContacts) : LocaleController.getString(R.string.FilterContacts);
        } else {
            string = LocaleController.getString(R.string.FilterNewChats);
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this.context, 0, this.resourcesProvider).setTitle(LocaleController.getString(!z3 ? R.string.BusinessRecipientsRemoveExcludeTitle : R.string.BusinessRecipientsRemoveIncludeTitle)).setMessage(LocaleController.formatString(!z3 ? R.string.BusinessRecipientsRemoveExcludeMessage : R.string.BusinessRecipientsRemoveIncludeMessage, string)).setPositiveButton(LocaleController.getString(R.string.Remove), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                BusinessRecipientsHelper businessRecipientsHelper = this.f$0;
                int i4 = i;
                boolean z4 = z3;
                if (i4 == 0) {
                    (!z4 ? businessRecipientsHelper.neverShow : businessRecipientsHelper.alwaysShow).remove(Long.valueOf(uItem.dialogId));
                } else if (z4) {
                    businessRecipientsHelper.includeFlags = (~i4) & businessRecipientsHelper.includeFlags;
                } else {
                    businessRecipientsHelper.excludeFlags = (~i4) & businessRecipientsHelper.excludeFlags;
                }
                businessRecipientsHelper.update.run();
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
        if (baseFragment != null) {
            baseFragment.showDialog(alertDialogCreate);
            return true;
        }
        alertDialogCreate.show();
        return true;
    }

    public final void setValue(TL_account.TL_businessRecipients tL_businessRecipients) {
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
        ArrayList arrayList = this.alwaysShow;
        ArrayList arrayList2 = this.neverShow;
        if (tL_businessBotRecipients2 == null) {
            this.exclude = true;
            this.excludeFlags = 0;
            this.includeFlags = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z = tL_businessBotRecipients2.exclude_selected;
        this.exclude = z;
        if (z) {
            this.includeFlags = 0;
            this.excludeFlags = tL_businessBotRecipients2.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.currentValue.users);
            return;
        }
        this.includeFlags = tL_businessBotRecipients2.flags & (-49);
        this.excludeFlags = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.currentValue.users);
        arrayList2.addAll(this.currentValue.exclude_users);
    }

    public final boolean validate(UniversalRecyclerView universalRecyclerView) {
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

    public BusinessRecipientsHelper(Context context, int i, Theme.ResourcesProvider resourcesProvider, ChatbotSheet$$ExternalSyntheticLambda0 chatbotSheet$$ExternalSyntheticLambda0) {
        this.alwaysShow = new ArrayList();
        this.neverShow = new ArrayList();
        this.shiftDp = -4;
        this.context = context;
        this.currentAccount = i;
        this.fragment = null;
        this.update = chatbotSheet$$ExternalSyntheticLambda0;
        this.resourcesProvider = resourcesProvider;
    }

    public final void setValue(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.bot = true;
        this.currentValue = tL_businessBotRecipients;
        ArrayList arrayList = this.alwaysShow;
        ArrayList arrayList2 = this.neverShow;
        if (tL_businessBotRecipients == null) {
            this.exclude = true;
            this.excludeFlags = 0;
            this.includeFlags = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z = tL_businessBotRecipients.exclude_selected;
        this.exclude = z;
        if (z) {
            this.includeFlags = 0;
            this.excludeFlags = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.currentValue.users);
            return;
        }
        this.includeFlags = tL_businessBotRecipients.flags & (-49);
        this.excludeFlags = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.currentValue.users);
        arrayList2.addAll(this.currentValue.exclude_users);
    }
}
