package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class i6 implements Runnable {
    public final int f35013a;
    public final WalletEngine2 f35014b;
    public final Utilities.Callback2 f35015c;
    public final TL_wallet.walletTransaction d;
    public final String f35016e;

    public i6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f35013a = i10;
        this.f35014b = walletEngine2;
        this.f35015c = callback2;
        this.d = wallettransaction;
        this.f35016e = str;
    }

    @Override
    public final void run() {
        switch (this.f35013a) {
            case 0:
                this.f35014b.lambda$previewTonConnect$1(this.f35015c, this.d, this.f35016e);
                return;
            default:
                this.f35014b.lambda$emulateRotateKey$29(this.f35015c, this.d, this.f35016e);
                return;
        }
    }
}
