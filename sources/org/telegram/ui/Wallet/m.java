package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.zc;
public final class m implements Runnable {
    public final int f33456a;
    public final Object f33457b;

    public m(Object obj, int i10) {
        this.f33456a = i10;
        this.f33457b = obj;
    }

    private final void a() {
        z zVar = (z) this.f33457b;
        synchronized (zVar) {
            if (zVar.f33894a) {
                return;
            }
            zVar.f33894a = true;
            Runnable runnable = zVar.f33895b;
            if (runnable != null) {
                runnable.run();
                zVar.f33895b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        switch (this.f33456a) {
            case 0:
                x xVar = (x) this.f33457b;
                synchronized (xVar) {
                    if (!xVar.f33822a) {
                        xVar.f33822a = true;
                        Runnable runnable = xVar.f33823b;
                        if (runnable != null) {
                            runnable.run();
                            xVar.f33823b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((g0) this.f33457b).close();
                return;
            case 3:
                u0 u0Var = (u0) this.f33457b;
                u0Var.c("AUTH_CANCELED");
                u0Var.e();
                if (w7.i6.f47327b == u0Var) {
                    w7.i6.f47327b = null;
                    return;
                }
                return;
            case 4:
                ((h2) this.f33457b).dismiss();
                return;
            case 5:
                ((org.telegram.ui.Cells.x0) this.f33457b).invalidate();
                return;
            case 6:
                AndroidUtilities.removeFromParent((di.d4) this.f33457b);
                return;
            case 7:
                v4 v4Var = (v4) this.f33457b;
                b71 b71Var = v4Var.f33774c;
                if (b71Var != null && b71Var.getScrollState() == 0) {
                    h71 n02 = v4Var.f33778j.n0();
                    if ((n02 == null || n02.getScrollState() == 0) && (d = v4Var.d(v4Var.f33774c.V2)) != null) {
                        s4.b0 b0Var = v4Var.f33774c.V2;
                        b0Var.getClass();
                        int i10 = new int[]{0, s4.n0.z(d) - b0Var.F()}[1];
                        if (i10 != 0) {
                            v4Var.f33774c.v0(0, i10, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((c5) this.f33457b).performClick();
                return;
            case 9:
                ((p5) this.f33457b).performClick();
                return;
            case 10:
                ((WalletEngine2) this.f33457b).lambda$close$53();
                return;
            case 11:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f33457b;
                if (zc.a(m2Var)) {
                    zc.a0(m2Var).M(LocaleController.getString(R.string.WalletCreated), LocaleController.getString(R.string.WalletCreatedInfo), R.raw.contact_check).j();
                    return;
                }
                return;
            case 12:
                o7 o7Var = (o7) this.f33457b;
                o7Var.removeSelfFromStack();
                Runnable runnable2 = o7Var.f33577f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.u3) this.f33457b).requestLayout();
                return;
            case 14:
                zc.a0((r8) this.f33457b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            default:
                ((z8) this.f33457b).U();
                return;
        }
    }
}
