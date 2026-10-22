package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class z6 implements Runnable {
    public final int f35192a;
    public final AtomicBoolean f35193b;
    public final FutureTask f35194c;

    public z6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f35192a = i10;
        this.f35193b = atomicBoolean;
        this.f35194c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f35192a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.f35193b, this.f35194c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.f35193b, this.f35194c);
                return;
        }
    }
}
