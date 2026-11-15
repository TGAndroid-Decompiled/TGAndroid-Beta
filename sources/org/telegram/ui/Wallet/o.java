package org.telegram.ui.Wallet;

import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fy0;
public final class o implements Runnable {
    public final int f44208a;
    public final l0 f44209b;
    public final String f44210c;
    public final z10 d;
    public final TL_wallet.nftItem f44211e;
    public final String f44212f;
    public final String h;
    public final byte[] f44213n;
    public final long f44214r;
    public final c2 f44215s;
    public final TLRPC.User f44216w;
    public final String f44217x;
    public final z10 f44218y;

    public o(l0 l0Var, String str, z10 z10Var, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j3, c2 c2Var, TLRPC.User user, String str4, z10 z10Var2, int i7) {
        this.f44208a = i7;
        this.f44209b = l0Var;
        this.f44210c = str;
        this.d = z10Var;
        this.f44211e = nftitem;
        this.f44212f = str2;
        this.h = str3;
        this.f44213n = bArr;
        this.f44214r = j3;
        this.f44215s = c2Var;
        this.f44216w = user;
        this.f44217x = str4;
        this.f44218y = z10Var2;
    }

    @Override
    public final void run() {
        switch (this.f44208a) {
            case 0:
                l0 l0Var = this.f44209b;
                String str = this.f44210c;
                z10 z10Var = this.d;
                o oVar = new o(l0Var, str, z10Var, this.f44211e, this.f44212f, this.h, this.f44213n, this.f44214r, this.f44215s, this.f44216w, this.f44217x, this.f44218y, 1);
                if (l0Var.K() && !l0Var.J()) {
                    l0.H("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    if (T != 0) {
                        ?? obj = new Object();
                        obj.f28476a = true;
                        boolean[] zArr = {false};
                        y yVar = new y(zArr, z10Var);
                        yVar.W = new fy0(29, zArr, oVar);
                        T.showAsSheet(yVar, obj);
                        return;
                    }
                    return;
                }
                oVar.run();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.f44210c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                l0.H(sb2.toString());
                final l0 l0Var2 = this.f44209b;
                final z10 z10Var2 = this.d;
                final TL_wallet.nftItem nftitem = this.f44211e;
                final String str3 = this.f44212f;
                final String str4 = this.h;
                final byte[] bArr = this.f44213n;
                final long j3 = this.f44214r;
                final c2 c2Var = this.f44215s;
                final TLRPC.User user = this.f44216w;
                final String str5 = this.f44217x;
                final z10 z10Var3 = this.f44218y;
                l0Var2.z(new s10() {
                    @Override
                    public final void a(java.lang.Object r29, java.lang.Object r30) {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.s.a(java.lang.Object, java.lang.Object):void");
                    }
                }, false, true);
                return;
        }
    }
}
