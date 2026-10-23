package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class z6 implements Runnable {
    public final int f35504a;
    public final AtomicBoolean f35505b;
    public final FutureTask f35506c;

    public z6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f35504a = i10;
        this.f35505b = atomicBoolean;
        this.f35506c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f35504a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.f35505b, this.f35506c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.f35505b, this.f35506c);
                return;
        }
    }
}
