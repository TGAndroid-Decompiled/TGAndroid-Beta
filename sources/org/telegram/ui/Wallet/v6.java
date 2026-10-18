package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class v6 implements Runnable {
    public final int f35000a;
    public final WalletEngine2 f35001b;
    public final byte[] f35002c;
    public final e2 d;
    public final String e;
    public final Utilities.Callback2 f35003f;

    public v6(WalletEngine2 walletEngine2, byte[] bArr, e2 e2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f35000a = i10;
        this.f35001b = walletEngine2;
        this.f35002c = bArr;
        this.d = e2Var;
        this.e = str;
        this.f35003f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35000a) {
            case 0:
                this.f35001b.lambda$signMessage$11(this.f35002c, this.d, this.e, this.f35003f);
                return;
            default:
                this.f35001b.lambda$prepareTonConnectTransfer$5(this.f35002c, this.d, this.e, this.f35003f);
                return;
        }
    }
}
