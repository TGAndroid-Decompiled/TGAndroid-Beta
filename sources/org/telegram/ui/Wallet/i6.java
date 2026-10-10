package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f35084a;
    public final WalletEngine2 f35085b;
    public final Utilities.Callback2 f35086c;

    public i6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f35084a = i10;
        this.f35085b = walletEngine2;
        this.f35086c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35084a) {
            case 0:
                this.f35085b.lambda$emulateRotateKey$30(this.f35086c);
                return;
            case 1:
                this.f35085b.lambda$balance$14(this.f35086c);
                return;
            default:
                this.f35085b.lambda$prepareSendNFT$24(this.f35086c);
                return;
        }
    }
}
