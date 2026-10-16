package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class l6 implements Runnable {
    public final int f33170a = 1;
    public final WalletEngine2 f33171b;
    public final String f33172c;
    public final Utilities.Callback d;

    public l6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f33171b = walletEngine2;
        this.f33172c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f33170a) {
            case 0:
                this.f33171b.lambda$previewSignMessage$7(this.d, this.f33172c);
                return;
            default:
                this.f33171b.lambda$getTransactionByHash$39(this.f33172c, this.d);
                return;
        }
    }

    public l6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f33171b = walletEngine2;
        this.d = callback;
        this.f33172c = str;
    }
}
