package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class t6 implements Runnable {
    public final int f37272a;
    public final WalletEngine2 f37273b;
    public final Utilities.Callback2 f37274c;
    public final TL_wallet.walletTransaction d;
    public final String e;

    public t6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f37272a = i10;
        this.f37273b = walletEngine2;
        this.f37274c = callback2;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f37272a) {
            case 0:
                this.f37273b.lambda$previewTonConnect$1(this.f37274c, this.d, this.e);
                return;
            default:
                this.f37273b.lambda$emulateRotateKey$29(this.f37274c, this.d, this.e);
                return;
        }
    }
}
