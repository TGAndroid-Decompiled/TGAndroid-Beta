package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
public final class d7 implements Runnable {
    public final int f42371a = 1;
    public final WalletEngine2 f42372b;
    public final String f42373c;
    public final c20 d;

    public d7(WalletEngine2 walletEngine2, String str, c20 c20Var) {
        this.f42372b = walletEngine2;
        this.f42373c = str;
        this.d = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f42371a) {
            case 0:
                this.f42372b.lambda$previewSignMessage$7(this.d, this.f42373c);
                return;
            default:
                this.f42372b.lambda$getTransactionByHash$39(this.f42373c, this.d);
                return;
        }
    }

    public d7(WalletEngine2 walletEngine2, c20 c20Var, String str) {
        this.f42372b = walletEngine2;
        this.d = c20Var;
        this.f42373c = str;
    }
}
