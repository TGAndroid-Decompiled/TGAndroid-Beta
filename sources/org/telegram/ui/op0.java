package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class op0 implements Utilities.Callback {
    public final int f36378a;
    public final pp0 f36379b;

    public op0(pp0 pp0Var, int i10) {
        this.f36378a = i10;
        this.f36379b = pp0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        wp0 wp0Var;
        aq0 aq0Var;
        wp0 wp0Var2;
        switch (this.f36378a) {
            case 0:
                Integer num = (Integer) obj;
                pp0 pp0Var = this.f36379b;
                wp0 wp0Var3 = pp0Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) wp0Var3.M.get(num);
                }
                wp0Var3.K = starGift;
                cq0 cq0Var = wp0Var3.f39235p0;
                if (starGift == null) {
                    xh.v3 v3Var = wp0Var3.J;
                    if (v3Var != null) {
                        v3Var.f();
                        wp0Var3.J = null;
                    }
                } else {
                    xh.v3 v3Var2 = wp0Var3.J;
                    if (v3Var2 == null || v3Var2.f46492b != starGift.f18568id) {
                        i10 = ((org.telegram.ui.ActionBar.n2) cq0Var).currentAccount;
                        xh.v3 v3Var3 = new xh.v3(wp0Var3.K.f18568id, i10, new op0(pp0Var, 2));
                        wp0Var3.J = v3Var3;
                        v3Var3.g(false);
                    }
                }
                wp0.a(wp0Var3);
                if (cq0Var.I.getCurrentPosition() == 1) {
                    wp0Var = cq0Var.f32844n;
                } else {
                    wp0Var = cq0Var.h;
                }
                wp0Var.e();
                return;
            case 1:
                wp0 wp0Var4 = this.f36379b.e;
                wp0Var4.h = ((Integer) obj).intValue();
                wp0Var4.f39236r = null;
                wp0Var4.f39237s = null;
                wp0Var4.I = null;
                wp0Var4.j(true);
                wp0Var4.i();
                wp0Var4.f(true);
                vp0 vp0Var = wp0Var4.f39240y;
                if (vp0Var != null) {
                    vp0Var.invalidate();
                }
                cq0 cq0Var2 = wp0Var4.f39235p0;
                wp0 wp0Var5 = cq0Var2.f32844n;
                if (wp0Var5 != null && (aq0Var = wp0Var5.f39216a) != null && (wp0Var2 = cq0Var2.h) != null) {
                    aq0Var.a(wp0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f36379b.e.e();
                return;
        }
    }
}
