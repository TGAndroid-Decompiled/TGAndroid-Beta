package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class b7 implements Runnable {
    public final int f34058a = 1;
    public final WalletEngine2 f34059b;
    public final String f34060c;
    public final Utilities.Callback d;

    public b7(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f34059b = walletEngine2;
        this.f34060c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f34058a) {
            case 0:
                this.f34059b.lambda$previewSignMessage$7(this.d, this.f34060c);
                return;
            default:
                this.f34059b.lambda$getTransactionByHash$39(this.f34060c, this.d);
                return;
        }
    }

    public b7(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f34059b = walletEngine2;
        this.d = callback;
        this.f34060c = str;
    }
}
