package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.p10;
public final class y7 implements Runnable {
    public final int f45449a;
    public final AtomicBoolean f45450b;
    public final p10 f45451c;

    public y7(AtomicBoolean atomicBoolean, p10 p10Var, int i7) {
        this.f45449a = i7;
        this.f45450b = atomicBoolean;
        this.f45451c = p10Var;
    }

    @Override
    public final void run() {
        switch (this.f45449a) {
            case 0:
                WalletEngine2.lambda$emulateSend$20(this.f45450b, this.f45451c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$24(this.f45450b, this.f45451c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$25(this.f45450b, this.f45451c);
                return;
        }
    }
}
