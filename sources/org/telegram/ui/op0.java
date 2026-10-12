package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class op0 implements Utilities.Callback {
    public final int f40757a;
    public final pp0 f40758b;

    public op0(pp0 pp0Var, int i10) {
        this.f40757a = i10;
        this.f40758b = pp0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        wp0 wp0Var;
        aq0 aq0Var;
        wp0 wp0Var2;
        switch (this.f40757a) {
            case 0:
                Integer num = (Integer) obj;
                pp0 pp0Var = this.f40758b;
                wp0 wp0Var3 = pp0Var.f41067e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) wp0Var3.M.get(num);
                }
                wp0Var3.K = starGift;
                cq0 cq0Var = wp0Var3.f43602p0;
                if (starGift == null) {
                    xh.u3 u3Var = wp0Var3.J;
                    if (u3Var != null) {
                        u3Var.f();
                        wp0Var3.J = null;
                    }
                } else {
                    xh.u3 u3Var2 = wp0Var3.J;
                    if (u3Var2 == null || u3Var2.f51773b != starGift.f20032id) {
                        i10 = ((org.telegram.ui.ActionBar.m2) cq0Var).currentAccount;
                        xh.u3 u3Var3 = new xh.u3(wp0Var3.K.f20032id, i10, new op0(pp0Var, 2));
                        wp0Var3.J = u3Var3;
                        u3Var3.g(false);
                    }
                }
                wp0.a(wp0Var3);
                if (cq0Var.I.getCurrentPosition() == 1) {
                    wp0Var = cq0Var.f36492n;
                } else {
                    wp0Var = cq0Var.h;
                }
                wp0Var.e();
                return;
            case 1:
                wp0 wp0Var4 = this.f40758b.f41067e;
                wp0Var4.h = ((Integer) obj).intValue();
                wp0Var4.f43603r = null;
                wp0Var4.f43604s = null;
                wp0Var4.I = null;
                wp0Var4.j(true);
                wp0Var4.i();
                wp0Var4.f(true);
                vp0 vp0Var = wp0Var4.f43607y;
                if (vp0Var != null) {
                    vp0Var.invalidate();
                }
                cq0 cq0Var2 = wp0Var4.f43602p0;
                wp0 wp0Var5 = cq0Var2.f36492n;
                if (wp0Var5 != null && (aq0Var = wp0Var5.f43582a) != null && (wp0Var2 = cq0Var2.h) != null) {
                    aq0Var.a(wp0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f40758b.f41067e.e();
                return;
        }
    }
}
