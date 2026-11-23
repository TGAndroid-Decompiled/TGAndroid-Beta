package org.telegram.ui.Wallet;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.p51;
public final class c0 implements r10 {
    public final int f43991a;
    public final boolean f43992b;
    public final Object f43993c;
    public final Object d;
    public final Object f43994e;

    public c0(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f43991a = i7;
        this.f43993c = obj;
        this.d = obj2;
        this.f43994e = obj3;
        this.f43992b = z10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        switch (this.f43991a) {
            case 0:
                u0 u0Var = (u0) this.f43993c;
                r0 r0Var = (r0) this.d;
                r10 r10Var = (r10) this.f43994e;
                boolean z10 = this.f43992b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge == null) {
                    r0Var.close();
                    if (tL_error == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = tL_error.text;
                    }
                    r10Var.a(null, str);
                    return;
                }
                int currentTime = ConnectionsManager.getInstance(u0Var.f45093a).getCurrentTime();
                StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                i5.c.z(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                sb2.append(proofchallenge.expires - currentTime);
                sb2.append("s");
                u0.P(sb2.toString());
                Utilities.d.c(new oi.o2(u0Var, z10, r0Var, proofchallenge, currentTime, r10Var));
                return;
            default:
                l2 l2Var = (l2) this.f43993c;
                o oVar = (o) this.d;
                h2 h2Var = (h2) this.f43994e;
                boolean z11 = this.f43992b;
                r0 r0Var2 = (r0) obj;
                String str2 = (String) obj2;
                if (r0Var2 != null && str2 == null) {
                    r0 b10 = r0Var2.b();
                    p51 p51Var = new p51(9, b10, oVar);
                    String str3 = h2Var.f44302e;
                    TL_wallet.tonConnectSession tonconnectsession = h2Var.f44299a;
                    if ("sendTransaction".equals(str3)) {
                        SharedPreferences sharedPreferences = np.u1(l2Var.f44489a).h7;
                        if (sharedPreferences.contains(l2.l(tonconnectsession.f28660id, h2Var.f44300b) + ".transfer")) {
                            l2Var.B(h2Var, b10, p51Var);
                            return;
                        }
                    }
                    di.x2 x2Var = new di.x2(l2Var, h2Var, p51Var, z11, b10);
                    if (tonconnectsession.closed) {
                        x2Var.a(null);
                        return;
                    }
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f28660id;
                    tonconnectregisterkey.client_id = tonconnectsession.client_id;
                    l2Var.f44493f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new s(p51Var, b10, h2Var, x2Var, 6));
                    return;
                }
                if (str2 == null) {
                    str2 = "Recovery phrase is unavailable";
                }
                oVar.a(str2);
                return;
        }
    }
}
