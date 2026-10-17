package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class s6 implements Runnable {
    public final int f34870a;
    public final WalletEngine2 f34871b;
    public final byte[] f34872c;
    public final e2 d;
    public final String e;
    public final Utilities.Callback2 f34873f;

    public s6(WalletEngine2 walletEngine2, byte[] bArr, e2 e2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f34870a = i10;
        this.f34871b = walletEngine2;
        this.f34872c = bArr;
        this.d = e2Var;
        this.e = str;
        this.f34873f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34870a) {
            case 0:
                this.f34871b.lambda$signMessage$11(this.f34872c, this.d, this.e, this.f34873f);
                return;
            default:
                this.f34871b.lambda$prepareTonConnectTransfer$5(this.f34872c, this.d, this.e, this.f34873f);
                return;
        }
    }
}
