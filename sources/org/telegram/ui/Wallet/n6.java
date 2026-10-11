package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class n6 implements Runnable {
    public final int f35333a = 1;
    public final WalletEngine2 f35334b;
    public final String f35335c;
    public final Utilities.Callback d;

    public n6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f35334b = walletEngine2;
        this.f35335c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f35333a) {
            case 0:
                this.f35334b.lambda$previewSignMessage$7(this.d, this.f35335c);
                return;
            default:
                this.f35334b.lambda$getTransactionByHash$39(this.f35335c, this.d);
                return;
        }
    }

    public n6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f35334b = walletEngine2;
        this.d = callback;
        this.f35335c = str;
    }
}
