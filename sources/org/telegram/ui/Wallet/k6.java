package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class k6 implements Runnable {
    public final int f35142a = 1;
    public final WalletEngine2 f35143b;
    public final String f35144c;
    public final Utilities.Callback d;

    public k6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f35143b = walletEngine2;
        this.f35144c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f35142a) {
            case 0:
                this.f35143b.lambda$previewSignMessage$7(this.d, this.f35144c);
                return;
            default:
                this.f35143b.lambda$getTransactionByHash$39(this.f35144c, this.d);
                return;
        }
    }

    public k6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f35143b = walletEngine2;
        this.d = callback;
        this.f35144c = str;
    }
}
