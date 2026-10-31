package org.telegram.ui.Wallet;

import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.t11;
public final class o implements Runnable {
    public final int f34963a;
    public final k0 f34964b;
    public final String f34965c;
    public final q20 d;
    public final TL_wallet.nftItem e;
    public final String f34966f;
    public final String h;
    public final byte[] f34967n;
    public final long f34968r;
    public final d2 f34969s;
    public final TLRPC.User f34970w;
    public final String f34971x;
    public final q20 f34972y;

    public o(k0 k0Var, String str, q20 q20Var, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j10, d2 d2Var, TLRPC.User user, String str4, q20 q20Var2, int i10) {
        this.f34963a = i10;
        this.f34964b = k0Var;
        this.f34965c = str;
        this.d = q20Var;
        this.e = nftitem;
        this.f34966f = str2;
        this.h = str3;
        this.f34967n = bArr;
        this.f34968r = j10;
        this.f34969s = d2Var;
        this.f34970w = user;
        this.f34971x = str4;
        this.f34972y = q20Var2;
    }

    @Override
    public final void run() {
        switch (this.f34963a) {
            case 0:
                k0 k0Var = this.f34964b;
                String str = this.f34965c;
                q20 q20Var = this.d;
                o oVar = new o(k0Var, str, q20Var, this.e, this.f34966f, this.h, this.f34967n, this.f34968r, this.f34969s, this.f34970w, this.f34971x, this.f34972y, 1);
                if (k0Var.K() && !k0Var.J()) {
                    k0.H("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != 0) {
                        ?? obj = new Object();
                        obj.f20389a = true;
                        boolean[] zArr = {false};
                        x xVar = new x(zArr, q20Var);
                        xVar.V = new t11(25, zArr, oVar);
                        T.showAsSheet(xVar, obj);
                        return;
                    }
                    return;
                }
                oVar.run();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.f34965c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                k0.H(sb2.toString());
                final k0 k0Var2 = this.f34964b;
                final q20 q20Var2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f34966f;
                final String str4 = this.h;
                final byte[] bArr = this.f34967n;
                final long j10 = this.f34968r;
                final d2 d2Var = this.f34969s;
                final TLRPC.User user = this.f34970w;
                final String str5 = this.f34971x;
                final q20 q20Var3 = this.f34972y;
                k0Var2.z(new j20() {
                    @Override
                    public final void a(java.lang.Object r29, java.lang.Object r30) {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.r.a(java.lang.Object, java.lang.Object):void");
                    }
                }, false, true);
                return;
        }
    }
}
