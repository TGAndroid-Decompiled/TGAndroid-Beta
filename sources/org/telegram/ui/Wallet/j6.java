package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class j6 implements Runnable {
    public final int f34925a;
    public final WalletEngine2 f34926b;
    public final Utilities.Callback2 f34927c;

    public j6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f34925a = i10;
        this.f34926b = walletEngine2;
        this.f34927c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34925a) {
            case 0:
                this.f34926b.lambda$emulateRotateKey$30(this.f34927c);
                return;
            case 1:
                this.f34926b.lambda$balance$14(this.f34927c);
                return;
            default:
                this.f34926b.lambda$prepareSendNFT$24(this.f34927c);
                return;
        }
    }
}
