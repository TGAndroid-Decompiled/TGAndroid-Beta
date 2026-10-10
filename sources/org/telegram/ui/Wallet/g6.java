package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class g6 implements Runnable {
    public final int f35019a;
    public final WalletEngine2 f35020b;
    public final byte[] f35021c;
    public final d2 d;
    public final String f35022e;
    public final Utilities.Callback2 f35023f;

    public g6(WalletEngine2 walletEngine2, byte[] bArr, d2 d2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f35019a = i10;
        this.f35020b = walletEngine2;
        this.f35021c = bArr;
        this.d = d2Var;
        this.f35022e = str;
        this.f35023f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35019a) {
            case 0:
                this.f35020b.lambda$signMessage$11(this.f35021c, this.d, this.f35022e, this.f35023f);
                return;
            default:
                this.f35020b.lambda$prepareTonConnectTransfer$5(this.f35021c, this.d, this.f35022e, this.f35023f);
                return;
        }
    }
}
