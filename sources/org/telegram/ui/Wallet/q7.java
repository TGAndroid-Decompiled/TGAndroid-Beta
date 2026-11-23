package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;
public final class q7 implements Runnable {
    public final int f44962a;
    public final WalletEngine2 f44963b;
    public final byte[] f44964c;
    public final l2 d;
    public final String f44965e;
    public final p10 f44966f;

    public q7(WalletEngine2 walletEngine2, byte[] bArr, l2 l2Var, String str, p10 p10Var, int i7) {
        this.f44962a = i7;
        this.f44963b = walletEngine2;
        this.f44964c = bArr;
        this.d = l2Var;
        this.f44965e = str;
        this.f44966f = p10Var;
    }

    @Override
    public final void run() {
        switch (this.f44962a) {
            case 0:
                this.f44963b.lambda$signMessage$14(this.f44964c, this.d, this.f44965e, this.f44966f);
                return;
            default:
                this.f44963b.lambda$prepareTonConnectTransfer$5(this.f44964c, this.d, this.f44965e, this.f44966f);
                return;
        }
    }
}
