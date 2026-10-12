package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class g6 implements Runnable {
    public final int f33206a;
    public final WalletEngine2 f33207b;
    public final Utilities.Callback2 f33208c;

    public g6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f33206a = i10;
        this.f33207b = walletEngine2;
        this.f33208c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f33206a) {
            case 0:
                this.f33207b.lambda$emulateRotateKey$30(this.f33208c);
                return;
            case 1:
                this.f33207b.lambda$balance$14(this.f33208c);
                return;
            default:
                this.f33207b.lambda$prepareSendNFT$24(this.f33208c);
                return;
        }
    }
}
