package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class ep0 implements Utilities.Callback {
    public final int f33539a;
    public final fp0 f33540b;

    public ep0(fp0 fp0Var, int i10) {
        this.f33539a = i10;
        this.f33540b = fp0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        mp0 mp0Var;
        qp0 qp0Var;
        mp0 mp0Var2;
        switch (this.f33539a) {
            case 0:
                Integer num = (Integer) obj;
                fp0 fp0Var = this.f33540b;
                mp0 mp0Var3 = fp0Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) mp0Var3.M.get(num);
                }
                mp0Var3.K = starGift;
                sp0 sp0Var = mp0Var3.f35751p0;
                if (starGift == null) {
                    xh.v3 v3Var = mp0Var3.J;
                    if (v3Var != null) {
                        v3Var.f();
                        mp0Var3.J = null;
                    }
                } else {
                    xh.v3 v3Var2 = mp0Var3.J;
                    if (v3Var2 == null || v3Var2.f46559b != starGift.f18577id) {
                        i10 = ((org.telegram.ui.ActionBar.m2) sp0Var).currentAccount;
                        xh.v3 v3Var3 = new xh.v3(mp0Var3.K.f18577id, i10, new ep0(fp0Var, 2));
                        mp0Var3.J = v3Var3;
                        v3Var3.g(false);
                    }
                }
                mp0.a(mp0Var3);
                if (sp0Var.I.getCurrentPosition() == 1) {
                    mp0Var = sp0Var.f37950n;
                } else {
                    mp0Var = sp0Var.h;
                }
                mp0Var.e();
                return;
            case 1:
                mp0 mp0Var4 = this.f33540b.e;
                mp0Var4.h = ((Integer) obj).intValue();
                mp0Var4.f35752r = null;
                mp0Var4.f35753s = null;
                mp0Var4.I = null;
                mp0Var4.j(true);
                mp0Var4.i();
                mp0Var4.f(true);
                lp0 lp0Var = mp0Var4.f35756y;
                if (lp0Var != null) {
                    lp0Var.invalidate();
                }
                sp0 sp0Var2 = mp0Var4.f35751p0;
                mp0 mp0Var5 = sp0Var2.f37950n;
                if (mp0Var5 != null && (qp0Var = mp0Var5.f35732a) != null && (mp0Var2 = sp0Var2.h) != null) {
                    qp0Var.a(mp0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f33540b.e.e();
                return;
        }
    }
}
