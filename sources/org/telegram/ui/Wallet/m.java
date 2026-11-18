package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.e51;
public final class m implements Runnable {
    public final int f44505a;
    public final Object f44506b;

    public m(Object obj, int i7) {
        this.f44505a = i7;
        this.f44506b = obj;
    }

    private final void a() {
        i0 i0Var = (i0) this.f44506b;
        synchronized (i0Var) {
            if (i0Var.f44322a) {
                return;
            }
            i0Var.f44322a = true;
            Runnable runnable = i0Var.f44323b;
            if (runnable != null) {
                runnable.run();
                i0Var.f44323b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z10;
        switch (this.f44505a) {
            case 0:
                g0 g0Var = (g0) this.f44506b;
                synchronized (g0Var) {
                    if (!g0Var.f44238a) {
                        g0Var.f44238a = true;
                        Runnable runnable = g0Var.f44239b;
                        if (runnable != null) {
                            runnable.run();
                            g0Var.f44239b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                ((r0) this.f44506b).close();
                return;
            case 2:
                a();
                return;
            case 3:
                e1 e1Var = (e1) this.f44506b;
                e1Var.c("AUTH_CANCELED");
                e1Var.e();
                if (c8.za.f5099b == e1Var) {
                    c8.za.f5099b = null;
                    return;
                }
                return;
            case 4:
                ((d3) this.f44506b).dismiss();
                return;
            case 5:
                ((org.telegram.ui.Cells.v0) this.f44506b).invalidate();
                return;
            case 6:
                ((org.telegram.ui.ActionBar.k5) this.f44506b).a(true);
                return;
            case 7:
                org.telegram.messenger.g0.E2((hi.m3) this.f44506b);
                return;
            case 8:
                j6 j6Var = (j6) this.f44506b;
                bi.c6 c6Var = j6Var.f44404c;
                if (c6Var != null && c6Var.getScrollState() == 0) {
                    e51 B0 = j6Var.f44409j.B0();
                    if ((B0 == null || B0.getScrollState() == 0) && (d = j6Var.d(j6Var.f44404c.f34606f3)) != null) {
                        v4.c0 c0Var = j6Var.f44404c.f34606f3;
                        c0Var.getClass();
                        int i7 = new int[]{0, v4.p0.z(d) - c0Var.F()}[1];
                        if (i7 != 0) {
                            j6Var.f44404c.w0(0, i7, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                fi.u2 u2Var = (fi.u2) this.f44506b;
                ci.f fVar = (ci.f) u2Var.f12611b;
                ci.e eVar = (ci.e) u2Var.f12612c;
                if (eVar != null) {
                    fVar.a(eVar);
                    fVar.D = 0.0f;
                    u2Var.f12612c = null;
                    u2Var.invalidate();
                    return;
                }
                return;
            case 10:
                ((WalletEngine2) this.f44506b).lambda$close$56();
                return;
            case 11:
                e9 e9Var = (e9) this.f44506b;
                boolean z11 = false;
                if (e9Var.h != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !e9Var.f44145s) {
                    e9Var.f44140c = e9Var.c();
                    e9Var.d = 0.0f;
                }
                if (z10 || e9Var.f44145s || e9Var.f44141e > 1.001f) {
                    z11 = true;
                }
                l4 l4Var = e9Var.f44139b;
                float f10 = e9Var.f44140c;
                float f11 = e9Var.d;
                l4Var.f59548r = f10;
                l4Var.f59549s = f11;
                l4Var.f59550w = z11;
                l4Var.f59551x = z11;
                return;
            case 12:
                l9 l9Var = (l9) this.f44506b;
                l9Var.removeSelfFromStack();
                Runnable runnable2 = l9Var.f44503f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.x3) this.f44506b).requestLayout();
                return;
            default:
                ((va) this.f44506b).Z();
                return;
        }
    }
}
