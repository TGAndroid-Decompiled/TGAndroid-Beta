package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
public final class o6 implements Runnable {
    public final int f35353a;
    public final AtomicBoolean f35354b;
    public final Utilities.Callback2 f35355c;

    public o6(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, int i10) {
        this.f35353a = i10;
        this.f35354b = atomicBoolean;
        this.f35355c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35353a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f35354b, this.f35355c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f35354b, this.f35355c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f35354b, this.f35355c);
                return;
        }
    }
}
