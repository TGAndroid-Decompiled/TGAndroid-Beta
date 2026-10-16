package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
public final class o6 implements Runnable {
    public final int f33292a;
    public final AtomicBoolean f33293b;
    public final Utilities.Callback2 f33294c;

    public o6(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, int i10) {
        this.f33292a = i10;
        this.f33293b = atomicBoolean;
        this.f33294c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f33292a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f33293b, this.f33294c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f33293b, this.f33294c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f33293b, this.f33294c);
                return;
        }
    }
}
