package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class z6 implements Runnable {
    public final int f43432a;
    public final WalletEngine2 f43433b;
    public final v10 f43434c;

    public z6(WalletEngine2 walletEngine2, v10 v10Var, int i7) {
        this.f43432a = i7;
        this.f43433b = walletEngine2;
        this.f43434c = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f43432a) {
            case 0:
                this.f43433b.lambda$emulateRotateKey$30(this.f43434c);
                return;
            case 1:
                this.f43433b.lambda$balance$14(this.f43434c);
                return;
            default:
                this.f43433b.lambda$prepareSendNFT$24(this.f43434c);
                return;
        }
    }
}
