package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class c6 implements Runnable {
    public final int f34760a;
    public final WalletEngine2 f34761b;
    public final Utilities.Callback2 f34762c;
    public final TL_wallet.sendTransfer d;
    public final String f34763e;

    public c6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.sendTransfer sendtransfer, String str, int i10) {
        this.f34760a = i10;
        this.f34761b = walletEngine2;
        this.f34762c = callback2;
        this.d = sendtransfer;
        this.f34763e = str;
    }

    @Override
    public final void run() {
        switch (this.f34760a) {
            case 0:
                this.f34761b.lambda$prepareTonConnectTransfer$4(this.f34762c, this.d, this.f34763e);
                return;
            default:
                this.f34761b.lambda$prepareSendNFT$25(this.f34762c, this.d, this.f34763e);
                return;
        }
    }
}
