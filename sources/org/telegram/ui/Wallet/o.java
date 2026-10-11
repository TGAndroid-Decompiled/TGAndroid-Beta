package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.m71;
public final class o implements Runnable {
    public final int f35342a;
    public final Object f35343b;

    public o(Object obj, int i10) {
        this.f35342a = i10;
        this.f35343b = obj;
    }

    private final void a() {
        b0 b0Var = (b0) this.f35343b;
        synchronized (b0Var) {
            if (b0Var.f34669a) {
                return;
            }
            b0Var.f34669a = true;
            Runnable runnable = b0Var.f34670b;
            if (runnable != null) {
                runnable.run();
                b0Var.f34670b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        switch (this.f35342a) {
            case 0:
                z zVar = (z) this.f35343b;
                synchronized (zVar) {
                    if (!zVar.f35759a) {
                        zVar.f35759a = true;
                        Runnable runnable = zVar.f35760b;
                        if (runnable != null) {
                            runnable.run();
                            zVar.f35760b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((i0) this.f35343b).close();
                return;
            case 3:
                w0 w0Var = (w0) this.f35343b;
                w0Var.c("AUTH_CANCELED");
                w0Var.e();
                if (w7.f6.f50040b == w0Var) {
                    w7.f6.f50040b = null;
                    return;
                }
                return;
            case 4:
                ((j2) this.f35343b).dismiss();
                return;
            case 5:
                ((org.telegram.ui.Cells.w0) this.f35343b).invalidate();
                return;
            case 6:
                AndroidUtilities.removeFromParent((ci.d4) this.f35343b);
                return;
            case 7:
                x4 x4Var = (x4) this.f35343b;
                g71 g71Var = x4Var.f35692c;
                if (g71Var != null && g71Var.getScrollState() == 0) {
                    m71 n02 = x4Var.f35697j.n0();
                    if ((n02 == null || n02.getScrollState() == 0) && (d = x4Var.d(x4Var.f35692c.V2)) != null) {
                        s4.d0 d0Var = x4Var.f35692c.V2;
                        d0Var.getClass();
                        int i10 = new int[]{0, s4.p0.z(d) - d0Var.F()}[1];
                        if (i10 != 0) {
                            x4Var.f35692c.v0(0, i10, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((f5) this.f35343b).performClick();
                return;
            case 9:
                ((s5) this.f35343b).performClick();
                return;
            case 10:
                ((WalletEngine2) this.f35343b).lambda$close$53();
                return;
            case 11:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f35343b;
                if (ad.a(m2Var)) {
                    ad.a0(m2Var).M(LocaleController.getString(R.string.WalletCreated), LocaleController.getString(R.string.WalletCreatedInfo), R.raw.contact_check).j();
                    return;
                }
                return;
            case 12:
                r7 r7Var = (r7) this.f35343b;
                r7Var.removeSelfFromStack();
                Runnable runnable2 = r7Var.f35520f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.u3) this.f35343b).requestLayout();
                return;
            case 14:
                ad.a0((u8) this.f35343b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            default:
                ((b9) this.f35343b).U();
                return;
        }
    }
}
