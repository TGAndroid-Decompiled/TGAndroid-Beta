package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class op0 implements Utilities.Callback {
    public final int f36223a;
    public final pp0 f36224b;

    public op0(pp0 pp0Var, int i10) {
        this.f36223a = i10;
        this.f36224b = pp0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        wp0 wp0Var;
        aq0 aq0Var;
        wp0 wp0Var2;
        switch (this.f36223a) {
            case 0:
                Integer num = (Integer) obj;
                pp0 pp0Var = this.f36224b;
                wp0 wp0Var3 = pp0Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) wp0Var3.M.get(num);
                }
                wp0Var3.K = starGift;
                cq0 cq0Var = wp0Var3.f39221p0;
                if (starGift == null) {
                    xh.v3 v3Var = wp0Var3.J;
                    if (v3Var != null) {
                        v3Var.f();
                        wp0Var3.J = null;
                    }
                } else {
                    xh.v3 v3Var2 = wp0Var3.J;
                    if (v3Var2 == null || v3Var2.f46424b != starGift.f18521id) {
                        i10 = ((org.telegram.ui.ActionBar.n2) cq0Var).currentAccount;
                        xh.v3 v3Var3 = new xh.v3(wp0Var3.K.f18521id, i10, new op0(pp0Var, 2));
                        wp0Var3.J = v3Var3;
                        v3Var3.g(false);
                    }
                }
                wp0.a(wp0Var3);
                if (cq0Var.I.getCurrentPosition() == 1) {
                    wp0Var = cq0Var.f32751n;
                } else {
                    wp0Var = cq0Var.h;
                }
                wp0Var.e();
                return;
            case 1:
                wp0 wp0Var4 = this.f36224b.e;
                wp0Var4.h = ((Integer) obj).intValue();
                wp0Var4.f39222r = null;
                wp0Var4.f39223s = null;
                wp0Var4.I = null;
                wp0Var4.j(true);
                wp0Var4.i();
                wp0Var4.f(true);
                vp0 vp0Var = wp0Var4.f39226y;
                if (vp0Var != null) {
                    vp0Var.invalidate();
                }
                cq0 cq0Var2 = wp0Var4.f39221p0;
                wp0 wp0Var5 = cq0Var2.f32751n;
                if (wp0Var5 != null && (aq0Var = wp0Var5.f39202a) != null && (wp0Var2 = cq0Var2.h) != null) {
                    aq0Var.a(wp0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f36224b.e.e();
                return;
        }
    }
}
