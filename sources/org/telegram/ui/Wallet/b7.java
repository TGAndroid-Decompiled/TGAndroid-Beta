package org.telegram.ui.Wallet;

import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_wallet;
public final class b7 implements Runnable {
    public final int f42284a;
    public final WalletEngine2 f42285b;
    public final n10 f42286c;
    public final TL_wallet.walletTransaction d;
    public final String f42287e;

    public b7(WalletEngine2 walletEngine2, n10 n10Var, TL_wallet.walletTransaction wallettransaction, String str, int i3) {
        this.f42284a = i3;
        this.f42285b = walletEngine2;
        this.f42286c = n10Var;
        this.d = wallettransaction;
        this.f42287e = str;
    }

    @Override
    public final void run() {
        switch (this.f42284a) {
            case 0:
                this.f42285b.lambda$previewTonConnect$1(this.f42286c, this.d, this.f42287e);
                return;
            default:
                this.f42285b.lambda$emulateRotateKey$29(this.f42286c, this.d, this.f42287e);
                return;
        }
    }
}
