package org.telegram.ui.Wallet;

import org.telegram.messenger.u10;
public final class d7 implements Runnable {
    public final int f42435a = 1;
    public final WalletEngine2 f42436b;
    public final String f42437c;
    public final u10 d;

    public d7(WalletEngine2 walletEngine2, String str, u10 u10Var) {
        this.f42436b = walletEngine2;
        this.f42437c = str;
        this.d = u10Var;
    }

    @Override
    public final void run() {
        switch (this.f42435a) {
            case 0:
                this.f42436b.lambda$previewSignMessage$7(this.d, this.f42437c);
                return;
            default:
                this.f42436b.lambda$getTransactionByHash$39(this.f42437c, this.d);
                return;
        }
    }

    public d7(WalletEngine2 walletEngine2, u10 u10Var, String str) {
        this.f42436b = walletEngine2;
        this.d = u10Var;
        this.f42437c = str;
    }
}
