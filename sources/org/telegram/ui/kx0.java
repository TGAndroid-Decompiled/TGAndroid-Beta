package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class kx0 implements Utilities.Callback {
    public final int f40931a;
    public final mx0 f40932b;

    public kx0(mx0 mx0Var, int i10) {
        this.f40931a = i10;
        this.f40932b = mx0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_account.TL_birthday tL_birthday;
        int i10;
        int i11;
        switch (this.f40931a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f40932b.d;
                privacyControlActivity.K = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(privacyControlActivity.f35928c, privacyControlActivity.f35936i0);
                privacyControlActivity.F0();
                return;
            default:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                mx0 mx0Var = this.f40932b;
                PrivacyControlActivity privacyControlActivity2 = mx0Var.d;
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
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new cs0(mx0Var, userFull, tL_birthday, 1), 1024);
                i10 = ((org.telegram.ui.ActionBar.r2) privacyControlActivity2).currentAccount;
                MessagesController.getInstance(i10).removeSuggestion(0L, "BIRTHDAY_SETUP");
                i11 = ((org.telegram.ui.ActionBar.r2) privacyControlActivity2).currentAccount;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
                privacyControlActivity2.G0(true);
                return;
        }
    }
}
