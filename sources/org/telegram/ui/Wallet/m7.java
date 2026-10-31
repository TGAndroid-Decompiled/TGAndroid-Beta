package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.j20;
public final class m7 implements Runnable {
    public final int f34911a;
    public final AtomicBoolean f34912b;
    public final j20 f34913c;

    public m7(AtomicBoolean atomicBoolean, j20 j20Var, int i10) {
        this.f34911a = i10;
        this.f34912b = atomicBoolean;
        this.f34913c = j20Var;
    }

    @Override
    public final void run() {
        switch (this.f34911a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f34912b, this.f34913c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f34912b, this.f34913c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f34912b, this.f34913c);
                return;
        }
    }
}
