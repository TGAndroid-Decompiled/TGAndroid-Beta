package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
public final class p implements Runnable {
    public final int f42953a;
    public final n0 f42954b;
    public final String f42955c;
    public final c20 d;
    public final TL_wallet.nftItem f42956e;
    public final String f42957f;
    public final String h;
    public final byte[] f42958n;
    public final long f42959r;
    public final e2 f42960s;
    public final TLRPC.User f42961w;
    public final String f42962x;
    public final c20 f42963y;

    public p(n0 n0Var, String str, c20 c20Var, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j3, e2 e2Var, TLRPC.User user, String str4, c20 c20Var2, int i7) {
        this.f42953a = i7;
        this.f42954b = n0Var;
        this.f42955c = str;
        this.d = c20Var;
        this.f42956e = nftitem;
        this.f42957f = str2;
        this.h = str3;
        this.f42958n = bArr;
        this.f42959r = j3;
        this.f42960s = e2Var;
        this.f42961w = user;
        this.f42962x = str4;
        this.f42963y = c20Var2;
    }

    @Override
    public final void run() {
        switch (this.f42953a) {
            case 0:
                n0 n0Var = this.f42954b;
                String str = this.f42955c;
                c20 c20Var = this.d;
                p pVar = new p(n0Var, str, c20Var, this.f42956e, this.f42957f, this.h, this.f42958n, this.f42959r, this.f42960s, this.f42961w, this.f42962x, this.f42963y, 1);
                if (n0Var.K() && !n0Var.J()) {
                    n0.H("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != 0) {
                        ?? obj = new Object();
                        obj.f27420a = true;
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
                final String str2 = this.f42955c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                n0.H(sb2.toString());
                final n0 n0Var2 = this.f42954b;
                final c20 c20Var2 = this.d;
                final TL_wallet.nftItem nftitem = this.f42956e;
                final String str3 = this.f42957f;
                final String str4 = this.h;
                final byte[] bArr = this.f42958n;
                final long j3 = this.f42959r;
                final e2 e2Var = this.f42960s;
                final TLRPC.User user = this.f42961w;
                final String str5 = this.f42962x;
                final c20 c20Var3 = this.f42963y;
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
