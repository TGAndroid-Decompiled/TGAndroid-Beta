package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class c7 implements Runnable {
    public final int f42360a;
    public final WalletEngine2 f42361b;
    public final v10 f42362c;
    public final TL_wallet.walletTransaction d;
    public final String f42363e;

    public c7(WalletEngine2 walletEngine2, v10 v10Var, TL_wallet.walletTransaction wallettransaction, String str, int i7) {
        this.f42360a = i7;
        this.f42361b = walletEngine2;
        this.f42362c = v10Var;
        this.d = wallettransaction;
        this.f42363e = str;
    }

    @Override
    public final void run() {
        switch (this.f42360a) {
            case 0:
                this.f42361b.lambda$previewTonConnect$1(this.f42362c, this.d, this.f42363e);
                return;
            default:
                this.f42361b.lambda$emulateRotateKey$29(this.f42362c, this.d, this.f42363e);
                return;
        }
    }
}
