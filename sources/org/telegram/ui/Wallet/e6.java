package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f34861a;
    public final WalletEngine2 f34862b;
    public final byte[] f34863c;
    public final c2 d;
    public final String f34864e;
    public final Utilities.Callback2 f34865f;

    public e6(WalletEngine2 walletEngine2, byte[] bArr, c2 c2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f34861a = i10;
        this.f34862b = walletEngine2;
        this.f34863c = bArr;
        this.d = c2Var;
        this.f34864e = str;
        this.f34865f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34861a) {
            case 0:
                this.f34862b.lambda$signMessage$11(this.f34863c, this.d, this.f34864e, this.f34865f);
                return;
            default:
                this.f34862b.lambda$prepareTonConnectTransfer$5(this.f34863c, this.d, this.f34864e, this.f34865f);
                return;
        }
    }
}
