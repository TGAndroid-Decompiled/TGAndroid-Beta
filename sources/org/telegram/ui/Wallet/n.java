package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.w61;
public final class n implements Runnable {
    public final int f34546a;
    public final Object f34547b;

    public n(Object obj, int i10) {
        this.f34546a = i10;
        this.f34547b = obj;
    }

    private final void a() {
        c0 c0Var = (c0) this.f34547b;
        synchronized (c0Var) {
            if (c0Var.f34063a) {
                return;
            }
            c0Var.f34063a = true;
            Runnable runnable = c0Var.f34064b;
            if (runnable != null) {
                runnable.run();
                c0Var.f34064b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z10;
        switch (this.f34546a) {
            case 0:
                a0 a0Var = (a0) this.f34547b;
                synchronized (a0Var) {
                    if (!a0Var.f33970a) {
                        a0Var.f33970a = true;
                        Runnable runnable = a0Var.f33971b;
                        if (runnable != null) {
                            runnable.run();
                            a0Var.f33971b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((j0) this.f34547b).close();
                return;
            case 3:
                ((boolean[]) this.f34547b)[0] = true;
                return;
            case 4:
                w0 w0Var = (w0) this.f34547b;
                w0Var.c("AUTH_CANCELED");
                w0Var.e();
                if (w7.h6.f48713b == w0Var) {
                    w7.h6.f48713b = null;
                    return;
                }
                return;
            case 5:
                ((j2) this.f34547b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.w0) this.f34547b).invalidate();
                return;
            case 7:
                AndroidUtilities.removeFromParent((ei.x3) this.f34547b);
                return;
            case 8:
                k5 k5Var = (k5) this.f34547b;
                w61 w61Var = k5Var.f34430c;
                if (w61Var != null && w61Var.getScrollState() == 0) {
                    c71 t02 = k5Var.f34434j.t0();
                    if ((t02 == null || t02.getScrollState() == 0) && (d = k5Var.d(k5Var.f34430c.V2)) != null) {
                        s4.b0 b0Var = k5Var.f34430c.V2;
                        b0Var.getClass();
                        int i10 = new int[]{0, s4.n0.z(d) - b0Var.F()}[1];
                        if (i10 != 0) {
                            k5Var.f34430c.v0(0, i10, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ci.i3 i3Var = (ci.i3) this.f34547b;
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
                ((WalletEngine2) this.f34547b).lambda$close$53();
                return;
            case 11:
                i8 i8Var = (i8) this.f34547b;
                boolean z11 = false;
                if (i8Var.h != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !i8Var.f34347s) {
                    i8Var.f34343c = i8Var.c();
                    i8Var.d = 0.0f;
                }
                if (z10 || i8Var.f34347s || i8Var.e > 1.001f) {
                    z11 = true;
                }
                m3 m3Var = i8Var.f34342b;
                float f7 = i8Var.f34343c;
                float f10 = i8Var.d;
                m3Var.f47193r = f7;
                m3Var.f47194s = f10;
                m3Var.v = z11;
                m3Var.f47195w = z11;
                return;
            case 12:
                p8 p8Var = (p8) this.f34547b;
                p8Var.removeSelfFromStack();
                Runnable runnable2 = p8Var.f34750f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.t3) this.f34547b).requestLayout();
                return;
            default:
                ((z9) this.f34547b).U();
                return;
        }
    }
}
