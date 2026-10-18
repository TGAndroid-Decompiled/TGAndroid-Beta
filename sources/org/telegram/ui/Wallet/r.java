package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m71;
public final class r implements Runnable {
    public final int f34810a;
    public final m0 f34811b;
    public final String f34812c;
    public final Utilities.Callback d;
    public final TL_wallet.nftItem e;
    public final String f34813f;
    public final String h;
    public final byte[] f34814n;
    public final long f34815r;
    public final TLRPC.User f34816s;
    public final String v;
    public final Utilities.Callback f34817w;
    public final e2 f34818x;

    public r(m0 m0Var, String str, Utilities.Callback callback, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j10, TLRPC.User user, String str4, Utilities.Callback callback2, e2 e2Var, int i10) {
        this.f34810a = i10;
        this.f34811b = m0Var;
        this.f34812c = str;
        this.d = callback;
        this.e = nftitem;
        this.f34813f = str2;
        this.h = str3;
        this.f34814n = bArr;
        this.f34815r = j10;
        this.f34816s = user;
        this.v = str4;
        this.f34817w = callback2;
        this.f34818x = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f34810a) {
            case 0:
                m0 m0Var = this.f34811b;
                String str = this.f34812c;
                Utilities.Callback callback = this.d;
                r rVar = new r(m0Var, str, callback, this.e, this.f34813f, this.h, this.f34814n, this.f34815r, this.f34816s, this.v, this.f34817w, this.f34818x, 1);
                if (m0Var.I() && !m0Var.H()) {
                    m0.F("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj = new Object();
                        obj.f21559a = true;
                        boolean[] zArr = {false};
                        z zVar = new z(zArr, callback);
                        zVar.V = new m71(25, zArr, rVar);
                        U.showAsSheet(zVar, obj);
                        return;
                    }
                    return;
                }
                rVar.run();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.f34812c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                m0.F(sb2.toString());
                final m0 m0Var2 = this.f34811b;
                final Utilities.Callback callback2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f34813f;
                final String str4 = this.h;
                final byte[] bArr = this.f34814n;
                final long j10 = this.f34815r;
                final TLRPC.User user = this.f34816s;
                final String str5 = this.v;
                final Utilities.Callback callback3 = this.f34817w;
                final e2 e2Var = this.f34818x;
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
