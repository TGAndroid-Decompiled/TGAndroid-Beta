package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class z6 implements Runnable {
    public final int f43463a;
    public final WalletEngine2 f43464b;
    public final byte[] f43465c;
    public final e2 d;
    public final String f43466e;
    public final v10 f43467f;

    public z6(WalletEngine2 walletEngine2, byte[] bArr, e2 e2Var, String str, v10 v10Var, int i7) {
        this.f43463a = i7;
        this.f43464b = walletEngine2;
        this.f43465c = bArr;
        this.d = e2Var;
        this.f43466e = str;
        this.f43467f = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f43463a) {
            case 0:
                this.f43464b.lambda$signMessage$11(this.f43465c, this.d, this.f43466e, this.f43467f);
                return;
            default:
                this.f43464b.lambda$prepareTonConnectTransfer$5(this.f43465c, this.d, this.f43466e, this.f43467f);
                return;
        }
    }
}
