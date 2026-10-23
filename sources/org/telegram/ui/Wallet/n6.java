package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class n6 implements Runnable {
    public final int f34907a;
    public final WalletEngine2 f34908b;
    public final Utilities.Callback2 f34909c;
    public final TL_wallet.sendTransfer d;
    public final String e;

    public n6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.sendTransfer sendtransfer, String str, int i10) {
        this.f34907a = i10;
        this.f34908b = walletEngine2;
        this.f34909c = callback2;
        this.d = sendtransfer;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f34907a) {
            case 0:
                this.f34908b.lambda$prepareTonConnectTransfer$4(this.f34909c, this.d, this.e);
                return;
            default:
                this.f34908b.lambda$prepareSendNFT$25(this.f34909c, this.d, this.e);
                return;
        }
    }
}
