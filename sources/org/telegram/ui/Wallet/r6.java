package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class r6 implements Runnable {
    public final int f34806a;
    public final WalletEngine2 f34807b;
    public final Utilities.Callback2 f34808c;

    public r6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f34806a = i10;
        this.f34807b = walletEngine2;
        this.f34808c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34806a) {
            case 0:
                this.f34807b.lambda$emulateRotateKey$30(this.f34808c);
                return;
            case 1:
                this.f34807b.lambda$balance$14(this.f34808c);
                return;
            default:
                this.f34807b.lambda$prepareSendNFT$24(this.f34808c);
                return;
        }
    }
}
