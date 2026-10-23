package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class v6 implements Runnable {
    public final int f35027a = 1;
    public final WalletEngine2 f35028b;
    public final String f35029c;
    public final Utilities.Callback d;

    public v6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f35028b = walletEngine2;
        this.f35029c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f35027a) {
            case 0:
                this.f35028b.lambda$previewSignMessage$7(this.d, this.f35029c);
                return;
            default:
                this.f35028b.lambda$getTransactionByHash$39(this.f35029c, this.d);
                return;
        }
    }

    public v6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f35028b = walletEngine2;
        this.d = callback;
        this.f35029c = str;
    }
}
