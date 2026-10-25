package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class z6 implements Runnable {
    public final int f37561a;
    public final AtomicBoolean f37562b;
    public final FutureTask f37563c;

    public z6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f37561a = i10;
        this.f37562b = atomicBoolean;
        this.f37563c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f37561a) {
            case 0:
                WalletEngine2.p(this.f37562b, this.f37563c);
                return;
            default:
                WalletEngine2.k(this.f37562b, this.f37563c);
                return;
        }
    }
}
