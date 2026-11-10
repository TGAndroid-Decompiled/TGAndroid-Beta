package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.v10;
public final class j7 implements Runnable {
    public final int f42688a;
    public final AtomicBoolean f42689b;
    public final v10 f42690c;

    public j7(AtomicBoolean atomicBoolean, v10 v10Var, int i7) {
        this.f42688a = i7;
        this.f42689b = atomicBoolean;
        this.f42690c = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f42688a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f42689b, this.f42690c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f42689b, this.f42690c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f42689b, this.f42690c);
                return;
        }
    }
}
