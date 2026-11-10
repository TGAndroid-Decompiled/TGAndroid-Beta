package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class e7 implements Runnable {
    public final int f42467a;
    public final WalletEngine2 f42468b;
    public final v10 f42469c;
    public final TL_wallet.walletTransaction d;
    public final String f42470e;

    public e7(WalletEngine2 walletEngine2, v10 v10Var, TL_wallet.walletTransaction wallettransaction, String str, int i7) {
        this.f42467a = i7;
        this.f42468b = walletEngine2;
        this.f42469c = v10Var;
        this.d = wallettransaction;
        this.f42470e = str;
    }

    @Override
    public final void run() {
        switch (this.f42467a) {
            case 0:
                this.f42468b.lambda$previewTonConnect$1(this.f42469c, this.d, this.f42470e);
                return;
            default:
                this.f42468b.lambda$emulateRotateKey$29(this.f42469c, this.d, this.f42470e);
                return;
        }
    }
}
