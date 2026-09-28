package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class fp0 implements Utilities.Callback {
    public final int f33739a;
    public final gp0 f33740b;

    public fp0(gp0 gp0Var, int i10) {
        this.f33739a = i10;
        this.f33740b = gp0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        np0 np0Var;
        rp0 rp0Var;
        np0 np0Var2;
        switch (this.f33739a) {
            case 0:
                Integer num = (Integer) obj;
                gp0 gp0Var = this.f33740b;
                np0 np0Var3 = gp0Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) np0Var3.M.get(num);
                }
                np0Var3.K = starGift;
                tp0 tp0Var = np0Var3.f35956p0;
                if (starGift == null) {
                    xh.v3 v3Var = np0Var3.J;
                    if (v3Var != null) {
                        v3Var.f();
                        np0Var3.J = null;
                    }
                } else {
                    xh.v3 v3Var2 = np0Var3.J;
                    if (v3Var2 == null || v3Var2.f46452b != starGift.f18561id) {
                        i10 = ((org.telegram.ui.ActionBar.m2) tp0Var).currentAccount;
                        xh.v3 v3Var3 = new xh.v3(np0Var3.K.f18561id, i10, new fp0(gp0Var, 2));
                        np0Var3.J = v3Var3;
                        v3Var3.g(false);
                    }
                }
                np0.a(np0Var3);
                if (tp0Var.I.getCurrentPosition() == 1) {
                    np0Var = tp0Var.f38180n;
                } else {
                    np0Var = tp0Var.h;
                }
                np0Var.e();
                return;
            case 1:
                np0 np0Var4 = this.f33740b.e;
                np0Var4.h = ((Integer) obj).intValue();
                np0Var4.f35957r = null;
                np0Var4.f35958s = null;
                np0Var4.I = null;
                np0Var4.j(true);
                np0Var4.i();
                np0Var4.f(true);
                mp0 mp0Var = np0Var4.f35961y;
                if (mp0Var != null) {
                    mp0Var.invalidate();
                }
                tp0 tp0Var2 = np0Var4.f35956p0;
                np0 np0Var5 = tp0Var2.f38180n;
                if (np0Var5 != null && (rp0Var = np0Var5.f35937a) != null && (np0Var2 = tp0Var2.h) != null) {
                    rp0Var.a(np0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f33740b.e.e();
                return;
        }
    }
}
