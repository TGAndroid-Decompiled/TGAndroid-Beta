package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class h6 implements Runnable {
    public final int f34993a;
    public final WalletEngine2 f34994b;
    public final Utilities.Callback2 f34995c;

    public h6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.f34993a = i10;
        this.f34994b = walletEngine2;
        this.f34995c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34993a) {
            case 0:
                this.f34994b.lambda$emulateRotateKey$30(this.f34995c);
                return;
            case 1:
                this.f34994b.lambda$balance$14(this.f34995c);
                return;
            default:
                this.f34994b.lambda$prepareSendNFT$24(this.f34995c);
                return;
        }
    }
}
