package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
public final class f7 implements Runnable {
    public final int f42461a = 1;
    public final WalletEngine2 f42462b;
    public final String f42463c;
    public final c20 d;

    public f7(WalletEngine2 walletEngine2, String str, c20 c20Var) {
        this.f42462b = walletEngine2;
        this.f42463c = str;
        this.d = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f42461a) {
            case 0:
                this.f42462b.lambda$previewSignMessage$7(this.d, this.f42463c);
                return;
            default:
                this.f42462b.lambda$getTransactionByHash$39(this.f42463c, this.d);
                return;
        }
    }

    public f7(WalletEngine2 walletEngine2, c20 c20Var, String str) {
        this.f42462b = walletEngine2;
        this.d = c20Var;
        this.f42463c = str;
    }
}
