package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.vc;
public final class o9 implements Runnable {
    public final int f34980a;
    public final s9 f34981b;

    public o9(s9 s9Var, int i10) {
        this.f34980a = i10;
        this.f34981b = s9Var;
    }

    @Override
    public final void run() {
        switch (this.f34980a) {
            case 0:
                this.f34981b.f35185c0 = null;
                return;
            default:
                vc.a0(this.f34981b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
        }
    }
}
