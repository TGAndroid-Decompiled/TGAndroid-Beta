package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class y6 implements Runnable {
    public final int f43434a;
    public final WalletEngine2 f43435b;
    public final byte[] f43436c;
    public final d2 d;
    public final String f43437e;
    public final v10 f43438f;

    public y6(WalletEngine2 walletEngine2, byte[] bArr, d2 d2Var, String str, v10 v10Var, int i7) {
        this.f43434a = i7;
        this.f43435b = walletEngine2;
        this.f43436c = bArr;
        this.d = d2Var;
        this.f43437e = str;
        this.f43438f = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f43434a) {
            case 0:
                this.f43435b.lambda$signMessage$11(this.f43436c, this.d, this.f43437e, this.f43438f);
                return;
            default:
                this.f43435b.lambda$prepareTonConnectTransfer$5(this.f43436c, this.d, this.f43437e, this.f43438f);
                return;
        }
    }
}
