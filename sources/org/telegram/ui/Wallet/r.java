package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k71;
public final class r implements Runnable {
    public final int f34778a;
    public final m0 f34779b;
    public final String f34780c;
    public final Utilities.Callback d;
    public final TL_wallet.nftItem e;
    public final String f34781f;
    public final String h;
    public final byte[] f34782n;
    public final long f34783r;
    public final TLRPC.User f34784s;
    public final String v;
    public final Utilities.Callback f34785w;
    public final e2 f34786x;

    public r(m0 m0Var, String str, Utilities.Callback callback, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j10, TLRPC.User user, String str4, Utilities.Callback callback2, e2 e2Var, int i10) {
        this.f34778a = i10;
        this.f34779b = m0Var;
        this.f34780c = str;
        this.d = callback;
        this.e = nftitem;
        this.f34781f = str2;
        this.h = str3;
        this.f34782n = bArr;
        this.f34783r = j10;
        this.f34784s = user;
        this.v = str4;
        this.f34785w = callback2;
        this.f34786x = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f34778a) {
            case 0:
                m0 m0Var = this.f34779b;
                String str = this.f34780c;
                Utilities.Callback callback = this.d;
                r rVar = new r(m0Var, str, callback, this.e, this.f34781f, this.h, this.f34782n, this.f34783r, this.f34784s, this.v, this.f34785w, this.f34786x, 1);
                if (m0Var.I() && !m0Var.H()) {
                    m0.F("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj = new Object();
                        obj.f21555a = true;
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
                final String str2 = this.f34780c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                m0.F(sb2.toString());
                final m0 m0Var2 = this.f34779b;
                final Utilities.Callback callback2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f34781f;
                final String str4 = this.h;
                final byte[] bArr = this.f34782n;
                final long j10 = this.f34783r;
                final TLRPC.User user = this.f34784s;
                final String str5 = this.v;
                final Utilities.Callback callback3 = this.f34785w;
                final e2 e2Var = this.f34786x;
                m0Var2.y(new Utilities.Callback2() {
                    @Override
                    public final void run(java.lang.Object r27, java.lang.Object r28) {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.s.run(java.lang.Object, java.lang.Object):void");
                    }
                }, false, true);
                return;
        }
    }
}
