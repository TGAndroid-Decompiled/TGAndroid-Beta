package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class o6 implements Runnable {
    public final int f37060a;
    public final WalletEngine2 f37061b;
    public final byte[] f37062c;
    public final d2 d;
    public final String e;
    public final Utilities.Callback2 f37063f;

    public o6(WalletEngine2 walletEngine2, byte[] bArr, d2 d2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f37060a = i10;
        this.f37061b = walletEngine2;
        this.f37062c = bArr;
        this.d = d2Var;
        this.e = str;
        this.f37063f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f37060a) {
            case 0:
                this.f37061b.lambda$signMessage$11(this.f37062c, this.d, this.e, this.f37063f);
                return;
            default:
                this.f37061b.lambda$prepareTonConnectTransfer$5(this.f37062c, this.d, this.e, this.f37063f);
                return;
        }
    }
}
