package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
public final class q6 implements Runnable {
    public final int f35478a;
    public final AtomicBoolean f35479b;
    public final Utilities.Callback2 f35480c;

    public q6(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, int i10) {
        this.f35478a = i10;
        this.f35479b = atomicBoolean;
        this.f35480c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35478a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f35479b, this.f35480c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f35479b, this.f35480c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f35479b, this.f35480c);
                return;
        }
    }
}
