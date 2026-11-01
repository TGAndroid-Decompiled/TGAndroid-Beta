package org.telegram.ui.Wallet;

import org.telegram.messenger.r20;
public final class j7 implements Runnable {
    public final int f34761a = 1;
    public final WalletEngine2 f34762b;
    public final String f34763c;
    public final r20 d;

    public j7(WalletEngine2 walletEngine2, String str, r20 r20Var) {
        this.f34762b = walletEngine2;
        this.f34763c = str;
        this.d = r20Var;
    }

    @Override
    public final void run() {
        switch (this.f34761a) {
            case 0:
                this.f34762b.lambda$previewSignMessage$7(this.d, this.f34763c);
                return;
            default:
                this.f34762b.lambda$getTransactionByHash$39(this.f34763c, this.d);
                return;
        }
    }

    public j7(WalletEngine2 walletEngine2, r20 r20Var, String str) {
        this.f34762b = walletEngine2;
        this.d = r20Var;
        this.f34763c = str;
    }
}
