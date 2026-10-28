package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.wc;
public final class n9 implements Runnable {
    public final int f37066a;
    public final r9 f37067b;

    public n9(r9 r9Var, int i10) {
        this.f37066a = i10;
        this.f37067b = r9Var;
    }

    @Override
    public final void run() {
        switch (this.f37066a) {
            case 0:
                this.f37067b.f37223d0 = null;
                return;
            default:
                wc.b0(this.f37067b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
        }
    }
}
