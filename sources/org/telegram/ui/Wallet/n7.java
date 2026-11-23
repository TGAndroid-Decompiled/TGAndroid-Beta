package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
import org.telegram.tgnet.tl.TL_wallet;
public final class n7 implements Runnable {
    public final int f44664a;
    public final WalletEngine2 f44665b;
    public final r10 f44666c;
    public final TL_wallet.sendTransfer d;
    public final String f44667e;

    public n7(WalletEngine2 walletEngine2, r10 r10Var, TL_wallet.sendTransfer sendtransfer, String str, int i7) {
        this.f44664a = i7;
        this.f44665b = walletEngine2;
        this.f44666c = r10Var;
        this.d = sendtransfer;
        this.f44667e = str;
    }

    @Override
    public final void run() {
        switch (this.f44664a) {
            case 0:
                this.f44665b.lambda$prepareTonConnectTransfer$4(this.f44666c, this.d, this.f44667e);
                return;
            case 1:
                this.f44665b.lambda$prepareTonConnectTransferPair$7(this.f44666c, this.d, this.f44667e);
                return;
            default:
                this.f44665b.lambda$prepareSendNFT$28(this.f44666c, this.d, this.f44667e);
                return;
        }
    }
}
