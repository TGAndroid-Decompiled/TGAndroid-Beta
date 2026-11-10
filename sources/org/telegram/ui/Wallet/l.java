package org.telegram.ui.Wallet;

import android.view.View;
import c8.va;
import org.telegram.ui.Components.r41;
public final class l implements Runnable {
    public final int f42747a;
    public final Object f42748b;

    public l(Object obj, int i7) {
        this.f42747a = i7;
        this.f42748b = obj;
    }

    private final void a() {
        b0 b0Var = (b0) this.f42748b;
        synchronized (b0Var) {
            if (b0Var.f42159a) {
                return;
            }
            b0Var.f42159a = true;
            Runnable runnable = b0Var.f42160b;
            if (runnable != null) {
                runnable.run();
                b0Var.f42160b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z9;
        switch (this.f42747a) {
            case 0:
                z zVar = (z) this.f42748b;
                synchronized (zVar) {
                    if (!zVar.f43404a) {
                        zVar.f43404a = true;
                        Runnable runnable = zVar.f43405b;
                        if (runnable != null) {
                            runnable.run();
                            zVar.f43405b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((i0) this.f42748b).close();
                return;
            case 3:
                ((boolean[]) this.f42748b)[0] = true;
                return;
            case 4:
                u0 u0Var = (u0) this.f42748b;
                u0Var.c("AUTH_CANCELED");
                u0Var.e();
                if (va.f5915b == u0Var) {
                    va.f5915b = null;
                    return;
                }
                return;
            case 5:
                ((x2) this.f42748b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.t0) this.f42748b).invalidate();
                return;
            case 7:
                org.telegram.messenger.g0.E2((fi.m3) this.f42748b);
                return;
            case 8:
                v5 v5Var = (v5) this.f42748b;
                fi.w3 w3Var = v5Var.f43258c;
                if (w3Var != null && w3Var.getScrollState() == 0) {
                    r41 y02 = v5Var.f43263j.y0();
                    if ((y02 == null || y02.getScrollState() == 0) && (d = v5Var.d(v5Var.f43258c.f37495e3)) != null) {
                        v4.b0 b0Var = v5Var.f43258c.f37495e3;
                        b0Var.getClass();
                        int i7 = new int[]{0, v4.n0.z(d) - b0Var.F()}[1];
                        if (i7 != 0) {
                            v5Var.f43258c.w0(0, i7, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                di.b3 b3Var = (di.b3) this.f42748b;
                ai.h hVar = (ai.h) b3Var.f8840b;
                ai.g gVar = (ai.g) b3Var.f8841c;
                if (gVar != null) {
                    hVar.a(gVar);
                    hVar.D = 0.0f;
                    b3Var.f8841c = null;
                    b3Var.invalidate();
                    return;
                }
                return;
            case 10:
                ((WalletEngine2) this.f42748b).lambda$close$53();
                return;
            case 11:
                q8 q8Var = (q8) this.f42748b;
                boolean z10 = false;
                if (q8Var.h != -1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9 && !q8Var.f43081s) {
                    q8Var.f43076c = q8Var.c();
                    q8Var.d = 0.0f;
                }
                if (z9 || q8Var.f43081s || q8Var.f43077e > 1.001f) {
                    z10 = true;
                }
                c4 c4Var = q8Var.f43075b;
                float f10 = q8Var.f43076c;
                float f11 = q8Var.d;
                c4Var.f57504r = f10;
                c4Var.f57505s = f11;
                c4Var.f57506w = z10;
                c4Var.f57507x = z10;
                return;
            case 12:
                w8 w8Var = (w8) this.f42748b;
                w8Var.removeSelfFromStack();
                Runnable runnable2 = w8Var.f43306f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.w3) this.f42748b).requestLayout();
                return;
            default:
                ((ga) this.f42748b).Z();
                return;
        }
    }
}
