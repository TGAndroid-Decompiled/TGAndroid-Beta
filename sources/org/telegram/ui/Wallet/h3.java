package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.zc;
public final class h3 implements Runnable {
    public final int f34831a;
    public final c5 f34832b;

    public h3(c5 c5Var, int i10) {
        this.f34831a = i10;
        this.f34832b = c5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f34831a) {
            case 0:
                c5 c5Var = this.f34832b;
                c5Var.S.post(new h3(c5Var, 8));
                return;
            case 1:
                c5.e0(this.f34832b);
                return;
            case 2:
                c5 c5Var2 = this.f34832b;
                c5Var2.getClass();
                c5Var2.presentFragment(new n7());
                return;
            case 3:
                c5 c5Var3 = this.f34832b;
                c5Var3.getClass();
                c5Var3.presentFragment(new di.i());
                return;
            case 4:
                c5 c5Var4 = this.f34832b;
                d0 d0Var = c5Var4.A0;
                if (d0Var != null && !d0Var.f34598a.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c5Var4.f34558g0 != z10) {
                    c5Var4.w0(z10);
                }
                j71 j71Var = c5Var4.f27776a;
                if (j71Var != null && j71Var.W2 != null) {
                    c5Var4.F0(true);
                    return;
                }
                return;
            case 5:
                this.f34832b.q0();
                return;
            case 6:
                this.f34832b.p0();
                return;
            case 7:
                zc.a0(this.f34832b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 8:
                c5 c5Var5 = this.f34832b;
                if (c5Var5.S.isAttachedToWindow()) {
                    if (!c5Var5.f27776a.canScrollVertically(-1)) {
                        c5Var5.f27776a.V2.h1(0, 0);
                    }
                    c5Var5.S.requestLayout();
                    return;
                }
                return;
            case 9:
                c5 c5Var6 = this.f34832b;
                c5Var6.G = false;
                c5Var6.E.invalidate();
                return;
            case 10:
                c5.b0(this.f34832b);
                return;
            case 11:
                this.f34832b.C0();
                return;
            case 12:
                this.f34832b.p0();
                return;
            default:
                this.f34832b.p0();
                return;
        }
    }
}
