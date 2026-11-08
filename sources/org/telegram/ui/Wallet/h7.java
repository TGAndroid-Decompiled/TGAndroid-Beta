package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.v10;
public final class h7 implements Runnable {
    public final int f42595a;
    public final AtomicBoolean f42596b;
    public final v10 f42597c;

    public h7(AtomicBoolean atomicBoolean, v10 v10Var, int i7) {
        this.f42595a = i7;
        this.f42596b = atomicBoolean;
        this.f42597c = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f42595a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f42596b, this.f42597c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f42596b, this.f42597c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f42596b, this.f42597c);
                return;
        }
    }
}
