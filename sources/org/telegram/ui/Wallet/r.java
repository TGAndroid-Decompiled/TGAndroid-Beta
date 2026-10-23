package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k71;
public final class r implements Runnable {
    public final int f34791a;
    public final m0 f34792b;
    public final String f34793c;
    public final Utilities.Callback d;
    public final TL_wallet.nftItem e;
    public final String f34794f;
    public final String h;
    public final byte[] f34795n;
    public final long f34796r;
    public final e2 f34797s;
    public final TLRPC.User v;
    public final String f34798w;
    public final Utilities.Callback f34799x;

    public r(m0 m0Var, String str, Utilities.Callback callback, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j10, e2 e2Var, TLRPC.User user, String str4, Utilities.Callback callback2, int i10) {
        this.f34791a = i10;
        this.f34792b = m0Var;
        this.f34793c = str;
        this.d = callback;
        this.e = nftitem;
        this.f34794f = str2;
        this.h = str3;
        this.f34795n = bArr;
        this.f34796r = j10;
        this.f34797s = e2Var;
        this.v = user;
        this.f34798w = str4;
        this.f34799x = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34791a) {
            case 0:
                m0 m0Var = this.f34792b;
                String str = this.f34793c;
                Utilities.Callback callback = this.d;
                r rVar = new r(m0Var, str, callback, this.e, this.f34794f, this.h, this.f34795n, this.f34796r, this.f34797s, this.v, this.f34798w, this.f34799x, 1);
                if (m0Var.I() && !m0Var.H()) {
                    m0.F("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj = new Object();
                        obj.f21560a = true;
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
                final String str2 = this.f34793c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                m0.F(sb2.toString());
                final m0 m0Var2 = this.f34792b;
                final Utilities.Callback callback2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f34794f;
                final String str4 = this.h;
                final byte[] bArr = this.f34795n;
                final long j10 = this.f34796r;
                final e2 e2Var = this.f34797s;
                final TLRPC.User user = this.v;
                final String str5 = this.f34798w;
                final Utilities.Callback callback3 = this.f34799x;
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
