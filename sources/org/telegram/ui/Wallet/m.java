package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.i71;
public final class m implements Runnable {
    public final int f34793a;
    public final Object f34794b;

    public m(Object obj, int i10) {
        this.f34793a = i10;
        this.f34794b = obj;
    }

    private final void a() {
        b0 b0Var = (b0) this.f34794b;
        synchronized (b0Var) {
            if (b0Var.f34317a) {
                return;
            }
            b0Var.f34317a = true;
            Runnable runnable = b0Var.f34318b;
            if (runnable != null) {
                runnable.run();
                b0Var.f34318b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z10;
        switch (this.f34793a) {
            case 0:
                z zVar = (z) this.f34794b;
                synchronized (zVar) {
                    if (!zVar.f35466a) {
                        zVar.f35466a = true;
                        Runnable runnable = zVar.f35467b;
                        if (runnable != null) {
                            runnable.run();
                            zVar.f35467b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((i0) this.f34794b).close();
                return;
            case 3:
                ((boolean[]) this.f34794b)[0] = true;
                return;
            case 4:
                v0 v0Var = (v0) this.f34794b;
                v0Var.c("AUTH_CANCELED");
                v0Var.e();
                if (w7.h6.f49150b == v0Var) {
                    w7.h6.f49150b = null;
                    return;
                }
                return;
            case 5:
                ((i2) this.f34794b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.v0) this.f34794b).invalidate();
                return;
            case 7:
                AndroidUtilities.removeFromParent((ei.x3) this.f34794b);
                return;
            case 8:
                k5 k5Var = (k5) this.f34794b;
                c71 c71Var = k5Var.f34712c;
                if (c71Var != null && c71Var.getScrollState() == 0) {
                    i71 t02 = k5Var.f34716j.t0();
                    if ((t02 == null || t02.getScrollState() == 0) && (d = k5Var.d(k5Var.f34712c.Y2)) != null) {
                        s4.b0 b0Var = k5Var.f34712c.Y2;
                        b0Var.getClass();
                        int i10 = new int[]{0, s4.n0.z(d) - b0Var.F()}[1];
                        if (i10 != 0) {
                            k5Var.f34712c.v0(0, i10, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ci.h3 h3Var = (ci.h3) this.f34794b;
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
                ((WalletEngine2) this.f34794b).lambda$close$53();
                return;
            case 11:
                j8 j8Var = (j8) this.f34794b;
                boolean z11 = false;
                if (j8Var.h != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !j8Var.f34657s) {
                    j8Var.f34653c = j8Var.c();
                    j8Var.d = 0.0f;
                }
                if (z10 || j8Var.f34657s || j8Var.e > 1.001f) {
                    z11 = true;
                }
                l3 l3Var = j8Var.f34652b;
                float f7 = j8Var.f34653c;
                float f10 = j8Var.d;
                l3Var.f47627r = f7;
                l3Var.f47628s = f10;
                l3Var.v = z11;
                l3Var.f47629w = z11;
                return;
            case 12:
                q8 q8Var = (q8) this.f34794b;
                q8Var.removeSelfFromStack();
                Runnable runnable2 = q8Var.f35084f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.t3) this.f34794b).requestLayout();
                return;
            default:
                ((aa) this.f34794b).U();
                return;
        }
    }
}
