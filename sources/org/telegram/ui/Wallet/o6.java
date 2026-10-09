package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class o6 implements Runnable {
    public final int f35324a;
    public final AtomicBoolean f35325b;
    public final FutureTask f35326c;

    public o6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f35324a = i10;
        this.f35325b = atomicBoolean;
        this.f35326c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f35324a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.f35325b, this.f35326c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.f35325b, this.f35326c);
                return;
        }
    }
}
