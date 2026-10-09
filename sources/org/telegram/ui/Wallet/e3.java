package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.e71;
public final class e3 implements Runnable {
    public final int f34833a;
    public final z4 f34834b;

    public e3(z4 z4Var, int i10) {
        this.f34833a = i10;
        this.f34834b = z4Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f34833a) {
            case 0:
                z4 z4Var = this.f34834b;
                z4Var.S.post(new e3(z4Var, 8));
                return;
            case 1:
                z4.e0(this.f34834b);
                return;
            case 2:
                z4 z4Var2 = this.f34834b;
                z4Var2.getClass();
                z4Var2.presentFragment(new k7());
                return;
            case 3:
                z4 z4Var3 = this.f34834b;
                z4Var3.getClass();
                z4Var3.presentFragment(new di.i());
                return;
            case 4:
                z4 z4Var4 = this.f34834b;
                c0 c0Var = z4Var4.A0;
                if (c0Var != null && !c0Var.f34691a.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z4Var4.f35721g0 != z10) {
                    z4Var4.w0(z10);
                }
                e71 e71Var = z4Var4.f26290a;
                if (e71Var != null && e71Var.W2 != null) {
                    z4Var4.F0(true);
                    return;
                }
                return;
            case 5:
                this.f34834b.q0();
                return;
            case 6:
                this.f34834b.p0();
                return;
            case 7:
                ad.a0(this.f34834b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 8:
                z4 z4Var5 = this.f34834b;
                if (z4Var5.S.isAttachedToWindow()) {
                    if (!z4Var5.f26290a.canScrollVertically(-1)) {
                        z4Var5.f26290a.V2.h1(0, 0);
                    }
                    z4Var5.S.requestLayout();
                    return;
                }
                return;
            case 9:
                z4 z4Var6 = this.f34834b;
                z4Var6.G = false;
                z4Var6.E.invalidate();
                return;
            case 10:
                z4.b0(this.f34834b);
                return;
            case 11:
                this.f34834b.C0();
                return;
            case 12:
                this.f34834b.p0();
                return;
            default:
                this.f34834b.p0();
                return;
        }
    }
}
