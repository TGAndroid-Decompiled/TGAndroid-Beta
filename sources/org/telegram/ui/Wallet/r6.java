package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class r6 implements Runnable {
    public final int f37212a;
    public final WalletEngine2 f37213b;
    public final Utilities.Callback2 f37214c;

    public r6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f37212a = i10;
        this.f37213b = walletEngine2;
        this.f37214c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f37212a) {
            case 0:
                this.f37213b.lambda$emulateRotateKey$30(this.f37214c);
                return;
            case 1:
                this.f37213b.lambda$balance$14(this.f37214c);
                return;
            default:
                this.f37213b.lambda$prepareSendNFT$24(this.f37214c);
                return;
        }
    }
}
