package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.v10;
public final class i7 implements Runnable {
    public final int f42600a;
    public final AtomicBoolean f42601b;
    public final v10 f42602c;

    public i7(AtomicBoolean atomicBoolean, v10 v10Var, int i7) {
        this.f42600a = i7;
        this.f42601b = atomicBoolean;
        this.f42602c = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f42600a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f42601b, this.f42602c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f42601b, this.f42602c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f42601b, this.f42602c);
                return;
        }
    }
}
