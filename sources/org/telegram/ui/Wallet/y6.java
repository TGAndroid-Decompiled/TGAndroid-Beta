package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
public final class y6 implements Runnable {
    public final int f35151a;
    public final AtomicBoolean f35152b;
    public final Utilities.Callback2 f35153c;

    public y6(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, int i10) {
        this.f35151a = i10;
        this.f35152b = atomicBoolean;
        this.f35153c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35151a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f35152b, this.f35153c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f35152b, this.f35153c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f35152b, this.f35153c);
                return;
        }
    }
}
