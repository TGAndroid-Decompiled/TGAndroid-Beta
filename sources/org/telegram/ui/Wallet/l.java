package org.telegram.ui.Wallet;

import android.view.View;
import c8.xa;
import org.telegram.ui.Components.u41;
public final class l implements Runnable {
    public final int f44076a;
    public final Object f44077b;

    public l(Object obj, int i7) {
        this.f44076a = i7;
        this.f44077b = obj;
    }

    private final void a() {
        b0 b0Var = (b0) this.f44077b;
        synchronized (b0Var) {
            if (b0Var.f43491a) {
                return;
            }
            b0Var.f43491a = true;
            Runnable runnable = b0Var.f43492b;
            if (runnable != null) {
                runnable.run();
                b0Var.f43492b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z10;
        switch (this.f44076a) {
            case 0:
                z zVar = (z) this.f44077b;
                synchronized (zVar) {
                    if (!zVar.f44768a) {
                        zVar.f44768a = true;
                        Runnable runnable = zVar.f44769b;
                        if (runnable != null) {
                            runnable.run();
                            zVar.f44769b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((i0) this.f44077b).close();
                return;
            case 3:
                ((boolean[]) this.f44077b)[0] = true;
                return;
            case 4:
                u0 u0Var = (u0) this.f44077b;
                u0Var.c("AUTH_CANCELED");
                u0Var.e();
                if (xa.f4778b == u0Var) {
                    xa.f4778b = null;
                    return;
                }
                return;
            case 5:
                ((w2) this.f44077b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.t0) this.f44077b).invalidate();
                return;
            case 7:
                org.telegram.messenger.g0.E2((hi.l3) this.f44077b);
                return;
            case 8:
                u5 u5Var = (u5) this.f44077b;
                bi.v3 v3Var = u5Var.f44556c;
                if (v3Var != null && v3Var.getScrollState() == 0) {
                    u41 y02 = u5Var.f44561j.y0();
                    if ((y02 == null || y02.getScrollState() == 0) && (d = u5Var.d(u5Var.f44556c.f39894f3)) != null) {
                        v4.b0 b0Var = u5Var.f44556c.f39894f3;
                        b0Var.getClass();
                        int i7 = new int[]{0, v4.o0.z(d) - b0Var.F()}[1];
                        if (i7 != 0) {
                            u5Var.f44556c.w0(0, i7, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                fi.w2 w2Var = (fi.w2) this.f44077b;
                ci.f fVar = (ci.f) w2Var.f12459b;
                ci.e eVar = (ci.e) w2Var.f12460c;
                if (eVar != null) {
                    fVar.a(eVar);
                    fVar.D = 0.0f;
                    w2Var.f12460c = null;
                    w2Var.invalidate();
                    return;
                }
                return;
            case 10:
                ((WalletEngine2) this.f44077b).lambda$close$53();
                return;
            case 11:
                q8 q8Var = (q8) this.f44077b;
                boolean z11 = false;
                if (q8Var.h != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !q8Var.f44402s) {
                    q8Var.f44397c = q8Var.c();
                    q8Var.d = 0.0f;
                }
                if (z10 || q8Var.f44402s || q8Var.f44398e > 1.001f) {
                    z11 = true;
                }
                b4 b4Var = q8Var.f44396b;
                float f10 = q8Var.f44397c;
                float f11 = q8Var.d;
                b4Var.f58980r = f10;
                b4Var.f58981s = f11;
                b4Var.f58982w = z11;
                b4Var.f58983x = z11;
                return;
            case 12:
                w8 w8Var = (w8) this.f44077b;
                w8Var.removeSelfFromStack();
                Runnable runnable2 = w8Var.f44660f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.w3) this.f44077b).requestLayout();
                return;
            default:
                ((ha) this.f44077b).Z();
                return;
        }
    }
}
