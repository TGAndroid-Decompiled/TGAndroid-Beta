package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class c7 implements Runnable {
    public final int f34090a;
    public final AtomicBoolean f34091b;
    public final FutureTask f34092c;

    public c7(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f34090a = i10;
        this.f34091b = atomicBoolean;
        this.f34092c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f34090a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.f34091b, this.f34092c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.f34091b, this.f34092c);
                return;
        }
    }
}
