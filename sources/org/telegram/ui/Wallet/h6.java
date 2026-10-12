package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class h6 implements Runnable {
    public final int f34857a;
    public final WalletEngine2 f34858b;
    public final byte[] f34859c;
    public final e2 d;
    public final String f34860e;
    public final Utilities.Callback2 f34861f;

    public h6(WalletEngine2 walletEngine2, byte[] bArr, e2 e2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f34857a = i10;
        this.f34858b = walletEngine2;
        this.f34859c = bArr;
        this.d = e2Var;
        this.f34860e = str;
        this.f34861f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34857a) {
            case 0:
                this.f34858b.lambda$signMessage$11(this.f34859c, this.d, this.f34860e, this.f34861f);
                return;
            default:
                this.f34858b.lambda$prepareTonConnectTransfer$5(this.f34859c, this.d, this.f34860e, this.f34861f);
                return;
        }
    }
}
