package org.telegram.ui.Wallet;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class x implements v10 {
    public final int f43317a;
    public final boolean f43318b;
    public final Object f43319c;
    public final Object d;
    public final Object f43320e;

    public x(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.f43317a = i7;
        this.f43319c = obj;
        this.d = obj2;
        this.f43320e = obj3;
        this.f43318b = z9;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        switch (this.f43317a) {
            case 0:
                m0 m0Var = (m0) this.f43319c;
                j0 j0Var = (j0) this.d;
                v10 v10Var = (v10) this.f43320e;
                boolean z9 = this.f43318b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge == null) {
                    j0Var.close();
                    if (tL_error == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = tL_error.text;
                    }
                    v10Var.a(null, str);
                    return;
                }
                int currentTime = ConnectionsManager.getInstance(m0Var.f42762a).getCurrentTime();
                StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                jg.g.x(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                sb2.append(proofchallenge.expires - currentTime);
                sb2.append("s");
                m0.H(sb2.toString());
                Utilities.d.c(new li.p2(m0Var, z9, j0Var, proofchallenge, currentTime, v10Var));
                return;
            default:
                e2 e2Var = (e2) this.f43319c;
                m mVar = (m) this.d;
                a2 a2Var = (a2) this.f43320e;
                boolean z10 = this.f43318b;
                j0 j0Var2 = (j0) obj;
                String str2 = (String) obj2;
                if (j0Var2 != null && str2 == null) {
                    j0 b10 = j0Var2.b();
                    t tVar = new t(7, b10, mVar);
                    String str3 = a2Var.f42096e;
                    TL_wallet.tonConnectSession tonconnectsession = a2Var.f42093a;
                    if ("sendTransaction".equals(str3)) {
                        SharedPreferences sharedPreferences = qp.s1(e2Var.f42427a).f24774e7;
                        if (sharedPreferences.contains(e2.l(tonconnectsession.f27218id, a2Var.f42094b) + ".transfer")) {
                            e2Var.B(a2Var, b10, tVar);
                            return;
                        }
                    }
                    bi.n3 n3Var = new bi.n3(e2Var, a2Var, tVar, z10, b10);
                    if (tonconnectsession.closed) {
                        n3Var.a(null);
                        return;
                    }
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f27218id;
                    tonconnectregisterkey.client_id = tonconnectsession.client_id;
                    e2Var.f42431f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new r(tVar, b10, a2Var, n3Var, 6));
                    return;
                }
                if (str2 == null) {
                    str2 = "Recovery phrase is unavailable";
                }
                mVar.a(str2);
                return;
        }
    }
}
