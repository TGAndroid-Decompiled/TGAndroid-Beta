package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class m6 implements Runnable {
    public final int f36968a;
    public final WalletEngine2 f36969b;
    public final Utilities.Callback2 f36970c;
    public final TL_wallet.sendTransfer d;
    public final String e;

    public m6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.sendTransfer sendtransfer, String str, int i10) {
        this.f36968a = i10;
        this.f36969b = walletEngine2;
        this.f36970c = callback2;
        this.d = sendtransfer;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f36968a) {
            case 0:
                this.f36969b.lambda$prepareTonConnectTransfer$4(this.f36970c, this.d, this.e);
                return;
            default:
                this.f36969b.lambda$prepareSendNFT$25(this.f36970c, this.d, this.e);
                return;
        }
    }
}
