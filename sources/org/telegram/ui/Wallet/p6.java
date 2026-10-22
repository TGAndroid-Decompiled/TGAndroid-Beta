package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class p6 implements Runnable {
    public final int f34739a;
    public final WalletEngine2 f34740b;
    public final byte[] f34741c;
    public final e2 d;
    public final String e;
    public final Utilities.Callback2 f34742f;

    public p6(WalletEngine2 walletEngine2, byte[] bArr, e2 e2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f34739a = i10;
        this.f34740b = walletEngine2;
        this.f34741c = bArr;
        this.d = e2Var;
        this.e = str;
        this.f34742f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34739a) {
            case 0:
                this.f34740b.lambda$signMessage$11(this.f34741c, this.d, this.e, this.f34742f);
                return;
            default:
                this.f34740b.lambda$prepareTonConnectTransfer$5(this.f34741c, this.d, this.e, this.f34742f);
                return;
        }
    }
}
