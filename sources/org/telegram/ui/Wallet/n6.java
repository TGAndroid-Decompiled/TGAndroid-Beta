package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class n6 implements Runnable {
    public final int f34611a;
    public final WalletEngine2 f34612b;
    public final Utilities.Callback2 f34613c;
    public final TL_wallet.sendTransfer d;
    public final String e;

    public n6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.sendTransfer sendtransfer, String str, int i10) {
        this.f34611a = i10;
        this.f34612b = walletEngine2;
        this.f34613c = callback2;
        this.d = sendtransfer;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f34611a) {
            case 0:
                this.f34612b.lambda$prepareTonConnectTransfer$4(this.f34613c, this.d, this.e);
                return;
            default:
                this.f34612b.lambda$prepareSendNFT$25(this.f34613c, this.d, this.e);
                return;
        }
    }
}
