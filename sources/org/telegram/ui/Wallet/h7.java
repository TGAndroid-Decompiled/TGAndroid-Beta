package org.telegram.ui.Wallet;

import org.telegram.messenger.k20;
import org.telegram.tgnet.tl.TL_wallet;
public final class h7 implements Runnable {
    public final int f34630a;
    public final WalletEngine2 f34631b;
    public final k20 f34632c;
    public final TL_wallet.walletTransaction d;
    public final String e;

    public h7(WalletEngine2 walletEngine2, k20 k20Var, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f34630a = i10;
        this.f34631b = walletEngine2;
        this.f34632c = k20Var;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f34630a) {
            case 0:
                this.f34631b.lambda$previewTonConnect$1(this.f34632c, this.d, this.e);
                return;
            default:
                this.f34631b.lambda$emulateRotateKey$29(this.f34632c, this.d, this.e);
                return;
        }
    }
}
