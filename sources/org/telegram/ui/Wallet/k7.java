package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class k7 implements Runnable {
    public final int f42729a;
    public final AtomicBoolean f42730b;
    public final FutureTask f42731c;

    public k7(AtomicBoolean atomicBoolean, FutureTask futureTask, int i7) {
        this.f42729a = i7;
        this.f42730b = atomicBoolean;
        this.f42731c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f42729a) {
            case 0:
                WalletEngine2.p(this.f42730b, this.f42731c);
                return;
            default:
                WalletEngine2.k(this.f42730b, this.f42731c);
                return;
        }
    }
}
