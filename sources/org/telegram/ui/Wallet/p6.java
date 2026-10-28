package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class p6 implements Runnable {
    public final int f37124a;
    public final WalletEngine2 f37125b;
    public final byte[] f37126c;
    public final d2 d;
    public final String e;
    public final Utilities.Callback2 f37127f;

    public p6(WalletEngine2 walletEngine2, byte[] bArr, d2 d2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f37124a = i10;
        this.f37125b = walletEngine2;
        this.f37126c = bArr;
        this.d = d2Var;
        this.e = str;
        this.f37127f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f37124a) {
            case 0:
                this.f37125b.lambda$signMessage$11(this.f37126c, this.d, this.e, this.f37127f);
                return;
            default:
                this.f37125b.lambda$prepareTonConnectTransfer$5(this.f37126c, this.d, this.e, this.f37127f);
                return;
        }
    }
}
