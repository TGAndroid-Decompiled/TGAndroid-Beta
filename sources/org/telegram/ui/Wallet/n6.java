package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
public final class n6 implements Runnable {
    public final int f35284a;
    public final AtomicBoolean f35285b;
    public final Utilities.Callback2 f35286c;

    public n6(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, int i10) {
        this.f35284a = i10;
        this.f35285b = atomicBoolean;
        this.f35286c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35284a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f35285b, this.f35286c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f35285b, this.f35286c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f35285b, this.f35286c);
                return;
        }
    }
}
