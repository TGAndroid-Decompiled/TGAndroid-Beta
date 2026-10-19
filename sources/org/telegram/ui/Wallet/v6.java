package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class v6 implements Runnable {
    public final int f35016a = 1;
    public final WalletEngine2 f35017b;
    public final String f35018c;
    public final Utilities.Callback d;

    public v6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f35017b = walletEngine2;
        this.f35018c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f35016a) {
            case 0:
                this.f35017b.lambda$previewSignMessage$7(this.d, this.f35018c);
                return;
            default:
                this.f35017b.lambda$getTransactionByHash$39(this.f35018c, this.d);
                return;
        }
    }

    public v6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f35017b = walletEngine2;
        this.d = callback;
        this.f35018c = str;
    }
}
