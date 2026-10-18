package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class v6 implements Runnable {
    public final int f34997a = 1;
    public final WalletEngine2 f34998b;
    public final String f34999c;
    public final Utilities.Callback d;

    public v6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f34998b = walletEngine2;
        this.f34999c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f34997a) {
            case 0:
                this.f34998b.lambda$previewSignMessage$7(this.d, this.f34999c);
                return;
            default:
                this.f34998b.lambda$getTransactionByHash$39(this.f34999c, this.d);
                return;
        }
    }

    public v6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f34998b = walletEngine2;
        this.d = callback;
        this.f34999c = str;
    }
}
