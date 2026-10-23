package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class z6 implements Runnable {
    public final int f35193a;
    public final AtomicBoolean f35194b;
    public final FutureTask f35195c;

    public z6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f35193a = i10;
        this.f35194b = atomicBoolean;
        this.f35195c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f35193a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.f35194b, this.f35195c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.f35194b, this.f35195c);
                return;
        }
    }
}
