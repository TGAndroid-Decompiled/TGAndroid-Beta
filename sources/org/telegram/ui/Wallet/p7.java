package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
public final class p7 implements Runnable {
    public final int f44834a;
    public final WalletEngine2 f44835b;
    public final byte[] f44836c;
    public final k2 d;
    public final String f44837e;
    public final r10 f44838f;

    public p7(WalletEngine2 walletEngine2, byte[] bArr, k2 k2Var, String str, r10 r10Var, int i7) {
        this.f44834a = i7;
        this.f44835b = walletEngine2;
        this.f44836c = bArr;
        this.d = k2Var;
        this.f44837e = str;
        this.f44838f = r10Var;
    }

    @Override
    public final void run() {
        switch (this.f44834a) {
            case 0:
                this.f44835b.lambda$signMessage$14(this.f44836c, this.d, this.f44837e, this.f44838f);
                return;
            default:
                this.f44835b.lambda$prepareTonConnectTransfer$5(this.f44836c, this.d, this.f44837e, this.f44838f);
                return;
        }
    }
}
