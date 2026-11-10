package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class a7 implements Runnable {
    public final int f42144a;
    public final WalletEngine2 f42145b;
    public final byte[] f42146c;
    public final c2 d;
    public final String f42147e;
    public final v10 f42148f;

    public a7(WalletEngine2 walletEngine2, byte[] bArr, c2 c2Var, String str, v10 v10Var, int i7) {
        this.f42144a = i7;
        this.f42145b = walletEngine2;
        this.f42146c = bArr;
        this.d = c2Var;
        this.f42147e = str;
        this.f42148f = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f42144a) {
            case 0:
                this.f42145b.lambda$signMessage$11(this.f42146c, this.d, this.f42147e, this.f42148f);
                return;
            default:
                this.f42145b.lambda$prepareTonConnectTransfer$5(this.f42146c, this.d, this.f42147e, this.f42148f);
                return;
        }
    }
}
