package org.telegram.ui.Wallet;

import org.telegram.messenger.s10;
public final class b7 implements Runnable {
    public final int f43508a;
    public final WalletEngine2 f43509b;
    public final s10 f43510c;

    public b7(WalletEngine2 walletEngine2, s10 s10Var, int i7) {
        this.f43508a = i7;
        this.f43509b = walletEngine2;
        this.f43510c = s10Var;
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
