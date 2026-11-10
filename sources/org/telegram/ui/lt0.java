package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class lt0 implements org.telegram.messenger.c20 {
    public final int f47691a;
    public final mt0 f47692b;

    public lt0(mt0 mt0Var, int i7) {
        this.f47691a = i7;
        this.f47692b = mt0Var;
    }

    @Override
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        int i7;
        int i10;
        switch (this.f47691a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f47692b.d;
                privacyControlActivity.M = ((Integer) obj).intValue();
                org.telegram.messenger.g0.a4(privacyControlActivity.f41654k0, privacyControlActivity.f41643c);
                privacyControlActivity.P0();
                return;
            default:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                mt0 mt0Var = this.f47692b;
                PrivacyControlActivity privacyControlActivity2 = mt0Var.d;
                TLRPC.UserFull b22 = privacyControlActivity2.getMessagesController().b2(privacyControlActivity2.getUserConfig().e());
                if (b22 != null) {
                    tL_birthday = b22.birthday;
                } else {
                    tL_birthday = null;
                }
                if (b22 != null) {
                    b22.flags2 |= 32;
                    b22.birthday = tL_birthday2;
                    privacyControlActivity2.getMessagesStorage().j2(b22, false);
                }
                privacyControlActivity2.getMessagesController().m2();
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new oo0(mt0Var, b22, tL_birthday, 1), 1024);
                i7 = ((org.telegram.ui.ActionBar.f2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.qp.s1(i7).k4(0L, "BIRTHDAY_SETUP");
                i10 = ((org.telegram.ui.ActionBar.f2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.qs.f(i10).k(309, new Object[0]);
                privacyControlActivity2.Q0(true);
                return;
        }
    }
}
