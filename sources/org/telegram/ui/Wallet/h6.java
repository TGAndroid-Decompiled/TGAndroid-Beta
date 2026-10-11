package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class h6 implements Runnable {
    public final int f35082a;
    public final WalletEngine2 f35083b;
    public final byte[] f35084c;
    public final e2 d;
    public final String f35085e;
    public final Utilities.Callback2 f35086f;

    public h6(WalletEngine2 walletEngine2, byte[] bArr, e2 e2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f35082a = i10;
        this.f35083b = walletEngine2;
        this.f35084c = bArr;
        this.d = e2Var;
        this.f35085e = str;
        this.f35086f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35082a) {
            case 0:
                this.f35083b.lambda$signMessage$11(this.f35084c, this.d, this.f35085e, this.f35086f);
                return;
            default:
                this.f35083b.lambda$prepareTonConnectTransfer$5(this.f35084c, this.d, this.f35085e, this.f35086f);
                return;
        }
    }
}
