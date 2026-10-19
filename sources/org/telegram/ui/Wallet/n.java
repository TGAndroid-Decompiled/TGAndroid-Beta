package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.v61;
public final class n implements Runnable {
    public final int f34535a;
    public final Object f34536b;

    public n(Object obj, int i10) {
        this.f34535a = i10;
        this.f34536b = obj;
    }

    private final void a() {
        c0 c0Var = (c0) this.f34536b;
        synchronized (c0Var) {
            if (c0Var.f34052a) {
                return;
            }
            c0Var.f34052a = true;
            Runnable runnable = c0Var.f34053b;
            if (runnable != null) {
                runnable.run();
                c0Var.f34053b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z10;
        switch (this.f34535a) {
            case 0:
                a0 a0Var = (a0) this.f34536b;
                synchronized (a0Var) {
                    if (!a0Var.f33959a) {
                        a0Var.f33959a = true;
                        Runnable runnable = a0Var.f33960b;
                        if (runnable != null) {
                            runnable.run();
                            a0Var.f33960b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((j0) this.f34536b).close();
                return;
            case 3:
                ((boolean[]) this.f34536b)[0] = true;
                return;
            case 4:
                w0 w0Var = (w0) this.f34536b;
                w0Var.c("AUTH_CANCELED");
                w0Var.e();
                if (w7.h6.f48704b == w0Var) {
                    w7.h6.f48704b = null;
                    return;
                }
                return;
            case 5:
                ((j2) this.f34536b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.w0) this.f34536b).invalidate();
                return;
            case 7:
                AndroidUtilities.removeFromParent((ei.x3) this.f34536b);
                return;
            case 8:
                k5 k5Var = (k5) this.f34536b;
                v61 v61Var = k5Var.f34419c;
                if (v61Var != null && v61Var.getScrollState() == 0) {
                    b71 t02 = k5Var.f34423j.t0();
                    if ((t02 == null || t02.getScrollState() == 0) && (d = k5Var.d(k5Var.f34419c.V2)) != null) {
                        s4.b0 b0Var = k5Var.f34419c.V2;
                        b0Var.getClass();
                        int i10 = new int[]{0, s4.n0.z(d) - b0Var.F()}[1];
                        if (i10 != 0) {
                            k5Var.f34419c.v0(0, i10, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ci.i3 i3Var = (ci.i3) this.f34536b;
                zh.f fVar = (zh.f) i3Var.f5485b;
                zh.e eVar = (zh.e) i3Var.f5486c;
                if (eVar != null) {
                    fVar.a(eVar);
                    fVar.D = 0.0f;
                    i3Var.f5486c = null;
                    i3Var.invalidate();
                    return;
                }
                return;
            case 10:
                ((WalletEngine2) this.f34536b).lambda$close$53();
                return;
            case 11:
                i8 i8Var = (i8) this.f34536b;
                boolean z11 = false;
                if (i8Var.h != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !i8Var.f34336s) {
                    i8Var.f34332c = i8Var.c();
                    i8Var.d = 0.0f;
                }
                if (z10 || i8Var.f34336s || i8Var.e > 1.001f) {
                    z11 = true;
                }
                m3 m3Var = i8Var.f34331b;
                float f7 = i8Var.f34332c;
                float f10 = i8Var.d;
                m3Var.f47184r = f7;
                m3Var.f47185s = f10;
                m3Var.v = z11;
                m3Var.f47186w = z11;
                return;
            case 12:
                p8 p8Var = (p8) this.f34536b;
                p8Var.removeSelfFromStack();
                Runnable runnable2 = p8Var.f34739f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.t3) this.f34536b).requestLayout();
                return;
            default:
                ((z9) this.f34536b).U();
                return;
        }
    }
}
