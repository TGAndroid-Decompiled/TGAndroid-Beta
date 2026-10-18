package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m71;
public final class r implements Runnable {
    public final int f34761a;
    public final m0 f34762b;
    public final String f34763c;
    public final Utilities.Callback d;
    public final TL_wallet.nftItem e;
    public final String f34764f;
    public final String h;
    public final byte[] f34765n;
    public final long f34766r;
    public final TLRPC.User f34767s;
    public final String v;
    public final Utilities.Callback f34768w;
    public final e2 f34769x;

    public r(m0 m0Var, String str, Utilities.Callback callback, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j10, TLRPC.User user, String str4, Utilities.Callback callback2, e2 e2Var, int i10) {
        this.f34761a = i10;
        this.f34762b = m0Var;
        this.f34763c = str;
        this.d = callback;
        this.e = nftitem;
        this.f34764f = str2;
        this.h = str3;
        this.f34765n = bArr;
        this.f34766r = j10;
        this.f34767s = user;
        this.v = str4;
        this.f34768w = callback2;
        this.f34769x = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f34761a) {
            case 0:
                m0 m0Var = this.f34762b;
                String str = this.f34763c;
                Utilities.Callback callback = this.d;
                r rVar = new r(m0Var, str, callback, this.e, this.f34764f, this.h, this.f34765n, this.f34766r, this.f34767s, this.v, this.f34768w, this.f34769x, 1);
                if (m0Var.I() && !m0Var.H()) {
                    m0.F("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj = new Object();
                        obj.f21552a = true;
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
                final String str2 = this.f34763c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                m0.F(sb2.toString());
                final m0 m0Var2 = this.f34762b;
                final Utilities.Callback callback2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f34764f;
                final String str4 = this.h;
                final byte[] bArr = this.f34765n;
                final long j10 = this.f34766r;
                final TLRPC.User user = this.f34767s;
                final String str5 = this.v;
                final Utilities.Callback callback3 = this.f34768w;
                final e2 e2Var = this.f34769x;
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
