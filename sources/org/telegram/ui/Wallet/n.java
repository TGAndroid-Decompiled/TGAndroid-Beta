package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xc;
public final class n implements Runnable {
    public final int f34614a;
    public final Object f34615b;

    public n(Object obj, int i10) {
        this.f34614a = i10;
        this.f34615b = obj;
    }

    private final void a() {
        c0 c0Var = (c0) this.f34615b;
        synchronized (c0Var) {
            if (c0Var.f34070a) {
                return;
            }
            c0Var.f34070a = true;
            Runnable runnable = c0Var.f34071b;
            if (runnable != null) {
                runnable.run();
                c0Var.f34071b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z10;
        switch (this.f34614a) {
            case 0:
                a0 a0Var = (a0) this.f34615b;
                synchronized (a0Var) {
                    if (!a0Var.f33958a) {
                        a0Var.f33958a = true;
                        Runnable runnable = a0Var.f33959b;
                        if (runnable != null) {
                            runnable.run();
                            a0Var.f33959b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((j0) this.f34615b).close();
                return;
            case 3:
                ((boolean[]) this.f34615b)[0] = true;
                return;
            case 4:
                w0 w0Var = (w0) this.f34615b;
                w0Var.c("AUTH_CANCELED");
                w0Var.e();
                if (w7.h6.f48749b == w0Var) {
                    w7.h6.f48749b = null;
                    return;
                }
                return;
            case 5:
                ((j2) this.f34615b).dismiss();
                return;
            case 6:
                y2 y2Var = (y2) this.f34615b;
                if (!y2Var.P && !y2Var.O) {
                    hh.d.c(y2Var.E, y2Var.h);
                    y2Var.F.d();
                    y2Var.a(1.0f);
                    return;
                }
                return;
            case 7:
                ((org.telegram.ui.Cells.w0) this.f34615b).invalidate();
                return;
            case 8:
                AndroidUtilities.removeFromParent((ei.x3) this.f34615b);
                return;
            case 9:
                i5 i5Var = (i5) this.f34615b;
                u61 u61Var = i5Var.f34333c;
                if (u61Var != null && u61Var.getScrollState() == 0) {
                    a71 t02 = i5Var.f34337j.t0();
                    if ((t02 == null || t02.getScrollState() == 0) && (d = i5Var.d(i5Var.f34333c.V2)) != null) {
                        s4.b0 b0Var = i5Var.f34333c.V2;
                        b0Var.getClass();
                        int i10 = new int[]{0, s4.n0.z(d) - b0Var.F()}[1];
                        if (i10 != 0) {
                            i5Var.f34333c.v0(0, i10, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((p5) this.f34615b).performClick();
                return;
            case 11:
                ((f6) this.f34615b).performClick();
                return;
            case 12:
                ((WalletEngine2) this.f34615b).lambda$close$53();
                return;
            case 13:
                o8 o8Var = (o8) this.f34615b;
                boolean z11 = false;
                if (o8Var.h != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !o8Var.f34687s) {
                    o8Var.f34683c = o8Var.c();
                    o8Var.d = 0.0f;
                }
                if (z10 || o8Var.f34687s || o8Var.e > 1.001f) {
                    z11 = true;
                }
                k3 k3Var = o8Var.f34682b;
                float f7 = o8Var.f34683c;
                float f10 = o8Var.d;
                k3Var.f47230r = f7;
                k3Var.f47231s = f10;
                k3Var.v = z11;
                k3Var.f47232w = z11;
                return;
            case 14:
                v8 v8Var = (v8) this.f34615b;
                v8Var.removeSelfFromStack();
                Runnable runnable2 = v8Var.f35010f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 15:
                ((org.telegram.ui.Cells.t3) this.f34615b).requestLayout();
                return;
            case 16:
                xc.a0((w9) this.f34615b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            default:
                ((da) this.f34615b).U();
                return;
        }
    }
}
