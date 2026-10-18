package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class z6 implements Runnable {
    public final int f35175a;
    public final WalletEngine2 f35176b;
    public final Utilities.Callback2 f35177c;
    public final TL_wallet.walletTransaction d;
    public final String e;

    public z6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f35175a = i10;
        this.f35176b = walletEngine2;
        this.f35177c = callback2;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f35175a) {
            case 0:
                this.f35176b.lambda$previewTonConnect$1(this.f35177c, this.d, this.e);
                return;
            default:
                this.f35176b.lambda$emulateRotateKey$29(this.f35177c, this.d, this.e);
                return;
        }
    }
}
