package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class x6 implements Runnable {
    public final int f43305a;
    public final WalletEngine2 f43306b;
    public final v10 f43307c;
    public final TL_wallet.sendTransfer d;
    public final String f43308e;

    public x6(WalletEngine2 walletEngine2, v10 v10Var, TL_wallet.sendTransfer sendtransfer, String str, int i7) {
        this.f43305a = i7;
        this.f43306b = walletEngine2;
        this.f43307c = v10Var;
        this.d = sendtransfer;
        this.f43308e = str;
    }

    @Override
    public final void run() {
        switch (this.f43305a) {
            case 0:
                this.f43306b.lambda$prepareTonConnectTransfer$4(this.f43307c, this.d, this.f43308e);
                return;
            default:
                this.f43306b.lambda$prepareSendNFT$25(this.f43307c, this.d, this.f43308e);
                return;
        }
    }
}
