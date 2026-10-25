package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class t6 implements Runnable {
    public final int f37269a;
    public final WalletEngine2 f37270b;
    public final Utilities.Callback2 f37271c;
    public final TL_wallet.walletTransaction d;
    public final String e;

    public t6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f37269a = i10;
        this.f37270b = walletEngine2;
        this.f37271c = callback2;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f37269a) {
            case 0:
                this.f37270b.lambda$previewTonConnect$1(this.f37271c, this.d, this.e);
                return;
            default:
                this.f37270b.lambda$emulateRotateKey$29(this.f37271c, this.d, this.e);
                return;
        }
    }
}
