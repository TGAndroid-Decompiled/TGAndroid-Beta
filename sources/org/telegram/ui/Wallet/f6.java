package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f32920a;
    public final WalletEngine2 f32921b;
    public final byte[] f32922c;
    public final d2 d;
    public final String e;
    public final Utilities.Callback2 f32923f;

    public f6(WalletEngine2 walletEngine2, byte[] bArr, d2 d2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.f32920a = i10;
        this.f32921b = walletEngine2;
        this.f32922c = bArr;
        this.d = d2Var;
        this.e = str;
        this.f32923f = callback2;
    }

    @Override
    public final void run() {
        switch (this.f32920a) {
            case 0:
                this.f32921b.lambda$signMessage$11(this.f32922c, this.d, this.e, this.f32923f);
                return;
            default:
                this.f32921b.lambda$prepareTonConnectTransfer$5(this.f32922c, this.d, this.e, this.f32923f);
                return;
        }
    }
}
