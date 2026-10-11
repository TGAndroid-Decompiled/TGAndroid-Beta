package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class r6 implements Runnable {
    public final int f35513a;
    public final AtomicBoolean f35514b;
    public final FutureTask f35515c;

    public r6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f35513a = i10;
        this.f35514b = atomicBoolean;
        this.f35515c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f35513a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.f35514b, this.f35515c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.f35514b, this.f35515c);
                return;
        }
    }
}
