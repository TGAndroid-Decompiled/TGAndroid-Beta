package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class r1 implements Utilities.Callback2 {
    public final int f35498a;
    public final e2 f35499b;
    public final long f35500c;
    public final int d;
    public final Object f35501e;

    public r1(e2 e2Var, Object obj, long j3, int i10, int i11) {
        this.f35498a = i11;
        this.f35499b = e2Var;
        this.f35501e = obj;
        this.f35500c = j3;
        this.d = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        final long j3;
        final int i10;
        final TL_wallet.tonConnectRequest tonconnectrequest;
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.f35498a) {
            case 0:
                final jh jhVar = (jh) this.f35501e;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final e2 e2Var = this.f35499b;
                k0 k0Var = e2Var.f34859b;
                byte[] bArr = null;
                if (tL_error == null && tonconnectpending != null) {
                    ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        j3 = this.f35500c;
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
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.f20303id == j3 && tonconnectrequest.expires > e2Var.f34862f.getCurrentTime()) {
                        final String r10 = k0Var.r();
                        if (k0Var.w() != null) {
                            bArr = (byte[]) k0Var.w().clone();
                        }
                        final byte[] bArr2 = bArr;
                        k0Var.x(new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj3, Object obj4) {
                                e2 e2Var2 = e2.this;
                                jh jhVar2 = jhVar;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = r10;
                                byte[] bArr3 = bArr2;
                                long j10 = j3;
                                int i12 = i10;
                                h0 h0Var = (h0) obj3;
                                String str2 = (String) obj4;
                                e2Var2.getClass();
                                if (h0Var != null && str2 == null) {
                                    h0 b10 = h0Var.b();
                                    Utilities.globalQueue.postRunnable(new ei.g1(e2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr3, new ai.m0(27, b10, jhVar2), j10, i12));
                                    return;
                                }
                                e2Var2.h = false;
                                if (str2 == null) {
                                    str2 = "Recovery phrase is unavailable";
                                }
                                jhVar2.run(null, str2);
                            }
                        }, true, false);
                        return;
                    }
                    e2Var.h = false;
                    jhVar.run(null, "This request has expired or has already been answered");
                    return;
                }
                e2Var.h = false;
                jhVar.run(null, e2.x(tL_error, "getPending"));
                return;
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f35501e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e2 e2Var2 = this.f35499b;
                e2Var2.getClass();
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    e2Var2.d(this.f35500c, this.d, callback);
                    return;
                } else {
                    callback.run(e2.x(tL_error2, "closeSession"));
                    return;
                }
        }
    }
}
