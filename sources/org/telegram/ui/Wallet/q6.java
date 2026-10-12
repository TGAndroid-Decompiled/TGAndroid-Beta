package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
public final class q6 implements Runnable {
    public final int f35294a;
    public final AtomicBoolean f35295b;
    public final Utilities.Callback2 f35296c;

    public q6(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, int i10) {
        this.f35294a = i10;
        this.f35295b = atomicBoolean;
        this.f35296c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35294a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.f35295b, this.f35296c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.f35295b, this.f35296c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.f35295b, this.f35296c);
                return;
        }
    }
}
