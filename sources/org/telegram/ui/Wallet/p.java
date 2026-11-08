package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
public final class p implements Runnable {
    public final int f42995a;
    public final m0 f42996b;
    public final String f42997c;
    public final c20 d;
    public final TL_wallet.nftItem f42998e;
    public final String f42999f;
    public final String h;
    public final byte[] f43000n;
    public final long f43001r;
    public final d2 f43002s;
    public final TLRPC.User f43003w;
    public final String f43004x;
    public final c20 f43005y;

    public p(m0 m0Var, String str, c20 c20Var, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j3, d2 d2Var, TLRPC.User user, String str4, c20 c20Var2, int i7) {
        this.f42995a = i7;
        this.f42996b = m0Var;
        this.f42997c = str;
        this.d = c20Var;
        this.f42998e = nftitem;
        this.f42999f = str2;
        this.h = str3;
        this.f43000n = bArr;
        this.f43001r = j3;
        this.f43002s = d2Var;
        this.f43003w = user;
        this.f43004x = str4;
        this.f43005y = c20Var2;
    }

    @Override
    public final void run() {
        switch (this.f42995a) {
            case 0:
                m0 m0Var = this.f42996b;
                String str = this.f42997c;
                c20 c20Var = this.d;
                p pVar = new p(m0Var, str, c20Var, this.f42998e, this.f42999f, this.h, this.f43000n, this.f43001r, this.f43002s, this.f43003w, this.f43004x, this.f43005y, 1);
                if (m0Var.K() && !m0Var.J()) {
                    m0.H("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != 0) {
                        ?? obj = new Object();
                        obj.f27424a = true;
                        boolean[] zArr = {false};
                        z zVar = new z(zArr, c20Var);
                        zVar.V = new n(2, zArr, pVar);
                        T.showAsSheet(zVar, obj);
                        return;
                    }
                    return;
                }
                pVar.run();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.f42997c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                m0.H(sb2.toString());
                final m0 m0Var2 = this.f42996b;
                final c20 c20Var2 = this.d;
                final TL_wallet.nftItem nftitem = this.f42998e;
                final String str3 = this.f42999f;
                final String str4 = this.h;
                final byte[] bArr = this.f43000n;
                final long j3 = this.f43001r;
                final d2 d2Var = this.f43002s;
                final TLRPC.User user = this.f43003w;
                final String str5 = this.f43004x;
                final c20 c20Var3 = this.f43005y;
                m0Var2.z(new v10() {
                    @Override
                    public final void a(java.lang.Object r29, java.lang.Object r30) {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.s.a(java.lang.Object, java.lang.Object):void");
                    }
                }, false, true);
                return;
        }
    }
}
