package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class w6 implements Runnable {
    public final int f35039a;
    public final WalletEngine2 f35040b;
    public final Utilities.Callback2 f35041c;
    public final TL_wallet.walletTransaction d;
    public final String e;

    public w6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f35039a = i10;
        this.f35040b = walletEngine2;
        this.f35041c = callback2;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f35039a) {
            case 0:
                this.f35040b.lambda$previewTonConnect$1(this.f35041c, this.d, this.e);
                return;
            default:
                this.f35040b.lambda$emulateRotateKey$29(this.f35041c, this.d, this.e);
                return;
        }
    }
}
