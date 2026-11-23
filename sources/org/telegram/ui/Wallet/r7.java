package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;
public final class r7 implements Runnable {
    public final int f44995a;
    public final WalletEngine2 f44996b;
    public final p10 f44997c;

    public r7(WalletEngine2 walletEngine2, p10 p10Var, int i7) {
        this.f44995a = i7;
        this.f44996b = walletEngine2;
        this.f44997c = p10Var;
    }

    @Override
    public final void run() {
        switch (this.f44995a) {
            case 0:
                this.f44996b.lambda$emulateRotateKey$33(this.f44997c);
                return;
            case 1:
                this.f44996b.lambda$prepareSendNFT$27(this.f44997c);
                return;
            default:
                this.f44996b.lambda$balance$17(this.f44997c);
                return;
        }
    }
}
