package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xc;
public final class m3 implements Runnable {
    public final int f34582a;
    public final l5 f34583b;

    public m3(l5 l5Var, int i10) {
        this.f34582a = i10;
        this.f34583b = l5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        e0 e0Var;
        switch (this.f34582a) {
            case 0:
                l5.e0(this.f34583b);
                return;
            case 1:
                l5 l5Var = this.f34583b;
                l5Var.getClass();
                l5Var.presentFragment(new k8());
                return;
            case 2:
                l5 l5Var2 = this.f34583b;
                l5Var2.getClass();
                l5Var2.presentFragment(new fi.g());
                return;
            case 3:
                l5 l5Var3 = this.f34583b;
                w7 w7Var = l5Var3.f34491k0;
                if (w7Var != null && (e0Var = l5Var3.F0) != null) {
                    w7Var.a0(e0Var);
                }
                e0 e0Var2 = l5Var3.F0;
                if (e0Var2 != null && !e0Var2.f34146a.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (l5Var3.f34487g0 != z10) {
                    l5Var3.E0(z10);
                }
                if (z10 && l5Var3.G0) {
                    l5Var3.H0();
                }
                u61 u61Var = l5Var3.f31190a;
                if (u61Var != null && u61Var.W2 != null) {
                    l5Var3.Q0(true);
                    return;
                }
                return;
            case 4:
                this.f34583b.n0(false);
                return;
            case 5:
                this.f34583b.x0();
                return;
            case 6:
                this.f34583b.w0();
                return;
            case 7:
                xc.a0(this.f34583b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 8:
                l5 l5Var4 = this.f34583b;
                if (l5Var4.S.isAttachedToWindow()) {
                    if (!l5Var4.f31190a.canScrollVertically(-1)) {
                        l5Var4.f31190a.V2.h1(0, 0);
                    }
                    l5Var4.S.requestLayout();
                    return;
                }
                return;
            case 9:
                l5 l5Var5 = this.f34583b;
                l5Var5.G = false;
                l5Var5.E.invalidate();
                return;
            case 10:
                l5.b0(this.f34583b);
                return;
            case 11:
                this.f34583b.M0();
                return;
            case 12:
                l5 l5Var6 = this.f34583b;
                l5Var6.S.post(new m3(l5Var6, 8));
                return;
            case 13:
                this.f34583b.w0();
                return;
            default:
                this.f34583b.w0();
                return;
        }
    }
}
