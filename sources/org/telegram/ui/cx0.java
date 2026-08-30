package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class cx0 implements Utilities.Callback {
    public final int f33447a;
    public final ex0 f33448b;

    public cx0(ex0 ex0Var, int i10) {
        this.f33447a = i10;
        this.f33448b = ex0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_account.TL_birthday tL_birthday;
        int i10;
        int i11;
        switch (this.f33447a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f33448b.d;
                privacyControlActivity.I = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(privacyControlActivity.d, privacyControlActivity.f31993g0);
                privacyControlActivity.E0();
                return;
            default:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                ex0 ex0Var = this.f33448b;
                PrivacyControlActivity privacyControlActivity2 = ex0Var.d;
                TLRPC.UserFull userFull = privacyControlActivity2.getMessagesController().getUserFull(privacyControlActivity2.getUserConfig().getClientUserId());
                if (userFull != null) {
                    tL_birthday = userFull.birthday;
                } else {
                    tL_birthday = null;
                }
                if (userFull != null) {
                    userFull.flags2 |= 32;
                    userFull.birthday = tL_birthday2;
                    privacyControlActivity2.getMessagesStorage().updateUserInfo(userFull, false);
                }
                privacyControlActivity2.getMessagesController().invalidateContentSettings();
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new rr0(ex0Var, userFull, tL_birthday, 1), 1024);
                i10 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity2).currentAccount;
                MessagesController.getInstance(i10).removeSuggestion(0L, "BIRTHDAY_SETUP");
                i11 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity2).currentAccount;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
                privacyControlActivity2.F0(true);
                return;
        }
    }
}
