package org.telegram.ui.Wallet;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.x21;
public final class w implements s10 {
    public final int f44611a;
    public final boolean f44612b;
    public final Object f44613c;
    public final Object d;
    public final Object f44614e;

    public w(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f44611a = i7;
        this.f44613c = obj;
        this.d = obj2;
        this.f44614e = obj3;
        this.f44612b = z10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        switch (this.f44611a) {
            case 0:
                l0 l0Var = (l0) this.f44613c;
                i0 i0Var = (i0) this.d;
                s10 s10Var = (s10) this.f44614e;
                boolean z10 = this.f44612b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge == null) {
                    i0Var.close();
                    if (tL_error == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = tL_error.text;
                    }
                    s10Var.a(null, str);
                    return;
                }
                int currentTime = ConnectionsManager.getInstance(l0Var.f44078a).getCurrentTime();
                StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                i5.c.y(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                sb2.append(proofchallenge.expires - currentTime);
                sb2.append("s");
                l0.H(sb2.toString());
                Utilities.d.c(new oi.n2(l0Var, z10, i0Var, proofchallenge, currentTime, s10Var));
                return;
            default:
                d2 d2Var = (d2) this.f44613c;
                m mVar = (m) this.d;
                z1 z1Var = (z1) this.f44614e;
                boolean z11 = this.f44612b;
                i0 i0Var2 = (i0) obj;
                String str2 = (String) obj2;
                if (i0Var2 != null && str2 == null) {
                    i0 b10 = i0Var2.b();
                    x21 x21Var = new x21(12, b10, mVar);
                    String str3 = z1Var.f44779e;
                    TL_wallet.tonConnectSession tonconnectsession = z1Var.f44776a;
                    if ("sendTransaction".equals(str3)) {
                        SharedPreferences sharedPreferences = np.s1(d2Var.f43729a).f25280f7;
                        if (sharedPreferences.contains(d2.l(tonconnectsession.f28313id, z1Var.f44777b) + ".transfer")) {
                            d2Var.B(z1Var, b10, x21Var);
                            return;
                        }
                    }
                    di.t2 t2Var = new di.t2(d2Var, z1Var, x21Var, z11, b10);
                    if (tonconnectsession.closed) {
                        t2Var.a(null);
                        return;
                    }
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f28313id;
                    tonconnectregisterkey.client_id = tonconnectsession.client_id;
                    d2Var.f43733f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new q(x21Var, b10, z1Var, t2Var, 6));
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
