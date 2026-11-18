package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_wallet;
public final class n7 implements Runnable {
    public final int f44654a;
    public final WalletEngine2 f44655b;
    public final q10 f44656c;
    public final TL_wallet.sendTransfer d;
    public final String f44657e;

    public n7(WalletEngine2 walletEngine2, q10 q10Var, TL_wallet.sendTransfer sendtransfer, String str, int i7) {
        this.f44654a = i7;
        this.f44655b = walletEngine2;
        this.f44656c = q10Var;
        this.d = sendtransfer;
        this.f44657e = str;
    }

    @Override
    public final void run() {
        switch (this.f44654a) {
            case 0:
                this.f44655b.lambda$prepareTonConnectTransfer$4(this.f44656c, this.d, this.f44657e);
                return;
            case 1:
                this.f44655b.lambda$prepareTonConnectTransferPair$7(this.f44656c, this.d, this.f44657e);
                return;
            default:
                this.f44655b.lambda$prepareSendNFT$28(this.f44656c, this.d, this.f44657e);
                return;
        }
    }
}
