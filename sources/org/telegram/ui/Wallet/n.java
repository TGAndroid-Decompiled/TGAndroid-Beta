package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xc;
public final class n implements Runnable {
    public final int f34620a;
    public final Object f34621b;

    public n(Object obj, int i10) {
        this.f34620a = i10;
        this.f34621b = obj;
    }

    private final void a() {
        c0 c0Var = (c0) this.f34621b;
        synchronized (c0Var) {
            if (c0Var.f34062a) {
                return;
            }
            c0Var.f34062a = true;
            Runnable runnable = c0Var.f34063b;
            if (runnable != null) {
                runnable.run();
                c0Var.f34063b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z10;
        switch (this.f34620a) {
            case 0:
                a0 a0Var = (a0) this.f34621b;
                synchronized (a0Var) {
                    if (!a0Var.f33951a) {
                        a0Var.f33951a = true;
                        Runnable runnable = a0Var.f33952b;
                        if (runnable != null) {
                            runnable.run();
                            a0Var.f33952b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((j0) this.f34621b).close();
                return;
            case 3:
                ((boolean[]) this.f34621b)[0] = true;
                return;
            case 4:
                w0 w0Var = (w0) this.f34621b;
                w0Var.c("AUTH_CANCELED");
                w0Var.e();
                if (w7.h6.f48724b == w0Var) {
                    w7.h6.f48724b = null;
                    return;
                }
                return;
            case 5:
                ((j2) this.f34621b).dismiss();
                return;
            case 6:
                x2 x2Var = (x2) this.f34621b;
                if (!x2Var.N && !x2Var.M) {
                    hh.d.c(x2Var.f35125x, x2Var.f35120f);
                    x2Var.f35126y.d();
                    x2Var.a(1.0f);
                    return;
                }
                return;
            case 7:
                ((org.telegram.ui.Cells.x0) this.f34621b).invalidate();
                return;
            case 8:
                AndroidUtilities.removeFromParent((ei.x3) this.f34621b);
                return;
            case 9:
                h5 h5Var = (h5) this.f34621b;
                u61 u61Var = h5Var.f34262c;
                if (u61Var != null && u61Var.getScrollState() == 0) {
                    a71 t02 = h5Var.f34266j.t0();
                    if ((t02 == null || t02.getScrollState() == 0) && (d = h5Var.d(h5Var.f34262c.V2)) != null) {
                        s4.b0 b0Var = h5Var.f34262c.V2;
                        b0Var.getClass();
                        int i10 = new int[]{0, s4.n0.z(d) - b0Var.F()}[1];
                        if (i10 != 0) {
                            h5Var.f34262c.v0(0, i10, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((o5) this.f34621b).performClick();
                return;
            case 11:
                ((c6) this.f34621b).performClick();
                return;
            case 12:
                ((WalletEngine2) this.f34621b).lambda$close$53();
                return;
            case 13:
                l8 l8Var = (l8) this.f34621b;
                boolean z11 = false;
                if (l8Var.h != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !l8Var.f34522s) {
                    l8Var.f34518c = l8Var.c();
                    l8Var.d = 0.0f;
                }
                if (z10 || l8Var.f34522s || l8Var.e > 1.001f) {
                    z11 = true;
                }
                j3 j3Var = l8Var.f34517b;
                float f7 = l8Var.f34518c;
                float f10 = l8Var.d;
                j3Var.f47205r = f7;
                j3Var.f47206s = f10;
                j3Var.v = z11;
                j3Var.f47207w = z11;
                return;
            case 14:
                s8 s8Var = (s8) this.f34621b;
                s8Var.removeSelfFromStack();
                Runnable runnable2 = s8Var.f34880f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 15:
                ((org.telegram.ui.Cells.t3) this.f34621b).requestLayout();
                return;
            case 16:
                xc.a0((t9) this.f34621b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            default:
                ((aa) this.f34621b).U();
                return;
        }
    }
}
