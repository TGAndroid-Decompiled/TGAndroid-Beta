package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.k71;
public final class m implements Runnable {
    public final int f35216a;
    public final Object f35217b;

    public m(Object obj, int i10) {
        this.f35216a = i10;
        this.f35217b = obj;
    }

    private final void a() {
        a0 a0Var = (a0) this.f35217b;
        synchronized (a0Var) {
            if (a0Var.f34603a) {
                return;
            }
            a0Var.f34603a = true;
            Runnable runnable = a0Var.f34604b;
            if (runnable != null) {
                runnable.run();
                a0Var.f34604b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        switch (this.f35216a) {
            case 0:
                y yVar = (y) this.f35217b;
                synchronized (yVar) {
                    if (!yVar.f35674a) {
                        yVar.f35674a = true;
                        Runnable runnable = yVar.f35675b;
                        if (runnable != null) {
                            runnable.run();
                            yVar.f35675b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((h0) this.f35217b).close();
                return;
            case 3:
                v0 v0Var = (v0) this.f35217b;
                v0Var.c("AUTH_CANCELED");
                v0Var.e();
                if (w7.f6.f49953b == v0Var) {
                    w7.f6.f49953b = null;
                    return;
                }
                return;
            case 4:
                ((h2) this.f35217b).dismiss();
                return;
            case 5:
                ((org.telegram.ui.Cells.w0) this.f35217b).invalidate();
                return;
            case 6:
                AndroidUtilities.removeFromParent((ci.d4) this.f35217b);
                return;
            case 7:
                v4 v4Var = (v4) this.f35217b;
                e71 e71Var = v4Var.f35568c;
                if (e71Var != null && e71Var.getScrollState() == 0) {
                    k71 n02 = v4Var.f35573j.n0();
                    if ((n02 == null || n02.getScrollState() == 0) && (d = v4Var.d(v4Var.f35568c.V2)) != null) {
                        s4.d0 d0Var = v4Var.f35568c.V2;
                        d0Var.getClass();
                        int i10 = new int[]{0, s4.p0.z(d) - d0Var.F()}[1];
                        if (i10 != 0) {
                            v4Var.f35568c.v0(0, i10, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((d5) this.f35217b).performClick();
                return;
            case 9:
                ((q5) this.f35217b).performClick();
                return;
            case 10:
                ((WalletEngine2) this.f35217b).lambda$close$53();
                return;
            case 11:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f35217b;
                if (ad.a(n2Var)) {
                    ad.a0(n2Var).M(LocaleController.getString(R.string.WalletCreated), LocaleController.getString(R.string.WalletCreatedInfo), R.raw.contact_check).j();
                    return;
                }
                return;
            case 12:
                p7 p7Var = (p7) this.f35217b;
                p7Var.removeSelfFromStack();
                Runnable runnable2 = p7Var.f35400f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.u3) this.f35217b).requestLayout();
                return;
            case 14:
                ad.a0((s8) this.f35217b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            default:
                ((z8) this.f35217b).U();
                return;
        }
    }
}
