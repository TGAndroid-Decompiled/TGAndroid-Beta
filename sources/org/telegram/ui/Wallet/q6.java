package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
public final class q6 implements Runnable {
    public final int f35512a;
    public final AtomicBoolean f35513b;
    public final Utilities.Callback2 f35514c;

    public q6(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, int i10) {
        this.f35512a = i10;
        this.f35513b = atomicBoolean;
        this.f35514c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35512a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f35513b, this.f35514c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f35513b, this.f35514c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f35513b, this.f35514c);
                return;
        }
    }
}
