package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class np0 implements Utilities.Callback {
    public final int f39001a;
    public final op0 f39002b;

    public np0(op0 op0Var, int i10) {
        this.f39001a = i10;
        this.f39002b = op0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        vp0 vp0Var;
        zp0 zp0Var;
        vp0 vp0Var2;
        switch (this.f39001a) {
            case 0:
                Integer num = (Integer) obj;
                op0 op0Var = this.f39002b;
                vp0 vp0Var3 = op0Var.f39296e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) vp0Var3.M.get(num);
                }
                vp0Var3.K = starGift;
                bq0 bq0Var = vp0Var3.f41619p0;
                if (starGift == null) {
                    yh.t3 t3Var = vp0Var3.J;
                    if (t3Var != null) {
                        t3Var.f();
                        vp0Var3.J = null;
                    }
                } else {
                    yh.t3 t3Var2 = vp0Var3.J;
                    if (t3Var2 == null || t3Var2.f50557b != starGift.f20097id) {
                        i10 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
                        yh.t3 t3Var3 = new yh.t3(vp0Var3.K.f20097id, i10, new np0(op0Var, 2));
                        vp0Var3.J = t3Var3;
                        t3Var3.g(false);
                    }
                }
                vp0.a(vp0Var3);
                if (bq0Var.I.getCurrentPosition() == 1) {
                    vp0Var = bq0Var.f34873n;
                } else {
                    vp0Var = bq0Var.h;
                }
                vp0Var.e();
                return;
            case 1:
                vp0 vp0Var4 = this.f39002b.f39296e;
                vp0Var4.h = ((Integer) obj).intValue();
                vp0Var4.f41620r = null;
                vp0Var4.f41621s = null;
                vp0Var4.I = null;
                vp0Var4.j(true);
                vp0Var4.i();
                vp0Var4.f(true);
                up0 up0Var = vp0Var4.f41624y;
                if (up0Var != null) {
                    up0Var.invalidate();
                }
                bq0 bq0Var2 = vp0Var4.f41619p0;
                vp0 vp0Var5 = bq0Var2.f34873n;
                if (vp0Var5 != null && (zp0Var = vp0Var5.f41599a) != null && (vp0Var2 = bq0Var2.h) != null) {
                    zp0Var.a(vp0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f39002b.f39296e.e();
                return;
        }
    }
}
