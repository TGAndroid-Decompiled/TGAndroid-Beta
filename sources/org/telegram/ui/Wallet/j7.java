package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class j7 implements Runnable {
    public final int f42667a;
    public final AtomicBoolean f42668b;
    public final FutureTask f42669c;

    public j7(AtomicBoolean atomicBoolean, FutureTask futureTask, int i7) {
        this.f42667a = i7;
        this.f42668b = atomicBoolean;
        this.f42669c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f42667a) {
            case 0:
                WalletEngine2.p(this.f42668b, this.f42669c);
                return;
            default:
                WalletEngine2.k(this.f42668b, this.f42669c);
                return;
        }
    }
}
