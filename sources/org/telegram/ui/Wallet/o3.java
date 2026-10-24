package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.vc;
public final class o3 implements Runnable {
    public final int f34930a;
    public final o5 f34931b;

    public o3(o5 o5Var, int i10) {
        this.f34930a = i10;
        this.f34931b = o5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        d0 d0Var;
        switch (this.f34930a) {
            case 0:
                o5.Z(this.f34931b);
                return;
            case 1:
                o5 o5Var = this.f34931b;
                o5Var.getClass();
                o5Var.presentFragment(new i8());
                return;
            case 2:
                o5 o5Var2 = this.f34931b;
                o5Var2.getClass();
                o5Var2.presentFragment(new fi.g());
                return;
            case 3:
                o5 o5Var3 = this.f34931b;
                t7 t7Var = o5Var3.f34944i0;
                if (t7Var != null && (d0Var = o5Var3.D0) != null) {
                    t7Var.Y(d0Var);
                }
                d0 d0Var2 = o5Var3.D0;
                if (d0Var2 != null && !d0Var2.f34387a.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (o5Var3.f34939e0 != z10) {
                    o5Var3.G0(z10);
                }
                if (z10 && o5Var3.E0) {
                    o8 o8Var = o5Var3.f34943h0;
                    if (o8Var != null) {
                        o8Var.b(false);
                    }
                    if (!o5Var3.f34939e0) {
                        o5Var3.E0 = true;
                    } else {
                        o5Var3.E0 = false;
                        o5Var3.f34938d0 = 1;
                        ei.h1 h1Var = o5Var3.f34950o0;
                        if (h1Var != null) {
                            h1Var.setPosition(1);
                        }
                    }
                }
                c71 c71Var = o5Var3.f25615a;
                if (c71Var != null && c71Var.Z2 != null) {
                    o5Var3.S0(true);
                    return;
                }
                return;
            case 4:
                this.f34931b.n0(false);
                return;
            case 5:
                this.f34931b.z0();
                return;
            case 6:
                this.f34931b.y0();
                return;
            case 7:
                o5 o5Var4 = this.f34931b;
                if (o5Var4.Q.isAttachedToWindow()) {
                    if (!o5Var4.f25615a.canScrollVertically(-1)) {
                        o5Var4.f25615a.Y2.h1(0, 0);
                    }
                    o5Var4.Q.requestLayout();
                    return;
                }
                return;
            case 8:
                this.f34931b.L0 = null;
                return;
            case 9:
                o5.c0(this.f34931b);
                return;
            case 10:
                this.f34931b.O0();
                return;
            case 11:
                vc.a0(this.f34931b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 12:
                o5 o5Var5 = this.f34931b;
                o5Var5.Q.post(new o3(o5Var5, 7));
                return;
            case 13:
                this.f34931b.y0();
                return;
            default:
                this.f34931b.y0();
                return;
        }
    }
}
