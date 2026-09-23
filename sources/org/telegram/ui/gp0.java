package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class gp0 implements Utilities.Callback {
    public final int f33632a;
    public final hp0 f33633b;

    public gp0(hp0 hp0Var, int i10) {
        this.f33632a = i10;
        this.f33633b = hp0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        op0 op0Var;
        sp0 sp0Var;
        op0 op0Var2;
        switch (this.f33632a) {
            case 0:
                Integer num = (Integer) obj;
                hp0 hp0Var = this.f33633b;
                op0 op0Var3 = hp0Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) op0Var3.M.get(num);
                }
                op0Var3.K = starGift;
                up0 up0Var = op0Var3.f35938p0;
                if (starGift == null) {
                    xh.v3 v3Var = op0Var3.J;
                    if (v3Var != null) {
                        v3Var.f();
                        op0Var3.J = null;
                    }
                } else {
                    xh.v3 v3Var2 = op0Var3.J;
                    if (v3Var2 == null || v3Var2.f46123b != starGift.f18308id) {
                        i10 = ((org.telegram.ui.ActionBar.n2) up0Var).currentAccount;
                        xh.v3 v3Var3 = new xh.v3(op0Var3.K.f18308id, i10, new gp0(hp0Var, 2));
                        op0Var3.J = v3Var3;
                        v3Var3.g(false);
                    }
                }
                op0.a(op0Var3);
                if (up0Var.I.getCurrentPosition() == 1) {
                    op0Var = up0Var.f38158n;
                } else {
                    op0Var = up0Var.h;
                }
                op0Var.e();
                return;
            case 1:
                op0 op0Var4 = this.f33633b.e;
                op0Var4.h = ((Integer) obj).intValue();
                op0Var4.f35939r = null;
                op0Var4.f35940s = null;
                op0Var4.I = null;
                op0Var4.j(true);
                op0Var4.i();
                op0Var4.f(true);
                np0 np0Var = op0Var4.f35943y;
                if (np0Var != null) {
                    np0Var.invalidate();
                }
                up0 up0Var2 = op0Var4.f35938p0;
                op0 op0Var5 = up0Var2.f38158n;
                if (op0Var5 != null && (sp0Var = op0Var5.f35919a) != null && (op0Var2 = up0Var2.h) != null) {
                    sp0Var.a(op0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f33633b.e.e();
                return;
        }
    }
}
