package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
public final class q7 implements Runnable {
    public final int f44823a;
    public final WalletEngine2 f44824b;
    public final q10 f44825c;

    public q7(WalletEngine2 walletEngine2, q10 q10Var, int i7) {
        this.f44823a = i7;
        this.f44824b = walletEngine2;
        this.f44825c = q10Var;
    }

    @Override
    public final void run() {
        switch (this.f44823a) {
            case 0:
                this.f44824b.lambda$emulateRotateKey$33(this.f44825c);
                return;
            case 1:
                this.f44824b.lambda$prepareSendNFT$27(this.f44825c);
                return;
            default:
                this.f44824b.lambda$balance$17(this.f44825c);
                return;
        }
    }
}
