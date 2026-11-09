package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.n60;
public final class n1 implements v10 {
    public final int f42851a;
    public final d2 f42852b;
    public final long f42853c;
    public final int d;
    public final Object f42854e;

    public n1(d2 d2Var, Object obj, long j3, int i7, int i10) {
        this.f42851a = i10;
        this.f42852b = d2Var;
        this.f42854e = obj;
        this.f42853c = j3;
        this.d = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        final long j3;
        final int i7;
        final TL_wallet.tonConnectRequest tonconnectrequest;
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.f42851a) {
            case 0:
                final n60 n60Var = (n60) this.f42854e;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final d2 d2Var = this.f42852b;
                l0 l0Var = d2Var.f42346b;
                byte[] bArr = null;
                if (tL_error == null && tonconnectpending != null) {
                    ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        j3 = this.f42853c;
                        i7 = this.d;
                        if (i10 < size) {
                            TL_wallet.tonConnectRequest tonconnectrequest2 = arrayList.get(i10);
                            i10++;
                            TL_wallet.tonConnectRequest tonconnectrequest3 = tonconnectrequest2;
                            if (tonconnectrequest3.session_id == j3 && tonconnectrequest3.msg_id == i7) {
                                tonconnectrequest = tonconnectrequest3;
                            }
                        } else {
                            tonconnectrequest = null;
                        }
                    }
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.f27218id == j3 && tonconnectrequest.expires > d2Var.f42349f.getCurrentTime()) {
                        final String t6 = l0Var.t();
                        if (l0Var.y() != null) {
                            bArr = (byte[]) l0Var.y().clone();
                        }
                        final byte[] bArr2 = bArr;
                        l0Var.z(new v10() {
                            @Override
                            public final void a(Object obj3, Object obj4) {
                                d2 d2Var2 = d2.this;
                                n60 n60Var2 = n60Var;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = t6;
                                byte[] bArr3 = bArr2;
                                long j10 = j3;
                                int i11 = i7;
                                i0 i0Var = (i0) obj3;
                                String str2 = (String) obj4;
                                d2Var2.getClass();
                                if (i0Var != null && str2 == null) {
                                    i0 b10 = i0Var.b();
                                    Utilities.f21336e.c(new hi.a1(d2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr3, new t1(0, b10, n60Var2), j10, i11));
                                    return;
                                }
                                d2Var2.h = false;
                                if (str2 == null) {
                                    str2 = "Recovery phrase is unavailable";
                                }
                                n60Var2.a(null, str2);
                            }
                        }, true, false);
                        return;
                    }
                    d2Var.h = false;
                    n60Var.a(null, "This request has expired or has already been answered");
                    return;
                }
                d2Var.h = false;
                n60Var.a(null, d2.z(tL_error, "getPending"));
                return;
            default:
                c20 c20Var = (c20) this.f42854e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d2 d2Var2 = this.f42852b;
                d2Var2.getClass();
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    d2Var2.e(this.d, this.f42853c, c20Var);
                    return;
                } else {
                    c20Var.a(d2.z(tL_error2, "closeSession"));
                    return;
                }
        }
    }
}
