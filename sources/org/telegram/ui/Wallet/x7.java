package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.q10;
public final class x7 implements Runnable {
    public final int f45277a;
    public final AtomicBoolean f45278b;
    public final q10 f45279c;

    public x7(AtomicBoolean atomicBoolean, q10 q10Var, int i7) {
        this.f45277a = i7;
        this.f45278b = atomicBoolean;
        this.f45279c = q10Var;
    }

    @Override
    public final void run() {
        switch (this.f45277a) {
            case 0:
                WalletEngine2.lambda$emulateSend$20(this.f45278b, this.f45279c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$24(this.f45278b, this.f45279c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$25(this.f45278b, this.f45279c);
                return;
        }
    }
}
