package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class r6 implements Runnable {
    public final int f35547a;
    public final AtomicBoolean f35548b;
    public final FutureTask f35549c;

    public r6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f35547a = i10;
        this.f35548b = atomicBoolean;
        this.f35549c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f35547a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.f35548b, this.f35549c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.f35548b, this.f35549c);
                return;
        }
    }
}
