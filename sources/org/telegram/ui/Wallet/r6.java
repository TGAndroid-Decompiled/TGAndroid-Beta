package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class r6 implements Runnable {
    public final int f34782a;
    public final WalletEngine2 f34783b;
    public final Utilities.Callback2 f34784c;

    public r6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f34782a = i10;
        this.f34783b = walletEngine2;
        this.f34784c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34782a) {
            case 0:
                this.f34783b.lambda$emulateRotateKey$30(this.f34784c);
                return;
            case 1:
                this.f34783b.lambda$balance$14(this.f34784c);
                return;
            default:
                this.f34783b.lambda$prepareSendNFT$24(this.f34784c);
                return;
        }
    }
}
