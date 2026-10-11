package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class l6 implements Runnable {
    public final int f35225a;
    public final WalletEngine2 f35226b;
    public final Utilities.Callback2 f35227c;
    public final TL_wallet.walletTransaction d;
    public final String f35228e;

    public l6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f35225a = i10;
        this.f35226b = walletEngine2;
        this.f35227c = callback2;
        this.d = wallettransaction;
        this.f35228e = str;
    }

    @Override
    public final void run() {
        switch (this.f35225a) {
            case 0:
                this.f35226b.lambda$previewTonConnect$1(this.f35227c, this.d, this.f35228e);
                return;
            default:
                this.f35226b.lambda$emulateRotateKey$29(this.f35227c, this.d, this.f35228e);
                return;
        }
    }
}
