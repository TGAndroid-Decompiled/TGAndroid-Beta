package org.telegram.ui.Wallet;

import org.telegram.messenger.k20;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.y01;
public final class o implements Runnable {
    public final int f34961a;
    public final k0 f34962b;
    public final String f34963c;
    public final r20 d;
    public final TL_wallet.nftItem e;
    public final String f34964f;
    public final String h;
    public final byte[] f34965n;
    public final long f34966r;
    public final d2 f34967s;
    public final TLRPC.User f34968w;
    public final String f34969x;
    public final r20 f34970y;

    public o(k0 k0Var, String str, r20 r20Var, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j10, d2 d2Var, TLRPC.User user, String str4, r20 r20Var2, int i10) {
        this.f34961a = i10;
        this.f34962b = k0Var;
        this.f34963c = str;
        this.d = r20Var;
        this.e = nftitem;
        this.f34964f = str2;
        this.h = str3;
        this.f34965n = bArr;
        this.f34966r = j10;
        this.f34967s = d2Var;
        this.f34968w = user;
        this.f34969x = str4;
        this.f34970y = r20Var2;
    }

    @Override
    public final void run() {
        switch (this.f34961a) {
            case 0:
                k0 k0Var = this.f34962b;
                String str = this.f34963c;
                r20 r20Var = this.d;
                o oVar = new o(k0Var, str, r20Var, this.e, this.f34964f, this.h, this.f34965n, this.f34966r, this.f34967s, this.f34968w, this.f34969x, this.f34970y, 1);
                if (k0Var.K() && !k0Var.J()) {
                    k0.H("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != 0) {
                        ?? obj = new Object();
                        obj.f20390a = true;
                        boolean[] zArr = {false};
                        x xVar = new x(zArr, r20Var);
                        xVar.V = new y01(26, zArr, oVar);
                        T.showAsSheet(xVar, obj);
                        return;
                    }
                    return;
                }
                oVar.run();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.f34963c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                k0.H(sb2.toString());
                final k0 k0Var2 = this.f34962b;
                final r20 r20Var2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f34964f;
                final String str4 = this.h;
                final byte[] bArr = this.f34965n;
                final long j10 = this.f34966r;
                final d2 d2Var = this.f34967s;
                final TLRPC.User user = this.f34968w;
                final String str5 = this.f34969x;
                final r20 r20Var3 = this.f34970y;
                k0Var2.z(new k20() {
                    @Override
                    public final void a(java.lang.Object r29, java.lang.Object r30) {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.r.a(java.lang.Object, java.lang.Object):void");
                    }
                }, false, true);
                return;
        }
    }
}
