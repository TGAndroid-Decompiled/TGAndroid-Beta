package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
public final class e7 implements Runnable {
    public final int f34203a;
    public final AtomicBoolean f34204b;
    public final Utilities.Callback2 f34205c;

    public e7(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, int i10) {
        this.f34203a = i10;
        this.f34204b = atomicBoolean;
        this.f34205c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34203a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f34204b, this.f34205c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f34204b, this.f34205c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f34204b, this.f34205c);
                return;
        }
    }
}
