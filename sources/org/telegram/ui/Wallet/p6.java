package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class p6 implements Runnable {
    public final int f34727a;
    public final WalletEngine2 f34728b;
    public final byte[] f34729c;
    public final e2 d;
    public final String e;
    public final Utilities.Callback2 f34730f;

    public p6(WalletEngine2 walletEngine2, byte[] bArr, e2 e2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f34727a = i10;
        this.f34728b = walletEngine2;
        this.f34729c = bArr;
        this.d = e2Var;
        this.e = str;
        this.f34730f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34727a) {
            case 0:
                this.f34728b.lambda$signMessage$11(this.f34729c, this.d, this.e, this.f34730f);
                return;
            default:
                this.f34728b.lambda$prepareTonConnectTransfer$5(this.f34729c, this.d, this.e, this.f34730f);
                return;
        }
    }
}
