package org.telegram.ui.Wallet;

import android.view.View;
import c8.va;
import org.telegram.ui.Components.q41;
public final class l implements Runnable {
    public final int f42722a;
    public final Object f42723b;

    public l(Object obj, int i7) {
        this.f42722a = i7;
        this.f42723b = obj;
    }

    private final void a() {
        c0 c0Var = (c0) this.f42723b;
        synchronized (c0Var) {
            if (c0Var.f42288a) {
                return;
            }
            c0Var.f42288a = true;
            Runnable runnable = c0Var.f42289b;
            if (runnable != null) {
                runnable.run();
                c0Var.f42289b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z9;
        switch (this.f42722a) {
            case 0:
                a0 a0Var = (a0) this.f42723b;
                synchronized (a0Var) {
                    if (!a0Var.f42085a) {
                        a0Var.f42085a = true;
                        Runnable runnable = a0Var.f42086b;
                        if (runnable != null) {
                            runnable.run();
                            a0Var.f42086b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((j0) this.f42723b).close();
                return;
            case 3:
                ((boolean[]) this.f42723b)[0] = true;
                return;
            case 4:
                v0 v0Var = (v0) this.f42723b;
                v0Var.c("AUTH_CANCELED");
                v0Var.e();
                if (va.f5912b == v0Var) {
                    va.f5912b = null;
                    return;
                }
                return;
            case 5:
                ((y2) this.f42723b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.t0) this.f42723b).invalidate();
                return;
            case 7:
                org.telegram.messenger.g0.E2((fi.m3) this.f42723b);
                return;
            case 8:
                t5 t5Var = (t5) this.f42723b;
                fi.w3 w3Var = t5Var.f43174c;
                if (w3Var != null && w3Var.getScrollState() == 0) {
                    q41 y02 = t5Var.f43179j.y0();
                    if ((y02 == null || y02.getScrollState() == 0) && (d = t5Var.d(t5Var.f43174c.f37189e3)) != null) {
                        v4.b0 b0Var = t5Var.f43174c.f37189e3;
                        b0Var.getClass();
                        int i7 = new int[]{0, v4.n0.z(d) - b0Var.F()}[1];
                        if (i7 != 0) {
                            t5Var.f43174c.w0(0, i7, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                di.b3 b3Var = (di.b3) this.f42723b;
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
                ((WalletEngine2) this.f42723b).lambda$close$53();
                return;
            case 11:
                o8 o8Var = (o8) this.f42723b;
                boolean z10 = false;
                if (o8Var.h != -1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9 && !o8Var.f42987s) {
                    o8Var.f42982c = o8Var.c();
                    o8Var.d = 0.0f;
                }
                if (z9 || o8Var.f42987s || o8Var.f42983e > 1.001f) {
                    z10 = true;
                }
                b4 b4Var = o8Var.f42981b;
                float f10 = o8Var.f42982c;
                float f11 = o8Var.d;
                b4Var.f57495r = f10;
                b4Var.f57496s = f11;
                b4Var.f57497w = z10;
                b4Var.f57498x = z10;
                return;
            case 12:
                u8 u8Var = (u8) this.f42723b;
                u8Var.removeSelfFromStack();
                Runnable runnable2 = u8Var.f43208f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.w3) this.f42723b).requestLayout();
                return;
            default:
                ((ea) this.f42723b).Z();
                return;
        }
    }
}
