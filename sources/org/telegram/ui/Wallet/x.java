package org.telegram.ui.Wallet;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class x implements v10 {
    public final int f43288a;
    public final boolean f43289b;
    public final Object f43290c;
    public final Object d;
    public final Object f43291e;

    public x(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.f43288a = i7;
        this.f43290c = obj;
        this.d = obj2;
        this.f43291e = obj3;
        this.f43289b = z9;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        switch (this.f43288a) {
            case 0:
                n0 n0Var = (n0) this.f43290c;
                k0 k0Var = (k0) this.d;
                v10 v10Var = (v10) this.f43291e;
                boolean z9 = this.f43289b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge == null) {
                    k0Var.close();
                    if (tL_error == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = tL_error.text;
                    }
                    v10Var.a(null, str);
                    return;
                }
                int currentTime = ConnectionsManager.getInstance(n0Var.f42768a).getCurrentTime();
                StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                jg.g.x(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                sb2.append(proofchallenge.expires - currentTime);
                sb2.append("s");
                n0.H(sb2.toString());
                Utilities.d.c(new li.p2(n0Var, z9, k0Var, proofchallenge, currentTime, v10Var));
                return;
            default:
                f2 f2Var = (f2) this.f43290c;
                m mVar = (m) this.d;
                b2 b2Var = (b2) this.f43291e;
                boolean z10 = this.f43289b;
                k0 k0Var2 = (k0) obj;
                String str2 = (String) obj2;
                if (k0Var2 != null && str2 == null) {
                    k0 b10 = k0Var2.b();
                    t tVar = new t(7, b10, mVar);
                    String str3 = b2Var.f42100e;
                    TL_wallet.tonConnectSession tonconnectsession = b2Var.f42097a;
                    if ("sendTransaction".equals(str3)) {
                        SharedPreferences sharedPreferences = qp.s1(f2Var.f42435a).f24759e7;
                        if (sharedPreferences.contains(f2.l(tonconnectsession.f27214id, b2Var.f42098b) + ".transfer")) {
                            f2Var.B(b2Var, b10, tVar);
                            return;
                        }
                    }
                    bi.n3 n3Var = new bi.n3(f2Var, b2Var, tVar, z10, b10);
                    if (tonconnectsession.closed) {
                        n3Var.a(null);
                        return;
                    }
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f27214id;
                    tonconnectregisterkey.client_id = tonconnectsession.client_id;
                    f2Var.f42439f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new r(tVar, b10, b2Var, n3Var, 6));
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
