package org.telegram.ui.Wallet;

import org.telegram.messenger.j20;
public final class d7 implements Runnable {
    public final int f34425a;
    public final WalletEngine2 f34426b;
    public final byte[] f34427c;
    public final d2 d;
    public final String e;
    public final j20 f34428f;

    public d7(WalletEngine2 walletEngine2, byte[] bArr, d2 d2Var, String str, j20 j20Var, int i10) {
        this.f34425a = i10;
        this.f34426b = walletEngine2;
        this.f34427c = bArr;
        this.d = d2Var;
        this.e = str;
        this.f34428f = j20Var;
    }

    @Override
    public final void run() {
        switch (this.f34425a) {
            case 0:
                this.f34426b.lambda$signMessage$11(this.f34427c, this.d, this.e, this.f34428f);
                return;
            default:
                this.f34426b.lambda$prepareTonConnectTransfer$5(this.f34427c, this.d, this.e, this.f34428f);
                return;
        }
    }
}
