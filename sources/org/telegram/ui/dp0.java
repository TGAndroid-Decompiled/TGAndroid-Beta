package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class dp0 implements Utilities.Callback {
    public final int f38919a;
    public final ep0 f38920b;

    public dp0(ep0 ep0Var, int i10) {
        this.f38919a = i10;
        this.f38920b = ep0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        lp0 lp0Var;
        pp0 pp0Var;
        lp0 lp0Var2;
        switch (this.f38919a) {
            case 0:
                Integer num = (Integer) obj;
                ep0 ep0Var = this.f38920b;
                lp0 lp0Var3 = ep0Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) lp0Var3.M.get(num);
                }
                lp0Var3.K = starGift;
                rp0 rp0Var = lp0Var3.f41333p0;
                if (starGift == null) {
                    zh.u3 u3Var = lp0Var3.J;
                    if (u3Var != null) {
                        u3Var.a();
                        lp0Var3.J = null;
                    }
                } else {
                    zh.u3 u3Var2 = lp0Var3.J;
                    if (u3Var2 == null || u3Var2.f53266b != starGift.f22256id) {
                        i10 = ((org.telegram.ui.ActionBar.r2) rp0Var).currentAccount;
                        zh.u3 u3Var3 = new zh.u3(lp0Var3.K.f22256id, i10, new dp0(ep0Var, 2));
                        lp0Var3.J = u3Var3;
                        u3Var3.g(false);
                    }
                }
                lp0.a(lp0Var3);
                if (rp0Var.I.getCurrentPosition() == 1) {
                    lp0Var = rp0Var.f43233n;
                } else {
                    lp0Var = rp0Var.h;
                }
                lp0Var.e();
                return;
            case 1:
                lp0 lp0Var4 = this.f38920b.e;
                lp0Var4.h = ((Integer) obj).intValue();
                lp0Var4.f41334r = null;
                lp0Var4.f41335s = null;
                lp0Var4.I = null;
                lp0Var4.j(true);
                lp0Var4.i();
                lp0Var4.f(true);
                kp0 kp0Var = lp0Var4.f41338y;
                if (kp0Var != null) {
                    kp0Var.invalidate();
                }
                rp0 rp0Var2 = lp0Var4.f41333p0;
                lp0 lp0Var5 = rp0Var2.f43233n;
                if (lp0Var5 != null && (pp0Var = lp0Var5.f41314a) != null && (lp0Var2 = rp0Var2.h) != null) {
                    pp0Var.a(lp0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f38920b.e.e();
                return;
        }
    }
}
