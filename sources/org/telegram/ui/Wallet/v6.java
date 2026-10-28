package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class v6 implements Runnable {
    public final int f37404a = 1;
    public final WalletEngine2 f37405b;
    public final String f37406c;
    public final Utilities.Callback d;

    public v6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f37405b = walletEngine2;
        this.f37406c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f37404a) {
            case 0:
                this.f37405b.lambda$previewSignMessage$7(this.d, this.f37406c);
                return;
            default:
                this.f37405b.lambda$getTransactionByHash$39(this.f37406c, this.d);
                return;
        }
    }

    public v6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f37405b = walletEngine2;
        this.d = callback;
        this.f37406c = str;
    }
}
