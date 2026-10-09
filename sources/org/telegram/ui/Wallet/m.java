package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.k71;
public final class m implements Runnable {
    public final int f35200a;
    public final Object f35201b;

    public m(Object obj, int i10) {
        this.f35200a = i10;
        this.f35201b = obj;
    }

    private final void a() {
        a0 a0Var = (a0) this.f35201b;
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
        switch (this.f35200a) {
            case 0:
                y yVar = (y) this.f35201b;
                synchronized (yVar) {
                    if (!yVar.f35637a) {
                        yVar.f35637a = true;
                        Runnable runnable = yVar.f35638b;
                        if (runnable != null) {
                            runnable.run();
                            yVar.f35638b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((h0) this.f35201b).close();
                return;
            case 3:
                v0 v0Var = (v0) this.f35201b;
                v0Var.c("AUTH_CANCELED");
                v0Var.e();
                if (w7.f6.f49951b == v0Var) {
                    w7.f6.f49951b = null;
                    return;
                }
                return;
            case 4:
                ((h2) this.f35201b).dismiss();
                return;
            case 5:
                ((org.telegram.ui.Cells.w0) this.f35201b).invalidate();
                return;
            case 6:
                ((c3) this.f35201b).p();
                return;
            case 7:
                AndroidUtilities.removeFromParent((ci.d4) this.f35201b);
                return;
            case 8:
                u4 u4Var = (u4) this.f35201b;
                e71 e71Var = u4Var.f35500c;
                if (e71Var != null && e71Var.getScrollState() == 0) {
                    k71 n02 = u4Var.f35505j.n0();
                    if ((n02 == null || n02.getScrollState() == 0) && (d = u4Var.d(u4Var.f35500c.V2)) != null) {
                        s4.d0 d0Var = u4Var.f35500c.V2;
                        d0Var.getClass();
                        int i10 = new int[]{0, s4.p0.z(d) - d0Var.F()}[1];
                        if (i10 != 0) {
                            u4Var.f35500c.v0(0, i10, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((c5) this.f35201b).performClick();
                return;
            case 10:
                ((p5) this.f35201b).performClick();
                return;
            case 11:
                ((WalletEngine2) this.f35201b).lambda$close$53();
                return;
            case 12:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f35201b;
                if (ad.a(n2Var)) {
                    ad.a0(n2Var).M(LocaleController.getString(R.string.WalletCreated), LocaleController.getString(R.string.WalletCreatedInfo), R.raw.contact_check).j();
                    return;
                }
                return;
            case 13:
                o7 o7Var = (o7) this.f35201b;
                o7Var.removeSelfFromStack();
                Runnable runnable2 = o7Var.f35331f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 14:
                ((org.telegram.ui.Cells.u3) this.f35201b).requestLayout();
                return;
            case 15:
                ad.a0((r8) this.f35201b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            default:
                ((y8) this.f35201b).U();
                return;
        }
    }
}
