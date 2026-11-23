package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
import org.telegram.tgnet.tl.TL_wallet;
public final class n7 implements Runnable {
    public final int f44698a;
    public final WalletEngine2 f44699b;
    public final r10 f44700c;
    public final TL_wallet.sendTransfer d;
    public final String f44701e;

    public n7(WalletEngine2 walletEngine2, r10 r10Var, TL_wallet.sendTransfer sendtransfer, String str, int i7) {
        this.f44698a = i7;
        this.f44699b = walletEngine2;
        this.f44700c = r10Var;
        this.d = sendtransfer;
        this.f44701e = str;
    }

    @Override
    public final void run() {
        switch (this.f44698a) {
            case 0:
                this.f44699b.lambda$prepareTonConnectTransfer$4(this.f44700c, this.d, this.f44701e);
                return;
            case 1:
                this.f44699b.lambda$prepareTonConnectTransferPair$7(this.f44700c, this.d, this.f44701e);
                return;
            default:
                this.f44699b.lambda$prepareSendNFT$28(this.f44700c, this.d, this.f44701e);
                return;
        }
    }
}
