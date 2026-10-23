package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
public final class y6 implements Runnable {
    public final int f35454a;
    public final AtomicBoolean f35455b;
    public final Utilities.Callback2 f35456c;

    public y6(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, int i10) {
        this.f35454a = i10;
        this.f35455b = atomicBoolean;
        this.f35456c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35454a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f35455b, this.f35456c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f35455b, this.f35456c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f35455b, this.f35456c);
                return;
        }
    }
}
