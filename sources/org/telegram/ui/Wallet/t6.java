package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class t6 implements Runnable {
    public final int f35215a;
    public final WalletEngine2 f35216b;
    public final Utilities.Callback2 f35217c;
    public final TL_wallet.walletTransaction d;
    public final String e;

    public t6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f35215a = i10;
        this.f35216b = walletEngine2;
        this.f35217c = callback2;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f35215a) {
            case 0:
                this.f35216b.lambda$previewTonConnect$1(this.f35217c, this.d, this.e);
                return;
            default:
                this.f35216b.lambda$emulateRotateKey$29(this.f35217c, this.d, this.e);
                return;
        }
    }
}
