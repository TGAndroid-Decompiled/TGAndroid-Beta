package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class d7 implements Runnable {
    public final int f42365a;
    public final WalletEngine2 f42366b;
    public final v10 f42367c;
    public final TL_wallet.walletTransaction d;
    public final String f42368e;

    public d7(WalletEngine2 walletEngine2, v10 v10Var, TL_wallet.walletTransaction wallettransaction, String str, int i7) {
        this.f42365a = i7;
        this.f42366b = walletEngine2;
        this.f42367c = v10Var;
        this.d = wallettransaction;
        this.f42368e = str;
    }

    @Override
    public final void run() {
        switch (this.f42365a) {
            case 0:
                this.f42366b.lambda$previewTonConnect$1(this.f42367c, this.d, this.f42368e);
                return;
            default:
                this.f42366b.lambda$emulateRotateKey$29(this.f42367c, this.d, this.f42368e);
                return;
        }
    }
}
