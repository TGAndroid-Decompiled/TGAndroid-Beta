package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.zc;
public final class f3 implements Runnable {
    public final int f33174a;
    public final z4 f33175b;

    public f3(z4 z4Var, int i10) {
        this.f33174a = i10;
        this.f33175b = z4Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f33174a) {
            case 0:
                z4 z4Var = this.f33175b;
                z4Var.S.post(new f3(z4Var, 8));
                return;
            case 1:
                z4.e0(this.f33175b);
                return;
            case 2:
                z4 z4Var2 = this.f33175b;
                z4Var2.getClass();
                z4Var2.presentFragment(new k7());
                return;
            case 3:
                z4 z4Var3 = this.f33175b;
                z4Var3.getClass();
                z4Var3.presentFragment(new ei.i());
                return;
            case 4:
                z4 z4Var4 = this.f33175b;
                b0 b0Var = z4Var4.A0;
                if (b0Var != null && !b0Var.f32940a.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z4Var4.f33926g0 != z10) {
                    z4Var4.w0(z10);
                }
                b71 b71Var = z4Var4.f23964a;
                if (b71Var != null && b71Var.W2 != null) {
                    z4Var4.F0(true);
                    return;
                }
                return;
            case 5:
                this.f33175b.q0();
                return;
            case 6:
                this.f33175b.p0();
                return;
            case 7:
                zc.a0(this.f33175b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 8:
                z4 z4Var5 = this.f33175b;
                if (z4Var5.S.isAttachedToWindow()) {
                    if (!z4Var5.f23964a.canScrollVertically(-1)) {
                        z4Var5.f23964a.V2.h1(0, 0);
                    }
                    z4Var5.S.requestLayout();
                    return;
                }
                return;
            case 9:
                z4 z4Var6 = this.f33175b;
                z4Var6.G = false;
                z4Var6.E.invalidate();
                return;
            case 10:
                z4.b0(this.f33175b);
                return;
            case 11:
                this.f33175b.C0();
                return;
            case 12:
                this.f33175b.p0();
                return;
            default:
                this.f33175b.p0();
                return;
        }
    }
}
