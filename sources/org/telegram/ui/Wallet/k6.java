package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class k6 implements Runnable {
    public final int f33404a = 1;
    public final WalletEngine2 f33405b;
    public final String f33406c;
    public final Utilities.Callback d;

    public k6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f33405b = walletEngine2;
        this.f33406c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f33404a) {
            case 0:
                this.f33405b.lambda$previewSignMessage$7(this.d, this.f33406c);
                return;
            default:
                this.f33405b.lambda$getTransactionByHash$39(this.f33406c, this.d);
                return;
        }
    }

    public k6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f33405b = walletEngine2;
        this.d = callback;
        this.f33406c = str;
    }
}
