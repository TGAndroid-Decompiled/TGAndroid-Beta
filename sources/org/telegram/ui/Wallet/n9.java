package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xc;
public final class n9 implements Runnable {
    public final int f34619a;
    public final r9 f34620b;

    public n9(r9 r9Var, int i10) {
        this.f34619a = i10;
        this.f34620b = r9Var;
    }

    @Override
    public final void run() {
        switch (this.f34619a) {
            case 0:
                this.f34620b.Z = null;
                return;
            default:
                xc.a0(this.f34620b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
        }
    }
}
