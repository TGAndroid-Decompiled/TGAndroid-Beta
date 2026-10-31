package org.telegram.ui.Wallet;

import org.telegram.messenger.j20;
import org.telegram.tgnet.tl.TL_wallet;
public final class h7 implements Runnable {
    public final int f34623a;
    public final WalletEngine2 f34624b;
    public final j20 f34625c;
    public final TL_wallet.walletTransaction d;
    public final String e;

    public h7(WalletEngine2 walletEngine2, j20 j20Var, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f34623a = i10;
        this.f34624b = walletEngine2;
        this.f34625c = j20Var;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f34623a) {
            case 0:
                this.f34624b.lambda$previewTonConnect$1(this.f34625c, this.d, this.e);
                return;
            default:
                this.f34624b.lambda$emulateRotateKey$29(this.f34625c, this.d, this.e);
                return;
        }
    }
}
