package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.zc;
public final class n implements Runnable {
    public final int f33225a;
    public final Object f33226b;

    public n(Object obj, int i10) {
        this.f33225a = i10;
        this.f33226b = obj;
    }

    private final void a() {
        a0 a0Var = (a0) this.f33226b;
        synchronized (a0Var) {
            if (a0Var.f32611a) {
                return;
            }
            a0Var.f32611a = true;
            Runnable runnable = a0Var.f32612b;
            if (runnable != null) {
                runnable.run();
                a0Var.f32612b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        switch (this.f33225a) {
            case 0:
                y yVar = (y) this.f33226b;
                synchronized (yVar) {
                    if (!yVar.f33594a) {
                        yVar.f33594a = true;
                        Runnable runnable = yVar.f33595b;
                        if (runnable != null) {
                            runnable.run();
                            yVar.f33595b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((h0) this.f33226b).close();
                return;
            case 3:
                v0 v0Var = (v0) this.f33226b;
                v0Var.c("AUTH_CANCELED");
                v0Var.e();
                if (w7.h6.f47317b == v0Var) {
                    w7.h6.f47317b = null;
                    return;
                }
                return;
            case 4:
                ((i2) this.f33226b).dismiss();
                return;
            case 5:
                ((org.telegram.ui.Cells.w0) this.f33226b).invalidate();
                return;
            case 6:
                AndroidUtilities.removeFromParent((di.d4) this.f33226b);
                return;
            case 7:
                w4 w4Var = (w4) this.f33226b;
                c71 c71Var = w4Var.f33548c;
                if (c71Var != null && c71Var.getScrollState() == 0) {
                    i71 n02 = w4Var.f33552j.n0();
                    if ((n02 == null || n02.getScrollState() == 0) && (d = w4Var.d(w4Var.f33548c.V2)) != null) {
                        s4.b0 b0Var = w4Var.f33548c.V2;
                        b0Var.getClass();
                        int i10 = new int[]{0, s4.n0.z(d) - b0Var.F()}[1];
                        if (i10 != 0) {
                            w4Var.f33548c.v0(0, i10, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((d5) this.f33226b).performClick();
                return;
            case 9:
                ((q5) this.f33226b).performClick();
                return;
            case 10:
                ((WalletEngine2) this.f33226b).lambda$close$53();
                return;
            case 11:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f33226b;
                if (zc.a(m2Var)) {
                    zc.a0(m2Var).M(LocaleController.getString(R.string.WalletCreated), LocaleController.getString(R.string.WalletCreatedInfo), R.raw.contact_check).j();
                    return;
                }
                return;
            case 12:
                p7 p7Var = (p7) this.f33226b;
                p7Var.removeSelfFromStack();
                Runnable runnable2 = p7Var.f33351f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.u3) this.f33226b).requestLayout();
                return;
            case 14:
                zc.a0((s8) this.f33226b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            default:
                ((z8) this.f33226b).U();
                return;
        }
    }
}
