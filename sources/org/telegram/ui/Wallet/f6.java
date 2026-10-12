package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class f6 implements Runnable {
    public final int f34759a;
    public final WalletEngine2 f34760b;
    public final Utilities.Callback2 f34761c;
    public final TL_wallet.sendTransfer d;
    public final String f34762e;

    public f6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.sendTransfer sendtransfer, String str, int i10) {
        this.f34759a = i10;
        this.f34760b = walletEngine2;
        this.f34761c = callback2;
        this.d = sendtransfer;
        this.f34762e = str;
    }

    @Override
    public final void run() {
        switch (this.f34759a) {
            case 0:
                this.f34760b.lambda$prepareTonConnectTransfer$4(this.f34761c, this.d, this.f34762e);
                return;
            default:
                this.f34760b.lambda$prepareSendNFT$25(this.f34761c, this.d, this.f34762e);
                return;
        }
    }
}
