package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class z6 implements Runnable {
    public final int f43438a;
    public final WalletEngine2 f43439b;
    public final byte[] f43440c;
    public final e2 d;
    public final String f43441e;
    public final v10 f43442f;

    public z6(WalletEngine2 walletEngine2, byte[] bArr, e2 e2Var, String str, v10 v10Var, int i7) {
        this.f43438a = i7;
        this.f43439b = walletEngine2;
        this.f43440c = bArr;
        this.d = e2Var;
        this.f43441e = str;
        this.f43442f = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f43438a) {
            case 0:
                this.f43439b.lambda$signMessage$11(this.f43440c, this.d, this.f43441e, this.f43442f);
                return;
            default:
                this.f43439b.lambda$prepareTonConnectTransfer$5(this.f43440c, this.d, this.f43441e, this.f43442f);
                return;
        }
    }
}
