package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class w6 implements Runnable {
    public final int f43298a;
    public final WalletEngine2 f43299b;
    public final v10 f43300c;
    public final TL_wallet.sendTransfer d;
    public final String f43301e;

    public w6(WalletEngine2 walletEngine2, v10 v10Var, TL_wallet.sendTransfer sendtransfer, String str, int i7) {
        this.f43298a = i7;
        this.f43299b = walletEngine2;
        this.f43300c = v10Var;
        this.d = sendtransfer;
        this.f43301e = str;
    }

    @Override
    public final void run() {
        switch (this.f43298a) {
            case 0:
                this.f43299b.lambda$prepareTonConnectTransfer$4(this.f43300c, this.d, this.f43301e);
                return;
            default:
                this.f43299b.lambda$prepareSendNFT$25(this.f43300c, this.d, this.f43301e);
                return;
        }
    }
}
