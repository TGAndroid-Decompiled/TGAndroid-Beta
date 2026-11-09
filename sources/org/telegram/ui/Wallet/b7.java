package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class b7 implements Runnable {
    public final int f42274a;
    public final WalletEngine2 f42275b;
    public final v10 f42276c;
    public final TL_wallet.walletTransaction d;
    public final String f42277e;

    public b7(WalletEngine2 walletEngine2, v10 v10Var, TL_wallet.walletTransaction wallettransaction, String str, int i7) {
        this.f42274a = i7;
        this.f42275b = walletEngine2;
        this.f42276c = v10Var;
        this.d = wallettransaction;
        this.f42277e = str;
    }

    @Override
    public final void run() {
        switch (this.f42274a) {
            case 0:
                this.f42275b.lambda$previewTonConnect$1(this.f42276c, this.d, this.f42277e);
                return;
            default:
                this.f42275b.lambda$emulateRotateKey$29(this.f42276c, this.d, this.f42277e);
                return;
        }
    }
}
