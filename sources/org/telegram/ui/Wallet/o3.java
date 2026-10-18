package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xc;
public final class o3 implements Runnable {
    public final int f34642a;
    public final n5 f34643b;

    public o3(n5 n5Var, int i10) {
        this.f34642a = i10;
        this.f34643b = n5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        e0 e0Var;
        switch (this.f34642a) {
            case 0:
                n5.b0(this.f34643b);
                return;
            case 1:
                n5 n5Var = this.f34643b;
                n5Var.getClass();
                n5Var.presentFragment(new h8());
                return;
            case 2:
                n5 n5Var2 = this.f34643b;
                n5Var2.getClass();
                n5Var2.presentFragment(new fi.g());
                return;
            case 3:
                n5 n5Var3 = this.f34643b;
                t7 t7Var = n5Var3.f34588i0;
                if (t7Var != null && (e0Var = n5Var3.D0) != null) {
                    t7Var.Y(e0Var);
                }
                e0 e0Var2 = n5Var3.D0;
                if (e0Var2 != null && !e0Var2.f34104a.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (n5Var3.f34583e0 != z10) {
                    n5Var3.F0(z10);
                }
                if (z10 && n5Var3.E0) {
                    n8 n8Var = n5Var3.f34587h0;
                    if (n8Var != null) {
                        n8Var.b(false);
                    }
                    if (!n5Var3.f34583e0) {
                        n5Var3.E0 = true;
                    } else {
                        n5Var3.E0 = false;
                        n5Var3.f34582d0 = 1;
                        ei.h1 h1Var = n5Var3.f34594o0;
                        if (h1Var != null) {
                            h1Var.setPosition(1);
                        }
                    }
                }
                u61 u61Var = n5Var3.f31190a;
                if (u61Var != null && u61Var.W2 != null) {
                    n5Var3.Q0(true);
                    return;
                }
                return;
            case 4:
                this.f34643b.o0(false);
                return;
            case 5:
                this.f34643b.y0();
                return;
            case 6:
                this.f34643b.x0();
                return;
            case 7:
                xc.a0(this.f34643b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 8:
                n5 n5Var4 = this.f34643b;
                if (n5Var4.Q.isAttachedToWindow()) {
                    if (!n5Var4.f31190a.canScrollVertically(-1)) {
                        n5Var4.f31190a.V2.h1(0, 0);
                    }
                    n5Var4.Q.requestLayout();
                    return;
                }
                return;
            case 9:
                n5.c0(this.f34643b);
                return;
            case 10:
                this.f34643b.M0();
                return;
            case 11:
                n5 n5Var5 = this.f34643b;
                n5Var5.Q.post(new o3(n5Var5, 8));
                return;
            case 12:
                this.f34643b.x0();
                return;
            default:
                this.f34643b.x0();
                return;
        }
    }
}
