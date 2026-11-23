package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_wallet;
public final class t7 implements Runnable {
    public final int f45190a;
    public final WalletEngine2 f45191b;
    public final p10 f45192c;
    public final TL_wallet.walletTransaction d;
    public final String f45193e;

    public t7(WalletEngine2 walletEngine2, p10 p10Var, TL_wallet.walletTransaction wallettransaction, String str, int i7) {
        this.f45190a = i7;
        this.f45191b = walletEngine2;
        this.f45192c = p10Var;
        this.d = wallettransaction;
        this.f45193e = str;
    }

    @Override
    public final void run() {
        switch (this.f45190a) {
            case 0:
                this.f45191b.lambda$emulateRotateKey$32(this.f45192c, this.d, this.f45193e);
                return;
            default:
                this.f45191b.lambda$previewTonConnect$1(this.f45192c, this.d, this.f45193e);
                return;
        }
    }
}
