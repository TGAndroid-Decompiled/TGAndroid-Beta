package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class h6 implements Runnable {
    public final int f32979a;
    public final WalletEngine2 f32980b;
    public final Utilities.Callback2 f32981c;

    public h6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f32979a = i10;
        this.f32980b = walletEngine2;
        this.f32981c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f32979a) {
            case 0:
                this.f32980b.lambda$emulateRotateKey$30(this.f32981c);
                return;
            case 1:
                this.f32980b.lambda$balance$14(this.f32981c);
                return;
            default:
                this.f32980b.lambda$prepareSendNFT$24(this.f32981c);
                return;
        }
    }
}
