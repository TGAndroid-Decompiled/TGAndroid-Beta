package org.telegram.ui.Wallet;

import org.telegram.messenger.n10;
public final class x6 implements Runnable {
    public final int f43437a;
    public final WalletEngine2 f43438b;
    public final byte[] f43439c;
    public final b2 d;
    public final String f43440e;
    public final n10 f43441f;

    public x6(WalletEngine2 walletEngine2, byte[] bArr, b2 b2Var, String str, n10 n10Var, int i3) {
        this.f43437a = i3;
        this.f43438b = walletEngine2;
        this.f43439c = bArr;
        this.d = b2Var;
        this.f43440e = str;
        this.f43441f = n10Var;
    }

    @Override
    public final void run() {
        switch (this.f43437a) {
            case 0:
                this.f43438b.lambda$signMessage$11(this.f43439c, this.d, this.f43440e, this.f43441f);
                return;
            default:
                this.f43438b.lambda$prepareTonConnectTransfer$5(this.f43439c, this.d, this.f43440e, this.f43441f);
                return;
        }
    }
}
