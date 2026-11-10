package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.o60;
public final class n1 implements v10 {
    public final int f42850a;
    public final d2 f42851b;
    public final long f42852c;
    public final int d;
    public final Object f42853e;

    public n1(d2 d2Var, Object obj, long j3, int i7, int i10) {
        this.f42850a = i10;
        this.f42851b = d2Var;
        this.f42853e = obj;
        this.f42852c = j3;
        this.d = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        final long j3;
        final int i7;
        final TL_wallet.tonConnectRequest tonconnectrequest;
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.f42850a) {
            case 0:
                final o60 o60Var = (o60) this.f42853e;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final d2 d2Var = this.f42851b;
                l0 l0Var = d2Var.f42287b;
                byte[] bArr = null;
                if (tL_error == null && tonconnectpending != null) {
                    ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        j3 = this.f42852c;
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
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.f27222id == j3 && tonconnectrequest.expires > d2Var.f42290f.getCurrentTime()) {
                        final String t6 = l0Var.t();
                        if (l0Var.y() != null) {
                            bArr = (byte[]) l0Var.y().clone();
                        }
                        final byte[] bArr2 = bArr;
                        l0Var.z(new v10() {
                            @Override
                            public final void a(Object obj3, Object obj4) {
                                d2 d2Var2 = d2.this;
                                o60 o60Var2 = o60Var;
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
                                    Utilities.f21341e.c(new hi.a1(d2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr3, new t1(0, b10, o60Var2), j10, i11));
                                    return;
                                }
                                d2Var2.h = false;
                                if (str2 == null) {
                                    str2 = "Recovery phrase is unavailable";
                                }
                                o60Var2.a(null, str2);
                            }
                        }, true, false);
                        return;
                    }
                    d2Var.h = false;
                    o60Var.a(null, "This request has expired or has already been answered");
                    return;
                }
                d2Var.h = false;
                o60Var.a(null, d2.z(tL_error, "getPending"));
                return;
            default:
                c20 c20Var = (c20) this.f42853e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d2 d2Var2 = this.f42851b;
                d2Var2.getClass();
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    d2Var2.e(this.d, this.f42852c, c20Var);
                    return;
                } else {
                    c20Var.a(d2.z(tL_error2, "closeSession"));
                    return;
                }
        }
    }
}
