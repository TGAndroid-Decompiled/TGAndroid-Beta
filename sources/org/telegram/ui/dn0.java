package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class dn0 implements org.telegram.messenger.r20 {
    public final int f36639a;
    public final en0 f36640b;

    public dn0(en0 en0Var, int i10) {
        this.f36639a = i10;
        this.f36640b = en0Var;
    }

    @Override
    public final void a(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        ln0 ln0Var;
        pn0 pn0Var;
        ln0 ln0Var2;
        switch (this.f36639a) {
            case 0:
                Integer num = (Integer) obj;
                en0 en0Var = this.f36640b;
                ln0 ln0Var3 = en0Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) ln0Var3.M.get(num);
                }
                ln0Var3.K = starGift;
                rn0 rn0Var = ln0Var3.f39334p0;
                if (starGift == null) {
                    ph.h3 h3Var = ln0Var3.J;
                    if (h3Var != null) {
                        h3Var.f();
                        ln0Var3.J = null;
                    }
                } else {
                    ph.h3 h3Var2 = ln0Var3.J;
                    if (h3Var2 == null || h3Var2.f45101b != starGift.f20022id) {
                        i10 = ((org.telegram.ui.ActionBar.k2) rn0Var).currentAccount;
                        ph.h3 h3Var3 = new ph.h3(i10, ln0Var3.K.f20022id, new dn0(en0Var, 2));
                        ln0Var3.J = h3Var3;
                        h3Var3.g(false);
                    }
                }
                ln0.a(ln0Var3);
                if (rn0Var.I.getCurrentPosition() == 1) {
                    ln0Var = rn0Var.f41118n;
                } else {
                    ln0Var = rn0Var.h;
                }
                ln0Var.e();
                return;
            case 1:
                ln0 ln0Var4 = this.f36640b.e;
                ln0Var4.h = ((Integer) obj).intValue();
                ln0Var4.f39335r = null;
                ln0Var4.f39336s = null;
                ln0Var4.I = null;
                ln0Var4.j(true);
                ln0Var4.i();
                ln0Var4.f(true);
                kn0 kn0Var = ln0Var4.D;
                if (kn0Var != null) {
                    kn0Var.invalidate();
                }
                rn0 rn0Var2 = ln0Var4.f39334p0;
                ln0 ln0Var5 = rn0Var2.f41118n;
                if (ln0Var5 != null && (pn0Var = ln0Var5.f39315a) != null && (ln0Var2 = rn0Var2.h) != null) {
                    pn0Var.a(ln0Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f36640b.e.e();
                return;
        }
    }
}
