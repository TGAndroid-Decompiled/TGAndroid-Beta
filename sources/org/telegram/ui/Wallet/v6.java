package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class v6 implements Runnable {
    public final int f35023a = 1;
    public final WalletEngine2 f35024b;
    public final String f35025c;
    public final Utilities.Callback d;

    public v6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f35024b = walletEngine2;
        this.f35025c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f35023a) {
            case 0:
                this.f35024b.lambda$previewSignMessage$7(this.d, this.f35025c);
                return;
            default:
                this.f35024b.lambda$getTransactionByHash$39(this.f35025c, this.d);
                return;
        }
    }

    public v6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f35024b = walletEngine2;
        this.d = callback;
        this.f35025c = str;
    }
}
