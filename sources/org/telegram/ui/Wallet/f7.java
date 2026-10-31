package org.telegram.ui.Wallet;

import org.telegram.messenger.j20;
public final class f7 implements Runnable {
    public final int f34505a;
    public final WalletEngine2 f34506b;
    public final j20 f34507c;

    public f7(WalletEngine2 walletEngine2, j20 j20Var, int i10) {
        this.f34505a = i10;
        this.f34506b = walletEngine2;
        this.f34507c = j20Var;
    }

    @Override
    public final void run() {
        switch (this.f34505a) {
            case 0:
                this.f34506b.lambda$emulateRotateKey$30(this.f34507c);
                return;
            case 1:
                this.f34506b.lambda$balance$14(this.f34507c);
                return;
            default:
                this.f34506b.lambda$prepareSendNFT$24(this.f34507c);
                return;
        }
    }
}
