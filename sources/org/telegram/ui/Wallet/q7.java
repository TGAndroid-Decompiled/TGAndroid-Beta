package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
public final class q7 implements Runnable {
    public final int f44833a;
    public final WalletEngine2 f44834b;
    public final r10 f44835c;

    public q7(WalletEngine2 walletEngine2, r10 r10Var, int i7) {
        this.f44833a = i7;
        this.f44834b = walletEngine2;
        this.f44835c = r10Var;
    }

    @Override
    public final void run() {
        switch (this.f44833a) {
            case 0:
                this.f44834b.lambda$emulateRotateKey$33(this.f44835c);
                return;
            case 1:
                this.f44834b.lambda$prepareSendNFT$27(this.f44835c);
                return;
            default:
                this.f44834b.lambda$balance$17(this.f44835c);
                return;
        }
    }
}
