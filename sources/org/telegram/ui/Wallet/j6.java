package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class j6 implements Runnable {
    public final int f35084a;
    public final WalletEngine2 f35085b;
    public final Utilities.Callback2 f35086c;
    public final TL_wallet.walletTransaction d;
    public final String f35087e;

    public j6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f35084a = i10;
        this.f35085b = walletEngine2;
        this.f35086c = callback2;
        this.d = wallettransaction;
        this.f35087e = str;
    }

    @Override
    public final void run() {
        switch (this.f35084a) {
            case 0:
                this.f35085b.lambda$previewTonConnect$1(this.f35086c, this.d, this.f35087e);
                return;
            default:
                this.f35085b.lambda$emulateRotateKey$29(this.f35086c, this.d, this.f35087e);
                return;
        }
    }
}
