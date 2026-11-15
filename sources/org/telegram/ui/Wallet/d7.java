package org.telegram.ui.Wallet;

import org.telegram.messenger.s10;
import org.telegram.tgnet.tl.TL_wallet;
public final class d7 implements Runnable {
    public final int f43752a;
    public final WalletEngine2 f43753b;
    public final s10 f43754c;
    public final TL_wallet.walletTransaction d;
    public final String f43755e;

    public d7(WalletEngine2 walletEngine2, s10 s10Var, TL_wallet.walletTransaction wallettransaction, String str, int i7) {
        this.f43752a = i7;
        this.f43753b = walletEngine2;
        this.f43754c = s10Var;
        this.d = wallettransaction;
        this.f43755e = str;
    }

    @Override
    public final void run() {
        switch (this.f43752a) {
            case 0:
                this.f43753b.lambda$previewTonConnect$1(this.f43754c, this.d, this.f43755e);
                return;
            default:
                this.f43753b.lambda$emulateRotateKey$29(this.f43754c, this.d, this.f43755e);
                return;
        }
    }
}
