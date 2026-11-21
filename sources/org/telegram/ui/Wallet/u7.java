package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;
public final class u7 implements Runnable {
    public final int f45175a = 0;
    public final WalletEngine2 f45176b;
    public final x10 f45177c;
    public final String d;

    public u7(WalletEngine2 walletEngine2, String str, x10 x10Var) {
        this.f45176b = walletEngine2;
        this.d = str;
        this.f45177c = x10Var;
    }

    @Override
    public final void run() {
        switch (this.f45175a) {
            case 0:
                this.f45176b.lambda$getTransactionByHash$42(this.d, this.f45177c);
                return;
            default:
                this.f45176b.lambda$previewSignMessage$10(this.f45177c, this.d);
                return;
        }
    }

    public u7(WalletEngine2 walletEngine2, x10 x10Var, String str) {
        this.f45176b = walletEngine2;
        this.f45177c = x10Var;
        this.d = str;
    }
}
