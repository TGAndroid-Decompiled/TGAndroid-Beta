package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class r6 implements Runnable {
    public final int f35326a;
    public final AtomicBoolean f35327b;
    public final FutureTask f35328c;

    public r6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f35326a = i10;
        this.f35327b = atomicBoolean;
        this.f35328c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f35326a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.f35327b, this.f35328c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.f35327b, this.f35328c);
                return;
        }
    }
}
