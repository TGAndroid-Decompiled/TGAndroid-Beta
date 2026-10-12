package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class l6 implements Runnable {
    public final int f35034a;
    public final WalletEngine2 f35035b;
    public final Utilities.Callback2 f35036c;
    public final TL_wallet.walletTransaction d;
    public final String f35037e;

    public l6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f35034a = i10;
        this.f35035b = walletEngine2;
        this.f35036c = callback2;
        this.d = wallettransaction;
        this.f35037e = str;
    }

    @Override
    public final void run() {
        switch (this.f35034a) {
            case 0:
                this.f35035b.lambda$previewTonConnect$1(this.f35036c, this.d, this.f35037e);
                return;
            default:
                this.f35035b.lambda$emulateRotateKey$29(this.f35036c, this.d, this.f35037e);
                return;
        }
    }
}
