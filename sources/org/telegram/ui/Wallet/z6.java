package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class z6 implements Runnable {
    public final int f37588a;
    public final AtomicBoolean f37589b;
    public final FutureTask f37590c;

    public z6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f37588a = i10;
        this.f37589b = atomicBoolean;
        this.f37590c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f37588a) {
            case 0:
                WalletEngine2.p(this.f37589b, this.f37590c);
                return;
            default:
                WalletEngine2.k(this.f37589b, this.f37590c);
                return;
        }
    }
}
