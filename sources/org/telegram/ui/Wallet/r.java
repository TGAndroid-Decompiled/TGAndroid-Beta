package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k71;
public final class r implements Runnable {
    public final int f34780a;
    public final m0 f34781b;
    public final String f34782c;
    public final Utilities.Callback d;
    public final TL_wallet.nftItem e;
    public final String f34783f;
    public final String h;
    public final byte[] f34784n;
    public final long f34785r;
    public final e2 f34786s;
    public final TLRPC.User v;
    public final String f34787w;
    public final Utilities.Callback f34788x;

    public r(m0 m0Var, String str, Utilities.Callback callback, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j10, e2 e2Var, TLRPC.User user, String str4, Utilities.Callback callback2, int i10) {
        this.f34780a = i10;
        this.f34781b = m0Var;
        this.f34782c = str;
        this.d = callback;
        this.e = nftitem;
        this.f34783f = str2;
        this.h = str3;
        this.f34784n = bArr;
        this.f34785r = j10;
        this.f34786s = e2Var;
        this.v = user;
        this.f34787w = str4;
        this.f34788x = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34780a) {
            case 0:
                m0 m0Var = this.f34781b;
                String str = this.f34782c;
                Utilities.Callback callback = this.d;
                r rVar = new r(m0Var, str, callback, this.e, this.f34783f, this.h, this.f34784n, this.f34785r, this.f34786s, this.v, this.f34787w, this.f34788x, 1);
                if (m0Var.I() && !m0Var.H()) {
                    m0.F("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj = new Object();
                        obj.f21553a = true;
                        boolean[] zArr = {false};
                        z zVar = new z(zArr, callback);
                        zVar.V = new k71(25, zArr, rVar);
                        U.showAsSheet(zVar, obj);
                        return;
                    }
                    return;
                }
                rVar.run();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.f34782c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                m0.F(sb2.toString());
                final m0 m0Var2 = this.f34781b;
                final Utilities.Callback callback2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f34783f;
                final String str4 = this.h;
                final byte[] bArr = this.f34784n;
                final long j10 = this.f34785r;
                final e2 e2Var = this.f34786s;
                final TLRPC.User user = this.v;
                final String str5 = this.f34787w;
                final Utilities.Callback callback3 = this.f34788x;
                m0Var2.y(new Utilities.Callback2() {
                    @Override
                    public final void run(java.lang.Object r29, java.lang.Object r30) {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.s.run(java.lang.Object, java.lang.Object):void");
                    }
                }, false, true);
                return;
        }
    }
}
