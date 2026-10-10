package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.l71;
public final class n implements Runnable {
    public final int f35312a;
    public final Object f35313b;

    public n(Object obj, int i10) {
        this.f35312a = i10;
        this.f35313b = obj;
    }

    private final void a() {
        a0 a0Var = (a0) this.f35313b;
        synchronized (a0Var) {
            if (a0Var.f34641a) {
                return;
            }
            a0Var.f34641a = true;
            Runnable runnable = a0Var.f34642b;
            if (runnable != null) {
                runnable.run();
                a0Var.f34642b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        switch (this.f35312a) {
            case 0:
                y yVar = (y) this.f35313b;
                synchronized (yVar) {
                    if (!yVar.f35729a) {
                        yVar.f35729a = true;
                        Runnable runnable = yVar.f35730b;
                        if (runnable != null) {
                            runnable.run();
                            yVar.f35730b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((h0) this.f35313b).close();
                return;
            case 3:
                v0 v0Var = (v0) this.f35313b;
                v0Var.c("AUTH_CANCELED");
                v0Var.e();
                if (w7.f6.f49997b == v0Var) {
                    w7.f6.f49997b = null;
                    return;
                }
                return;
            case 4:
                ((i2) this.f35313b).dismiss();
                return;
            case 5:
                ((org.telegram.ui.Cells.w0) this.f35313b).invalidate();
                return;
            case 6:
                AndroidUtilities.removeFromParent((ci.d4) this.f35313b);
                return;
            case 7:
                w4 w4Var = (w4) this.f35313b;
                f71 f71Var = w4Var.f35662c;
                if (f71Var != null && f71Var.getScrollState() == 0) {
                    l71 n02 = w4Var.f35667j.n0();
                    if ((n02 == null || n02.getScrollState() == 0) && (d = w4Var.d(w4Var.f35662c.V2)) != null) {
                        s4.d0 d0Var = w4Var.f35662c.V2;
                        d0Var.getClass();
                        int i10 = new int[]{0, s4.p0.z(d) - d0Var.F()}[1];
                        if (i10 != 0) {
                            w4Var.f35662c.v0(0, i10, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((e5) this.f35313b).performClick();
                return;
            case 9:
                ((r5) this.f35313b).performClick();
                return;
            case 10:
                ((WalletEngine2) this.f35313b).lambda$close$53();
                return;
            case 11:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f35313b;
                if (ad.a(n2Var)) {
                    ad.a0(n2Var).M(LocaleController.getString(R.string.WalletCreated), LocaleController.getString(R.string.WalletCreatedInfo), R.raw.contact_check).j();
                    return;
                }
                return;
            case 12:
                q7 q7Var = (q7) this.f35313b;
                q7Var.removeSelfFromStack();
                Runnable runnable2 = q7Var.f35490f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.u3) this.f35313b).requestLayout();
                return;
            case 14:
                ad.a0((t8) this.f35313b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            default:
                ((a9) this.f35313b).U();
                return;
        }
    }
}
