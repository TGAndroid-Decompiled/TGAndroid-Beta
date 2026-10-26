package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
public final class y6 implements Runnable {
    public final int f37521a;
    public final AtomicBoolean f37522b;
    public final Utilities.Callback2 f37523c;

    public y6(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, int i10) {
        this.f37521a = i10;
        this.f37522b = atomicBoolean;
        this.f37523c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f37521a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f37522b, this.f37523c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f37522b, this.f37523c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f37522b, this.f37523c);
                return;
        }
    }
}
