package org.telegram.ui.Wallet;

import org.telegram.messenger.q20;
public final class j7 implements Runnable {
    public final int f34756a = 1;
    public final WalletEngine2 f34757b;
    public final String f34758c;
    public final q20 d;

    public j7(WalletEngine2 walletEngine2, String str, q20 q20Var) {
        this.f34757b = walletEngine2;
        this.f34758c = str;
        this.d = q20Var;
    }

    @Override
    public final void run() {
        switch (this.f34756a) {
            case 0:
                this.f34757b.lambda$previewSignMessage$7(this.d, this.f34758c);
                return;
            default:
                this.f34757b.lambda$getTransactionByHash$39(this.f34758c, this.d);
                return;
        }
    }

    public j7(WalletEngine2 walletEngine2, q20 q20Var, String str) {
        this.f34757b = walletEngine2;
        this.d = q20Var;
        this.f34758c = str;
    }
}
