package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.k20;
public final class m7 implements Runnable {
    public final int f34910a;
    public final AtomicBoolean f34911b;
    public final k20 f34912c;

    public m7(AtomicBoolean atomicBoolean, k20 k20Var, int i10) {
        this.f34910a = i10;
        this.f34911b = atomicBoolean;
        this.f34912c = k20Var;
    }

    @Override
    public final void run() {
        switch (this.f34910a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f34911b, this.f34912c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f34911b, this.f34912c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f34911b, this.f34912c);
                return;
        }
    }
}
