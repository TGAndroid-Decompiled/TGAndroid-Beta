package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class t6 implements Runnable {
    public final int f37296a;
    public final WalletEngine2 f37297b;
    public final Utilities.Callback2 f37298c;
    public final TL_wallet.walletTransaction d;
    public final String e;

    public t6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f37296a = i10;
        this.f37297b = walletEngine2;
        this.f37298c = callback2;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f37296a) {
            case 0:
                this.f37297b.lambda$previewTonConnect$1(this.f37298c, this.d, this.e);
                return;
            default:
                this.f37297b.lambda$emulateRotateKey$29(this.f37298c, this.d, this.e);
                return;
        }
    }
}
