package org.telegram.ui.Wallet;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.k20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.d01;
public final class v implements k20 {
    public final int f35298a;
    public final boolean f35299b;
    public final Object f35300c;
    public final Object d;
    public final Object e;

    public v(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f35298a = i10;
        this.f35300c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f35299b = z10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        switch (this.f35298a) {
            case 0:
                k0 k0Var = (k0) this.f35300c;
                h0 h0Var = (h0) this.d;
                k20 k20Var = (k20) this.e;
                boolean z10 = this.f35299b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge == null) {
                    h0Var.close();
                    if (tL_error == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = tL_error.text;
                    }
                    k20Var.a(null, str);
                    return;
                }
                int currentTime = ConnectionsManager.getInstance(k0Var.f34781a).getCurrentTime();
                StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                i0.a.t(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                sb2.append(proofchallenge.expires - currentTime);
                sb2.append("s");
                k0.H(sb2.toString());
                Utilities.d.c(new bi.y2(k0Var, z10, h0Var, proofchallenge, currentTime, k20Var));
                return;
            default:
                e2 e2Var = (e2) this.f35300c;
                m mVar = (m) this.d;
                a2 a2Var = (a2) this.e;
                boolean z11 = this.f35299b;
                h0 h0Var2 = (h0) obj;
                String str2 = (String) obj2;
                if (h0Var2 != null && str2 == null) {
                    h0 b10 = h0Var2.b();
                    d01 d01Var = new d01(14, b10, mVar);
                    String str3 = a2Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = a2Var.f34169a;
                    if ("sendTransaction".equals(str3)) {
                        SharedPreferences sharedPreferences = wp.r1(e2Var.f34450a).f7;
                        if (sharedPreferences.contains(e2.l(tonconnectsession.f20056id, a2Var.f34170b) + ".transfer")) {
                            e2Var.B(a2Var, b10, d01Var);
                            return;
                        }
                    }
                    u1 u1Var = new u1(e2Var, a2Var, d01Var, z11, b10);
                    if (tonconnectsession.closed) {
                        u1Var.a(null);
                        return;
                    }
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f20056id;
                    tonconnectregisterkey.client_id = tonconnectsession.client_id;
                    e2Var.f34453f.sendRequestTyped(tonconnectregisterkey, new a3.b(1), new q(d01Var, b10, a2Var, u1Var, 6));
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
