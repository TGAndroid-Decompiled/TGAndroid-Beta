package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class z6 implements Runnable {
    public final int f43462a;
    public final WalletEngine2 f43463b;
    public final byte[] f43464c;
    public final e2 d;
    public final String f43465e;
    public final v10 f43466f;

    public z6(WalletEngine2 walletEngine2, byte[] bArr, e2 e2Var, String str, v10 v10Var, int i7) {
        this.f43462a = i7;
        this.f43463b = walletEngine2;
        this.f43464c = bArr;
        this.d = e2Var;
        this.f43465e = str;
        this.f43466f = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f43462a) {
            case 0:
                this.f43463b.lambda$signMessage$11(this.f43464c, this.d, this.f43465e, this.f43466f);
                return;
            default:
                this.f43463b.lambda$prepareTonConnectTransfer$5(this.f43464c, this.d, this.f43465e, this.f43466f);
                return;
        }
    }
}
