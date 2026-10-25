package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class v6 implements Runnable {
    public final int f37377a = 1;
    public final WalletEngine2 f37378b;
    public final String f37379c;
    public final Utilities.Callback d;

    public v6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f37378b = walletEngine2;
        this.f37379c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f37377a) {
            case 0:
                this.f37378b.lambda$previewSignMessage$7(this.d, this.f37379c);
                return;
            default:
                this.f37378b.lambda$getTransactionByHash$39(this.f37379c, this.d);
                return;
        }
    }

    public v6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f37378b = walletEngine2;
        this.d = callback;
        this.f37379c = str;
    }
}
