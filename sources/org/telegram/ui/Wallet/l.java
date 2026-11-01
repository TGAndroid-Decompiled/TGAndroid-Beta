package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.v51;
public final class l implements Runnable {
    public final int f34832a;
    public final Object f34833b;

    public l(Object obj, int i10) {
        this.f34832a = i10;
        this.f34833b = obj;
    }

    private final void a() {
        a0 a0Var = (a0) this.f34833b;
        synchronized (a0Var) {
            if (a0Var.f34163a) {
                return;
            }
            a0Var.f34163a = true;
            Runnable runnable = a0Var.f34164b;
            if (runnable != null) {
                runnable.run();
                a0Var.f34164b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z10;
        switch (this.f34832a) {
            case 0:
                y yVar = (y) this.f34833b;
                synchronized (yVar) {
                    if (!yVar.f35402a) {
                        yVar.f35402a = true;
                        Runnable runnable = yVar.f35403b;
                        if (runnable != null) {
                            runnable.run();
                            yVar.f35403b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((h0) this.f34833b).close();
                return;
            case 3:
                ((boolean[]) this.f34833b)[0] = true;
                return;
            case 4:
                u0 u0Var = (u0) this.f34833b;
                u0Var.c("AUTH_CANCELED");
                u0Var.e();
                if (w7.k6.f52636b == u0Var) {
                    w7.k6.f52636b = null;
                    return;
                }
                return;
            case 5:
                ((z2) this.f34833b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.s0) this.f34833b).invalidate();
                return;
            case 7:
                org.telegram.messenger.i0.E2((vh.p2) this.f34833b);
                return;
            case 8:
                x5 x5Var = (x5) this.f34833b;
                ii iiVar = x5Var.f35390c;
                if (iiVar != null && iiVar.getScrollState() == 0) {
                    v51 y02 = x5Var.f35394j.y0();
                    if ((y02 == null || y02.getScrollState() == 0) && (d = x5Var.d(x5Var.f35390c.f31182e3)) != null) {
                        s4.a0 a0Var = x5Var.f35390c.f31182e3;
                        a0Var.getClass();
                        int i10 = new int[]{0, s4.n0.z(d) - a0Var.F()}[1];
                        if (i10 != 0) {
                            x5Var.f35390c.w0(0, i10, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ih.c cVar = (ih.c) this.f34833b;
                qh.g gVar = (qh.g) cVar.f8522b;
                qh.f fVar = (qh.f) cVar.f8523c;
                if (fVar != null) {
                    gVar.a(fVar);
                    gVar.D = 0.0f;
                    cVar.f8523c = null;
                    cVar.invalidate();
                    return;
                }
                return;
            case 10:
                ((WalletEngine2) this.f34833b).lambda$close$53();
                return;
            case 11:
                u8 u8Var = (u8) this.f34833b;
                boolean z11 = false;
                if (u8Var.h != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !u8Var.f35293s) {
                    u8Var.f35289c = u8Var.c();
                    u8Var.d = 0.0f;
                }
                if (z10 || u8Var.f35293s || u8Var.e > 1.001f) {
                    z11 = true;
                }
                c4 c4Var = u8Var.f35288b;
                float f7 = u8Var.f35289c;
                float f10 = u8Var.d;
                c4Var.f12001r = f7;
                c4Var.f12002s = f10;
                c4Var.f12003w = z11;
                c4Var.f12004x = z11;
                return;
            case 12:
                a9 a9Var = (a9) this.f34833b;
                a9Var.removeSelfFromStack();
                Runnable runnable2 = a9Var.f34217f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.y3) this.f34833b).requestLayout();
                return;
            default:
                ((ja) this.f34833b).Z();
                return;
        }
    }
}
