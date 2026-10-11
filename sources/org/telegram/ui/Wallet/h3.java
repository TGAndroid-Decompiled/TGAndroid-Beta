package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.g71;
public final class h3 implements Runnable {
    public final int f35020a;
    public final c5 f35021b;

    public h3(c5 c5Var, int i10) {
        this.f35020a = i10;
        this.f35021b = c5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f35020a) {
            case 0:
                c5 c5Var = this.f35021b;
                c5Var.S.post(new h3(c5Var, 8));
                return;
            case 1:
                c5.e0(this.f35021b);
                return;
            case 2:
                c5 c5Var2 = this.f35021b;
                c5Var2.getClass();
                c5Var2.presentFragment(new n7());
                return;
            case 3:
                c5 c5Var3 = this.f35021b;
                c5Var3.getClass();
                c5Var3.presentFragment(new di.i());
                return;
            case 4:
                c5 c5Var4 = this.f35021b;
                d0 d0Var = c5Var4.A0;
                if (d0Var != null && !d0Var.f34787a.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c5Var4.f34747g0 != z10) {
                    c5Var4.w0(z10);
                }
                g71 g71Var = c5Var4.f26922a;
                if (g71Var != null && g71Var.W2 != null) {
                    c5Var4.F0(true);
                    return;
                }
                return;
            case 5:
                this.f35021b.q0();
                return;
            case 6:
                this.f35021b.p0();
                return;
            case 7:
                ad.a0(this.f35021b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 8:
                c5 c5Var5 = this.f35021b;
                if (c5Var5.S.isAttachedToWindow()) {
                    if (!c5Var5.f26922a.canScrollVertically(-1)) {
                        c5Var5.f26922a.V2.h1(0, 0);
                    }
                    c5Var5.S.requestLayout();
                    return;
                }
                return;
            case 9:
                c5 c5Var6 = this.f35021b;
                c5Var6.G = false;
                c5Var6.E.invalidate();
                return;
            case 10:
                c5.b0(this.f35021b);
                return;
            case 11:
                this.f35021b.C0();
                return;
            case 12:
                this.f35021b.p0();
                return;
            default:
                this.f35021b.p0();
                return;
        }
    }
}
