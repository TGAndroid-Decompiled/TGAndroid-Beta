package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.h51;
public final class m implements Runnable {
    public final int f44515a;
    public final Object f44516b;

    public m(Object obj, int i7) {
        this.f44515a = i7;
        this.f44516b = obj;
    }

    private final void a() {
        i0 i0Var = (i0) this.f44516b;
        synchronized (i0Var) {
            if (i0Var.f44332a) {
                return;
            }
            i0Var.f44332a = true;
            Runnable runnable = i0Var.f44333b;
            if (runnable != null) {
                runnable.run();
                i0Var.f44333b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z10;
        switch (this.f44515a) {
            case 0:
                g0 g0Var = (g0) this.f44516b;
                synchronized (g0Var) {
                    if (!g0Var.f44248a) {
                        g0Var.f44248a = true;
                        Runnable runnable = g0Var.f44249b;
                        if (runnable != null) {
                            runnable.run();
                            g0Var.f44249b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                ((r0) this.f44516b).close();
                return;
            case 2:
                a();
                return;
            case 3:
                e1 e1Var = (e1) this.f44516b;
                e1Var.c("AUTH_CANCELED");
                e1Var.e();
                if (c8.ab.f4478b == e1Var) {
                    c8.ab.f4478b = null;
                    return;
                }
                return;
            case 4:
                ((d3) this.f44516b).dismiss();
                return;
            case 5:
                ((org.telegram.ui.Cells.v0) this.f44516b).invalidate();
                return;
            case 6:
                ((org.telegram.ui.ActionBar.j5) this.f44516b).a(true);
                return;
            case 7:
                org.telegram.messenger.g0.E2((hi.l3) this.f44516b);
                return;
            case 8:
                j6 j6Var = (j6) this.f44516b;
                bi.i6 i6Var = j6Var.f44414c;
                if (i6Var != null && i6Var.getScrollState() == 0) {
                    h51 B0 = j6Var.f44419j.B0();
                    if ((B0 == null || B0.getScrollState() == 0) && (d = j6Var.d(j6Var.f44414c.f35741f3)) != null) {
                        v4.b0 b0Var = j6Var.f44414c.f35741f3;
                        b0Var.getClass();
                        int i7 = new int[]{0, v4.o0.z(d) - b0Var.F()}[1];
                        if (i7 != 0) {
                            j6Var.f44414c.w0(0, i7, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                fi.u2 u2Var = (fi.u2) this.f44516b;
                ci.f fVar = (ci.f) u2Var.f12606b;
                ci.e eVar = (ci.e) u2Var.f12607c;
                if (eVar != null) {
                    fVar.a(eVar);
                    fVar.D = 0.0f;
                    u2Var.f12607c = null;
                    u2Var.invalidate();
                    return;
                }
                return;
            case 10:
                ((WalletEngine2) this.f44516b).lambda$close$56();
                return;
            case 11:
                e9 e9Var = (e9) this.f44516b;
                boolean z11 = false;
                if (e9Var.h != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !e9Var.f44155s) {
                    e9Var.f44150c = e9Var.c();
                    e9Var.d = 0.0f;
                }
                if (z10 || e9Var.f44155s || e9Var.f44151e > 1.001f) {
                    z11 = true;
                }
                l4 l4Var = e9Var.f44149b;
                float f10 = e9Var.f44150c;
                float f11 = e9Var.d;
                l4Var.f59555r = f10;
                l4Var.f59556s = f11;
                l4Var.f59557w = z11;
                l4Var.f59558x = z11;
                return;
            case 12:
                l9 l9Var = (l9) this.f44516b;
                l9Var.removeSelfFromStack();
                Runnable runnable2 = l9Var.f44513f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.x3) this.f44516b).requestLayout();
                return;
            default:
                ((va) this.f44516b).Z();
                return;
        }
    }
}
