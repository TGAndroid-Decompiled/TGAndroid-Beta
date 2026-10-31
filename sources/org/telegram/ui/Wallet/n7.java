package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class n7 implements Runnable {
    public final int f34947a;
    public final AtomicBoolean f34948b;
    public final FutureTask f34949c;

    public n7(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f34947a = i10;
        this.f34948b = atomicBoolean;
        this.f34949c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f34947a) {
            case 0:
                WalletEngine2.p(this.f34948b, this.f34949c);
                return;
            default:
                WalletEngine2.k(this.f34948b, this.f34949c);
                return;
        }
    }
}
