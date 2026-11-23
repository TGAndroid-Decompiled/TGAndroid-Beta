package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.g51;
public final class m implements Runnable {
    public final int f44627a;
    public final Object f44628b;

    public m(Object obj, int i7) {
        this.f44627a = i7;
        this.f44628b = obj;
    }

    private final void a() {
        j0 j0Var = (j0) this.f44628b;
        synchronized (j0Var) {
            if (j0Var.f44494a) {
                return;
            }
            j0Var.f44494a = true;
            Runnable runnable = j0Var.f44495b;
            if (runnable != null) {
                runnable.run();
                j0Var.f44495b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z10;
        switch (this.f44627a) {
            case 0:
                h0 h0Var = (h0) this.f44628b;
                synchronized (h0Var) {
                    if (!h0Var.f44410a) {
                        h0Var.f44410a = true;
                        Runnable runnable = h0Var.f44411b;
                        if (runnable != null) {
                            runnable.run();
                            h0Var.f44411b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                ((s0) this.f44628b).close();
                return;
            case 2:
                a();
                return;
            case 3:
                f1 f1Var = (f1) this.f44628b;
                f1Var.c("AUTH_CANCELED");
                f1Var.e();
                if (c8.ab.f4478b == f1Var) {
                    c8.ab.f4478b = null;
                    return;
                }
                return;
            case 4:
                ((e3) this.f44628b).dismiss();
                return;
            case 5:
                ((org.telegram.ui.Cells.v0) this.f44628b).invalidate();
                return;
            case 6:
                ((org.telegram.ui.ActionBar.k5) this.f44628b).a(true);
                return;
            case 7:
                org.telegram.messenger.g0.E2((hi.u3) this.f44628b);
                return;
            case 8:
                k6 k6Var = (k6) this.f44628b;
                bi.i6 i6Var = k6Var.f44575c;
                if (i6Var != null && i6Var.getScrollState() == 0) {
                    g51 B0 = k6Var.f44580j.B0();
                    if ((B0 == null || B0.getScrollState() == 0) && (d = k6Var.d(k6Var.f44575c.f35322f3)) != null) {
                        v4.c0 c0Var = k6Var.f44575c.f35322f3;
                        c0Var.getClass();
                        int i7 = new int[]{0, v4.p0.z(d) - c0Var.F()}[1];
                        if (i7 != 0) {
                            k6Var.f44575c.w0(0, i7, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                fi.u2 u2Var = (fi.u2) this.f44628b;
                ci.f fVar = (ci.f) u2Var.f12615b;
                ci.e eVar = (ci.e) u2Var.f12616c;
                if (eVar != null) {
                    fVar.a(eVar);
                    fVar.D = 0.0f;
                    u2Var.f12616c = null;
                    u2Var.invalidate();
                    return;
                }
                return;
            case 10:
                ((WalletEngine2) this.f44628b).lambda$close$56();
                return;
            case 11:
                f9 f9Var = (f9) this.f44628b;
                boolean z11 = false;
                if (f9Var.h != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !f9Var.f44318s) {
                    f9Var.f44313c = f9Var.c();
                    f9Var.d = 0.0f;
                }
                if (z10 || f9Var.f44318s || f9Var.f44314e > 1.001f) {
                    z11 = true;
                }
                m4 m4Var = f9Var.f44312b;
                float f10 = f9Var.f44313c;
                float f11 = f9Var.d;
                m4Var.f59675r = f10;
                m4Var.f59676s = f11;
                m4Var.f59677w = z11;
                m4Var.f59678x = z11;
                return;
            case 12:
                m9 m9Var = (m9) this.f44628b;
                m9Var.removeSelfFromStack();
                Runnable runnable2 = m9Var.f44674f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.x3) this.f44628b).requestLayout();
                return;
            default:
                ((wa) this.f44628b).Z();
                return;
        }
    }
}
