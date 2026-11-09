package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.v10;
public final class g7 implements Runnable {
    public final int f42514a;
    public final AtomicBoolean f42515b;
    public final v10 f42516c;

    public g7(AtomicBoolean atomicBoolean, v10 v10Var, int i7) {
        this.f42514a = i7;
        this.f42515b = atomicBoolean;
        this.f42516c = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f42514a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f42515b, this.f42516c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f42515b, this.f42516c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f42515b, this.f42516c);
                return;
        }
    }
}
