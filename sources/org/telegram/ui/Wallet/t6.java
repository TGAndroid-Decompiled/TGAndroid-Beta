package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class t6 implements Runnable {
    public final int f34913a;
    public final WalletEngine2 f34914b;
    public final Utilities.Callback2 f34915c;
    public final TL_wallet.walletTransaction d;
    public final String e;

    public t6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f34913a = i10;
        this.f34914b = walletEngine2;
        this.f34915c = callback2;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f34913a) {
            case 0:
                this.f34914b.lambda$previewTonConnect$1(this.f34915c, this.d, this.e);
                return;
            default:
                this.f34914b.lambda$emulateRotateKey$29(this.f34915c, this.d, this.e);
                return;
        }
    }
}
