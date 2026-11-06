package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.v10;
public final class i7 implements Runnable {
    public final int f42625a;
    public final AtomicBoolean f42626b;
    public final v10 f42627c;

    public i7(AtomicBoolean atomicBoolean, v10 v10Var, int i7) {
        this.f42625a = i7;
        this.f42626b = atomicBoolean;
        this.f42627c = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f42625a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f42626b, this.f42627c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f42626b, this.f42627c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f42626b, this.f42627c);
                return;
        }
    }
}
