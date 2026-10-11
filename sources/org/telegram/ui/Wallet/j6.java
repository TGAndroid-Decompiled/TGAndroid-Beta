package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class j6 implements Runnable {
    public final int f35148a;
    public final WalletEngine2 f35149b;
    public final Utilities.Callback2 f35150c;

    public j6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f35148a = i10;
        this.f35149b = walletEngine2;
        this.f35150c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35148a) {
            case 0:
                this.f35149b.lambda$emulateRotateKey$30(this.f35150c);
                return;
            case 1:
                this.f35149b.lambda$balance$14(this.f35150c);
                return;
            default:
                this.f35149b.lambda$prepareSendNFT$24(this.f35150c);
                return;
        }
    }
}
