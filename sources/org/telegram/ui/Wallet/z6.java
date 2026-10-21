package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class z6 implements Runnable {
    public final int f35189a;
    public final AtomicBoolean f35190b;
    public final FutureTask f35191c;

    public z6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f35189a = i10;
        this.f35190b = atomicBoolean;
        this.f35191c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f35189a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.f35190b, this.f35191c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.f35190b, this.f35191c);
                return;
        }
    }
}
