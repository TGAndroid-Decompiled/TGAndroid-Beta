package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class x6 implements Runnable {
    public final int f35093a;
    public final WalletEngine2 f35094b;
    public final Utilities.Callback2 f35095c;

    public x6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f35093a = i10;
        this.f35094b = walletEngine2;
        this.f35095c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35093a) {
            case 0:
                this.f35094b.lambda$emulateRotateKey$30(this.f35095c);
                return;
            case 1:
                this.f35094b.lambda$balance$14(this.f35095c);
                return;
            default:
                this.f35094b.lambda$prepareSendNFT$24(this.f35095c);
                return;
        }
    }
}
