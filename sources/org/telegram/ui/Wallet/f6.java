package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f34927a;
    public final WalletEngine2 f34928b;
    public final byte[] f34929c;
    public final c2 d;
    public final String f34930e;
    public final Utilities.Callback2 f34931f;

    public f6(WalletEngine2 walletEngine2, byte[] bArr, c2 c2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f34927a = i10;
        this.f34928b = walletEngine2;
        this.f34929c = bArr;
        this.d = c2Var;
        this.f34930e = str;
        this.f34931f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34927a) {
            case 0:
                this.f34928b.lambda$signMessage$11(this.f34929c, this.d, this.f34930e, this.f34931f);
                return;
            default:
                this.f34928b.lambda$prepareTonConnectTransfer$5(this.f34929c, this.d, this.f34930e, this.f34931f);
                return;
        }
    }
}
