package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
public final class y6 implements Runnable {
    public final int f37518a;
    public final AtomicBoolean f37519b;
    public final Utilities.Callback2 f37520c;

    public y6(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, int i10) {
        this.f37518a = i10;
        this.f37519b = atomicBoolean;
        this.f37520c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f37518a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f37519b, this.f37520c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f37519b, this.f37520c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f37519b, this.f37520c);
                return;
        }
    }
}
