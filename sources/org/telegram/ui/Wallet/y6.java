package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
public final class y6 implements Runnable {
    public final int f35140a;
    public final AtomicBoolean f35141b;
    public final Utilities.Callback2 f35142c;

    public y6(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, int i10) {
        this.f35140a = i10;
        this.f35141b = atomicBoolean;
        this.f35142c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35140a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f35141b, this.f35142c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f35141b, this.f35142c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f35141b, this.f35142c);
                return;
        }
    }
}
