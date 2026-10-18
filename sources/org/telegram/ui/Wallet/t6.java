package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class t6 implements Runnable {
    public final int f34941a;
    public final WalletEngine2 f34942b;
    public final Utilities.Callback2 f34943c;
    public final TL_wallet.sendTransfer d;
    public final String e;

    public t6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.sendTransfer sendtransfer, String str, int i10) {
        this.f34941a = i10;
        this.f34942b = walletEngine2;
        this.f34943c = callback2;
        this.d = sendtransfer;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f34941a) {
            case 0:
                this.f34942b.lambda$prepareTonConnectTransfer$4(this.f34943c, this.d, this.e);
                return;
            default:
                this.f34942b.lambda$prepareSendNFT$25(this.f34943c, this.d, this.e);
                return;
        }
    }
}
