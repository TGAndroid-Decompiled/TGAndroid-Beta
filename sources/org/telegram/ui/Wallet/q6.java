package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class q6 implements Runnable {
    public final int f35483a;
    public final AtomicBoolean f35484b;
    public final FutureTask f35485c;

    public q6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f35483a = i10;
        this.f35484b = atomicBoolean;
        this.f35485c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f35483a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.f35484b, this.f35485c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.f35484b, this.f35485c);
                return;
        }
    }
}
