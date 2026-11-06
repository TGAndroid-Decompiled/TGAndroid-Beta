package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class j7 implements Runnable {
    public final int f42643a;
    public final AtomicBoolean f42644b;
    public final FutureTask f42645c;

    public j7(AtomicBoolean atomicBoolean, FutureTask futureTask, int i7) {
        this.f42643a = i7;
        this.f42644b = atomicBoolean;
        this.f42645c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f42643a) {
            case 0:
                WalletEngine2.p(this.f42644b, this.f42645c);
                return;
            default:
                WalletEngine2.k(this.f42644b, this.f42645c);
                return;
        }
    }
}
