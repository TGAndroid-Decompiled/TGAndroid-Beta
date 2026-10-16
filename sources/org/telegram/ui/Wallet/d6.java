package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class d6 implements Runnable {
    public final int f32792a;
    public final WalletEngine2 f32793b;
    public final Utilities.Callback2 f32794c;
    public final TL_wallet.sendTransfer d;
    public final String e;

    public d6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.sendTransfer sendtransfer, String str, int i10) {
        this.f32792a = i10;
        this.f32793b = walletEngine2;
        this.f32794c = callback2;
        this.d = sendtransfer;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f32792a) {
            case 0:
                this.f32793b.lambda$prepareTonConnectTransfer$4(this.f32794c, this.d, this.e);
                return;
            default:
                this.f32793b.lambda$prepareSendNFT$25(this.f32794c, this.d, this.e);
                return;
        }
    }
}
