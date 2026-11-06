package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class b7 implements Runnable {
    public final int f42149a;
    public final WalletEngine2 f42150b;
    public final v10 f42151c;

    public b7(WalletEngine2 walletEngine2, v10 v10Var, int i7) {
        this.f42149a = i7;
        this.f42150b = walletEngine2;
        this.f42151c = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f42149a) {
            case 0:
                this.f42150b.lambda$emulateRotateKey$30(this.f42151c);
                return;
            case 1:
                this.f42150b.lambda$balance$14(this.f42151c);
                return;
            default:
                this.f42150b.lambda$prepareSendNFT$24(this.f42151c);
                return;
        }
    }
}
