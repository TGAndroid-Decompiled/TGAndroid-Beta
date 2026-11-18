package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
public final class p7 implements Runnable {
    public final int f44790a;
    public final WalletEngine2 f44791b;
    public final byte[] f44792c;
    public final k2 d;
    public final String f44793e;
    public final q10 f44794f;

    public p7(WalletEngine2 walletEngine2, byte[] bArr, k2 k2Var, String str, q10 q10Var, int i7) {
        this.f44790a = i7;
        this.f44791b = walletEngine2;
        this.f44792c = bArr;
        this.d = k2Var;
        this.f44793e = str;
        this.f44794f = q10Var;
    }

    @Override
    public final void run() {
        switch (this.f44790a) {
            case 0:
                this.f44791b.lambda$signMessage$14(this.f44792c, this.d, this.f44793e, this.f44794f);
                return;
            default:
                this.f44791b.lambda$prepareTonConnectTransfer$5(this.f44792c, this.d, this.f44793e, this.f44794f);
                return;
        }
    }
}
