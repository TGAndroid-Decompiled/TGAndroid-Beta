package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class g6 implements Runnable {
    public final int f34933a;
    public final WalletEngine2 f34934b;
    public final Utilities.Callback2 f34935c;

    public g6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f34933a = i10;
        this.f34934b = walletEngine2;
        this.f34935c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34933a) {
            case 0:
                this.f34934b.lambda$emulateRotateKey$30(this.f34935c);
                return;
            case 1:
                this.f34934b.lambda$balance$14(this.f34935c);
                return;
            default:
                this.f34934b.lambda$prepareSendNFT$24(this.f34935c);
                return;
        }
    }
}
