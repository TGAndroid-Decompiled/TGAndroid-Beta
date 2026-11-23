package org.telegram.ui.Wallet;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.a31;
public final class d0 implements p10 {
    public final int f44152a;
    public final boolean f44153b;
    public final Object f44154c;
    public final Object d;
    public final Object f44155e;

    public d0(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f44152a = i7;
        this.f44154c = obj;
        this.d = obj2;
        this.f44155e = obj3;
        this.f44153b = z10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        switch (this.f44152a) {
            case 0:
                v0 v0Var = (v0) this.f44154c;
                s0 s0Var = (s0) this.d;
                p10 p10Var = (p10) this.f44155e;
                boolean z10 = this.f44153b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge == null) {
                    s0Var.close();
                    if (tL_error == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = tL_error.text;
                    }
                    p10Var.a(null, str);
                    return;
                }
                int currentTime = ConnectionsManager.getInstance(v0Var.f45255a).getCurrentTime();
                StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                i5.c.z(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                sb2.append(proofchallenge.expires - currentTime);
                sb2.append("s");
                v0.P(sb2.toString());
                Utilities.d.c(new oi.q2(v0Var, z10, s0Var, proofchallenge, currentTime, p10Var));
                return;
            default:
                m2 m2Var = (m2) this.f44154c;
                o oVar = (o) this.d;
                i2 i2Var = (i2) this.f44155e;
                boolean z11 = this.f44153b;
                s0 s0Var2 = (s0) obj;
                String str2 = (String) obj2;
                if (s0Var2 != null && str2 == null) {
                    s0 b10 = s0Var2.b();
                    a31 a31Var = new a31(10, b10, oVar);
                    String str3 = i2Var.f44464e;
                    TL_wallet.tonConnectSession tonconnectsession = i2Var.f44461a;
                    if ("sendTransaction".equals(str3)) {
                        SharedPreferences sharedPreferences = mp.u1(m2Var.f44648a).h7;
                        if (sharedPreferences.contains(m2.l(tonconnectsession.f28754id, i2Var.f44462b) + ".transfer")) {
                            m2Var.B(i2Var, b10, a31Var);
                            return;
                        }
                    }
                    di.x2 x2Var = new di.x2(m2Var, i2Var, a31Var, z11, b10);
                    if (tonconnectsession.closed) {
                        x2Var.a(null);
                        return;
                    }
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f28754id;
                    tonconnectregisterkey.client_id = tonconnectsession.client_id;
                    m2Var.f44652f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new t(a31Var, b10, i2Var, x2Var, 6));
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
