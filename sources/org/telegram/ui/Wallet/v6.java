package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class v6 implements Runnable {
    public final int f43216a;
    public final WalletEngine2 f43217b;
    public final v10 f43218c;
    public final TL_wallet.sendTransfer d;
    public final String f43219e;

    public v6(WalletEngine2 walletEngine2, v10 v10Var, TL_wallet.sendTransfer sendtransfer, String str, int i7) {
        this.f43216a = i7;
        this.f43217b = walletEngine2;
        this.f43218c = v10Var;
        this.d = sendtransfer;
        this.f43219e = str;
    }

    @Override
    public final void run() {
        switch (this.f43216a) {
            case 0:
                this.f43217b.lambda$prepareTonConnectTransfer$4(this.f43218c, this.d, this.f43219e);
                return;
            default:
                this.f43217b.lambda$prepareSendNFT$25(this.f43218c, this.d, this.f43219e);
                return;
        }
    }
}
