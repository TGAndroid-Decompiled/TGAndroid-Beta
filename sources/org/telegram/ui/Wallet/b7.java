package org.telegram.ui.Wallet;

import org.telegram.messenger.j20;
import org.telegram.tgnet.tl.TL_wallet;
public final class b7 implements Runnable {
    public final int f34273a;
    public final WalletEngine2 f34274b;
    public final j20 f34275c;
    public final TL_wallet.sendTransfer d;
    public final String e;

    public b7(WalletEngine2 walletEngine2, j20 j20Var, TL_wallet.sendTransfer sendtransfer, String str, int i10) {
        this.f34273a = i10;
        this.f34274b = walletEngine2;
        this.f34275c = j20Var;
        this.d = sendtransfer;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f34273a) {
            case 0:
                this.f34274b.lambda$prepareTonConnectTransfer$4(this.f34275c, this.d, this.e);
                return;
            default:
                this.f34274b.lambda$prepareSendNFT$25(this.f34275c, this.d, this.e);
                return;
        }
    }
}
