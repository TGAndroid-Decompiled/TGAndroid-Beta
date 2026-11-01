package org.telegram.ui.Wallet;

import org.telegram.messenger.k20;
public final class d7 implements Runnable {
    public final int f34430a;
    public final WalletEngine2 f34431b;
    public final byte[] f34432c;
    public final d2 d;
    public final String e;
    public final k20 f34433f;

    public d7(WalletEngine2 walletEngine2, byte[] bArr, d2 d2Var, String str, k20 k20Var, int i10) {
        this.f34430a = i10;
        this.f34431b = walletEngine2;
        this.f34432c = bArr;
        this.d = d2Var;
        this.e = str;
        this.f34433f = k20Var;
    }

    @Override
    public final void run() {
        switch (this.f34430a) {
            case 0:
                this.f34431b.lambda$signMessage$11(this.f34432c, this.d, this.e, this.f34433f);
                return;
            default:
                this.f34431b.lambda$prepareTonConnectTransfer$5(this.f34432c, this.d, this.e, this.f34433f);
                return;
        }
    }
}
