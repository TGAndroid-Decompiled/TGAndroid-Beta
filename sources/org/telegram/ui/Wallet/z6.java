package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class z6 implements Runnable {
    public final int f35182a;
    public final AtomicBoolean f35183b;
    public final FutureTask f35184c;

    public z6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f35182a = i10;
        this.f35183b = atomicBoolean;
        this.f35184c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f35182a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.f35183b, this.f35184c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.f35183b, this.f35184c);
                return;
        }
    }
}
