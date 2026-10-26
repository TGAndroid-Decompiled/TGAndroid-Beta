package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zc1;
public final class q implements Runnable {
    public final int f37113a;
    public final l0 f37114b;
    public final String f37115c;
    public final Utilities.Callback d;
    public final TL_wallet.nftItem e;
    public final String f37116f;
    public final String h;
    public final byte[] f37117n;
    public final long f37118r;
    public final d2 f37119s;
    public final TLRPC.User v;
    public final String f37120w;
    public final Utilities.Callback f37121x;

    public q(l0 l0Var, String str, Utilities.Callback callback, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j10, d2 d2Var, TLRPC.User user, String str4, Utilities.Callback callback2, int i10) {
        this.f37113a = i10;
        this.f37114b = l0Var;
        this.f37115c = str;
        this.d = callback;
        this.e = nftitem;
        this.f37116f = str2;
        this.h = str3;
        this.f37117n = bArr;
        this.f37118r = j10;
        this.f37119s = d2Var;
        this.v = user;
        this.f37120w = str4;
        this.f37121x = callback2;
    }

    @Override
    public final void run() {
        switch (this.f37113a) {
            case 0:
                l0 l0Var = this.f37114b;
                String str = this.f37115c;
                Utilities.Callback callback = this.d;
                q qVar = new q(l0Var, str, callback, this.e, this.f37116f, this.h, this.f37117n, this.f37118r, this.f37119s, this.v, this.f37120w, this.f37121x, 1);
                if (l0Var.I() && !l0Var.H()) {
                    l0.F("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj = new Object();
                        obj.f22928a = true;
                        boolean[] zArr = {false};
                        y yVar = new y(zArr, callback);
                        yVar.V = new zc1(15, zArr, qVar);
                        U.showAsSheet(yVar, obj);
                        return;
                    }
                    return;
                }
                qVar.run();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.f37115c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                l0.F(sb2.toString());
                final l0 l0Var2 = this.f37114b;
                final Utilities.Callback callback2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f37116f;
                final String str4 = this.h;
                final byte[] bArr = this.f37117n;
                final long j10 = this.f37118r;
                final d2 d2Var = this.f37119s;
                final TLRPC.User user = this.v;
                final String str5 = this.f37120w;
                final Utilities.Callback callback3 = this.f37121x;
                l0Var2.y(new Utilities.Callback2() {
                    @Override
                    public final void run(java.lang.Object r29, java.lang.Object r30) {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.r.run(java.lang.Object, java.lang.Object):void");
                    }
                }, false, true);
                return;
        }
    }
}
