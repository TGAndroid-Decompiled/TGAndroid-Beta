package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sb1;
public final class o implements Runnable {
    public final int f42879a;
    public final l0 f42880b;
    public final String f42881c;
    public final c20 d;
    public final TL_wallet.nftItem f42882e;
    public final String f42883f;
    public final String h;
    public final byte[] f42884n;
    public final long f42885r;
    public final c2 f42886s;
    public final TLRPC.User f42887w;
    public final String f42888x;
    public final c20 f42889y;

    public o(l0 l0Var, String str, c20 c20Var, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j3, c2 c2Var, TLRPC.User user, String str4, c20 c20Var2, int i7) {
        this.f42879a = i7;
        this.f42880b = l0Var;
        this.f42881c = str;
        this.d = c20Var;
        this.f42882e = nftitem;
        this.f42883f = str2;
        this.h = str3;
        this.f42884n = bArr;
        this.f42885r = j3;
        this.f42886s = c2Var;
        this.f42887w = user;
        this.f42888x = str4;
        this.f42889y = c20Var2;
    }

    @Override
    public final void run() {
        switch (this.f42879a) {
            case 0:
                l0 l0Var = this.f42880b;
                String str = this.f42881c;
                c20 c20Var = this.d;
                o oVar = new o(l0Var, str, c20Var, this.f42882e, this.f42883f, this.h, this.f42884n, this.f42885r, this.f42886s, this.f42887w, this.f42888x, this.f42889y, 1);
                if (l0Var.K() && !l0Var.J()) {
                    l0.H("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != 0) {
                        ?? obj = new Object();
                        obj.f27388a = true;
                        boolean[] zArr = {false};
                        y yVar = new y(zArr, c20Var);
                        yVar.V = new sb1(4, zArr, oVar);
                        T.showAsSheet(yVar, obj);
                        return;
                    }
                    return;
                }
                oVar.run();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.f42881c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                l0.H(sb2.toString());
                final l0 l0Var2 = this.f42880b;
                final c20 c20Var2 = this.d;
                final TL_wallet.nftItem nftitem = this.f42882e;
                final String str3 = this.f42883f;
                final String str4 = this.h;
                final byte[] bArr = this.f42884n;
                final long j3 = this.f42885r;
                final c2 c2Var = this.f42886s;
                final TLRPC.User user = this.f42887w;
                final String str5 = this.f42888x;
                final c20 c20Var3 = this.f42889y;
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
