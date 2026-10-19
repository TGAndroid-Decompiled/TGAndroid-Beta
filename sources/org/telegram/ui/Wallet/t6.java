package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class t6 implements Runnable {
    public final int f34902a;
    public final WalletEngine2 f34903b;
    public final Utilities.Callback2 f34904c;
    public final TL_wallet.walletTransaction d;
    public final String e;

    public t6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f34902a = i10;
        this.f34903b = walletEngine2;
        this.f34904c = callback2;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f34902a) {
            case 0:
                this.f34903b.lambda$previewTonConnect$1(this.f34904c, this.d, this.e);
                return;
            default:
                this.f34903b.lambda$emulateRotateKey$29(this.f34904c, this.d, this.e);
                return;
        }
    }
}
