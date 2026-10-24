package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class t6 implements Runnable {
    public final int f35217a;
    public final WalletEngine2 f35218b;
    public final Utilities.Callback2 f35219c;
    public final TL_wallet.walletTransaction d;
    public final String e;

    public t6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f35217a = i10;
        this.f35218b = walletEngine2;
        this.f35219c = callback2;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f35217a) {
            case 0:
                this.f35218b.lambda$previewTonConnect$1(this.f35219c, this.d, this.e);
                return;
            default:
                this.f35218b.lambda$emulateRotateKey$29(this.f35219c, this.d, this.e);
                return;
        }
    }
}
