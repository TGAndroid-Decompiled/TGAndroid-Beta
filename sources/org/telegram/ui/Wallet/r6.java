package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class r6 implements Runnable {
    public final int f35108a;
    public final WalletEngine2 f35109b;
    public final Utilities.Callback2 f35110c;

    public r6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f35108a = i10;
        this.f35109b = walletEngine2;
        this.f35110c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35108a) {
            case 0:
                this.f35109b.lambda$emulateRotateKey$30(this.f35110c);
                return;
            case 1:
                this.f35109b.lambda$balance$14(this.f35110c);
                return;
            default:
                this.f35109b.lambda$prepareSendNFT$24(this.f35110c);
                return;
        }
    }
}
