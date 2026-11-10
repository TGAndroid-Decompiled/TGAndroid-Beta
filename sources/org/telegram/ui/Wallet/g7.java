package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
public final class g7 implements Runnable {
    public final int f42534a = 1;
    public final WalletEngine2 f42535b;
    public final String f42536c;
    public final c20 d;

    public g7(WalletEngine2 walletEngine2, String str, c20 c20Var) {
        this.f42535b = walletEngine2;
        this.f42536c = str;
        this.d = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f42534a) {
            case 0:
                this.f42535b.lambda$previewSignMessage$7(this.d, this.f42536c);
                return;
            default:
                this.f42535b.lambda$getTransactionByHash$39(this.f42536c, this.d);
                return;
        }
    }

    public g7(WalletEngine2 walletEngine2, c20 c20Var, String str) {
        this.f42535b = walletEngine2;
        this.d = c20Var;
        this.f42536c = str;
    }
}
