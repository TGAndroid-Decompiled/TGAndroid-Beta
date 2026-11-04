package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.n10;
public final class g7 implements Runnable {
    public final int f42580a;
    public final AtomicBoolean f42581b;
    public final n10 f42582c;

    public g7(AtomicBoolean atomicBoolean, n10 n10Var, int i3) {
        this.f42580a = i3;
        this.f42581b = atomicBoolean;
        this.f42582c = n10Var;
    }

    @Override
    public final void run() {
        switch (this.f42580a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f42581b, this.f42582c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f42581b, this.f42582c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f42581b, this.f42582c);
                return;
        }
    }
}
