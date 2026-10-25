package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class dp0 implements Utilities.Callback {
    public final int f38916a;
    public final ep0 f38917b;

    public dp0(ep0 ep0Var, int i10) {
        this.f38916a = i10;
        this.f38917b = ep0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        lp0 lp0Var;
        pp0 pp0Var;
        lp0 lp0Var2;
        switch (this.f38916a) {
            case 0:
                Integer num = (Integer) obj;
                ep0 ep0Var = this.f38917b;
                lp0 lp0Var3 = ep0Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) lp0Var3.M.get(num);
                }
                lp0Var3.K = starGift;
                rp0 rp0Var = lp0Var3.f41330p0;
                if (starGift == null) {
                    zh.u3 u3Var = lp0Var3.J;
                    if (u3Var != null) {
                        u3Var.a();
                        lp0Var3.J = null;
                    }
                } else {
                    zh.u3 u3Var2 = lp0Var3.J;
                    if (u3Var2 == null || u3Var2.f53263b != starGift.f22254id) {
                        i10 = ((org.telegram.ui.ActionBar.r2) rp0Var).currentAccount;
                        zh.u3 u3Var3 = new zh.u3(lp0Var3.K.f22254id, i10, new dp0(ep0Var, 2));
                        lp0Var3.J = u3Var3;
                        u3Var3.g(false);
                    }
                }
                lp0.a(lp0Var3);
                if (rp0Var.I.getCurrentPosition() == 1) {
                    lp0Var = rp0Var.f43230n;
                } else {
                    lp0Var = rp0Var.h;
                }
                lp0Var.e();
                return;
            case 1:
                lp0 lp0Var4 = this.f38917b.e;
                lp0Var4.h = ((Integer) obj).intValue();
                lp0Var4.f41331r = null;
                lp0Var4.f41332s = null;
                lp0Var4.I = null;
                lp0Var4.j(true);
                lp0Var4.i();
                lp0Var4.f(true);
                kp0 kp0Var = lp0Var4.f41335y;
                if (kp0Var != null) {
                    kp0Var.invalidate();
                }
                rp0 rp0Var2 = lp0Var4.f41330p0;
                lp0 lp0Var5 = rp0Var2.f43230n;
                if (lp0Var5 != null && (pp0Var = lp0Var5.f41311a) != null && (lp0Var2 = rp0Var2.h) != null) {
                    pp0Var.a(lp0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f38917b.e.e();
                return;
        }
    }
}
