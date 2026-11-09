package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class x6 implements Runnable {
    public final int f43352a;
    public final WalletEngine2 f43353b;
    public final byte[] f43354c;
    public final c2 d;
    public final String f43355e;
    public final v10 f43356f;

    public x6(WalletEngine2 walletEngine2, byte[] bArr, c2 c2Var, String str, v10 v10Var, int i7) {
        this.f43352a = i7;
        this.f43353b = walletEngine2;
        this.f43354c = bArr;
        this.d = c2Var;
        this.f43355e = str;
        this.f43356f = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f43352a) {
            case 0:
                this.f43353b.lambda$signMessage$11(this.f43354c, this.d, this.f43355e, this.f43356f);
                return;
            default:
                this.f43353b.lambda$prepareTonConnectTransfer$5(this.f43354c, this.d, this.f43355e, this.f43356f);
                return;
        }
    }
}
