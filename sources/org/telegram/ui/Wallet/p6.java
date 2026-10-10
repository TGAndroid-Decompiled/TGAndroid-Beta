package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
public final class p6 implements Runnable {
    public final int f35448a;
    public final AtomicBoolean f35449b;
    public final Utilities.Callback2 f35450c;

    public p6(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, int i10) {
        this.f35448a = i10;
        this.f35449b = atomicBoolean;
        this.f35450c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35448a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f35449b, this.f35450c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f35449b, this.f35450c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f35449b, this.f35450c);
                return;
        }
    }
}
