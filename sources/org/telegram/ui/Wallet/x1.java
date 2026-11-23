package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.m60;
public final class x1 implements p10 {
    public final int f45366a;
    public final m2 f45367b;
    public final long f45368c;
    public final int d;
    public final Object f45369e;

    public x1(m2 m2Var, Object obj, long j3, int i7, int i10) {
        this.f45366a = i10;
        this.f45367b = m2Var;
        this.f45369e = obj;
        this.f45368c = j3;
        this.d = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        final long j3;
        final int i7;
        final TL_wallet.tonConnectRequest tonconnectrequest;
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.f45366a) {
            case 0:
                final m60 m60Var = (m60) this.f45369e;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final m2 m2Var = this.f45367b;
                v0 v0Var = m2Var.f44649b;
                byte[] bArr = null;
                if (tL_error == null && tonconnectpending != null) {
                    ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        j3 = this.f45368c;
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
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.f28754id == j3 && tonconnectrequest.expires > m2Var.f44652f.getCurrentTime()) {
                        final String y10 = v0Var.y();
                        if (v0Var.E() != null) {
                            bArr = (byte[]) v0Var.E().clone();
                        }
                        final byte[] bArr2 = bArr;
                        v0Var.F(true, false, false, new p10() {
                            @Override
                            public final void a(Object obj3, Object obj4) {
                                m2 m2Var2 = m2.this;
                                m60 m60Var2 = m60Var;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = y10;
                                byte[] bArr3 = bArr2;
                                long j10 = j3;
                                int i11 = i7;
                                s0 s0Var = (s0) obj3;
                                String str2 = (String) obj4;
                                m2Var2.getClass();
                                if (s0Var != null && str2 == null) {
                                    s0 b10 = s0Var.b();
                                    Utilities.f22877e.c(new ki.y0(m2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr3, new f0(4, b10, m60Var2), j10, i11));
                                    return;
                                }
                                m2Var2.h = false;
                                if (str2 == null) {
                                    str2 = "Recovery phrase is unavailable";
                                }
                                m60Var2.a(null, str2);
                            }
                        });
                        return;
                    }
                    m2Var.h = false;
                    m60Var.a(null, "This request has expired or has already been answered");
                    return;
                }
                m2Var.h = false;
                m60Var.a(null, m2.z(tL_error, "getPending"));
                return;
            default:
                w10 w10Var = (w10) this.f45369e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                m2 m2Var2 = this.f45367b;
                m2Var2.getClass();
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    m2Var2.e(this.d, this.f45368c, w10Var);
                    return;
                } else {
                    w10Var.a(m2.z(tL_error2, "closeSession"));
                    return;
                }
        }
    }
}
