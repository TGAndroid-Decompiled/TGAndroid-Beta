package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class mp0 implements Utilities.Callback {
    public final int f39959a;
    public final np0 f39960b;

    public mp0(np0 np0Var, int i10) {
        this.f39959a = i10;
        this.f39960b = np0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        up0 up0Var;
        yp0 yp0Var;
        up0 up0Var2;
        switch (this.f39959a) {
            case 0:
                Integer num = (Integer) obj;
                np0 np0Var = this.f39960b;
                up0 up0Var3 = np0Var.f40308e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) up0Var3.M.get(num);
                }
                up0Var3.K = starGift;
                aq0 aq0Var = up0Var3.f42530p0;
                if (starGift == null) {
                    xh.v3 v3Var = up0Var3.J;
                    if (v3Var != null) {
                        v3Var.f();
                        up0Var3.J = null;
                    }
                } else {
                    xh.v3 v3Var2 = up0Var3.J;
                    if (v3Var2 == null || v3Var2.f51551b != starGift.f20265id) {
                        i10 = ((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount;
                        xh.v3 v3Var3 = new xh.v3(up0Var3.K.f20265id, i10, new mp0(np0Var, 2));
                        up0Var3.J = v3Var3;
                        v3Var3.g(false);
                    }
                }
                up0.a(up0Var3);
                if (aq0Var.I.getCurrentPosition() == 1) {
                    up0Var = aq0Var.f35993n;
                } else {
                    up0Var = aq0Var.h;
                }
                up0Var.e();
                return;
            case 1:
                up0 up0Var4 = this.f39960b.f40308e;
                up0Var4.h = ((Integer) obj).intValue();
                up0Var4.f42531r = null;
                up0Var4.f42532s = null;
                up0Var4.I = null;
                up0Var4.j(true);
                up0Var4.i();
                up0Var4.f(true);
                tp0 tp0Var = up0Var4.f42535y;
                if (tp0Var != null) {
                    tp0Var.invalidate();
                }
                aq0 aq0Var2 = up0Var4.f42530p0;
                up0 up0Var5 = aq0Var2.f35993n;
                if (up0Var5 != null && (yp0Var = up0Var5.f42510a) != null && (up0Var2 = aq0Var2.h) != null) {
                    yp0Var.a(up0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f39960b.f40308e.e();
                return;
        }
    }
}
