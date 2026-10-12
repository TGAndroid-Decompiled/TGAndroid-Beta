package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class i6 implements Runnable {
    public final int f33289a;
    public final WalletEngine2 f33290b;
    public final Utilities.Callback2 f33291c;
    public final TL_wallet.walletTransaction d;
    public final String e;

    public i6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f33289a = i10;
        this.f33290b = walletEngine2;
        this.f33291c = callback2;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f33289a) {
            case 0:
                this.f33290b.lambda$previewTonConnect$1(this.f33291c, this.d, this.e);
                return;
            default:
                this.f33290b.lambda$emulateRotateKey$29(this.f33291c, this.d, this.e);
                return;
        }
    }
}
