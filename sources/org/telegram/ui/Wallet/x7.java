package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.q10;
public final class x7 implements Runnable {
    public final int f45317a;
    public final AtomicBoolean f45318b;
    public final q10 f45319c;

    public x7(AtomicBoolean atomicBoolean, q10 q10Var, int i7) {
        this.f45317a = i7;
        this.f45318b = atomicBoolean;
        this.f45319c = q10Var;
    }

    @Override
    public final void run() {
        switch (this.f45317a) {
            case 0:
                WalletEngine2.lambda$emulateSend$20(this.f45318b, this.f45319c);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$24(this.f45318b, this.f45319c);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$25(this.f45318b, this.f45319c);
                return;
        }
    }
}
