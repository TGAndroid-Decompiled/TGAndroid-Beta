package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xc;
public final class n9 implements Runnable {
    public final int f34611a;
    public final r9 f34612b;

    public n9(r9 r9Var, int i10) {
        this.f34611a = i10;
        this.f34612b = r9Var;
    }

    @Override
    public final void run() {
        switch (this.f34611a) {
            case 0:
                this.f34612b.Z = null;
                return;
            default:
                xc.a0(this.f34612b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
        }
    }
}
