package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.wc;
public final class n9 implements Runnable {
    public final int f37041a;
    public final r9 f37042b;

    public n9(r9 r9Var, int i10) {
        this.f37041a = i10;
        this.f37042b = r9Var;
    }

    @Override
    public final void run() {
        switch (this.f37041a) {
            case 0:
                this.f37042b.f37199d0 = null;
                return;
            default:
                wc.b0(this.f37042b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
        }
    }
}
