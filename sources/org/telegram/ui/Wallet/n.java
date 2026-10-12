package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.zc;
public final class n implements Runnable {
    public final int f35101a;
    public final Object f35102b;

    public n(Object obj, int i10) {
        this.f35101a = i10;
        this.f35102b = obj;
    }

    private final void a() {
        b0 b0Var = (b0) this.f35102b;
        synchronized (b0Var) {
            if (b0Var.f34480a) {
                return;
            }
            b0Var.f34480a = true;
            Runnable runnable = b0Var.f34481b;
            if (runnable != null) {
                runnable.run();
                b0Var.f34481b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        switch (this.f35101a) {
            case 0:
                z zVar = (z) this.f35102b;
                synchronized (zVar) {
                    if (!zVar.f35571a) {
                        zVar.f35571a = true;
                        Runnable runnable = zVar.f35572b;
                        if (runnable != null) {
                            runnable.run();
                            zVar.f35572b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((i0) this.f35102b).close();
                return;
            case 3:
                w0 w0Var = (w0) this.f35102b;
                w0Var.c("AUTH_CANCELED");
                w0Var.e();
                if (w7.e6.f50170b == w0Var) {
                    w7.e6.f50170b = null;
                    return;
                }
                return;
            case 4:
                ((j2) this.f35102b).dismiss();
                return;
            case 5:
                ((org.telegram.ui.Cells.w0) this.f35102b).invalidate();
                return;
            case 6:
                AndroidUtilities.removeFromParent((ci.d4) this.f35102b);
                return;
            case 7:
                x4 x4Var = (x4) this.f35102b;
                j71 j71Var = x4Var.f35504c;
                if (j71Var != null && j71Var.getScrollState() == 0) {
                    p71 n02 = x4Var.f35509j.n0();
                    if ((n02 == null || n02.getScrollState() == 0) && (d = x4Var.d(x4Var.f35504c.V2)) != null) {
                        s4.d0 d0Var = x4Var.f35504c.V2;
                        d0Var.getClass();
                        int i10 = new int[]{0, s4.p0.z(d) - d0Var.F()}[1];
                        if (i10 != 0) {
                            x4Var.f35504c.v0(0, i10, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((f5) this.f35102b).performClick();
                return;
            case 9:
                ((s5) this.f35102b).performClick();
                return;
            case 10:
                ((WalletEngine2) this.f35102b).lambda$close$53();
                return;
            case 11:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f35102b;
                if (zc.a(m2Var)) {
                    zc.a0(m2Var).M(LocaleController.getString(R.string.WalletCreated), LocaleController.getString(R.string.WalletCreatedInfo), R.raw.contact_check).j();
                    return;
                }
                return;
            case 12:
                r7 r7Var = (r7) this.f35102b;
                r7Var.removeSelfFromStack();
                Runnable runnable2 = r7Var.f35333f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.u3) this.f35102b).requestLayout();
                return;
            case 14:
                zc.a0((u8) this.f35102b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            default:
                ((b9) this.f35102b).U();
                return;
        }
    }
}
