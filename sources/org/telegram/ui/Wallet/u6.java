package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class u6 implements Runnable {
    public final int f34934a;
    public final WalletEngine2 f34935b;
    public final Utilities.Callback2 f34936c;

    public u6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f34934a = i10;
        this.f34935b = walletEngine2;
        this.f34936c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34934a) {
            case 0:
                this.f34935b.lambda$emulateRotateKey$30(this.f34936c);
                return;
            case 1:
                this.f34935b.lambda$balance$14(this.f34936c);
                return;
            default:
                this.f34935b.lambda$prepareSendNFT$24(this.f34936c);
                return;
        }
    }
}
