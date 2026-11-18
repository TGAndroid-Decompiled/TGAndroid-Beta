package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_wallet;
public final class s7 implements Runnable {
    public final int f45018a;
    public final WalletEngine2 f45019b;
    public final q10 f45020c;
    public final TL_wallet.walletTransaction d;
    public final String f45021e;

    public s7(WalletEngine2 walletEngine2, q10 q10Var, TL_wallet.walletTransaction wallettransaction, String str, int i7) {
        this.f45018a = i7;
        this.f45019b = walletEngine2;
        this.f45020c = q10Var;
        this.d = wallettransaction;
        this.f45021e = str;
    }

    @Override
    public final void run() {
        switch (this.f45018a) {
            case 0:
                this.f45019b.lambda$emulateRotateKey$32(this.f45020c, this.d, this.f45021e);
                return;
            default:
                this.f45019b.lambda$previewTonConnect$1(this.f45020c, this.d, this.f45021e);
                return;
        }
    }
}
