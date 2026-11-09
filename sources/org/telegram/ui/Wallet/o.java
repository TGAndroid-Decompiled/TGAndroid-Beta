package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wb1;
public final class o implements Runnable {
    public final int f42913a;
    public final l0 f42914b;
    public final String f42915c;
    public final c20 d;
    public final TL_wallet.nftItem f42916e;
    public final String f42917f;
    public final String h;
    public final byte[] f42918n;
    public final long f42919r;
    public final c2 f42920s;
    public final TLRPC.User f42921w;
    public final String f42922x;
    public final c20 f42923y;

    public o(l0 l0Var, String str, c20 c20Var, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j3, c2 c2Var, TLRPC.User user, String str4, c20 c20Var2, int i7) {
        this.f42913a = i7;
        this.f42914b = l0Var;
        this.f42915c = str;
        this.d = c20Var;
        this.f42916e = nftitem;
        this.f42917f = str2;
        this.h = str3;
        this.f42918n = bArr;
        this.f42919r = j3;
        this.f42920s = c2Var;
        this.f42921w = user;
        this.f42922x = str4;
        this.f42923y = c20Var2;
    }

    @Override
    public final void run() {
        switch (this.f42913a) {
            case 0:
                l0 l0Var = this.f42914b;
                String str = this.f42915c;
                c20 c20Var = this.d;
                o oVar = new o(l0Var, str, c20Var, this.f42916e, this.f42917f, this.h, this.f42918n, this.f42919r, this.f42920s, this.f42921w, this.f42922x, this.f42923y, 1);
                if (l0Var.K() && !l0Var.J()) {
                    l0.H("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != 0) {
                        ?? obj = new Object();
                        obj.f27408a = true;
                        boolean[] zArr = {false};
                        y yVar = new y(zArr, c20Var);
                        yVar.V = new wb1(3, zArr, oVar);
                        T.showAsSheet(yVar, obj);
                        return;
                    }
                    return;
                }
                oVar.run();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.f42915c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                l0.H(sb2.toString());
                final l0 l0Var2 = this.f42914b;
                final c20 c20Var2 = this.d;
                final TL_wallet.nftItem nftitem = this.f42916e;
                final String str3 = this.f42917f;
                final String str4 = this.h;
                final byte[] bArr = this.f42918n;
                final long j3 = this.f42919r;
                final c2 c2Var = this.f42920s;
                final TLRPC.User user = this.f42921w;
                final String str5 = this.f42922x;
                final c20 c20Var3 = this.f42923y;
                l0Var2.z(new v10() {
                    @Override
                    public final void a(java.lang.Object r29, java.lang.Object r30) {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.r.a(java.lang.Object, java.lang.Object):void");
                    }
                }, false, true);
                return;
        }
    }
}
