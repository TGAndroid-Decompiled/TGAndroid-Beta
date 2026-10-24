package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class z6 implements Runnable {
    public final int f35506a;
    public final AtomicBoolean f35507b;
    public final FutureTask f35508c;

    public z6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f35506a = i10;
        this.f35507b = atomicBoolean;
        this.f35508c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f35506a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.f35507b, this.f35508c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.f35507b, this.f35508c);
                return;
        }
    }
}
