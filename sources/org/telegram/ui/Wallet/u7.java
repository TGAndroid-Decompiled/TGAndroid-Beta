package org.telegram.ui.Wallet;

import org.telegram.messenger.y10;
public final class u7 implements Runnable {
    public final int f45179a = 0;
    public final WalletEngine2 f45180b;
    public final y10 f45181c;
    public final String d;

    public u7(WalletEngine2 walletEngine2, String str, y10 y10Var) {
        this.f45180b = walletEngine2;
        this.d = str;
        this.f45181c = y10Var;
    }

    @Override
    public final void run() {
        switch (this.f45179a) {
            case 0:
                this.f45180b.lambda$getTransactionByHash$42(this.d, this.f45181c);
                return;
            default:
                this.f45180b.lambda$previewSignMessage$10(this.f45181c, this.d);
                return;
        }
    }

    public u7(WalletEngine2 walletEngine2, y10 y10Var, String str) {
        this.f45180b = walletEngine2;
        this.f45181c = y10Var;
        this.d = str;
    }
}
