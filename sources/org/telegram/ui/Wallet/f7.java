package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class f7 implements Runnable {
    public final int f34244a;
    public final AtomicBoolean f34245b;
    public final FutureTask f34246c;

    public f7(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.f34244a = i10;
        this.f34245b = atomicBoolean;
        this.f34246c = futureTask;
    }

    @Override
    public final void run() {
        switch (this.f34244a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.f34245b, this.f34246c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.f34245b, this.f34246c);
                return;
        }
    }
}
