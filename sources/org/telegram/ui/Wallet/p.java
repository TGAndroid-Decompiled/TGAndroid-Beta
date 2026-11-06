package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
public final class p implements Runnable {
    public final int f42952a;
    public final n0 f42953b;
    public final String f42954c;
    public final c20 d;
    public final TL_wallet.nftItem f42955e;
    public final String f42956f;
    public final String h;
    public final byte[] f42957n;
    public final long f42958r;
    public final e2 f42959s;
    public final TLRPC.User f42960w;
    public final String f42961x;
    public final c20 f42962y;

    public p(n0 n0Var, String str, c20 c20Var, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j3, e2 e2Var, TLRPC.User user, String str4, c20 c20Var2, int i7) {
        this.f42952a = i7;
        this.f42953b = n0Var;
        this.f42954c = str;
        this.d = c20Var;
        this.f42955e = nftitem;
        this.f42956f = str2;
        this.h = str3;
        this.f42957n = bArr;
        this.f42958r = j3;
        this.f42959s = e2Var;
        this.f42960w = user;
        this.f42961x = str4;
        this.f42962y = c20Var2;
    }

    @Override
    public final void run() {
        switch (this.f42952a) {
            case 0:
                n0 n0Var = this.f42953b;
                String str = this.f42954c;
                c20 c20Var = this.d;
                p pVar = new p(n0Var, str, c20Var, this.f42955e, this.f42956f, this.h, this.f42957n, this.f42958r, this.f42959s, this.f42960w, this.f42961x, this.f42962y, 1);
                if (n0Var.K() && !n0Var.J()) {
                    n0.H("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != 0) {
                        ?? obj = new Object();
                        obj.f27421a = true;
                        boolean[] zArr = {false};
                        a0 a0Var = new a0(zArr, c20Var);
                        a0Var.V = new n(2, zArr, pVar);
                        T.showAsSheet(a0Var, obj);
                        return;
                    }
                    return;
                }
                pVar.run();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.f42954c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                n0.H(sb2.toString());
                final n0 n0Var2 = this.f42953b;
                final c20 c20Var2 = this.d;
                final TL_wallet.nftItem nftitem = this.f42955e;
                final String str3 = this.f42956f;
                final String str4 = this.h;
                final byte[] bArr = this.f42957n;
                final long j3 = this.f42958r;
                final e2 e2Var = this.f42959s;
                final TLRPC.User user = this.f42960w;
                final String str5 = this.f42961x;
                final c20 c20Var3 = this.f42962y;
                n0Var2.z(new v10() {
                    @Override
                    public final void a(java.lang.Object r29, java.lang.Object r30) {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.s.a(java.lang.Object, java.lang.Object):void");
                    }
                }, false, true);
                return;
        }
    }
}
