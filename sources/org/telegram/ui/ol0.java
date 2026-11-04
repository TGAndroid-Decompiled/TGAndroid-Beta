package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class ol0 implements org.telegram.messenger.u10 {
    public final int f48308a;
    public final pl0 f48309b;

    public ol0(pl0 pl0Var, int i3) {
        this.f48308a = i3;
        this.f48309b = pl0Var;
    }

    @Override
    public final void a(Object obj) {
        TL_stars.StarGift starGift;
        int i3;
        wl0 wl0Var;
        am0 am0Var;
        wl0 wl0Var2;
        switch (this.f48308a) {
            case 0:
                Integer num = (Integer) obj;
                pl0 pl0Var = this.f48309b;
                wl0 wl0Var3 = pl0Var.f48606e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) wl0Var3.N.get(num);
                }
                wl0Var3.L = starGift;
                cm0 cm0Var = wl0Var3.f51221q0;
                if (starGift == null) {
                    ai.w5 w5Var = wl0Var3.K;
                    if (w5Var != null) {
                        w5Var.f();
                        wl0Var3.K = null;
                    }
                } else {
                    ai.w5 w5Var2 = wl0Var3.K;
                    if (w5Var2 == null || w5Var2.f1068b != starGift.f27230id) {
                        i3 = ((org.telegram.ui.ActionBar.d2) cm0Var).currentAccount;
                        ai.w5 w5Var3 = new ai.w5(i3, wl0Var3.L.f27230id, new ol0(pl0Var, 2));
                        wl0Var3.K = w5Var3;
                        w5Var3.g(false);
                    }
                }
                wl0.a(wl0Var3);
                if (cm0Var.J.getCurrentPosition() == 1) {
                    wl0Var = cm0Var.f44398n;
                } else {
                    wl0Var = cm0Var.h;
                }
                wl0Var.e();
                return;
            case 1:
                wl0 wl0Var4 = this.f48309b.f48606e;
                wl0Var4.h = ((Integer) obj).intValue();
                wl0Var4.f51222r = null;
                wl0Var4.f51223s = null;
                wl0Var4.J = null;
                wl0Var4.j(true);
                wl0Var4.i();
                wl0Var4.f(true);
                vl0 vl0Var = wl0Var4.E;
                if (vl0Var != null) {
                    vl0Var.invalidate();
                }
                cm0 cm0Var2 = wl0Var4.f51221q0;
                wl0 wl0Var5 = cm0Var2.f44398n;
                if (wl0Var5 != null && (am0Var = wl0Var5.f51200a) != null && (wl0Var2 = cm0Var2.h) != null) {
                    am0Var.a(wl0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f48309b.f48606e.e();
                return;
        }
    }
}
