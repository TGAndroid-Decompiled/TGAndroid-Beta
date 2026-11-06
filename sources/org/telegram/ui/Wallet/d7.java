package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class d7 implements Runnable {
    public final int f42390a;
    public final WalletEngine2 f42391b;
    public final v10 f42392c;
    public final TL_wallet.walletTransaction d;
    public final String f42393e;

    public d7(WalletEngine2 walletEngine2, v10 v10Var, TL_wallet.walletTransaction wallettransaction, String str, int i7) {
        this.f42390a = i7;
        this.f42391b = walletEngine2;
        this.f42392c = v10Var;
        this.d = wallettransaction;
        this.f42393e = str;
    }

    @Override
    public final void run() {
        switch (this.f42390a) {
            case 0:
                this.f42391b.lambda$previewTonConnect$1(this.f42392c, this.d, this.f42393e);
                return;
            default:
                this.f42391b.lambda$emulateRotateKey$29(this.f42392c, this.d, this.f42393e);
                return;
        }
    }
}
