package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class r6 implements Runnable {
    public final int f35106a;
    public final WalletEngine2 f35107b;
    public final Utilities.Callback2 f35108c;

    public r6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f35106a = i10;
        this.f35107b = walletEngine2;
        this.f35108c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35106a) {
            case 0:
                this.f35107b.lambda$emulateRotateKey$30(this.f35108c);
                return;
            case 1:
                this.f35107b.lambda$balance$14(this.f35108c);
                return;
            default:
                this.f35107b.lambda$prepareSendNFT$24(this.f35108c);
                return;
        }
    }
}
