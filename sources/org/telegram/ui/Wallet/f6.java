package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class f6 implements Runnable {
    public final int f34982a;
    public final WalletEngine2 f34983b;
    public final Utilities.Callback2 f34984c;
    public final TL_wallet.sendTransfer d;
    public final String f34985e;

    public f6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.sendTransfer sendtransfer, String str, int i10) {
        this.f34982a = i10;
        this.f34983b = walletEngine2;
        this.f34984c = callback2;
        this.d = sendtransfer;
        this.f34985e = str;
    }

    @Override
    public final void run() {
        switch (this.f34982a) {
            case 0:
                this.f34983b.lambda$prepareTonConnectTransfer$4(this.f34984c, this.d, this.f34985e);
                return;
            default:
                this.f34983b.lambda$prepareSendNFT$25(this.f34984c, this.d, this.f34985e);
                return;
        }
    }
}
