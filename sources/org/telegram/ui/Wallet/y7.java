package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class y7 implements Runnable {
    public final int f45323a;
    public final AtomicBoolean f45324b;
    public final FutureTask f45325c;

    public y7(AtomicBoolean atomicBoolean, FutureTask futureTask, int i7) {
        this.f45323a = i7;
        this.f45324b = atomicBoolean;
        this.f45325c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f45323a) {
            case 0:
                WalletEngine2.N(this.f45324b, this.f45325c);
                return;
            default:
                WalletEngine2.B(this.f45324b, this.f45325c);
                return;
        }
    }
}
