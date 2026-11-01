package org.telegram.ui.Wallet;

import org.telegram.messenger.k20;
import org.telegram.tgnet.tl.TL_wallet;
public final class b7 implements Runnable {
    public final int f34275a;
    public final WalletEngine2 f34276b;
    public final k20 f34277c;
    public final TL_wallet.sendTransfer d;
    public final String e;

    public b7(WalletEngine2 walletEngine2, k20 k20Var, TL_wallet.sendTransfer sendtransfer, String str, int i10) {
        this.f34275a = i10;
        this.f34276b = walletEngine2;
        this.f34277c = k20Var;
        this.d = sendtransfer;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f34275a) {
            case 0:
                this.f34276b.lambda$prepareTonConnectTransfer$4(this.f34277c, this.d, this.e);
                return;
            default:
                this.f34276b.lambda$prepareSendNFT$25(this.f34277c, this.d, this.e);
                return;
        }
    }
}
