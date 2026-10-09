package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class l6 implements Runnable {
    public final int f35207a = 1;
    public final WalletEngine2 f35208b;
    public final String f35209c;
    public final Utilities.Callback d;

    public l6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f35208b = walletEngine2;
        this.f35209c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f35207a) {
            case 0:
                this.f35208b.lambda$previewSignMessage$7(this.d, this.f35209c);
                return;
            default:
                this.f35208b.lambda$getTransactionByHash$39(this.f35209c, this.d);
                return;
        }
    }

    public l6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f35208b = walletEngine2;
        this.d = callback;
        this.f35209c = str;
    }
}
