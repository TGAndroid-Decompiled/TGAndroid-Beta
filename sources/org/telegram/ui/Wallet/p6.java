package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class p6 implements Runnable {
    public final int f34708a;
    public final WalletEngine2 f34709b;
    public final byte[] f34710c;
    public final e2 d;
    public final String e;
    public final Utilities.Callback2 f34711f;

    public p6(WalletEngine2 walletEngine2, byte[] bArr, e2 e2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f34708a = i10;
        this.f34709b = walletEngine2;
        this.f34710c = bArr;
        this.d = e2Var;
        this.e = str;
        this.f34711f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34708a) {
            case 0:
                this.f34709b.lambda$signMessage$11(this.f34710c, this.d, this.e, this.f34711f);
                return;
            default:
                this.f34709b.lambda$prepareTonConnectTransfer$5(this.f34710c, this.d, this.e, this.f34711f);
                return;
        }
    }
}
