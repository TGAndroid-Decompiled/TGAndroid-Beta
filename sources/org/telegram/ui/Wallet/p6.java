package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class p6 implements Runnable {
    public final int f34729a;
    public final WalletEngine2 f34730b;
    public final byte[] f34731c;
    public final e2 d;
    public final String e;
    public final Utilities.Callback2 f34732f;

    public p6(WalletEngine2 walletEngine2, byte[] bArr, e2 e2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f34729a = i10;
        this.f34730b = walletEngine2;
        this.f34731c = bArr;
        this.d = e2Var;
        this.e = str;
        this.f34732f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34729a) {
            case 0:
                this.f34730b.lambda$signMessage$11(this.f34731c, this.d, this.e, this.f34732f);
                return;
            default:
                this.f34730b.lambda$prepareTonConnectTransfer$5(this.f34731c, this.d, this.e, this.f34732f);
                return;
        }
    }
}
