package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
public final class b7 implements Runnable {
    public final int f34048a;
    public final AtomicBoolean f34049b;
    public final Utilities.Callback2 f34050c;

    public b7(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, int i10) {
        this.f34048a = i10;
        this.f34049b = atomicBoolean;
        this.f34050c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34048a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f34049b, this.f34050c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f34049b, this.f34050c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f34049b, this.f34050c);
                return;
        }
    }
}
