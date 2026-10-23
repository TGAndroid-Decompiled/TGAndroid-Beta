package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.j71;
public final class m implements Runnable {
    public final int f34791a;
    public final Object f34792b;

    public m(Object obj, int i10) {
        this.f34791a = i10;
        this.f34792b = obj;
    }

    private final void a() {
        b0 b0Var = (b0) this.f34792b;
        synchronized (b0Var) {
            if (b0Var.f34315a) {
                return;
            }
            b0Var.f34315a = true;
            Runnable runnable = b0Var.f34316b;
            if (runnable != null) {
                runnable.run();
                b0Var.f34316b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z10;
        switch (this.f34791a) {
            case 0:
                z zVar = (z) this.f34792b;
                synchronized (zVar) {
                    if (!zVar.f35464a) {
                        zVar.f35464a = true;
                        Runnable runnable = zVar.f35465b;
                        if (runnable != null) {
                            runnable.run();
                            zVar.f35465b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((i0) this.f34792b).close();
                return;
            case 3:
                ((boolean[]) this.f34792b)[0] = true;
                return;
            case 4:
                v0 v0Var = (v0) this.f34792b;
                v0Var.c("AUTH_CANCELED");
                v0Var.e();
                if (w7.h6.f49151b == v0Var) {
                    w7.h6.f49151b = null;
                    return;
                }
                return;
            case 5:
                ((i2) this.f34792b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.v0) this.f34792b).invalidate();
                return;
            case 7:
                AndroidUtilities.removeFromParent((ei.x3) this.f34792b);
                return;
            case 8:
                k5 k5Var = (k5) this.f34792b;
                d71 d71Var = k5Var.f34710c;
                if (d71Var != null && d71Var.getScrollState() == 0) {
                    j71 t02 = k5Var.f34714j.t0();
                    if ((t02 == null || t02.getScrollState() == 0) && (d = k5Var.d(k5Var.f34710c.Y2)) != null) {
                        s4.b0 b0Var = k5Var.f34710c.Y2;
                        b0Var.getClass();
                        int i10 = new int[]{0, s4.n0.z(d) - b0Var.F()}[1];
                        if (i10 != 0) {
                            k5Var.f34710c.v0(0, i10, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ci.h3 h3Var = (ci.h3) this.f34792b;
                zh.f fVar = (zh.f) h3Var.f5393b;
                zh.e eVar = (zh.e) h3Var.f5394c;
                if (eVar != null) {
                    fVar.a(eVar);
                    fVar.D = 0.0f;
                    h3Var.f5394c = null;
                    h3Var.invalidate();
                    return;
                }
                return;
            case 10:
                ((WalletEngine2) this.f34792b).lambda$close$53();
                return;
            case 11:
                j8 j8Var = (j8) this.f34792b;
                boolean z11 = false;
                if (j8Var.h != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !j8Var.f34655s) {
                    j8Var.f34651c = j8Var.c();
                    j8Var.d = 0.0f;
                }
                if (z10 || j8Var.f34655s || j8Var.e > 1.001f) {
                    z11 = true;
                }
                l3 l3Var = j8Var.f34650b;
                float f7 = j8Var.f34651c;
                float f10 = j8Var.d;
                l3Var.f47628r = f7;
                l3Var.f47629s = f10;
                l3Var.v = z11;
                l3Var.f47630w = z11;
                return;
            case 12:
                q8 q8Var = (q8) this.f34792b;
                q8Var.removeSelfFromStack();
                Runnable runnable2 = q8Var.f35082f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.t3) this.f34792b).requestLayout();
                return;
            default:
                ((aa) this.f34792b).U();
                return;
        }
    }
}
