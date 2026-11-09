package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class h7 implements Runnable {
    public final int f42556a;
    public final AtomicBoolean f42557b;
    public final FutureTask f42558c;

    public h7(AtomicBoolean atomicBoolean, FutureTask futureTask, int i7) {
        this.f42556a = i7;
        this.f42557b = atomicBoolean;
        this.f42558c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f42556a) {
            case 0:
                WalletEngine2.p(this.f42557b, this.f42558c);
                return;
            default:
                WalletEngine2.k(this.f42557b, this.f42558c);
                return;
        }
    }
}
