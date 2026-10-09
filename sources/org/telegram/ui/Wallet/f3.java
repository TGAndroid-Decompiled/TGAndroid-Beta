package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.e71;
public final class f3 implements Runnable {
    public final int f34899a;
    public final a5 f34900b;

    public f3(a5 a5Var, int i10) {
        this.f34899a = i10;
        this.f34900b = a5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f34899a) {
            case 0:
                a5 a5Var = this.f34900b;
                a5Var.S.post(new f3(a5Var, 8));
                return;
            case 1:
                a5.e0(this.f34900b);
                return;
            case 2:
                a5 a5Var2 = this.f34900b;
                a5Var2.getClass();
                a5Var2.presentFragment(new l7());
                return;
            case 3:
                a5 a5Var3 = this.f34900b;
                a5Var3.getClass();
                a5Var3.presentFragment(new di.i());
                return;
            case 4:
                a5 a5Var4 = this.f34900b;
                c0 c0Var = a5Var4.A0;
                if (c0Var != null && !c0Var.f34703a.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (a5Var4.f34625g0 != z10) {
                    a5Var4.w0(z10);
                }
                e71 e71Var = a5Var4.f26290a;
                if (e71Var != null && e71Var.W2 != null) {
                    a5Var4.F0(true);
                    return;
                }
                return;
            case 5:
                this.f34900b.q0();
                return;
            case 6:
                this.f34900b.p0();
                return;
            case 7:
                ad.a0(this.f34900b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 8:
                a5 a5Var5 = this.f34900b;
                if (a5Var5.S.isAttachedToWindow()) {
                    if (!a5Var5.f26290a.canScrollVertically(-1)) {
                        a5Var5.f26290a.V2.h1(0, 0);
                    }
                    a5Var5.S.requestLayout();
                    return;
                }
                return;
            case 9:
                a5 a5Var6 = this.f34900b;
                a5Var6.G = false;
                a5Var6.E.invalidate();
                return;
            case 10:
                a5.b0(this.f34900b);
                return;
            case 11:
                this.f34900b.C0();
                return;
            case 12:
                this.f34900b.p0();
                return;
            default:
                this.f34900b.p0();
                return;
        }
    }
}
