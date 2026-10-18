package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xc;
public final class n implements Runnable {
    public final int f34560a;
    public final Object f34561b;

    public n(Object obj, int i10) {
        this.f34560a = i10;
        this.f34561b = obj;
    }

    private final void a() {
        c0 c0Var = (c0) this.f34561b;
        synchronized (c0Var) {
            if (c0Var.f34031a) {
                return;
            }
            c0Var.f34031a = true;
            Runnable runnable = c0Var.f34032b;
            if (runnable != null) {
                runnable.run();
                c0Var.f34032b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z10;
        switch (this.f34560a) {
            case 0:
                a0 a0Var = (a0) this.f34561b;
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
                ((j0) this.f34561b).close();
                return;
            case 3:
                ((boolean[]) this.f34561b)[0] = true;
                return;
            case 4:
                w0 w0Var = (w0) this.f34561b;
                w0Var.c("AUTH_CANCELED");
                w0Var.e();
                if (w7.h6.f48702b == w0Var) {
                    w7.h6.f48702b = null;
                    return;
                }
                return;
            case 5:
                ((j2) this.f34561b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.w0) this.f34561b).invalidate();
                return;
            case 7:
                AndroidUtilities.removeFromParent((ei.x3) this.f34561b);
                return;
            case 8:
                j5 j5Var = (j5) this.f34561b;
                u61 u61Var = j5Var.f34357c;
                if (u61Var != null && u61Var.getScrollState() == 0) {
                    a71 u02 = j5Var.f34361j.u0();
                    if ((u02 == null || u02.getScrollState() == 0) && (d = j5Var.d(j5Var.f34357c.V2)) != null) {
                        s4.b0 b0Var = j5Var.f34357c.V2;
                        b0Var.getClass();
                        int i10 = new int[]{0, s4.n0.z(d) - b0Var.F()}[1];
                        if (i10 != 0) {
                            j5Var.f34357c.v0(0, i10, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((WalletEngine2) this.f34561b).lambda$close$53();
                return;
            case 10:
                i8 i8Var = (i8) this.f34561b;
                boolean z11 = false;
                if (i8Var.h != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !i8Var.f34315s) {
                    i8Var.f34311c = i8Var.c();
                    i8Var.d = 0.0f;
                }
                if (z10 || i8Var.f34315s || i8Var.e > 1.001f) {
                    z11 = true;
                }
                l3 l3Var = i8Var.f34310b;
                float f7 = i8Var.f34311c;
                float f10 = i8Var.d;
                l3Var.f47180r = f7;
                l3Var.f47181s = f10;
                l3Var.v = z11;
                l3Var.f47182w = z11;
                return;
            case 11:
                p8 p8Var = (p8) this.f34561b;
                p8Var.removeSelfFromStack();
                Runnable runnable2 = p8Var.f34718f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Cells.t3) this.f34561b).requestLayout();
                return;
            case 13:
                xc.a0((r9) this.f34561b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            default:
                ((y9) this.f34561b).U();
                return;
        }
    }
}
