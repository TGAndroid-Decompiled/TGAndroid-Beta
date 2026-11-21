package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_wallet;
public final class n7 implements Runnable {
    public final int f44694a;
    public final WalletEngine2 f44695b;
    public final q10 f44696c;
    public final TL_wallet.sendTransfer d;
    public final String f44697e;

    public n7(WalletEngine2 walletEngine2, q10 q10Var, TL_wallet.sendTransfer sendtransfer, String str, int i7) {
        this.f44694a = i7;
        this.f44695b = walletEngine2;
        this.f44696c = q10Var;
        this.d = sendtransfer;
        this.f44697e = str;
    }

    @Override
    public final void run() {
        switch (this.f44694a) {
            case 0:
                this.f44695b.lambda$prepareTonConnectTransfer$4(this.f44696c, this.d, this.f44697e);
                return;
            case 1:
                this.f44695b.lambda$prepareTonConnectTransferPair$7(this.f44696c, this.d, this.f44697e);
                return;
            default:
                this.f44695b.lambda$prepareSendNFT$28(this.f44696c, this.d, this.f44697e);
                return;
        }
    }
}
