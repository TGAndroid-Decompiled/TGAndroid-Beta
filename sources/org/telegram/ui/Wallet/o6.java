package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class o6 implements Runnable {
    public final int f33571a;
    public final AtomicBoolean f33572b;
    public final FutureTask f33573c;

    public o6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f33571a = i10;
        this.f33572b = atomicBoolean;
        this.f33573c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f33571a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.f33572b, this.f33573c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.f33572b, this.f33573c);
                return;
        }
    }
}
