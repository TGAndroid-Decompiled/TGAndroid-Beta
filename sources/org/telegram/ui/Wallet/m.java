package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.h51;
public final class m implements Runnable {
    public final int f44549a;
    public final Object f44550b;

    public m(Object obj, int i7) {
        this.f44549a = i7;
        this.f44550b = obj;
    }

    private final void a() {
        i0 i0Var = (i0) this.f44550b;
        synchronized (i0Var) {
            if (i0Var.f44366a) {
                return;
            }
            i0Var.f44366a = true;
            Runnable runnable = i0Var.f44367b;
            if (runnable != null) {
                runnable.run();
                i0Var.f44367b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z10;
        switch (this.f44549a) {
            case 0:
                g0 g0Var = (g0) this.f44550b;
                synchronized (g0Var) {
                    if (!g0Var.f44282a) {
                        g0Var.f44282a = true;
                        Runnable runnable = g0Var.f44283b;
                        if (runnable != null) {
                            runnable.run();
                            g0Var.f44283b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                ((r0) this.f44550b).close();
                return;
            case 2:
                a();
                return;
            case 3:
                e1 e1Var = (e1) this.f44550b;
                e1Var.c("AUTH_CANCELED");
                e1Var.e();
                if (c8.za.f5131b == e1Var) {
                    c8.za.f5131b = null;
                    return;
                }
                return;
            case 4:
                ((d3) this.f44550b).dismiss();
                return;
            case 5:
                ((org.telegram.ui.Cells.v0) this.f44550b).invalidate();
                return;
            case 6:
                ((org.telegram.ui.ActionBar.j5) this.f44550b).a(true);
                return;
            case 7:
                org.telegram.messenger.g0.E2((hi.l3) this.f44550b);
                return;
            case 8:
                j6 j6Var = (j6) this.f44550b;
                bi.f6 f6Var = j6Var.f44448c;
                if (f6Var != null && f6Var.getScrollState() == 0) {
                    h51 B0 = j6Var.f44453j.B0();
                    if ((B0 == null || B0.getScrollState() == 0) && (d = j6Var.d(j6Var.f44448c.f35788f3)) != null) {
                        v4.c0 c0Var = j6Var.f44448c.f35788f3;
                        c0Var.getClass();
                        int i7 = new int[]{0, v4.p0.z(d) - c0Var.F()}[1];
                        if (i7 != 0) {
                            j6Var.f44448c.w0(0, i7, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                fi.u2 u2Var = (fi.u2) this.f44550b;
                ci.f fVar = (ci.f) u2Var.f12653b;
                ci.e eVar = (ci.e) u2Var.f12654c;
                if (eVar != null) {
                    fVar.a(eVar);
                    fVar.D = 0.0f;
                    u2Var.f12654c = null;
                    u2Var.invalidate();
                    return;
                }
                return;
            case 10:
                ((WalletEngine2) this.f44550b).lambda$close$56();
                return;
            case 11:
                e9 e9Var = (e9) this.f44550b;
                boolean z11 = false;
                if (e9Var.h != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !e9Var.f44189s) {
                    e9Var.f44184c = e9Var.c();
                    e9Var.d = 0.0f;
                }
                if (z10 || e9Var.f44189s || e9Var.f44185e > 1.001f) {
                    z11 = true;
                }
                l4 l4Var = e9Var.f44183b;
                float f10 = e9Var.f44184c;
                float f11 = e9Var.d;
                l4Var.f59590r = f10;
                l4Var.f59591s = f11;
                l4Var.f59592w = z11;
                l4Var.f59593x = z11;
                return;
            case 12:
                l9 l9Var = (l9) this.f44550b;
                l9Var.removeSelfFromStack();
                Runnable runnable2 = l9Var.f44547f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.x3) this.f44550b).requestLayout();
                return;
            default:
                ((va) this.f44550b).Z();
                return;
        }
    }
}
