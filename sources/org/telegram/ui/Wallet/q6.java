package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class q6 implements Runnable {
    public final int f34803a;
    public final WalletEngine2 f34804b;
    public final Utilities.Callback2 f34805c;
    public final TL_wallet.sendTransfer d;
    public final String e;

    public q6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.sendTransfer sendtransfer, String str, int i10) {
        this.f34803a = i10;
        this.f34804b = walletEngine2;
        this.f34805c = callback2;
        this.d = sendtransfer;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f34803a) {
            case 0:
                this.f34804b.lambda$prepareTonConnectTransfer$4(this.f34805c, this.d, this.e);
                return;
            default:
                this.f34804b.lambda$prepareSendNFT$25(this.f34805c, this.d, this.e);
                return;
        }
    }
}
