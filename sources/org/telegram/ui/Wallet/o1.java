package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.k20;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.d70;
import org.telegram.ui.i70;
public final class o1 implements k20 {
    public final int f34971a;
    public final e2 f34972b;
    public final long f34973c;
    public final int d;
    public final Object e;

    public o1(e2 e2Var, Object obj, long j10, int i10, int i11) {
        this.f34971a = i11;
        this.f34972b = e2Var;
        this.e = obj;
        this.f34973c = j10;
        this.d = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        final long j10;
        final int i10;
        final TL_wallet.tonConnectRequest tonconnectrequest;
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.f34971a) {
            case 0:
                final i70 i70Var = (i70) this.e;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final e2 e2Var = this.f34972b;
                k0 k0Var = e2Var.f34451b;
                byte[] bArr = null;
                if (tL_error == null && tonconnectpending != null) {
                    ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        j10 = this.f34973c;
                        i10 = this.d;
                        if (i11 < size) {
                            TL_wallet.tonConnectRequest tonconnectrequest2 = arrayList.get(i11);
                            i11++;
                            TL_wallet.tonConnectRequest tonconnectrequest3 = tonconnectrequest2;
                            if (tonconnectrequest3.session_id == j10 && tonconnectrequest3.msg_id == i10) {
                                tonconnectrequest = tonconnectrequest3;
                            }
                        } else {
                            tonconnectrequest = null;
                        }
                    }
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.f20056id == j10 && tonconnectrequest.expires > e2Var.f34453f.getCurrentTime()) {
                        final String t10 = k0Var.t();
                        if (k0Var.y() != null) {
                            bArr = (byte[]) k0Var.y().clone();
                        }
                        final byte[] bArr2 = bArr;
                        k0Var.z(new k20() {
                            @Override
                            public final void a(Object obj3, Object obj4) {
                                e2 e2Var2 = e2.this;
                                i70 i70Var2 = i70Var;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = t10;
                                byte[] bArr3 = bArr2;
                                long j11 = j10;
                                int i12 = i10;
                                h0 h0Var = (h0) obj3;
                                String str2 = (String) obj4;
                                e2Var2.getClass();
                                if (h0Var != null && str2 == null) {
                                    h0 b10 = h0Var.b();
                                    Utilities.e.c(new d70(e2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr3, new ih.s(24, b10, i70Var2), j11, i12));
                                    return;
                                }
                                e2Var2.h = false;
                                if (str2 == null) {
                                    str2 = "Recovery phrase is unavailable";
                                }
                                i70Var2.a(null, str2);
                            }
                        }, true, false);
                        return;
                    }
                    e2Var.h = false;
                    i70Var.a(null, "This request has expired or has already been answered");
                    return;
                }
                e2Var.h = false;
                i70Var.a(null, e2.z(tL_error, "getPending"));
                return;
            default:
                r20 r20Var = (r20) this.e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e2 e2Var2 = this.f34972b;
                e2Var2.getClass();
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    e2Var2.e(this.d, this.f34973c, r20Var);
                    return;
                } else {
                    r20Var.a(e2.z(tL_error2, "closeSession"));
                    return;
                }
        }
    }
}
