package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.eh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class t1 implements Utilities.Callback2 {
    public final int f34889a;
    public final f2 f34890b;
    public final long f34891c;
    public final int d;
    public final Object e;

    public t1(f2 f2Var, Object obj, long j10, int i10, int i11) {
        this.f34889a = i11;
        this.f34890b = f2Var;
        this.e = obj;
        this.f34891c = j10;
        this.d = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        final long j10;
        final int i10;
        final TL_wallet.tonConnectRequest tonconnectrequest;
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.f34889a) {
            case 0:
                final eh ehVar = (eh) this.e;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final f2 f2Var = this.f34890b;
                m0 m0Var = f2Var.f34192b;
                byte[] bArr = null;
                if (tL_error == null && tonconnectpending != null) {
                    ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        j10 = this.f34891c;
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
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.f20530id == j10 && tonconnectrequest.expires > f2Var.f34194f.getCurrentTime()) {
                        final String s10 = m0Var.s();
                        if (m0Var.x() != null) {
                            bArr = (byte[]) m0Var.x().clone();
                        }
                        final byte[] bArr2 = bArr;
                        m0Var.y(new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj3, Object obj4) {
                                f2 f2Var2 = f2.this;
                                eh ehVar2 = ehVar;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = s10;
                                byte[] bArr3 = bArr2;
                                long j11 = j10;
                                int i12 = i10;
                                j0 j0Var = (j0) obj3;
                                String str2 = (String) obj4;
                                f2Var2.getClass();
                                if (j0Var != null && str2 == null) {
                                    j0 b10 = j0Var.b();
                                    Utilities.globalQueue.postRunnable(new gi.d1(f2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr3, new s1(2, b10, ehVar2), j11, i12));
                                    return;
                                }
                                f2Var2.h = false;
                                if (str2 == null) {
                                    str2 = "Recovery phrase is unavailable";
                                }
                                ehVar2.run(null, str2);
                            }
                        }, true, false);
                        return;
                    }
                    f2Var.h = false;
                    ehVar.run(null, "This request has expired or has already been answered");
                    return;
                }
                f2Var.h = false;
                ehVar.run(null, f2.x(tL_error, "getPending"));
                return;
            default:
                Utilities.Callback callback = (Utilities.Callback) this.e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                f2 f2Var2 = this.f34890b;
                f2Var2.getClass();
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    f2Var2.d(this.f34891c, this.d, callback);
                    return;
                } else {
                    callback.run(f2.x(tL_error2, "closeSession"));
                    return;
                }
        }
    }
}
