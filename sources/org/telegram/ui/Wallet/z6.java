package org.telegram.ui.Wallet;

import org.telegram.messenger.n10;
public final class z6 implements Runnable {
    public final int f43508a;
    public final WalletEngine2 f43509b;
    public final n10 f43510c;

    public z6(WalletEngine2 walletEngine2, n10 n10Var, int i3) {
        this.f43508a = i3;
        this.f43509b = walletEngine2;
        this.f43510c = n10Var;
    }

    @Override
    public final void run() {
        switch (this.f43508a) {
            case 0:
                this.f43509b.lambda$emulateRotateKey$30(this.f43510c);
                return;
            case 1:
                this.f43509b.lambda$balance$14(this.f43510c);
                return;
            default:
                this.f43509b.lambda$prepareSendNFT$24(this.f43510c);
                return;
        }
    }
}
