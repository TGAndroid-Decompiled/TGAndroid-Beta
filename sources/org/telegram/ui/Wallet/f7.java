package org.telegram.ui.Wallet;

import org.telegram.messenger.k20;
public final class f7 implements Runnable {
    public final int f34503a;
    public final WalletEngine2 f34504b;
    public final k20 f34505c;

    public f7(WalletEngine2 walletEngine2, k20 k20Var, int i10) {
        this.f34503a = i10;
        this.f34504b = walletEngine2;
        this.f34505c = k20Var;
    }

    @Override
    public final void run() {
        switch (this.f34503a) {
            case 0:
                this.f34504b.lambda$emulateRotateKey$30(this.f34505c);
                return;
            case 1:
                this.f34504b.lambda$balance$14(this.f34505c);
                return;
            default:
                this.f34504b.lambda$prepareSendNFT$24(this.f34505c);
                return;
        }
    }
}
