package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class f6 implements Runnable {
    public final int f34948a;
    public final WalletEngine2 f34949b;
    public final Utilities.Callback2 f34950c;
    public final TL_wallet.sendTransfer d;
    public final String f34951e;

    public f6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.sendTransfer sendtransfer, String str, int i10) {
        this.f34948a = i10;
        this.f34949b = walletEngine2;
        this.f34950c = callback2;
        this.d = sendtransfer;
        this.f34951e = str;
    }

    @Override
    public final void run() {
        switch (this.f34948a) {
            case 0:
                this.f34949b.lambda$prepareTonConnectTransfer$4(this.f34950c, this.d, this.f34951e);
                return;
            default:
                this.f34949b.lambda$prepareSendNFT$25(this.f34950c, this.d, this.f34951e);
                return;
        }
    }
}
