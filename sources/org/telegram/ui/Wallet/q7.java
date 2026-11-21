package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
public final class q7 implements Runnable {
    public final int f44863a;
    public final WalletEngine2 f44864b;
    public final q10 f44865c;

    public q7(WalletEngine2 walletEngine2, q10 q10Var, int i7) {
        this.f44863a = i7;
        this.f44864b = walletEngine2;
        this.f44865c = q10Var;
    }

    @Override
    public final void run() {
        switch (this.f44863a) {
            case 0:
                this.f44864b.lambda$emulateRotateKey$33(this.f44865c);
                return;
            case 1:
                this.f44864b.lambda$prepareSendNFT$27(this.f44865c);
                return;
            default:
                this.f44864b.lambda$balance$17(this.f44865c);
                return;
        }
    }
}
