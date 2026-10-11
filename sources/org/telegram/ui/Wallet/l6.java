package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class l6 implements Runnable {
    public final int f35259a;
    public final WalletEngine2 f35260b;
    public final Utilities.Callback2 f35261c;
    public final TL_wallet.walletTransaction d;
    public final String f35262e;

    public l6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f35259a = i10;
        this.f35260b = walletEngine2;
        this.f35261c = callback2;
        this.d = wallettransaction;
        this.f35262e = str;
    }

    @Override
    public final void run() {
        switch (this.f35259a) {
            case 0:
                this.f35260b.lambda$previewTonConnect$1(this.f35261c, this.d, this.f35262e);
                return;
            default:
                this.f35260b.lambda$emulateRotateKey$29(this.f35261c, this.d, this.f35262e);
                return;
        }
    }
}
