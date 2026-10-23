package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
public final class y6 implements Runnable {
    public final int f35156a;
    public final AtomicBoolean f35157b;
    public final Utilities.Callback2 f35158c;

    public y6(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, int i10) {
        this.f35156a = i10;
        this.f35157b = atomicBoolean;
        this.f35158c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35156a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f35157b, this.f35158c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f35157b, this.f35158c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f35157b, this.f35158c);
                return;
        }
    }
}
