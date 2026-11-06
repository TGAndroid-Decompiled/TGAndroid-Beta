package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class d7 implements Runnable {
    public final int f42389a;
    public final WalletEngine2 f42390b;
    public final v10 f42391c;
    public final TL_wallet.walletTransaction d;
    public final String f42392e;

    public d7(WalletEngine2 walletEngine2, v10 v10Var, TL_wallet.walletTransaction wallettransaction, String str, int i7) {
        this.f42389a = i7;
        this.f42390b = walletEngine2;
        this.f42391c = v10Var;
        this.d = wallettransaction;
        this.f42392e = str;
    }

    @Override
    public final void run() {
        switch (this.f42389a) {
            case 0:
                this.f42390b.lambda$previewTonConnect$1(this.f42391c, this.d, this.f42392e);
                return;
            default:
                this.f42390b.lambda$emulateRotateKey$29(this.f42391c, this.d, this.f42392e);
                return;
        }
    }
}
