package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class j7 implements Runnable {
    public final int f42668a;
    public final AtomicBoolean f42669b;
    public final FutureTask f42670c;

    public j7(AtomicBoolean atomicBoolean, FutureTask futureTask, int i7) {
        this.f42668a = i7;
        this.f42669b = atomicBoolean;
        this.f42670c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f42668a) {
            case 0:
                WalletEngine2.p(this.f42669b, this.f42670c);
                return;
            default:
                WalletEngine2.k(this.f42669b, this.f42670c);
                return;
        }
    }
}
