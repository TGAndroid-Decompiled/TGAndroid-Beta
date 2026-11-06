package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class b7 implements Runnable {
    public final int f42148a;
    public final WalletEngine2 f42149b;
    public final v10 f42150c;

    public b7(WalletEngine2 walletEngine2, v10 v10Var, int i7) {
        this.f42148a = i7;
        this.f42149b = walletEngine2;
        this.f42150c = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f42148a) {
            case 0:
                this.f42149b.lambda$emulateRotateKey$30(this.f42150c);
                return;
            case 1:
                this.f42149b.lambda$balance$14(this.f42150c);
                return;
            default:
                this.f42149b.lambda$prepareSendNFT$24(this.f42150c);
                return;
        }
    }
}
