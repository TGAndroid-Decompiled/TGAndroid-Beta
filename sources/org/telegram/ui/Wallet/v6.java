package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class v6 implements Runnable {
    public final int f35326a = 1;
    public final WalletEngine2 f35327b;
    public final String f35328c;
    public final Utilities.Callback d;

    public v6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f35327b = walletEngine2;
        this.f35328c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f35326a) {
            case 0:
                this.f35327b.lambda$previewSignMessage$7(this.d, this.f35328c);
                return;
            default:
                this.f35327b.lambda$getTransactionByHash$39(this.f35328c, this.d);
                return;
        }
    }

    public v6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f35327b = walletEngine2;
        this.d = callback;
        this.f35328c = str;
    }
}
