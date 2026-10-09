package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class d6 implements Runnable {
    public final int f34825a;
    public final WalletEngine2 f34826b;
    public final Utilities.Callback2 f34827c;
    public final TL_wallet.sendTransfer d;
    public final String f34828e;

    public d6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.sendTransfer sendtransfer, String str, int i10) {
        this.f34825a = i10;
        this.f34826b = walletEngine2;
        this.f34827c = callback2;
        this.d = sendtransfer;
        this.f34828e = str;
    }

    @Override
    public final void run() {
        switch (this.f34825a) {
            case 0:
                this.f34826b.lambda$prepareTonConnectTransfer$4(this.f34827c, this.d, this.f34828e);
                return;
            default:
                this.f34826b.lambda$prepareSendNFT$25(this.f34827c, this.d, this.f34828e);
                return;
        }
    }
}
