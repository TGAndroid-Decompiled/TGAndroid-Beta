package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_wallet;
public final class o7 implements Runnable {
    public final int f44826a;
    public final WalletEngine2 f44827b;
    public final p10 f44828c;
    public final TL_wallet.sendTransfer d;
    public final String f44829e;

    public o7(WalletEngine2 walletEngine2, p10 p10Var, TL_wallet.sendTransfer sendtransfer, String str, int i7) {
        this.f44826a = i7;
        this.f44827b = walletEngine2;
        this.f44828c = p10Var;
        this.d = sendtransfer;
        this.f44829e = str;
    }

    @Override
    public final void run() {
        switch (this.f44826a) {
            case 0:
                this.f44827b.lambda$prepareTonConnectTransfer$4(this.f44828c, this.d, this.f44829e);
                return;
            case 1:
                this.f44827b.lambda$prepareTonConnectTransferPair$7(this.f44828c, this.d, this.f44829e);
                return;
            default:
                this.f44827b.lambda$prepareSendNFT$28(this.f44828c, this.d, this.f44829e);
                return;
        }
    }
}
