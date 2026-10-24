package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class p6 implements Runnable {
    public final int f35044a;
    public final WalletEngine2 f35045b;
    public final byte[] f35046c;
    public final d2 d;
    public final String e;
    public final Utilities.Callback2 f35047f;

    public p6(WalletEngine2 walletEngine2, byte[] bArr, d2 d2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f35044a = i10;
        this.f35045b = walletEngine2;
        this.f35046c = bArr;
        this.d = d2Var;
        this.e = str;
        this.f35047f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35044a) {
            case 0:
                this.f35045b.lambda$signMessage$11(this.f35046c, this.d, this.e, this.f35047f);
                return;
            default:
                this.f35045b.lambda$prepareTonConnectTransfer$5(this.f35046c, this.d, this.e, this.f35047f);
                return;
        }
    }
}
