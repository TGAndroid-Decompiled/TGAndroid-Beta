package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class o6 implements Runnable {
    public final int f37063a;
    public final WalletEngine2 f37064b;
    public final byte[] f37065c;
    public final d2 d;
    public final String e;
    public final Utilities.Callback2 f37066f;

    public o6(WalletEngine2 walletEngine2, byte[] bArr, d2 d2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f37063a = i10;
        this.f37064b = walletEngine2;
        this.f37065c = bArr;
        this.d = d2Var;
        this.e = str;
        this.f37066f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f37063a) {
            case 0:
                this.f37064b.lambda$signMessage$11(this.f37065c, this.d, this.e, this.f37066f);
                return;
            default:
                this.f37064b.lambda$prepareTonConnectTransfer$5(this.f37065c, this.d, this.e, this.f37066f);
                return;
        }
    }
}
