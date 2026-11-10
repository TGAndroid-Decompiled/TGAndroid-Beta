package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class y6 implements Runnable {
    public final int f43385a;
    public final WalletEngine2 f43386b;
    public final v10 f43387c;
    public final TL_wallet.sendTransfer d;
    public final String f43388e;

    public y6(WalletEngine2 walletEngine2, v10 v10Var, TL_wallet.sendTransfer sendtransfer, String str, int i7) {
        this.f43385a = i7;
        this.f43386b = walletEngine2;
        this.f43387c = v10Var;
        this.d = sendtransfer;
        this.f43388e = str;
    }

    @Override
    public final void run() {
        switch (this.f43385a) {
            case 0:
                this.f43386b.lambda$prepareTonConnectTransfer$4(this.f43387c, this.d, this.f43388e);
                return;
            default:
                this.f43386b.lambda$prepareSendNFT$25(this.f43387c, this.d, this.f43388e);
                return;
        }
    }
}
