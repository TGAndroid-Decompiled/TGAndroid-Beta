package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class z6 implements Runnable {
    public final int f35185a;
    public final AtomicBoolean f35186b;
    public final FutureTask f35187c;

    public z6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f35185a = i10;
        this.f35186b = atomicBoolean;
        this.f35187c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f35185a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.f35186b, this.f35187c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.f35186b, this.f35187c);
                return;
        }
    }
}
