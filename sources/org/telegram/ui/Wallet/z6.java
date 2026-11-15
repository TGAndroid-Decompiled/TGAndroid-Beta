package org.telegram.ui.Wallet;

import org.telegram.messenger.s10;
public final class z6 implements Runnable {
    public final int f44841a;
    public final WalletEngine2 f44842b;
    public final byte[] f44843c;
    public final c2 d;
    public final String f44844e;
    public final s10 f44845f;

    public z6(WalletEngine2 walletEngine2, byte[] bArr, c2 c2Var, String str, s10 s10Var, int i7) {
        this.f44841a = i7;
        this.f44842b = walletEngine2;
        this.f44843c = bArr;
        this.d = c2Var;
        this.f44844e = str;
        this.f44845f = s10Var;
    }

    @Override
    public final void run() {
        switch (this.f44841a) {
            case 0:
                this.f44842b.lambda$signMessage$11(this.f44843c, this.d, this.f44844e, this.f44845f);
                return;
            default:
                this.f44842b.lambda$prepareTonConnectTransfer$5(this.f44843c, this.d, this.f44844e, this.f44845f);
                return;
        }
    }
}
