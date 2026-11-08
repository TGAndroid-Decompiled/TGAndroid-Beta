package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class i7 implements Runnable {
    public final int f42637a;
    public final AtomicBoolean f42638b;
    public final FutureTask f42639c;

    public i7(AtomicBoolean atomicBoolean, FutureTask futureTask, int i7) {
        this.f42637a = i7;
        this.f42638b = atomicBoolean;
        this.f42639c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f42637a) {
            case 0:
                WalletEngine2.p(this.f42638b, this.f42639c);
                return;
            default:
                WalletEngine2.k(this.f42638b, this.f42639c);
                return;
        }
    }
}
