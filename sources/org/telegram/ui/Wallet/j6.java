package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class j6 implements Runnable {
    public final int f34923a;
    public final WalletEngine2 f34924b;
    public final Utilities.Callback2 f34925c;

    public j6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f34923a = i10;
        this.f34924b = walletEngine2;
        this.f34925c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34923a) {
            case 0:
                this.f34924b.lambda$emulateRotateKey$30(this.f34925c);
                return;
            case 1:
                this.f34924b.lambda$balance$14(this.f34925c);
                return;
            default:
                this.f34924b.lambda$prepareSendNFT$24(this.f34925c);
                return;
        }
    }
}
