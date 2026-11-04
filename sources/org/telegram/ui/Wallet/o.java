package org.telegram.ui.Wallet;

import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ma1;
public final class o implements Runnable {
    public final int f42971a;
    public final k0 f42972b;
    public final String f42973c;
    public final u10 d;
    public final TL_wallet.nftItem f42974e;
    public final String f42975f;
    public final String h;
    public final byte[] f42976n;
    public final long f42977r;
    public final b2 f42978s;
    public final TLRPC.User f42979w;
    public final String f42980x;
    public final u10 f42981y;

    public o(k0 k0Var, String str, u10 u10Var, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j10, b2 b2Var, TLRPC.User user, String str4, u10 u10Var2, int i3) {
        this.f42971a = i3;
        this.f42972b = k0Var;
        this.f42973c = str;
        this.d = u10Var;
        this.f42974e = nftitem;
        this.f42975f = str2;
        this.h = str3;
        this.f42976n = bArr;
        this.f42977r = j10;
        this.f42978s = b2Var;
        this.f42979w = user;
        this.f42980x = str4;
        this.f42981y = u10Var2;
    }

    @Override
    public final void run() {
        switch (this.f42971a) {
            case 0:
                k0 k0Var = this.f42972b;
                String str = this.f42973c;
                u10 u10Var = this.d;
                o oVar = new o(k0Var, str, u10Var, this.f42974e, this.f42975f, this.h, this.f42976n, this.f42977r, this.f42978s, this.f42979w, this.f42980x, this.f42981y, 1);
                if (k0Var.K() && !k0Var.J()) {
                    k0.H("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T != 0) {
                        ?? obj = new Object();
                        obj.f27395a = true;
                        boolean[] zArr = {false};
                        x xVar = new x(zArr, u10Var);
                        xVar.W = new ma1(7, zArr, oVar);
                        T.showAsSheet(xVar, obj);
                        return;
                    }
                    return;
                }
                oVar.run();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.f42973c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                k0.H(sb2.toString());
                final k0 k0Var2 = this.f42972b;
                final u10 u10Var2 = this.d;
                final TL_wallet.nftItem nftitem = this.f42974e;
                final String str3 = this.f42975f;
                final String str4 = this.h;
                final byte[] bArr = this.f42976n;
                final long j10 = this.f42977r;
                final b2 b2Var = this.f42978s;
                final TLRPC.User user = this.f42979w;
                final String str5 = this.f42980x;
                final u10 u10Var3 = this.f42981y;
                k0Var2.z(new n10() {
                    @Override
                    public final void a(java.lang.Object r29, java.lang.Object r30) {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.r.a(java.lang.Object, java.lang.Object):void");
                    }
                }, false, true);
                return;
        }
    }
}
