package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class c6 implements Runnable {
    public final int f33020a;
    public final WalletEngine2 f33021b;
    public final Utilities.Callback2 f33022c;
    public final TL_wallet.sendTransfer d;
    public final String e;

    public c6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.sendTransfer sendtransfer, String str, int i10) {
        this.f33020a = i10;
        this.f33021b = walletEngine2;
        this.f33022c = callback2;
        this.d = sendtransfer;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f33020a) {
            case 0:
                this.f33021b.lambda$prepareTonConnectTransfer$4(this.f33022c, this.d, this.e);
                return;
            default:
                this.f33021b.lambda$prepareSendNFT$25(this.f33022c, this.d, this.e);
                return;
        }
    }
}
