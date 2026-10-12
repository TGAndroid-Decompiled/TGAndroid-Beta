package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class n6 implements Runnable {
    public final int f35135a = 1;
    public final WalletEngine2 f35136b;
    public final String f35137c;
    public final Utilities.Callback d;

    public n6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f35136b = walletEngine2;
        this.f35137c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f35135a) {
            case 0:
                this.f35136b.lambda$previewSignMessage$7(this.d, this.f35137c);
                return;
            default:
                this.f35136b.lambda$getTransactionByHash$39(this.f35137c, this.d);
                return;
        }
    }

    public n6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f35136b = walletEngine2;
        this.d = callback;
        this.f35137c = str;
    }
}
