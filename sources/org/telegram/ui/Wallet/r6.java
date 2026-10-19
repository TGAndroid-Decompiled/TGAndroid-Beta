package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class r6 implements Runnable {
    public final int f34800a;
    public final WalletEngine2 f34801b;
    public final Utilities.Callback2 f34802c;

    public r6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f34800a = i10;
        this.f34801b = walletEngine2;
        this.f34802c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34800a) {
            case 0:
                this.f34801b.lambda$emulateRotateKey$30(this.f34802c);
                return;
            case 1:
                this.f34801b.lambda$balance$14(this.f34802c);
                return;
            default:
                this.f34801b.lambda$prepareSendNFT$24(this.f34802c);
                return;
        }
    }
}
