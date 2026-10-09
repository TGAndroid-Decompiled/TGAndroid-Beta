package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class p6 implements Runnable {
    public final int f35393a;
    public final AtomicBoolean f35394b;
    public final FutureTask f35395c;

    public p6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f35393a = i10;
        this.f35394b = atomicBoolean;
        this.f35395c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f35393a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.f35394b, this.f35395c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.f35394b, this.f35395c);
                return;
        }
    }
}
