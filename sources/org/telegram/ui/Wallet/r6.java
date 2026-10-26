package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class r6 implements Runnable {
    public final int f37188a;
    public final WalletEngine2 f37189b;
    public final Utilities.Callback2 f37190c;

    public r6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f37188a = i10;
        this.f37189b = walletEngine2;
        this.f37190c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f37188a) {
            case 0:
                this.f37189b.lambda$emulateRotateKey$30(this.f37190c);
                return;
            case 1:
                this.f37189b.lambda$balance$14(this.f37190c);
                return;
            default:
                this.f37189b.lambda$prepareSendNFT$24(this.f37190c);
                return;
        }
    }
}
