package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
public final class n6 implements Runnable {
    public final int f33518a;
    public final AtomicBoolean f33519b;
    public final Utilities.Callback2 f33520c;

    public n6(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, int i10) {
        this.f33518a = i10;
        this.f33519b = atomicBoolean;
        this.f33520c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f33518a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f33519b, this.f33520c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f33519b, this.f33520c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f33519b, this.f33520c);
                return;
        }
    }
}
