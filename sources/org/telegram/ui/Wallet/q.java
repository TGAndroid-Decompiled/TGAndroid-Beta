package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o71;
public final class q implements Runnable {
    public final int f35052a;
    public final l0 f35053b;
    public final String f35054c;
    public final Utilities.Callback d;
    public final TL_wallet.nftItem e;
    public final String f35055f;
    public final String h;
    public final byte[] f35056n;
    public final long f35057r;
    public final d2 f35058s;
    public final TLRPC.User v;
    public final String f35059w;
    public final Utilities.Callback f35060x;

    public q(l0 l0Var, String str, Utilities.Callback callback, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j10, d2 d2Var, TLRPC.User user, String str4, Utilities.Callback callback2, int i10) {
        this.f35052a = i10;
        this.f35053b = l0Var;
        this.f35054c = str;
        this.d = callback;
        this.e = nftitem;
        this.f35055f = str2;
        this.h = str3;
        this.f35056n = bArr;
        this.f35057r = j10;
        this.f35058s = d2Var;
        this.v = user;
        this.f35059w = str4;
        this.f35060x = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35052a) {
            case 0:
                l0 l0Var = this.f35053b;
                String str = this.f35054c;
                Utilities.Callback callback = this.d;
                q qVar = new q(l0Var, str, callback, this.e, this.f35055f, this.h, this.f35056n, this.f35057r, this.f35058s, this.v, this.f35059w, this.f35060x, 1);
                if (l0Var.I() && !l0Var.H()) {
                    l0.F("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj = new Object();
                        obj.f21636a = true;
                        boolean[] zArr = {false};
                        y yVar = new y(zArr, callback);
                        yVar.V = new o71(25, zArr, qVar);
                        U.showAsSheet(yVar, obj);
                        return;
                    }
                    return;
                }
                qVar.run();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.f35054c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                l0.F(sb2.toString());
                final l0 l0Var2 = this.f35053b;
                final Utilities.Callback callback2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f35055f;
                final String str4 = this.h;
                final byte[] bArr = this.f35056n;
                final long j10 = this.f35057r;
                final d2 d2Var = this.f35058s;
                final TLRPC.User user = this.v;
                final String str5 = this.f35059w;
                final Utilities.Callback callback3 = this.f35060x;
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
