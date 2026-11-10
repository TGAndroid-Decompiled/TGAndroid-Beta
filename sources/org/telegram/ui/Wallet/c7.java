package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class c7 implements Runnable {
    public final int f42216a;
    public final WalletEngine2 f42217b;
    public final v10 f42218c;

    public c7(WalletEngine2 walletEngine2, v10 v10Var, int i7) {
        this.f42216a = i7;
        this.f42217b = walletEngine2;
        this.f42218c = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f42216a) {
            case 0:
                this.f42217b.lambda$emulateRotateKey$30(this.f42218c);
                return;
            case 1:
                this.f42217b.lambda$balance$14(this.f42218c);
                return;
            default:
                this.f42217b.lambda$prepareSendNFT$24(this.f42218c);
                return;
        }
    }
}
