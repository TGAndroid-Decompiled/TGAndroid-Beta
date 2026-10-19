package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class v6 implements Runnable {
    public final int f35014a = 1;
    public final WalletEngine2 f35015b;
    public final String f35016c;
    public final Utilities.Callback d;

    public v6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f35015b = walletEngine2;
        this.f35016c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f35014a) {
            case 0:
                this.f35015b.lambda$previewSignMessage$7(this.d, this.f35016c);
                return;
            default:
                this.f35015b.lambda$getTransactionByHash$39(this.f35016c, this.d);
                return;
        }
    }

    public v6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f35015b = walletEngine2;
        this.d = callback;
        this.f35016c = str;
    }
}
