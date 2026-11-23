package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.m60;
public final class w1 implements r10 {
    public final int f45204a;
    public final l2 f45205b;
    public final long f45206c;
    public final int d;
    public final Object f45207e;

    public w1(l2 l2Var, Object obj, long j3, int i7, int i10) {
        this.f45204a = i10;
        this.f45205b = l2Var;
        this.f45207e = obj;
        this.f45206c = j3;
        this.d = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        final long j3;
        final int i7;
        final TL_wallet.tonConnectRequest tonconnectrequest;
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.f45204a) {
            case 0:
                final m60 m60Var = (m60) this.f45207e;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final l2 l2Var = this.f45205b;
                u0 u0Var = l2Var.f44490b;
                byte[] bArr = null;
                if (tL_error == null && tonconnectpending != null) {
                    ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        j3 = this.f45206c;
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
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.f28660id == j3 && tonconnectrequest.expires > l2Var.f44493f.getCurrentTime()) {
                        final String y10 = u0Var.y();
                        if (u0Var.E() != null) {
                            bArr = (byte[]) u0Var.E().clone();
                        }
                        final byte[] bArr2 = bArr;
                        u0Var.F(true, false, false, new r10() {
                            @Override
                            public final void a(Object obj3, Object obj4) {
                                l2 l2Var2 = l2.this;
                                m60 m60Var2 = m60Var;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = y10;
                                byte[] bArr3 = bArr2;
                                long j10 = j3;
                                int i11 = i7;
                                r0 r0Var = (r0) obj3;
                                String str2 = (String) obj4;
                                l2Var2.getClass();
                                if (r0Var != null && str2 == null) {
                                    r0 b10 = r0Var.b();
                                    Utilities.f22774e.c(new ki.y0(l2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr3, new e0(4, b10, m60Var2), j10, i11));
                                    return;
                                }
                                l2Var2.h = false;
                                if (str2 == null) {
                                    str2 = "Recovery phrase is unavailable";
                                }
                                m60Var2.a(null, str2);
                            }
                        });
                        return;
                    }
                    l2Var.h = false;
                    m60Var.a(null, "This request has expired or has already been answered");
                    return;
                }
                l2Var.h = false;
                m60Var.a(null, l2.z(tL_error, "getPending"));
                return;
            default:
                y10 y10Var = (y10) this.f45207e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                l2 l2Var2 = this.f45205b;
                l2Var2.getClass();
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    l2Var2.e(this.d, this.f45206c, y10Var);
                    return;
                } else {
                    y10Var.a(l2.z(tL_error2, "closeSession"));
                    return;
                }
        }
    }
}
