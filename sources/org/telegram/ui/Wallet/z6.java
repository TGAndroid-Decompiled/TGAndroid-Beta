package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class z6 implements Runnable {
    public final int f35180a;
    public final AtomicBoolean f35181b;
    public final FutureTask f35182c;

    public z6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f35180a = i10;
        this.f35181b = atomicBoolean;
        this.f35182c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f35180a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.f35181b, this.f35182c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.f35181b, this.f35182c);
                return;
        }
    }
}
