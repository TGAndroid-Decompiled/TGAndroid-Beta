package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class r6 implements Runnable {
    public final int f34798a;
    public final WalletEngine2 f34799b;
    public final Utilities.Callback2 f34800c;

    public r6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f34798a = i10;
        this.f34799b = walletEngine2;
        this.f34800c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34798a) {
            case 0:
                this.f34799b.lambda$emulateRotateKey$30(this.f34800c);
                return;
            case 1:
                this.f34799b.lambda$balance$14(this.f34800c);
                return;
            default:
                this.f34799b.lambda$prepareSendNFT$24(this.f34800c);
                return;
        }
    }
}
