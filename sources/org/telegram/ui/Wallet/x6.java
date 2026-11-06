package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class x6 implements Runnable {
    public final int f43330a;
    public final WalletEngine2 f43331b;
    public final v10 f43332c;
    public final TL_wallet.sendTransfer d;
    public final String f43333e;

    public x6(WalletEngine2 walletEngine2, v10 v10Var, TL_wallet.sendTransfer sendtransfer, String str, int i7) {
        this.f43330a = i7;
        this.f43331b = walletEngine2;
        this.f43332c = v10Var;
        this.d = sendtransfer;
        this.f43333e = str;
    }

    @Override
    public final void run() {
        switch (this.f43330a) {
            case 0:
                this.f43331b.lambda$prepareTonConnectTransfer$4(this.f43332c, this.d, this.f43333e);
                return;
            default:
                this.f43331b.lambda$prepareSendNFT$25(this.f43332c, this.d, this.f43333e);
                return;
        }
    }
}
