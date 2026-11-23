package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class y7 implements Runnable {
    public final int f45367a;
    public final AtomicBoolean f45368b;
    public final FutureTask f45369c;

    public y7(AtomicBoolean atomicBoolean, FutureTask futureTask, int i7) {
        this.f45367a = i7;
        this.f45368b = atomicBoolean;
        this.f45369c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f45367a) {
            case 0:
                WalletEngine2.N(this.f45368b, this.f45369c);
                return;
            default:
                WalletEngine2.B(this.f45368b, this.f45369c);
                return;
        }
    }
}
