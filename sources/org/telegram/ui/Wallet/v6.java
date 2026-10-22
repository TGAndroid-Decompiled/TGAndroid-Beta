package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class v6 implements Runnable {
    public final int f35026a = 1;
    public final WalletEngine2 f35027b;
    public final String f35028c;
    public final Utilities.Callback d;

    public v6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f35027b = walletEngine2;
        this.f35028c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f35026a) {
            case 0:
                this.f35027b.lambda$previewSignMessage$7(this.d, this.f35028c);
                return;
            default:
                this.f35027b.lambda$getTransactionByHash$39(this.f35028c, this.d);
                return;
        }
    }

    public v6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f35027b = walletEngine2;
        this.d = callback;
        this.f35028c = str;
    }
}
