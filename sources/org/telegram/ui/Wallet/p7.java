package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
public final class p7 implements Runnable {
    public final int f44800a;
    public final WalletEngine2 f44801b;
    public final byte[] f44802c;
    public final k2 d;
    public final String f44803e;
    public final r10 f44804f;

    public p7(WalletEngine2 walletEngine2, byte[] bArr, k2 k2Var, String str, r10 r10Var, int i7) {
        this.f44800a = i7;
        this.f44801b = walletEngine2;
        this.f44802c = bArr;
        this.d = k2Var;
        this.f44803e = str;
        this.f44804f = r10Var;
    }

    @Override
    public final void run() {
        switch (this.f44800a) {
            case 0:
                this.f44801b.lambda$signMessage$14(this.f44802c, this.d, this.f44803e, this.f44804f);
                return;
            default:
                this.f44801b.lambda$prepareTonConnectTransfer$5(this.f44802c, this.d, this.f44803e, this.f44804f);
                return;
        }
    }
}
