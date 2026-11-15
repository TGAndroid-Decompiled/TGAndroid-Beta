package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.s10;
public final class i7 implements Runnable {
    public final int f43987a;
    public final AtomicBoolean f43988b;
    public final s10 f43989c;

    public i7(AtomicBoolean atomicBoolean, s10 s10Var, int i7) {
        this.f43987a = i7;
        this.f43988b = atomicBoolean;
        this.f43989c = s10Var;
    }

    @Override
    public final void run() {
        switch (this.f43987a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f43988b, this.f43989c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f43988b, this.f43989c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f43988b, this.f43989c);
                return;
        }
    }
}
