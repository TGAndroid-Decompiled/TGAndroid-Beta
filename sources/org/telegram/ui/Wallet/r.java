package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k71;
public final class r implements Runnable {
    public final int f34787a;
    public final m0 f34788b;
    public final String f34789c;
    public final Utilities.Callback d;
    public final TL_wallet.nftItem e;
    public final String f34790f;
    public final String h;
    public final byte[] f34791n;
    public final long f34792r;
    public final e2 f34793s;
    public final TLRPC.User v;
    public final String f34794w;
    public final Utilities.Callback f34795x;

    public r(m0 m0Var, String str, Utilities.Callback callback, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j10, e2 e2Var, TLRPC.User user, String str4, Utilities.Callback callback2, int i10) {
        this.f34787a = i10;
        this.f34788b = m0Var;
        this.f34789c = str;
        this.d = callback;
        this.e = nftitem;
        this.f34790f = str2;
        this.h = str3;
        this.f34791n = bArr;
        this.f34792r = j10;
        this.f34793s = e2Var;
        this.v = user;
        this.f34794w = str4;
        this.f34795x = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34787a) {
            case 0:
                m0 m0Var = this.f34788b;
                String str = this.f34789c;
                Utilities.Callback callback = this.d;
                r rVar = new r(m0Var, str, callback, this.e, this.f34790f, this.h, this.f34791n, this.f34792r, this.f34793s, this.v, this.f34794w, this.f34795x, 1);
                if (m0Var.I() && !m0Var.H()) {
                    m0.F("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj = new Object();
                        obj.f21556a = true;
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
                final String str2 = this.f34789c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                m0.F(sb2.toString());
                final m0 m0Var2 = this.f34788b;
                final Utilities.Callback callback2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f34790f;
                final String str4 = this.h;
                final byte[] bArr = this.f34791n;
                final long j10 = this.f34792r;
                final e2 e2Var = this.f34793s;
                final TLRPC.User user = this.v;
                final String str5 = this.f34794w;
                final Utilities.Callback callback3 = this.f34795x;
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
