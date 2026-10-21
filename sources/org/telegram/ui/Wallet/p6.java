package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class p6 implements Runnable {
    public final int f34736a;
    public final WalletEngine2 f34737b;
    public final byte[] f34738c;
    public final e2 d;
    public final String e;
    public final Utilities.Callback2 f34739f;

    public p6(WalletEngine2 walletEngine2, byte[] bArr, e2 e2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f34736a = i10;
        this.f34737b = walletEngine2;
        this.f34738c = bArr;
        this.d = e2Var;
        this.e = str;
        this.f34739f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34736a) {
            case 0:
                this.f34737b.lambda$signMessage$11(this.f34738c, this.d, this.e, this.f34739f);
                return;
            default:
                this.f34737b.lambda$prepareTonConnectTransfer$5(this.f34738c, this.d, this.e, this.f34739f);
                return;
        }
    }
}
