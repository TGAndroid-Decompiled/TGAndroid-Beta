package org.telegram.ui.Wallet;

import org.telegram.messenger.w10;
public final class v7 implements Runnable {
    public final int f45306a = 0;
    public final WalletEngine2 f45307b;
    public final w10 f45308c;
    public final String d;

    public v7(WalletEngine2 walletEngine2, String str, w10 w10Var) {
        this.f45307b = walletEngine2;
        this.d = str;
        this.f45308c = w10Var;
    }

    @Override
    public final void run() {
        switch (this.f45306a) {
            case 0:
                this.f45307b.lambda$getTransactionByHash$42(this.d, this.f45308c);
                return;
            default:
                this.f45307b.lambda$previewSignMessage$10(this.f45308c, this.d);
                return;
        }
    }

    public v7(WalletEngine2 walletEngine2, w10 w10Var, String str) {
        this.f45307b = walletEngine2;
        this.f45308c = w10Var;
        this.d = str;
    }
}
