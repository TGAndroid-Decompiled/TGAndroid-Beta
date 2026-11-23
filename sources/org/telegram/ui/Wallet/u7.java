package org.telegram.ui.Wallet;

import org.telegram.messenger.y10;
public final class u7 implements Runnable {
    public final int f45144a = 0;
    public final WalletEngine2 f45145b;
    public final y10 f45146c;
    public final String d;

    public u7(WalletEngine2 walletEngine2, String str, y10 y10Var) {
        this.f45145b = walletEngine2;
        this.d = str;
        this.f45146c = y10Var;
    }

    @Override
    public final void run() {
        switch (this.f45144a) {
            case 0:
                this.f45145b.lambda$getTransactionByHash$42(this.d, this.f45146c);
                return;
            default:
                this.f45145b.lambda$previewSignMessage$10(this.f45146c, this.d);
                return;
        }
    }

    public u7(WalletEngine2 walletEngine2, y10 y10Var, String str) {
        this.f45145b = walletEngine2;
        this.f45146c = y10Var;
        this.d = str;
    }
}
