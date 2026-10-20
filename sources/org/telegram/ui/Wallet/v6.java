package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class v6 implements Runnable {
    public final int f35022a = 1;
    public final WalletEngine2 f35023b;
    public final String f35024c;
    public final Utilities.Callback d;

    public v6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f35023b = walletEngine2;
        this.f35024c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f35022a) {
            case 0:
                this.f35023b.lambda$previewSignMessage$7(this.d, this.f35024c);
                return;
            default:
                this.f35023b.lambda$getTransactionByHash$39(this.f35024c, this.d);
                return;
        }
    }

    public v6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f35023b = walletEngine2;
        this.d = callback;
        this.f35024c = str;
    }
}
