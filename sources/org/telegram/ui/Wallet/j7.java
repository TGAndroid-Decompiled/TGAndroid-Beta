package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class j7 implements Runnable {
    public final int f44025a;
    public final AtomicBoolean f44026b;
    public final FutureTask f44027c;

    public j7(AtomicBoolean atomicBoolean, FutureTask futureTask, int i7) {
        this.f44025a = i7;
        this.f44026b = atomicBoolean;
        this.f44027c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f44025a) {
            case 0:
                WalletEngine2.p(this.f44026b, this.f44027c);
                return;
            default:
                WalletEngine2.k(this.f44026b, this.f44027c);
                return;
        }
    }
}
