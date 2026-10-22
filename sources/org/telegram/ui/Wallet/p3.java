package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.xc;
public final class p3 implements Runnable {
    public final int f34697a;
    public final o5 f34698b;

    public p3(o5 o5Var, int i10) {
        this.f34697a = i10;
        this.f34698b = o5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        e0 e0Var;
        switch (this.f34697a) {
            case 0:
                o5.Z(this.f34698b);
                return;
            case 1:
                o5 o5Var = this.f34698b;
                o5Var.getClass();
                o5Var.presentFragment(new h8());
                return;
            case 2:
                o5 o5Var2 = this.f34698b;
                o5Var2.getClass();
                o5Var2.presentFragment(new fi.g());
                return;
            case 3:
                o5 o5Var3 = this.f34698b;
                t7 t7Var = o5Var3.f34654i0;
                if (t7Var != null && (e0Var = o5Var3.D0) != null) {
                    t7Var.Y(e0Var);
                }
                e0 e0Var2 = o5Var3.D0;
                if (e0Var2 != null && !e0Var2.f34136a.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (o5Var3.f34649e0 != z10) {
                    o5Var3.G0(z10);
                }
                if (z10 && o5Var3.E0) {
                    n8 n8Var = o5Var3.f34653h0;
                    if (n8Var != null) {
                        n8Var.b(false);
                    }
                    if (!o5Var3.f34649e0) {
                        o5Var3.E0 = true;
                    } else {
                        o5Var3.E0 = false;
                        o5Var3.f34648d0 = 1;
                        ei.h1 h1Var = o5Var3.f34660o0;
                        if (h1Var != null) {
                            h1Var.setPosition(1);
                        }
                    }
                }
                w61 w61Var = o5Var3.f32359a;
                if (w61Var != null && w61Var.W2 != null) {
                    o5Var3.R0(true);
                    return;
                }
                return;
            case 4:
                this.f34698b.n0(false);
                return;
            case 5:
                this.f34698b.z0();
                return;
            case 6:
                this.f34698b.y0();
                return;
            case 7:
                o5 o5Var4 = this.f34698b;
                if (o5Var4.Q.isAttachedToWindow()) {
                    if (!o5Var4.f32359a.canScrollVertically(-1)) {
                        o5Var4.f32359a.V2.h1(0, 0);
                    }
                    o5Var4.Q.requestLayout();
                    return;
                }
                return;
            case 8:
                this.f34698b.L0 = null;
                return;
            case 9:
                o5.c0(this.f34698b);
                return;
            case 10:
                this.f34698b.N0();
                return;
            case 11:
                xc.a0(this.f34698b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 12:
                o5 o5Var5 = this.f34698b;
                o5Var5.Q.post(new p3(o5Var5, 7));
                return;
            case 13:
                this.f34698b.y0();
                return;
            default:
                this.f34698b.y0();
                return;
        }
    }
}
