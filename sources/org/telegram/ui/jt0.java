package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class jt0 implements org.telegram.messenger.x10 {
    public final int f49058a;
    public final kt0 f49059b;

    public jt0(kt0 kt0Var, int i7) {
        this.f49058a = i7;
        this.f49059b = kt0Var;
    }

    @Override
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        int i7;
        int i10;
        switch (this.f49058a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f49059b.d;
                privacyControlActivity.N = ((Integer) obj).intValue();
                org.telegram.messenger.g0.Y3(privacyControlActivity.f43472l0, privacyControlActivity.f43460c);
                privacyControlActivity.P0();
                return;
            default:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                kt0 kt0Var = this.f49059b;
                PrivacyControlActivity privacyControlActivity2 = kt0Var.d;
                TLRPC.UserFull d2 = privacyControlActivity2.getMessagesController().d2(privacyControlActivity2.getUserConfig().e());
                if (d2 != null) {
                    tL_birthday = d2.birthday;
                } else {
                    tL_birthday = null;
                }
                if (d2 != null) {
                    d2.flags2 |= 32;
                    d2.birthday = tL_birthday2;
                    privacyControlActivity2.getMessagesStorage().j2(d2, false);
                }
                privacyControlActivity2.getMessagesController().o2();
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new mo0(kt0Var, d2, tL_birthday, 1), 1024);
                i7 = ((org.telegram.ui.ActionBar.h2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.mp.u1(i7).s4(0L, "BIRTHDAY_SETUP");
                i10 = ((org.telegram.ui.ActionBar.h2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.ks.f(i10).k(312, new Object[0]);
                privacyControlActivity2.Q0(true);
                return;
        }
    }
}
