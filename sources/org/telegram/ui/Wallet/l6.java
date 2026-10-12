package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class l6 implements Runnable {
    public final int f35036a;
    public final WalletEngine2 f35037b;
    public final Utilities.Callback2 f35038c;
    public final TL_wallet.walletTransaction d;
    public final String f35039e;

    public l6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f35036a = i10;
        this.f35037b = walletEngine2;
        this.f35038c = callback2;
        this.d = wallettransaction;
        this.f35039e = str;
    }

    @Override
    public final void run() {
        switch (this.f35036a) {
            case 0:
                this.f35037b.lambda$previewTonConnect$1(this.f35038c, this.d, this.f35039e);
                return;
            default:
                this.f35037b.lambda$emulateRotateKey$29(this.f35038c, this.d, this.f35039e);
                return;
        }
    }
}
