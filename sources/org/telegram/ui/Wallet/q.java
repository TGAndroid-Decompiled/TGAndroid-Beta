package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.n71;
public final class q implements Runnable {
    public final int f35054a;
    public final l0 f35055b;
    public final String f35056c;
    public final Utilities.Callback d;
    public final TL_wallet.nftItem e;
    public final String f35057f;
    public final String h;
    public final byte[] f35058n;
    public final long f35059r;
    public final d2 f35060s;
    public final TLRPC.User v;
    public final String f35061w;
    public final Utilities.Callback f35062x;

    public q(l0 l0Var, String str, Utilities.Callback callback, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j10, d2 d2Var, TLRPC.User user, String str4, Utilities.Callback callback2, int i10) {
        this.f35054a = i10;
        this.f35055b = l0Var;
        this.f35056c = str;
        this.d = callback;
        this.e = nftitem;
        this.f35057f = str2;
        this.h = str3;
        this.f35058n = bArr;
        this.f35059r = j10;
        this.f35060s = d2Var;
        this.v = user;
        this.f35061w = str4;
        this.f35062x = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35054a) {
            case 0:
                l0 l0Var = this.f35055b;
                String str = this.f35056c;
                Utilities.Callback callback = this.d;
                q qVar = new q(l0Var, str, callback, this.e, this.f35057f, this.h, this.f35058n, this.f35059r, this.f35060s, this.v, this.f35061w, this.f35062x, 1);
                if (l0Var.I() && !l0Var.H()) {
                    l0.F("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj = new Object();
                        obj.f21637a = true;
                        boolean[] zArr = {false};
                        y yVar = new y(zArr, callback);
                        yVar.V = new n71(25, zArr, qVar);
                        U.showAsSheet(yVar, obj);
                        return;
                    }
                    return;
                }
                qVar.run();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.f35056c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                l0.F(sb2.toString());
                final l0 l0Var2 = this.f35055b;
                final Utilities.Callback callback2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f35057f;
                final String str4 = this.h;
                final byte[] bArr = this.f35058n;
                final long j10 = this.f35059r;
                final d2 d2Var = this.f35060s;
                final TLRPC.User user = this.v;
                final String str5 = this.f35061w;
                final Utilities.Callback callback3 = this.f35062x;
                l0Var2.y(new Utilities.Callback2() {
                    @Override
                    public final void run(java.lang.Object r29, java.lang.Object r30) {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.r.run(java.lang.Object, java.lang.Object):void");
                    }
                }, false, true);
                return;
        }
    }
}
