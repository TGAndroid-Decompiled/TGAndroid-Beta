package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.f60;
public final class m1 implements n10 {
    public final int f42816a;
    public final c2 f42817b;
    public final long f42818c;
    public final int d;
    public final Object f42819e;

    public m1(c2 c2Var, Object obj, long j10, int i3, int i10) {
        this.f42816a = i10;
        this.f42817b = c2Var;
        this.f42819e = obj;
        this.f42818c = j10;
        this.d = i3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        final long j10;
        final int i3;
        final TL_wallet.tonConnectRequest tonconnectrequest;
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.f42816a) {
            case 0:
                final f60 f60Var = (f60) this.f42819e;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final c2 c2Var = this.f42817b;
                k0 k0Var = c2Var.f42378b;
                byte[] bArr = null;
                if (tL_error == null && tonconnectpending != null) {
                    ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        j10 = this.f42818c;
                        i3 = this.d;
                        if (i10 < size) {
                            TL_wallet.tonConnectRequest tonconnectrequest2 = arrayList.get(i10);
                            i10++;
                            TL_wallet.tonConnectRequest tonconnectrequest3 = tonconnectrequest2;
                            if (tonconnectrequest3.session_id == j10 && tonconnectrequest3.msg_id == i3) {
                                tonconnectrequest = tonconnectrequest3;
                            }
                        } else {
                            tonconnectrequest = null;
                        }
                    }
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.f27264id == j10 && tonconnectrequest.expires > c2Var.f42381f.getCurrentTime()) {
                        final String t10 = k0Var.t();
                        if (k0Var.y() != null) {
                            bArr = (byte[]) k0Var.y().clone();
                        }
                        final byte[] bArr2 = bArr;
                        k0Var.z(new n10() {
                            @Override
                            public final void a(Object obj3, Object obj4) {
                                c2 c2Var2 = c2.this;
                                f60 f60Var2 = f60Var;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = t10;
                                byte[] bArr3 = bArr2;
                                long j11 = j10;
                                int i11 = i3;
                                h0 h0Var = (h0) obj3;
                                String str2 = (String) obj4;
                                c2Var2.getClass();
                                if (h0Var != null && str2 == null) {
                                    h0 b10 = h0Var.b();
                                    Utilities.f21387e.c(new ii.b1(c2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr3, new s1(1, b10, f60Var2), j11, i11));
                                    return;
                                }
                                c2Var2.h = false;
                                if (str2 == null) {
                                    str2 = "Recovery phrase is unavailable";
                                }
                                f60Var2.a(null, str2);
                            }
                        }, true, false);
                        return;
                    }
                    c2Var.h = false;
                    f60Var.a(null, "This request has expired or has already been answered");
                    return;
                }
                c2Var.h = false;
                f60Var.a(null, c2.z(tL_error, "getPending"));
                return;
            default:
                u10 u10Var = (u10) this.f42819e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                c2 c2Var2 = this.f42817b;
                c2Var2.getClass();
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    c2Var2.e(this.d, this.f42818c, u10Var);
                    return;
                } else {
                    u10Var.a(c2.z(tL_error2, "closeSession"));
                    return;
                }
        }
    }
}
