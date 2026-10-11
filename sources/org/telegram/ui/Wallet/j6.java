package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class j6 implements Runnable {
    public final int f35114a;
    public final WalletEngine2 f35115b;
    public final Utilities.Callback2 f35116c;

    public j6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f35114a = i10;
        this.f35115b = walletEngine2;
        this.f35116c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35114a) {
            case 0:
                this.f35115b.lambda$emulateRotateKey$30(this.f35116c);
                return;
            case 1:
                this.f35115b.lambda$balance$14(this.f35116c);
                return;
            default:
                this.f35115b.lambda$prepareSendNFT$24(this.f35116c);
                return;
        }
    }
}
