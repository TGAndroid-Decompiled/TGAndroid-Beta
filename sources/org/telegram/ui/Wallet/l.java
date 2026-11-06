package org.telegram.ui.Wallet;

import android.view.View;
import c8.va;
import org.telegram.ui.Components.q41;
public final class l implements Runnable {
    public final int f42718a;
    public final Object f42719b;

    public l(Object obj, int i7) {
        this.f42718a = i7;
        this.f42719b = obj;
    }

    private final void a() {
        d0 d0Var = (d0) this.f42719b;
        synchronized (d0Var) {
            if (d0Var.f42317a) {
                return;
            }
            d0Var.f42317a = true;
            Runnable runnable = d0Var.f42318b;
            if (runnable != null) {
                runnable.run();
                d0Var.f42318b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z9;
        switch (this.f42718a) {
            case 0:
                b0 b0Var = (b0) this.f42719b;
                synchronized (b0Var) {
                    if (!b0Var.f42113a) {
                        b0Var.f42113a = true;
                        Runnable runnable = b0Var.f42114b;
                        if (runnable != null) {
                            runnable.run();
                            b0Var.f42114b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((k0) this.f42719b).close();
                return;
            case 3:
                ((boolean[]) this.f42719b)[0] = true;
                return;
            case 4:
                w0 w0Var = (w0) this.f42719b;
                w0Var.c("AUTH_CANCELED");
                w0Var.e();
                if (va.f5912b == w0Var) {
                    va.f5912b = null;
                    return;
                }
                return;
            case 5:
                ((z2) this.f42719b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.t0) this.f42719b).invalidate();
                return;
            case 7:
                org.telegram.messenger.g0.E2((fi.m3) this.f42719b);
                return;
            case 8:
                u5 u5Var = (u5) this.f42719b;
                fi.w3 w3Var = u5Var.f43205c;
                if (w3Var != null && w3Var.getScrollState() == 0) {
                    q41 y02 = u5Var.f43210j.y0();
                    if ((y02 == null || y02.getScrollState() == 0) && (d = u5Var.d(u5Var.f43205c.f37159e3)) != null) {
                        v4.b0 b0Var2 = u5Var.f43205c.f37159e3;
                        b0Var2.getClass();
                        int i7 = new int[]{0, v4.n0.z(d) - b0Var2.F()}[1];
                        if (i7 != 0) {
                            u5Var.f43205c.w0(0, i7, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                di.b3 b3Var = (di.b3) this.f42719b;
                ai.h hVar = (ai.h) b3Var.f8841b;
                ai.g gVar = (ai.g) b3Var.f8842c;
                if (gVar != null) {
                    hVar.a(gVar);
                    hVar.D = 0.0f;
                    b3Var.f8842c = null;
                    b3Var.invalidate();
                    return;
                }
                return;
            case 10:
                ((WalletEngine2) this.f42719b).lambda$close$53();
                return;
            case 11:
                p8 p8Var = (p8) this.f42719b;
                boolean z10 = false;
                if (p8Var.h != -1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9 && !p8Var.f43025s) {
                    p8Var.f43020c = p8Var.c();
                    p8Var.d = 0.0f;
                }
                if (z9 || p8Var.f43025s || p8Var.f43021e > 1.001f) {
                    z10 = true;
                }
                c4 c4Var = p8Var.f43019b;
                float f10 = p8Var.f43020c;
                float f11 = p8Var.d;
                c4Var.f57403r = f10;
                c4Var.f57404s = f11;
                c4Var.f57405w = z10;
                c4Var.f57406x = z10;
                return;
            case 12:
                v8 v8Var = (v8) this.f42719b;
                v8Var.removeSelfFromStack();
                Runnable runnable2 = v8Var.f43242f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.w3) this.f42719b).requestLayout();
                return;
            default:
                ((fa) this.f42719b).Z();
                return;
        }
    }
}
