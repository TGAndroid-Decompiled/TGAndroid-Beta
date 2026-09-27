package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class ip0 implements Utilities.Callback {
    public final int f34515a;
    public final jp0 f34516b;

    public ip0(jp0 jp0Var, int i10) {
        this.f34515a = i10;
        this.f34516b = jp0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        qp0 qp0Var;
        up0 up0Var;
        qp0 qp0Var2;
        switch (this.f34515a) {
            case 0:
                Integer num = (Integer) obj;
                jp0 jp0Var = this.f34516b;
                qp0 qp0Var3 = jp0Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) qp0Var3.M.get(num);
                }
                qp0Var3.K = starGift;
                wp0 wp0Var = qp0Var3.f36807p0;
                if (starGift == null) {
                    xh.w3 w3Var = qp0Var3.J;
                    if (w3Var != null) {
                        w3Var.f();
                        qp0Var3.J = null;
                    }
                } else {
                    xh.w3 w3Var2 = qp0Var3.J;
                    if (w3Var2 == null || w3Var2.f46526b != starGift.f18554id) {
                        i10 = ((org.telegram.ui.ActionBar.o2) wp0Var).currentAccount;
                        xh.w3 w3Var3 = new xh.w3(qp0Var3.K.f18554id, i10, new ip0(jp0Var, 2));
                        qp0Var3.J = w3Var3;
                        w3Var3.g(false);
                    }
                }
                qp0.a(qp0Var3);
                if (wp0Var.I.getCurrentPosition() == 1) {
                    qp0Var = wp0Var.f39403n;
                } else {
                    qp0Var = wp0Var.h;
                }
                qp0Var.e();
                return;
            case 1:
                qp0 qp0Var4 = this.f34516b.e;
                qp0Var4.h = ((Integer) obj).intValue();
                qp0Var4.f36808r = null;
                qp0Var4.f36809s = null;
                qp0Var4.I = null;
                qp0Var4.j(true);
                qp0Var4.i();
                qp0Var4.f(true);
                pp0 pp0Var = qp0Var4.f36812y;
                if (pp0Var != null) {
                    pp0Var.invalidate();
                }
                wp0 wp0Var2 = qp0Var4.f36807p0;
                qp0 qp0Var5 = wp0Var2.f39403n;
                if (qp0Var5 != null && (up0Var = qp0Var5.f36788a) != null && (qp0Var2 = wp0Var2.h) != null) {
                    up0Var.a(qp0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f34516b.e.e();
                return;
        }
    }
}
