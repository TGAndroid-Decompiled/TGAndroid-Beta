package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class n7 implements Runnable {
    public final int f34945a;
    public final AtomicBoolean f34946b;
    public final FutureTask f34947c;

    public n7(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f34945a = i10;
        this.f34946b = atomicBoolean;
        this.f34947c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f34945a) {
            case 0:
                WalletEngine2.p(this.f34946b, this.f34947c);
                return;
            default:
                WalletEngine2.k(this.f34946b, this.f34947c);
                return;
        }
    }
}
