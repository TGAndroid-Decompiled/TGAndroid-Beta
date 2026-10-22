package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xc;
public final class n9 implements Runnable {
    public final int f34623a;
    public final r9 f34624b;

    public n9(r9 r9Var, int i10) {
        this.f34623a = i10;
        this.f34624b = r9Var;
    }

    @Override
    public final void run() {
        switch (this.f34623a) {
            case 0:
                this.f34624b.Z = null;
                return;
            default:
                xc.a0(this.f34624b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
        }
    }
}
