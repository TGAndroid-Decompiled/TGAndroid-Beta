package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class t6 implements Runnable {
    public final int f34909a;
    public final WalletEngine2 f34910b;
    public final Utilities.Callback2 f34911c;
    public final TL_wallet.walletTransaction d;
    public final String e;

    public t6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f34909a = i10;
        this.f34910b = walletEngine2;
        this.f34911c = callback2;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f34909a) {
            case 0:
                this.f34910b.lambda$previewTonConnect$1(this.f34911c, this.d, this.e);
                return;
            default:
                this.f34910b.lambda$emulateRotateKey$29(this.f34911c, this.d, this.e);
                return;
        }
    }
}
