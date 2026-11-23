package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
import org.telegram.tgnet.tl.TL_wallet;
public final class s7 implements Runnable {
    public final int f45062a;
    public final WalletEngine2 f45063b;
    public final r10 f45064c;
    public final TL_wallet.walletTransaction d;
    public final String f45065e;

    public s7(WalletEngine2 walletEngine2, r10 r10Var, TL_wallet.walletTransaction wallettransaction, String str, int i7) {
        this.f45062a = i7;
        this.f45063b = walletEngine2;
        this.f45064c = r10Var;
        this.d = wallettransaction;
        this.f45065e = str;
    }

    @Override
    public final void run() {
        switch (this.f45062a) {
            case 0:
                this.f45063b.lambda$emulateRotateKey$32(this.f45064c, this.d, this.f45065e);
                return;
            default:
                this.f45063b.lambda$previewTonConnect$1(this.f45064c, this.d, this.f45065e);
                return;
        }
    }
}
