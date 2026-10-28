package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yc1;
public final class q implements Runnable {
    public final int f37138a;
    public final l0 f37139b;
    public final String f37140c;
    public final Utilities.Callback d;
    public final TL_wallet.nftItem e;
    public final String f37141f;
    public final String h;
    public final byte[] f37142n;
    public final long f37143r;
    public final d2 f37144s;
    public final TLRPC.User v;
    public final String f37145w;
    public final Utilities.Callback f37146x;

    public q(l0 l0Var, String str, Utilities.Callback callback, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j10, d2 d2Var, TLRPC.User user, String str4, Utilities.Callback callback2, int i10) {
        this.f37138a = i10;
        this.f37139b = l0Var;
        this.f37140c = str;
        this.d = callback;
        this.e = nftitem;
        this.f37141f = str2;
        this.h = str3;
        this.f37142n = bArr;
        this.f37143r = j10;
        this.f37144s = d2Var;
        this.v = user;
        this.f37145w = str4;
        this.f37146x = callback2;
    }

    @Override
    public final void run() {
        switch (this.f37138a) {
            case 0:
                l0 l0Var = this.f37139b;
                String str = this.f37140c;
                Utilities.Callback callback = this.d;
                q qVar = new q(l0Var, str, callback, this.e, this.f37141f, this.h, this.f37142n, this.f37143r, this.f37144s, this.v, this.f37145w, this.f37146x, 1);
                if (l0Var.K() && !l0Var.J()) {
                    l0.H("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj = new Object();
                        obj.f22929a = true;
                        boolean[] zArr = {false};
                        y yVar = new y(zArr, callback);
                        yVar.V = new yc1(16, zArr, qVar);
                        U.showAsSheet(yVar, obj);
                        return;
                    }
                    return;
                }
                qVar.run();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.f37140c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                l0.H(sb2.toString());
                final l0 l0Var2 = this.f37139b;
                final Utilities.Callback callback2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f37141f;
                final String str4 = this.h;
                final byte[] bArr = this.f37142n;
                final long j10 = this.f37143r;
                final d2 d2Var = this.f37144s;
                final TLRPC.User user = this.v;
                final String str5 = this.f37145w;
                final Utilities.Callback callback3 = this.f37146x;
                l0Var2.z(new Utilities.Callback2() {
                    @Override
                    public final void run(java.lang.Object r29, java.lang.Object r30) {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.r.run(java.lang.Object, java.lang.Object):void");
                    }
                }, false, true);
                return;
        }
    }
}
