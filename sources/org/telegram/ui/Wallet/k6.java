package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class k6 implements Runnable {
    public final int f35195a;
    public final WalletEngine2 f35196b;
    public final Utilities.Callback2 f35197c;
    public final TL_wallet.walletTransaction d;
    public final String f35198e;

    public k6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.f35195a = i10;
        this.f35196b = walletEngine2;
        this.f35197c = callback2;
        this.d = wallettransaction;
        this.f35198e = str;
    }

    @Override
    public final void run() {
        switch (this.f35195a) {
            case 0:
                this.f35196b.lambda$previewTonConnect$1(this.f35197c, this.d, this.f35198e);
                return;
            default:
                this.f35196b.lambda$emulateRotateKey$29(this.f35197c, this.d, this.f35198e);
                return;
        }
    }
}
