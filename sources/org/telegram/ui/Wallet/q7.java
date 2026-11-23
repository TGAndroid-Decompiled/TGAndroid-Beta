package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
public final class q7 implements Runnable {
    public final int f44867a;
    public final WalletEngine2 f44868b;
    public final r10 f44869c;

    public q7(WalletEngine2 walletEngine2, r10 r10Var, int i7) {
        this.f44867a = i7;
        this.f44868b = walletEngine2;
        this.f44869c = r10Var;
    }

    @Override
    public final void run() {
        switch (this.f44867a) {
            case 0:
                this.f44868b.lambda$emulateRotateKey$33(this.f44869c);
                return;
            case 1:
                this.f44868b.lambda$prepareSendNFT$27(this.f44869c);
                return;
            default:
                this.f44868b.lambda$balance$17(this.f44869c);
                return;
        }
    }
}
