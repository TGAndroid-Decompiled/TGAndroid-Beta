package org.telegram.ui.Wallet;

import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_wallet;
public final class v6 implements Runnable {
    public final int f43291a;
    public final WalletEngine2 f43292b;
    public final n10 f43293c;
    public final TL_wallet.sendTransfer d;
    public final String f43294e;

    public v6(WalletEngine2 walletEngine2, n10 n10Var, TL_wallet.sendTransfer sendtransfer, String str, int i3) {
        this.f43291a = i3;
        this.f43292b = walletEngine2;
        this.f43293c = n10Var;
        this.d = sendtransfer;
        this.f43294e = str;
    }

    @Override
    public final void run() {
        switch (this.f43291a) {
            case 0:
                this.f43292b.lambda$prepareTonConnectTransfer$4(this.f43293c, this.d, this.f43294e);
                return;
            default:
                this.f43292b.lambda$prepareSendNFT$25(this.f43293c, this.d, this.f43294e);
                return;
        }
    }
}
