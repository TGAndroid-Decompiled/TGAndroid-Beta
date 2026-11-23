package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class z7 implements Runnable {
    public final int f45495a;
    public final AtomicBoolean f45496b;
    public final FutureTask f45497c;

    public z7(AtomicBoolean atomicBoolean, FutureTask futureTask, int i7) {
        this.f45495a = i7;
        this.f45496b = atomicBoolean;
        this.f45497c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f45495a) {
            case 0:
                WalletEngine2.N(this.f45496b, this.f45497c);
                return;
            default:
                WalletEngine2.B(this.f45496b, this.f45497c);
                return;
        }
    }
}
