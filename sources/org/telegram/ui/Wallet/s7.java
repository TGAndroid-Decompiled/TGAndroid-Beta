package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_wallet;
public final class s7 implements Runnable {
    public final int f45058a;
    public final WalletEngine2 f45059b;
    public final q10 f45060c;
    public final TL_wallet.walletTransaction d;
    public final String f45061e;

    public s7(WalletEngine2 walletEngine2, q10 q10Var, TL_wallet.walletTransaction wallettransaction, String str, int i7) {
        this.f45058a = i7;
        this.f45059b = walletEngine2;
        this.f45060c = q10Var;
        this.d = wallettransaction;
        this.f45061e = str;
    }

    @Override
    public final void run() {
        switch (this.f45058a) {
            case 0:
                this.f45059b.lambda$emulateRotateKey$32(this.f45060c, this.d, this.f45061e);
                return;
            default:
                this.f45059b.lambda$previewTonConnect$1(this.f45060c, this.d, this.f45061e);
                return;
        }
    }
}
