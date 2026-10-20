package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class p6 implements Runnable {
    public final int f34735a;
    public final WalletEngine2 f34736b;
    public final byte[] f34737c;
    public final e2 d;
    public final String e;
    public final Utilities.Callback2 f34738f;

    public p6(WalletEngine2 walletEngine2, byte[] bArr, e2 e2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f34735a = i10;
        this.f34736b = walletEngine2;
        this.f34737c = bArr;
        this.d = e2Var;
        this.e = str;
        this.f34738f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34735a) {
            case 0:
                this.f34736b.lambda$signMessage$11(this.f34737c, this.d, this.e, this.f34738f);
                return;
            default:
                this.f34736b.lambda$prepareTonConnectTransfer$5(this.f34737c, this.d, this.e, this.f34738f);
                return;
        }
    }
}
