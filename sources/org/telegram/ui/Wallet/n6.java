package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class n6 implements Runnable {
    public final int f34610a;
    public final WalletEngine2 f34611b;
    public final Utilities.Callback2 f34612c;
    public final TL_wallet.sendTransfer d;
    public final String e;

    public n6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.sendTransfer sendtransfer, String str, int i10) {
        this.f34610a = i10;
        this.f34611b = walletEngine2;
        this.f34612c = callback2;
        this.d = sendtransfer;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f34610a) {
            case 0:
                this.f34611b.lambda$prepareTonConnectTransfer$4(this.f34612c, this.d, this.e);
                return;
            default:
                this.f34611b.lambda$prepareSendNFT$25(this.f34612c, this.d, this.e);
                return;
        }
    }
}
