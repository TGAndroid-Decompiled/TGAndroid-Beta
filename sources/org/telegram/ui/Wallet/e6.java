package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class e6 implements Runnable {
    public final int f34916a;
    public final WalletEngine2 f34917b;
    public final Utilities.Callback2 f34918c;
    public final TL_wallet.sendTransfer d;
    public final String f34919e;

    public e6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.sendTransfer sendtransfer, String str, int i10) {
        this.f34916a = i10;
        this.f34917b = walletEngine2;
        this.f34918c = callback2;
        this.d = sendtransfer;
        this.f34919e = str;
    }

    @Override
    public final void run() {
        switch (this.f34916a) {
            case 0:
                this.f34917b.lambda$prepareTonConnectTransfer$4(this.f34918c, this.d, this.f34919e);
                return;
            default:
                this.f34917b.lambda$prepareSendNFT$25(this.f34918c, this.d, this.f34919e);
                return;
        }
    }
}
