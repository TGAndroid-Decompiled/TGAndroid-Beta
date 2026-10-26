package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class z6 implements Runnable {
    public final int f37564a;
    public final AtomicBoolean f37565b;
    public final FutureTask f37566c;

    public z6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f37564a = i10;
        this.f37565b = atomicBoolean;
        this.f37566c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f37564a) {
            case 0:
                WalletEngine2.p(this.f37565b, this.f37566c);
                return;
            default:
                WalletEngine2.k(this.f37565b, this.f37566c);
                return;
        }
    }
}
