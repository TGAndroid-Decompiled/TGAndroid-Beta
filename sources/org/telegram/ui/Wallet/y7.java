package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class y7 implements Runnable {
    public final int f45333a;
    public final AtomicBoolean f45334b;
    public final FutureTask f45335c;

    public y7(AtomicBoolean atomicBoolean, FutureTask futureTask, int i7) {
        this.f45333a = i7;
        this.f45334b = atomicBoolean;
        this.f45335c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f45333a) {
            case 0:
                WalletEngine2.N(this.f45334b, this.f45335c);
                return;
            default:
                WalletEngine2.B(this.f45334b, this.f45335c);
                return;
        }
    }
}
