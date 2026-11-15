package org.telegram.ui.Wallet;

import org.telegram.messenger.z10;
public final class f7 implements Runnable {
    public final int f43836a = 1;
    public final WalletEngine2 f43837b;
    public final String f43838c;
    public final z10 d;

    public f7(WalletEngine2 walletEngine2, String str, z10 z10Var) {
        this.f43837b = walletEngine2;
        this.f43838c = str;
        this.d = z10Var;
    }

    @Override
    public final void run() {
        switch (this.f43836a) {
            case 0:
                this.f43837b.lambda$previewSignMessage$7(this.d, this.f43838c);
                return;
            default:
                this.f43837b.lambda$getTransactionByHash$39(this.f43838c, this.d);
                return;
        }
    }

    public f7(WalletEngine2 walletEngine2, z10 z10Var, String str) {
        this.f43837b = walletEngine2;
        this.d = z10Var;
        this.f43838c = str;
    }
}
