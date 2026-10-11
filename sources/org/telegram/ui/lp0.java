package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class lp0 implements Utilities.Callback {
    public final int f39747a;
    public final mp0 f39748b;

    public lp0(mp0 mp0Var, int i10) {
        this.f39747a = i10;
        this.f39748b = mp0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        tp0 tp0Var;
        xp0 xp0Var;
        tp0 tp0Var2;
        switch (this.f39747a) {
            case 0:
                Integer num = (Integer) obj;
                mp0 mp0Var = this.f39748b;
                tp0 tp0Var3 = mp0Var.f40082e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) tp0Var3.M.get(num);
                }
                tp0Var3.K = starGift;
                zp0 zp0Var = tp0Var3.f42275p0;
                if (starGift == null) {
                    xh.v3 v3Var = tp0Var3.J;
                    if (v3Var != null) {
                        v3Var.f();
                        tp0Var3.J = null;
                    }
                } else {
                    xh.v3 v3Var2 = tp0Var3.J;
                    if (v3Var2 == null || v3Var2.f51674b != starGift.f20295id) {
                        i10 = ((org.telegram.ui.ActionBar.m2) zp0Var).currentAccount;
                        xh.v3 v3Var3 = new xh.v3(tp0Var3.K.f20295id, i10, new lp0(mp0Var, 2));
                        tp0Var3.J = v3Var3;
                        v3Var3.g(false);
                    }
                }
                tp0.a(tp0Var3);
                if (zp0Var.I.getCurrentPosition() == 1) {
                    tp0Var = zp0Var.f45086n;
                } else {
                    tp0Var = zp0Var.h;
                }
                tp0Var.e();
                return;
            case 1:
                tp0 tp0Var4 = this.f39748b.f40082e;
                tp0Var4.h = ((Integer) obj).intValue();
                tp0Var4.f42276r = null;
                tp0Var4.f42277s = null;
                tp0Var4.I = null;
                tp0Var4.j(true);
                tp0Var4.i();
                tp0Var4.f(true);
                sp0 sp0Var = tp0Var4.f42280y;
                if (sp0Var != null) {
                    sp0Var.invalidate();
                }
                zp0 zp0Var2 = tp0Var4.f42275p0;
                tp0 tp0Var5 = zp0Var2.f45086n;
                if (tp0Var5 != null && (xp0Var = tp0Var5.f42255a) != null && (tp0Var2 = zp0Var2.h) != null) {
                    xp0Var.a(tp0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f39748b.f40082e.e();
                return;
        }
    }
}
