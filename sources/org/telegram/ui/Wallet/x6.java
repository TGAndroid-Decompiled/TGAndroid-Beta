package org.telegram.ui.Wallet;

import org.telegram.messenger.s10;
import org.telegram.tgnet.tl.TL_wallet;
public final class x6 implements Runnable {
    public final int f44683a;
    public final WalletEngine2 f44684b;
    public final s10 f44685c;
    public final TL_wallet.sendTransfer d;
    public final String f44686e;

    public x6(WalletEngine2 walletEngine2, s10 s10Var, TL_wallet.sendTransfer sendtransfer, String str, int i7) {
        this.f44683a = i7;
        this.f44684b = walletEngine2;
        this.f44685c = s10Var;
        this.d = sendtransfer;
        this.f44686e = str;
    }

    @Override
    public final void run() {
        switch (this.f44683a) {
            case 0:
                this.f44684b.lambda$prepareTonConnectTransfer$4(this.f44685c, this.d, this.f44686e);
                return;
            default:
                this.f44684b.lambda$prepareSendNFT$25(this.f44685c, this.d, this.f44686e);
                return;
        }
    }
}
