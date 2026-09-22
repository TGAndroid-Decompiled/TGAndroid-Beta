package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class mp0 implements Utilities.Callback {
    public final int f35790a;
    public final np0 f35791b;

    public mp0(np0 np0Var, int i10) {
        this.f35790a = i10;
        this.f35791b = np0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        up0 up0Var;
        yp0 yp0Var;
        up0 up0Var2;
        switch (this.f35790a) {
            case 0:
                Integer num = (Integer) obj;
                np0 np0Var = this.f35791b;
                up0 up0Var3 = np0Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) up0Var3.M.get(num);
                }
                up0Var3.K = starGift;
                aq0 aq0Var = up0Var3.f38097p0;
                if (starGift == null) {
                    xh.u3 u3Var = up0Var3.J;
                    if (u3Var != null) {
                        u3Var.f();
                        up0Var3.J = null;
                    }
                } else {
                    xh.u3 u3Var2 = up0Var3.J;
                    if (u3Var2 == null || u3Var2.f46140b != starGift.f18334id) {
                        i10 = ((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount;
                        xh.u3 u3Var3 = new xh.u3(up0Var3.K.f18334id, i10, new mp0(np0Var, 2));
                        up0Var3.J = u3Var3;
                        u3Var3.g(false);
                    }
                }
                up0.a(up0Var3);
                if (aq0Var.I.getCurrentPosition() == 1) {
                    up0Var = aq0Var.f31885n;
                } else {
                    up0Var = aq0Var.h;
                }
                up0Var.e();
                return;
            case 1:
                up0 up0Var4 = this.f35791b.e;
                up0Var4.h = ((Integer) obj).intValue();
                up0Var4.f38098r = null;
                up0Var4.f38099s = null;
                up0Var4.I = null;
                up0Var4.j(true);
                up0Var4.i();
                up0Var4.f(true);
                tp0 tp0Var = up0Var4.f38102y;
                if (tp0Var != null) {
                    tp0Var.invalidate();
                }
                aq0 aq0Var2 = up0Var4.f38097p0;
                up0 up0Var5 = aq0Var2.f31885n;
                if (up0Var5 != null && (yp0Var = up0Var5.f38078a) != null && (up0Var2 = aq0Var2.h) != null) {
                    yp0Var.a(up0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f35791b.e.e();
                return;
        }
    }
}
