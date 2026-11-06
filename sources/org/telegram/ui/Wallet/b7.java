package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class b7 implements Runnable {
    public final int f42124a;
    public final WalletEngine2 f42125b;
    public final v10 f42126c;

    public b7(WalletEngine2 walletEngine2, v10 v10Var, int i7) {
        this.f42124a = i7;
        this.f42125b = walletEngine2;
        this.f42126c = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f42124a) {
            case 0:
                this.f42125b.lambda$emulateRotateKey$30(this.f42126c);
                return;
            case 1:
                this.f42125b.lambda$balance$14(this.f42126c);
                return;
            default:
                this.f42125b.lambda$prepareSendNFT$24(this.f42126c);
                return;
        }
    }
}
