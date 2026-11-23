package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
import org.telegram.tgnet.tl.TL_wallet;
public final class s7 implements Runnable {
    public final int f45028a;
    public final WalletEngine2 f45029b;
    public final r10 f45030c;
    public final TL_wallet.walletTransaction d;
    public final String f45031e;

    public s7(WalletEngine2 walletEngine2, r10 r10Var, TL_wallet.walletTransaction wallettransaction, String str, int i7) {
        this.f45028a = i7;
        this.f45029b = walletEngine2;
        this.f45030c = r10Var;
        this.d = wallettransaction;
        this.f45031e = str;
    }

    @Override
    public final void run() {
        switch (this.f45028a) {
            case 0:
                this.f45029b.lambda$emulateRotateKey$32(this.f45030c, this.d, this.f45031e);
                return;
            default:
                this.f45029b.lambda$previewTonConnect$1(this.f45030c, this.d, this.f45031e);
                return;
        }
    }
}
