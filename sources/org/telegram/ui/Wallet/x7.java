package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.r10;
public final class x7 implements Runnable {
    public final int f45321a;
    public final AtomicBoolean f45322b;
    public final r10 f45323c;

    public x7(AtomicBoolean atomicBoolean, r10 r10Var, int i7) {
        this.f45321a = i7;
        this.f45322b = atomicBoolean;
        this.f45323c = r10Var;
    }

    @Override
    public final void run() {
        switch (this.f45321a) {
            case 0:
                WalletEngine2.lambda$emulateSend$20(this.f45322b, this.f45323c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$24(this.f45322b, this.f45323c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$25(this.f45322b, this.f45323c);
                return;
        }
    }
}
