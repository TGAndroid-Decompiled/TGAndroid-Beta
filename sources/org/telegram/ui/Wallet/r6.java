package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class r6 implements Runnable {
    public final int f37185a;
    public final WalletEngine2 f37186b;
    public final Utilities.Callback2 f37187c;

    public r6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f37185a = i10;
        this.f37186b = walletEngine2;
        this.f37187c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f37185a) {
            case 0:
                this.f37186b.lambda$emulateRotateKey$30(this.f37187c);
                return;
            case 1:
                this.f37186b.lambda$balance$14(this.f37187c);
                return;
            default:
                this.f37186b.lambda$prepareSendNFT$24(this.f37187c);
                return;
        }
    }
}
