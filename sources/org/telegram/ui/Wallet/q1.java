package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class q1 implements Utilities.Callback2 {
    public final int f35408a;
    public final d2 f35409b;
    public final long f35410c;
    public final int d;
    public final Object f35411e;

    public q1(d2 d2Var, Object obj, long j3, int i10, int i11) {
        this.f35408a = i11;
        this.f35409b = d2Var;
        this.f35411e = obj;
        this.f35410c = j3;
        this.d = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        final long j3;
        final int i10;
        final TL_wallet.tonConnectRequest tonconnectrequest;
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.f35408a) {
            case 0:
                final jh jhVar = (jh) this.f35411e;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final d2 d2Var = this.f35409b;
                k0 k0Var = d2Var.f34768b;
                byte[] bArr = null;
                if (tL_error == null && tonconnectpending != null) {
                    ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        j3 = this.f35410c;
                        i10 = this.d;
                        if (i11 < size) {
                            TL_wallet.tonConnectRequest tonconnectrequest2 = arrayList.get(i11);
                            i11++;
                            TL_wallet.tonConnectRequest tonconnectrequest3 = tonconnectrequest2;
                            if (tonconnectrequest3.session_id == j3 && tonconnectrequest3.msg_id == i10) {
                                tonconnectrequest = tonconnectrequest3;
                            }
                        } else {
                            tonconnectrequest = null;
                        }
                    }
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.f20299id == j3 && tonconnectrequest.expires > d2Var.f34771f.getCurrentTime()) {
                        final String r10 = k0Var.r();
                        if (k0Var.w() != null) {
                            bArr = (byte[]) k0Var.w().clone();
                        }
                        final byte[] bArr2 = bArr;
                        k0Var.x(new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj3, Object obj4) {
                                d2 d2Var2 = d2.this;
                                jh jhVar2 = jhVar;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = r10;
                                byte[] bArr3 = bArr2;
                                long j10 = j3;
                                int i12 = i10;
                                h0 h0Var = (h0) obj3;
                                String str2 = (String) obj4;
                                d2Var2.getClass();
                                if (h0Var != null && str2 == null) {
                                    h0 b10 = h0Var.b();
                                    Utilities.globalQueue.postRunnable(new ei.g1(d2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr3, new ai.m0(27, b10, jhVar2), j10, i12));
                                    return;
                                }
                                d2Var2.h = false;
                                if (str2 == null) {
                                    str2 = "Recovery phrase is unavailable";
                                }
                                jhVar2.run(null, str2);
                            }
                        }, true, false);
                        return;
                    }
                    d2Var.h = false;
                    jhVar.run(null, "This request has expired or has already been answered");
                    return;
                }
                d2Var.h = false;
                jhVar.run(null, d2.x(tL_error, "getPending"));
                return;
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f35411e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d2 d2Var2 = this.f35409b;
                d2Var2.getClass();
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    d2Var2.d(this.f35410c, this.d, callback);
                    return;
                } else {
                    callback.run(d2.x(tL_error2, "closeSession"));
                    return;
                }
        }
    }
}
