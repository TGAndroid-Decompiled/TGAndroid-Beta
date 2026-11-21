package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
public final class p7 implements Runnable {
    public final int f44830a;
    public final WalletEngine2 f44831b;
    public final byte[] f44832c;
    public final k2 d;
    public final String f44833e;
    public final q10 f44834f;

    public p7(WalletEngine2 walletEngine2, byte[] bArr, k2 k2Var, String str, q10 q10Var, int i7) {
        this.f44830a = i7;
        this.f44831b = walletEngine2;
        this.f44832c = bArr;
        this.d = k2Var;
        this.f44833e = str;
        this.f44834f = q10Var;
    }

    @Override
    public final void run() {
        switch (this.f44830a) {
            case 0:
                this.f44831b.lambda$signMessage$14(this.f44832c, this.d, this.f44833e, this.f44834f);
                return;
            default:
                this.f44831b.lambda$prepareTonConnectTransfer$5(this.f44832c, this.d, this.f44833e, this.f44834f);
                return;
        }
    }
}
