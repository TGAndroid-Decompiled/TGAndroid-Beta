package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class fn0 implements org.telegram.messenger.q20 {
    public final int f37302a;
    public final gn0 f37303b;

    public fn0(gn0 gn0Var, int i10) {
        this.f37302a = i10;
        this.f37303b = gn0Var;
    }

    @Override
    public final void a(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        nn0 nn0Var;
        rn0 rn0Var;
        nn0 nn0Var2;
        switch (this.f37302a) {
            case 0:
                Integer num = (Integer) obj;
                gn0 gn0Var = this.f37303b;
                nn0 nn0Var3 = gn0Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) nn0Var3.M.get(num);
                }
                nn0Var3.K = starGift;
                tn0 tn0Var = nn0Var3.f40001p0;
                if (starGift == null) {
                    ph.h3 h3Var = nn0Var3.J;
                    if (h3Var != null) {
                        h3Var.f();
                        nn0Var3.J = null;
                    }
                } else {
                    ph.h3 h3Var2 = nn0Var3.J;
                    if (h3Var2 == null || h3Var2.f45090b != starGift.f20021id) {
                        i10 = ((org.telegram.ui.ActionBar.k2) tn0Var).currentAccount;
                        ph.h3 h3Var3 = new ph.h3(i10, nn0Var3.K.f20021id, new fn0(gn0Var, 2));
                        nn0Var3.J = h3Var3;
                        h3Var3.g(false);
                    }
                }
                nn0.a(nn0Var3);
                if (tn0Var.I.getCurrentPosition() == 1) {
                    nn0Var = tn0Var.f41876n;
                } else {
                    nn0Var = tn0Var.h;
                }
                nn0Var.e();
                return;
            case 1:
                nn0 nn0Var4 = this.f37303b.e;
                nn0Var4.h = ((Integer) obj).intValue();
                nn0Var4.f40002r = null;
                nn0Var4.f40003s = null;
                nn0Var4.I = null;
                nn0Var4.j(true);
                nn0Var4.i();
                nn0Var4.f(true);
                mn0 mn0Var = nn0Var4.D;
                if (mn0Var != null) {
                    mn0Var.invalidate();
                }
                tn0 tn0Var2 = nn0Var4.f40001p0;
                nn0 nn0Var5 = tn0Var2.f41876n;
                if (nn0Var5 != null && (rn0Var = nn0Var5.f39982a) != null && (nn0Var2 = tn0Var2.h) != null) {
                    rn0Var.a(nn0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f37303b.e.e();
                return;
        }
    }
}
