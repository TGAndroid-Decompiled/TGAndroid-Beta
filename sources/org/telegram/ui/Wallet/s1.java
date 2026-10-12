package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.mh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class s1 implements Utilities.Callback2 {
    public final int f35340a;
    public final f2 f35341b;
    public final long f35342c;
    public final int d;
    public final Object f35343e;

    public s1(f2 f2Var, Object obj, long j3, int i10, int i11) {
        this.f35340a = i11;
        this.f35341b = f2Var;
        this.f35343e = obj;
        this.f35342c = j3;
        this.d = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        final long j3;
        final int i10;
        final TL_wallet.tonConnectRequest tonconnectrequest;
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.f35340a) {
            case 0:
                final mh mhVar = (mh) this.f35343e;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final f2 f2Var = this.f35341b;
                l0 l0Var = f2Var.f34702b;
                byte[] bArr = null;
                if (tL_error == null && tonconnectpending != null) {
                    ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        j3 = this.f35342c;
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
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.f20066id == j3 && tonconnectrequest.expires > f2Var.f34705f.getCurrentTime()) {
                        final String r10 = l0Var.r();
                        if (l0Var.w() != null) {
                            bArr = (byte[]) l0Var.w().clone();
                        }
                        final byte[] bArr2 = bArr;
                        l0Var.x(new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj3, Object obj4) {
                                f2 f2Var2 = f2.this;
                                mh mhVar2 = mhVar;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = r10;
                                byte[] bArr3 = bArr2;
                                long j10 = j3;
                                int i12 = i10;
                                i0 i0Var = (i0) obj3;
                                String str2 = (String) obj4;
                                f2Var2.getClass();
                                if (i0Var != null && str2 == null) {
                                    i0 b10 = i0Var.b();
                                    Utilities.globalQueue.postRunnable(new ei.g1(f2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr3, new ai.m0(27, b10, mhVar2), j10, i12));
                                    return;
                                }
                                f2Var2.h = false;
                                if (str2 == null) {
                                    str2 = "Recovery phrase is unavailable";
                                }
                                mhVar2.run(null, str2);
                            }
                        }, true, false);
                        return;
                    }
                    f2Var.h = false;
                    mhVar.run(null, "This request has expired or has already been answered");
                    return;
                }
                f2Var.h = false;
                mhVar.run(null, f2.x(tL_error, "getPending"));
                return;
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f35343e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                f2 f2Var2 = this.f35341b;
                f2Var2.getClass();
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    f2Var2.d(this.f35342c, this.d, callback);
                    return;
                } else {
                    callback.run(f2.x(tL_error2, "closeSession"));
                    return;
                }
        }
    }
}
