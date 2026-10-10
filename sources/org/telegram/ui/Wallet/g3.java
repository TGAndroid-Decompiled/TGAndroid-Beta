package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.f71;
public final class g3 implements Runnable {
    public final int f34991a;
    public final b5 f34992b;

    public g3(b5 b5Var, int i10) {
        this.f34991a = i10;
        this.f34992b = b5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f34991a) {
            case 0:
                b5 b5Var = this.f34992b;
                b5Var.S.post(new g3(b5Var, 8));
                return;
            case 1:
                b5.e0(this.f34992b);
                return;
            case 2:
                b5 b5Var2 = this.f34992b;
                b5Var2.getClass();
                b5Var2.presentFragment(new m7());
                return;
            case 3:
                b5 b5Var3 = this.f34992b;
                b5Var3.getClass();
                b5Var3.presentFragment(new di.i());
                return;
            case 4:
                b5 b5Var4 = this.f34992b;
                c0 c0Var = b5Var4.A0;
                if (c0Var != null && !c0Var.f34758a.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (b5Var4.f34716g0 != z10) {
                    b5Var4.w0(z10);
                }
                f71 f71Var = b5Var4.f26629a;
                if (f71Var != null && f71Var.W2 != null) {
                    b5Var4.F0(true);
                    return;
                }
                return;
            case 5:
                this.f34992b.q0();
                return;
            case 6:
                this.f34992b.p0();
                return;
            case 7:
                ad.a0(this.f34992b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 8:
                b5 b5Var5 = this.f34992b;
                if (b5Var5.S.isAttachedToWindow()) {
                    if (!b5Var5.f26629a.canScrollVertically(-1)) {
                        b5Var5.f26629a.V2.h1(0, 0);
                    }
                    b5Var5.S.requestLayout();
                    return;
                }
                return;
            case 9:
                b5 b5Var6 = this.f34992b;
                b5Var6.G = false;
                b5Var6.E.invalidate();
                return;
            case 10:
                b5.b0(this.f34992b);
                return;
            case 11:
                this.f34992b.C0();
                return;
            case 12:
                this.f34992b.p0();
                return;
            default:
                this.f34992b.p0();
                return;
        }
    }
}
