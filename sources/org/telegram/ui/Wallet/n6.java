package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class n6 implements Runnable {
    public final int f35367a = 1;
    public final WalletEngine2 f35368b;
    public final String f35369c;
    public final Utilities.Callback d;

    public n6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f35368b = walletEngine2;
        this.f35369c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f35367a) {
            case 0:
                this.f35368b.lambda$previewSignMessage$7(this.d, this.f35369c);
                return;
            default:
                this.f35368b.lambda$getTransactionByHash$39(this.f35369c, this.d);
                return;
        }
    }

    public n6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f35368b = walletEngine2;
        this.d = callback;
        this.f35369c = str;
    }
}
