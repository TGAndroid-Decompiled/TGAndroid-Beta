package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class p6 implements Runnable {
    public final int f35042a;
    public final WalletEngine2 f35043b;
    public final byte[] f35044c;
    public final d2 d;
    public final String e;
    public final Utilities.Callback2 f35045f;

    public p6(WalletEngine2 walletEngine2, byte[] bArr, d2 d2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f35042a = i10;
        this.f35043b = walletEngine2;
        this.f35044c = bArr;
        this.d = d2Var;
        this.e = str;
        this.f35045f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35042a) {
            case 0:
                this.f35043b.lambda$signMessage$11(this.f35044c, this.d, this.e, this.f35045f);
                return;
            default:
                this.f35043b.lambda$prepareTonConnectTransfer$5(this.f35044c, this.d, this.e, this.f35045f);
                return;
        }
    }
}
