package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.l60;
public final class o1 implements v10 {
    public final int f42933a;
    public final e2 f42934b;
    public final long f42935c;
    public final int d;
    public final Object f42936e;

    public o1(e2 e2Var, Object obj, long j3, int i7, int i10) {
        this.f42933a = i10;
        this.f42934b = e2Var;
        this.f42936e = obj;
        this.f42935c = j3;
        this.d = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        final long j3;
        final int i7;
        final TL_wallet.tonConnectRequest tonconnectrequest;
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.f42933a) {
            case 0:
                final l60 l60Var = (l60) this.f42936e;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final e2 e2Var = this.f42934b;
                m0 m0Var = e2Var.f42428b;
                byte[] bArr = null;
                if (tL_error == null && tonconnectpending != null) {
                    ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        j3 = this.f42935c;
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
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.f27218id == j3 && tonconnectrequest.expires > e2Var.f42431f.getCurrentTime()) {
                        final String t6 = m0Var.t();
                        if (m0Var.y() != null) {
                            bArr = (byte[]) m0Var.y().clone();
                        }
                        final byte[] bArr2 = bArr;
                        m0Var.z(new v10() {
                            @Override
                            public final void a(Object obj3, Object obj4) {
                                e2 e2Var2 = e2.this;
                                l60 l60Var2 = l60Var;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = t6;
                                byte[] bArr3 = bArr2;
                                long j10 = j3;
                                int i11 = i7;
                                j0 j0Var = (j0) obj3;
                                String str2 = (String) obj4;
                                e2Var2.getClass();
                                if (j0Var != null && str2 == null) {
                                    j0 b10 = j0Var.b();
                                    Utilities.f21336e.c(new hi.a1(e2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr3, new u1(0, b10, l60Var2), j10, i11));
                                    return;
                                }
                                e2Var2.h = false;
                                if (str2 == null) {
                                    str2 = "Recovery phrase is unavailable";
                                }
                                l60Var2.a(null, str2);
                            }
                        }, true, false);
                        return;
                    }
                    e2Var.h = false;
                    l60Var.a(null, "This request has expired or has already been answered");
                    return;
                }
                e2Var.h = false;
                l60Var.a(null, e2.z(tL_error, "getPending"));
                return;
            default:
                c20 c20Var = (c20) this.f42936e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e2 e2Var2 = this.f42934b;
                e2Var2.getClass();
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    e2Var2.e(this.d, this.f42935c, c20Var);
                    return;
                } else {
                    c20Var.a(e2.z(tL_error2, "closeSession"));
                    return;
                }
        }
    }
}
