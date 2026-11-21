package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.h51;
public final class m implements Runnable {
    public final int f44545a;
    public final Object f44546b;

    public m(Object obj, int i7) {
        this.f44545a = i7;
        this.f44546b = obj;
    }

    private final void a() {
        i0 i0Var = (i0) this.f44546b;
        synchronized (i0Var) {
            if (i0Var.f44362a) {
                return;
            }
            i0Var.f44362a = true;
            Runnable runnable = i0Var.f44363b;
            if (runnable != null) {
                runnable.run();
                i0Var.f44363b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z10;
        switch (this.f44545a) {
            case 0:
                g0 g0Var = (g0) this.f44546b;
                synchronized (g0Var) {
                    if (!g0Var.f44278a) {
                        g0Var.f44278a = true;
                        Runnable runnable = g0Var.f44279b;
                        if (runnable != null) {
                            runnable.run();
                            g0Var.f44279b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                ((r0) this.f44546b).close();
                return;
            case 2:
                a();
                return;
            case 3:
                e1 e1Var = (e1) this.f44546b;
                e1Var.c("AUTH_CANCELED");
                e1Var.e();
                if (c8.za.f5128b == e1Var) {
                    c8.za.f5128b = null;
                    return;
                }
                return;
            case 4:
                ((d3) this.f44546b).dismiss();
                return;
            case 5:
                ((org.telegram.ui.Cells.v0) this.f44546b).invalidate();
                return;
            case 6:
                ((org.telegram.ui.ActionBar.j5) this.f44546b).a(true);
                return;
            case 7:
                org.telegram.messenger.g0.E2((hi.l3) this.f44546b);
                return;
            case 8:
                j6 j6Var = (j6) this.f44546b;
                bi.g6 g6Var = j6Var.f44444c;
                if (g6Var != null && g6Var.getScrollState() == 0) {
                    h51 B0 = j6Var.f44449j.B0();
                    if ((B0 == null || B0.getScrollState() == 0) && (d = j6Var.d(j6Var.f44444c.f35795f3)) != null) {
                        v4.c0 c0Var = j6Var.f44444c.f35795f3;
                        c0Var.getClass();
                        int i7 = new int[]{0, v4.p0.z(d) - c0Var.F()}[1];
                        if (i7 != 0) {
                            j6Var.f44444c.w0(0, i7, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                fi.u2 u2Var = (fi.u2) this.f44546b;
                ci.f fVar = (ci.f) u2Var.f12650b;
                ci.e eVar = (ci.e) u2Var.f12651c;
                if (eVar != null) {
                    fVar.a(eVar);
                    fVar.D = 0.0f;
                    u2Var.f12651c = null;
                    u2Var.invalidate();
                    return;
                }
                return;
            case 10:
                ((WalletEngine2) this.f44546b).lambda$close$56();
                return;
            case 11:
                e9 e9Var = (e9) this.f44546b;
                boolean z11 = false;
                if (e9Var.h != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !e9Var.f44185s) {
                    e9Var.f44180c = e9Var.c();
                    e9Var.d = 0.0f;
                }
                if (z10 || e9Var.f44185s || e9Var.f44181e > 1.001f) {
                    z11 = true;
                }
                l4 l4Var = e9Var.f44179b;
                float f10 = e9Var.f44180c;
                float f11 = e9Var.d;
                l4Var.f59586r = f10;
                l4Var.f59587s = f11;
                l4Var.f59588w = z11;
                l4Var.f59589x = z11;
                return;
            case 12:
                l9 l9Var = (l9) this.f44546b;
                l9Var.removeSelfFromStack();
                Runnable runnable2 = l9Var.f44543f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.x3) this.f44546b).requestLayout();
                return;
            default:
                ((va) this.f44546b).Z();
                return;
        }
    }
}
