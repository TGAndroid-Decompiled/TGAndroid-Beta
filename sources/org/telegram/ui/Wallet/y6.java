package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
public final class y6 implements Runnable {
    public final int f35152a;
    public final AtomicBoolean f35153b;
    public final Utilities.Callback2 f35154c;

    public y6(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, int i10) {
        this.f35152a = i10;
        this.f35153b = atomicBoolean;
        this.f35154c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35152a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f35153b, this.f35154c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f35153b, this.f35154c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f35153b, this.f35154c);
                return;
        }
    }
}
