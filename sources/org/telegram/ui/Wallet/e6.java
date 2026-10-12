package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f33145a;
    public final WalletEngine2 f33146b;
    public final byte[] f33147c;
    public final c2 d;
    public final String e;
    public final Utilities.Callback2 f33148f;

    public e6(WalletEngine2 walletEngine2, byte[] bArr, c2 c2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f33145a = i10;
        this.f33146b = walletEngine2;
        this.f33147c = bArr;
        this.d = c2Var;
        this.e = str;
        this.f33148f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f33145a) {
            case 0:
                this.f33146b.lambda$signMessage$11(this.f33147c, this.d, this.e, this.f33148f);
                return;
            default:
                this.f33146b.lambda$prepareTonConnectTransfer$5(this.f33147c, this.d, this.e, this.f33148f);
                return;
        }
    }
}
