package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class h6 implements Runnable {
    public final int f35048a;
    public final WalletEngine2 f35049b;
    public final byte[] f35050c;
    public final e2 d;
    public final String f35051e;
    public final Utilities.Callback2 f35052f;

    public h6(WalletEngine2 walletEngine2, byte[] bArr, e2 e2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f35048a = i10;
        this.f35049b = walletEngine2;
        this.f35050c = bArr;
        this.d = e2Var;
        this.f35051e = str;
        this.f35052f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35048a) {
            case 0:
                this.f35049b.lambda$signMessage$11(this.f35050c, this.d, this.f35051e, this.f35052f);
                return;
            default:
                this.f35049b.lambda$prepareTonConnectTransfer$5(this.f35050c, this.d, this.f35051e, this.f35052f);
                return;
        }
    }
}
