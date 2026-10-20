package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class z6 implements Runnable {
    public final int f35188a;
    public final AtomicBoolean f35189b;
    public final FutureTask f35190c;

    public z6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f35188a = i10;
        this.f35189b = atomicBoolean;
        this.f35190c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f35188a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.f35189b, this.f35190c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.f35189b, this.f35190c);
                return;
        }
    }
}
