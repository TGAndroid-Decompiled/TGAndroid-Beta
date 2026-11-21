package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class y7 implements Runnable {
    public final int f45363a;
    public final AtomicBoolean f45364b;
    public final FutureTask f45365c;

    public y7(AtomicBoolean atomicBoolean, FutureTask futureTask, int i7) {
        this.f45363a = i7;
        this.f45364b = atomicBoolean;
        this.f45365c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f45363a) {
            case 0:
                WalletEngine2.N(this.f45364b, this.f45365c);
                return;
            default:
                WalletEngine2.B(this.f45364b, this.f45365c);
                return;
        }
    }
}
