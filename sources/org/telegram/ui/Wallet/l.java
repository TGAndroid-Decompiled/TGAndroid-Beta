package org.telegram.ui.Wallet;

import android.view.View;
import c8.va;
import org.telegram.ui.Components.r41;
public final class l implements Runnable {
    public final int f42678a;
    public final Object f42679b;

    public l(Object obj, int i7) {
        this.f42678a = i7;
        this.f42679b = obj;
    }

    private final void a() {
        b0 b0Var = (b0) this.f42679b;
        synchronized (b0Var) {
            if (b0Var.f42202a) {
                return;
            }
            b0Var.f42202a = true;
            Runnable runnable = b0Var.f42203b;
            if (runnable != null) {
                runnable.run();
                b0Var.f42203b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z9;
        switch (this.f42678a) {
            case 0:
                z zVar = (z) this.f42679b;
                synchronized (zVar) {
                    if (!zVar.f43397a) {
                        zVar.f43397a = true;
                        Runnable runnable = zVar.f43398b;
                        if (runnable != null) {
                            runnable.run();
                            zVar.f43398b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((i0) this.f42679b).close();
                return;
            case 3:
                ((boolean[]) this.f42679b)[0] = true;
                return;
            case 4:
                u0 u0Var = (u0) this.f42679b;
                u0Var.c("AUTH_CANCELED");
                u0Var.e();
                if (va.f5910b == u0Var) {
                    va.f5910b = null;
                    return;
                }
                return;
            case 5:
                ((x2) this.f42679b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.t0) this.f42679b).invalidate();
                return;
            case 7:
                org.telegram.messenger.g0.E2((fi.m3) this.f42679b);
                return;
            case 8:
                s5 s5Var = (s5) this.f42679b;
                fi.w3 w3Var = s5Var.f43092c;
                if (w3Var != null && w3Var.getScrollState() == 0) {
                    r41 y02 = s5Var.f43097j.y0();
                    if ((y02 == null || y02.getScrollState() == 0) && (d = s5Var.d(s5Var.f43092c.f37555e3)) != null) {
                        v4.b0 b0Var = s5Var.f43092c.f37555e3;
                        b0Var.getClass();
                        int i7 = new int[]{0, v4.n0.z(d) - b0Var.F()}[1];
                        if (i7 != 0) {
                            s5Var.f43092c.w0(0, i7, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                di.b3 b3Var = (di.b3) this.f42679b;
                ai.h hVar = (ai.h) b3Var.f8835b;
                ai.g gVar = (ai.g) b3Var.f8836c;
                if (gVar != null) {
                    hVar.a(gVar);
                    hVar.D = 0.0f;
                    b3Var.f8836c = null;
                    b3Var.invalidate();
                    return;
                }
                return;
            case 10:
                ((WalletEngine2) this.f42679b).lambda$close$53();
                return;
            case 11:
                n8 n8Var = (n8) this.f42679b;
                boolean z10 = false;
                if (n8Var.h != -1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9 && !n8Var.f42905s) {
                    n8Var.f42900c = n8Var.c();
                    n8Var.d = 0.0f;
                }
                if (z9 || n8Var.f42905s || n8Var.f42901e > 1.001f) {
                    z10 = true;
                }
                a4 a4Var = n8Var.f42899b;
                float f10 = n8Var.f42900c;
                float f11 = n8Var.d;
                a4Var.f57508r = f10;
                a4Var.f57509s = f11;
                a4Var.f57510w = z10;
                a4Var.f57511x = z10;
                return;
            case 12:
                t8 t8Var = (t8) this.f42679b;
                t8Var.removeSelfFromStack();
                Runnable runnable2 = t8Var.f43126f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.w3) this.f42679b).requestLayout();
                return;
            default:
                ((da) this.f42679b).Z();
                return;
        }
    }
}
