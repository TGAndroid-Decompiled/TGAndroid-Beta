package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class r6 implements Runnable {
    public final int f34811a;
    public final WalletEngine2 f34812b;
    public final Utilities.Callback2 f34813c;

    public r6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f34811a = i10;
        this.f34812b = walletEngine2;
        this.f34813c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34811a) {
            case 0:
                this.f34812b.lambda$emulateRotateKey$30(this.f34813c);
                return;
            case 1:
                this.f34812b.lambda$balance$14(this.f34813c);
                return;
            default:
                this.f34812b.lambda$prepareSendNFT$24(this.f34813c);
                return;
        }
    }
}
