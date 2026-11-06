package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
public final class f7 implements Runnable {
    public final int f42486a = 1;
    public final WalletEngine2 f42487b;
    public final String f42488c;
    public final c20 d;

    public f7(WalletEngine2 walletEngine2, String str, c20 c20Var) {
        this.f42487b = walletEngine2;
        this.f42488c = str;
        this.d = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f42486a) {
            case 0:
                this.f42487b.lambda$previewSignMessage$7(this.d, this.f42488c);
                return;
            default:
                this.f42487b.lambda$getTransactionByHash$39(this.f42488c, this.d);
                return;
        }
    }

    public f7(WalletEngine2 walletEngine2, c20 c20Var, String str) {
        this.f42487b = walletEngine2;
        this.d = c20Var;
        this.f42488c = str;
    }
}
