package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class r6 implements Runnable {
    public final int f34807a;
    public final WalletEngine2 f34808b;
    public final Utilities.Callback2 f34809c;

    public r6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f34807a = i10;
        this.f34808b = walletEngine2;
        this.f34809c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34807a) {
            case 0:
                this.f34808b.lambda$emulateRotateKey$30(this.f34809c);
                return;
            case 1:
                this.f34808b.lambda$balance$14(this.f34809c);
                return;
            default:
                this.f34808b.lambda$prepareSendNFT$24(this.f34809c);
                return;
        }
    }
}
