package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class f6 implements Runnable {
    public final int f34757a;
    public final WalletEngine2 f34758b;
    public final Utilities.Callback2 f34759c;
    public final TL_wallet.sendTransfer d;
    public final String f34760e;

    public f6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.sendTransfer sendtransfer, String str, int i10) {
        this.f34757a = i10;
        this.f34758b = walletEngine2;
        this.f34759c = callback2;
        this.d = sendtransfer;
        this.f34760e = str;
    }

    @Override
    public final void run() {
        switch (this.f34757a) {
            case 0:
                this.f34758b.lambda$prepareTonConnectTransfer$4(this.f34759c, this.d, this.f34760e);
                return;
            default:
                this.f34758b.lambda$prepareSendNFT$25(this.f34759c, this.d, this.f34760e);
                return;
        }
    }
}
