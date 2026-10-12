package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class h6 implements Runnable {
    public final int f34859a;
    public final WalletEngine2 f34860b;
    public final byte[] f34861c;
    public final e2 d;
    public final String f34862e;
    public final Utilities.Callback2 f34863f;

    public h6(WalletEngine2 walletEngine2, byte[] bArr, e2 e2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f34859a = i10;
        this.f34860b = walletEngine2;
        this.f34861c = bArr;
        this.d = e2Var;
        this.f34862e = str;
        this.f34863f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34859a) {
            case 0:
                this.f34860b.lambda$signMessage$11(this.f34861c, this.d, this.f34862e, this.f34863f);
                return;
            default:
                this.f34860b.lambda$prepareTonConnectTransfer$5(this.f34861c, this.d, this.f34862e, this.f34863f);
                return;
        }
    }
}
