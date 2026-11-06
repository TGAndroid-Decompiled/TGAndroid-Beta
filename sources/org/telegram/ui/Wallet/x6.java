package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class x6 implements Runnable {
    public final int f43329a;
    public final WalletEngine2 f43330b;
    public final v10 f43331c;
    public final TL_wallet.sendTransfer d;
    public final String f43332e;

    public x6(WalletEngine2 walletEngine2, v10 v10Var, TL_wallet.sendTransfer sendtransfer, String str, int i7) {
        this.f43329a = i7;
        this.f43330b = walletEngine2;
        this.f43331c = v10Var;
        this.d = sendtransfer;
        this.f43332e = str;
    }

    @Override
    public final void run() {
        switch (this.f43329a) {
            case 0:
                this.f43330b.lambda$prepareTonConnectTransfer$4(this.f43331c, this.d, this.f43332e);
                return;
            default:
                this.f43330b.lambda$prepareSendNFT$25(this.f43331c, this.d, this.f43332e);
                return;
        }
    }
}
