package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class h7 implements Runnable {
    public final int f42625a;
    public final AtomicBoolean f42626b;
    public final FutureTask f42627c;

    public h7(AtomicBoolean atomicBoolean, FutureTask futureTask, int i3) {
        this.f42625a = i3;
        this.f42626b = atomicBoolean;
        this.f42627c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f42625a) {
            case 0:
                WalletEngine2.p(this.f42626b, this.f42627c);
                return;
            default:
                WalletEngine2.k(this.f42626b, this.f42627c);
                return;
        }
    }
}
