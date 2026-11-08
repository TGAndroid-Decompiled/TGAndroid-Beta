package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class a7 implements Runnable {
    public final int f42120a;
    public final WalletEngine2 f42121b;
    public final v10 f42122c;

    public a7(WalletEngine2 walletEngine2, v10 v10Var, int i7) {
        this.f42120a = i7;
        this.f42121b = walletEngine2;
        this.f42122c = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f42120a) {
            case 0:
                this.f42121b.lambda$emulateRotateKey$30(this.f42122c);
                return;
            case 1:
                this.f42121b.lambda$balance$14(this.f42122c);
                return;
            default:
                this.f42121b.lambda$prepareSendNFT$24(this.f42122c);
                return;
        }
    }
}
