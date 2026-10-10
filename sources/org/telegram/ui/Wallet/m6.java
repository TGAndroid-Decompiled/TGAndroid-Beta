package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class m6 implements Runnable {
    public final int f35303a = 1;
    public final WalletEngine2 f35304b;
    public final String f35305c;
    public final Utilities.Callback d;

    public m6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f35304b = walletEngine2;
        this.f35305c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f35303a) {
            case 0:
                this.f35304b.lambda$previewSignMessage$7(this.d, this.f35305c);
                return;
            default:
                this.f35304b.lambda$getTransactionByHash$39(this.f35305c, this.d);
                return;
        }
    }

    public m6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f35304b = walletEngine2;
        this.d = callback;
        this.f35305c = str;
    }
}
