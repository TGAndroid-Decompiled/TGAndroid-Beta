package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xc;
public final class o9 implements Runnable {
    public final int f34978a;
    public final s9 f34979b;

    public o9(s9 s9Var, int i10) {
        this.f34978a = i10;
        this.f34979b = s9Var;
    }

    @Override
    public final void run() {
        switch (this.f34978a) {
            case 0:
                this.f34979b.f35183c0 = null;
                return;
            default:
                xc.a0(this.f34979b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
        }
    }
}
