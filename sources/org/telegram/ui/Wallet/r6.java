package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class r6 implements Runnable {
    public final int f34810a;
    public final WalletEngine2 f34811b;
    public final Utilities.Callback2 f34812c;

    public r6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f34810a = i10;
        this.f34811b = walletEngine2;
        this.f34812c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34810a) {
            case 0:
                this.f34811b.lambda$emulateRotateKey$30(this.f34812c);
                return;
            case 1:
                this.f34811b.lambda$balance$14(this.f34812c);
                return;
            default:
                this.f34811b.lambda$prepareSendNFT$24(this.f34812c);
                return;
        }
    }
}
