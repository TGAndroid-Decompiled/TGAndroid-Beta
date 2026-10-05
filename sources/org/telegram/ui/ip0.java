package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class ip0 implements Utilities.Callback {
    public final int f37471a;
    public final jp0 f37472b;

    public ip0(jp0 jp0Var, int i10) {
        this.f37471a = i10;
        this.f37472b = jp0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        qp0 qp0Var;
        up0 up0Var;
        qp0 qp0Var2;
        switch (this.f37471a) {
            case 0:
                Integer num = (Integer) obj;
                jp0 jp0Var = this.f37472b;
                qp0 qp0Var3 = jp0Var.f37751e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) qp0Var3.M.get(num);
                }
                qp0Var3.K = starGift;
                wp0 wp0Var = qp0Var3.f39849p0;
                if (starGift == null) {
                    xh.v3 v3Var = qp0Var3.J;
                    if (v3Var != null) {
                        v3Var.f();
                        qp0Var3.J = null;
                    }
                } else {
                    xh.v3 v3Var2 = qp0Var3.J;
                    if (v3Var2 == null || v3Var2.f50289b != starGift.f20274id) {
                        i10 = ((org.telegram.ui.ActionBar.n2) wp0Var).currentAccount;
                        xh.v3 v3Var3 = new xh.v3(qp0Var3.K.f20274id, i10, new ip0(jp0Var, 2));
                        qp0Var3.J = v3Var3;
                        v3Var3.g(false);
                    }
                }
                qp0.a(qp0Var3);
                if (wp0Var.I.getCurrentPosition() == 1) {
                    qp0Var = wp0Var.f42655n;
                } else {
                    qp0Var = wp0Var.h;
                }
                qp0Var.e();
                return;
            case 1:
                qp0 qp0Var4 = this.f37472b.f37751e;
                qp0Var4.h = ((Integer) obj).intValue();
                qp0Var4.f39850r = null;
                qp0Var4.f39851s = null;
                qp0Var4.I = null;
                qp0Var4.j(true);
                qp0Var4.i();
                qp0Var4.f(true);
                pp0 pp0Var = qp0Var4.f39854y;
                if (pp0Var != null) {
                    pp0Var.invalidate();
                }
                wp0 wp0Var2 = qp0Var4.f39849p0;
                qp0 qp0Var5 = wp0Var2.f42655n;
                if (qp0Var5 != null && (up0Var = qp0Var5.f39829a) != null && (qp0Var2 = wp0Var2.h) != null) {
                    up0Var.a(qp0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f37472b.f37751e.e();
                return;
        }
    }
}
