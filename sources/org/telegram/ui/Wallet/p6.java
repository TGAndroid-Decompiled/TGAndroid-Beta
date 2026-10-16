package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class p6 implements Runnable {
    public final int f33345a;
    public final AtomicBoolean f33346b;
    public final FutureTask f33347c;

    public p6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f33345a = i10;
        this.f33346b = atomicBoolean;
        this.f33347c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f33345a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.f33346b, this.f33347c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.f33346b, this.f33347c);
                return;
        }
    }
}
