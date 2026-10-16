package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class j6 implements Runnable {
    public final int f33062a;
    public final WalletEngine2 f33063b;
    public final Utilities.Callback2 f33064c;
    public final TL_wallet.walletTransaction d;
    public final String e;

    public j6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f33062a = i10;
        this.f33063b = walletEngine2;
        this.f33064c = callback2;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f33062a) {
            case 0:
                this.f33063b.lambda$previewTonConnect$1(this.f33064c, this.d, this.e);
                return;
            default:
                this.f33063b.lambda$emulateRotateKey$29(this.f33064c, this.d, this.e);
                return;
        }
    }
}
