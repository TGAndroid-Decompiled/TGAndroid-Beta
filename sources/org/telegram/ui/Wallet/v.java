package org.telegram.ui.Wallet;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.f11;
public final class v implements j20 {
    public final int f35292a;
    public final boolean f35293b;
    public final Object f35294c;
    public final Object d;
    public final Object e;

    public v(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f35292a = i10;
        this.f35294c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f35293b = z10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        switch (this.f35292a) {
            case 0:
                k0 k0Var = (k0) this.f35294c;
                h0 h0Var = (h0) this.d;
                j20 j20Var = (j20) this.e;
                boolean z10 = this.f35293b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge == null) {
                    h0Var.close();
                    if (tL_error == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = tL_error.text;
                    }
                    j20Var.a(null, str);
                    return;
                }
                int currentTime = ConnectionsManager.getInstance(k0Var.f34776a).getCurrentTime();
                StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                i0.a.t(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                sb2.append(proofchallenge.expires - currentTime);
                sb2.append("s");
                k0.H(sb2.toString());
                Utilities.d.c(new bi.y2(k0Var, z10, h0Var, proofchallenge, currentTime, j20Var));
                return;
            default:
                e2 e2Var = (e2) this.f35294c;
                m mVar = (m) this.d;
                a2 a2Var = (a2) this.e;
                boolean z11 = this.f35293b;
                h0 h0Var2 = (h0) obj;
                String str2 = (String) obj2;
                if (h0Var2 != null && str2 == null) {
                    h0 b10 = h0Var2.b();
                    f11 f11Var = new f11(13, b10, mVar);
                    String str3 = a2Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = a2Var.f34162a;
                    if ("sendTransaction".equals(str3)) {
                        SharedPreferences sharedPreferences = vp.r1(e2Var.f34445a).f7;
                        if (sharedPreferences.contains(e2.l(tonconnectsession.f20055id, a2Var.f34163b) + ".transfer")) {
                            e2Var.B(a2Var, b10, f11Var);
                            return;
                        }
                    }
                    u1 u1Var = new u1(e2Var, a2Var, f11Var, z11, b10);
                    if (tonconnectsession.closed) {
                        u1Var.a(null);
                        return;
                    }
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f20055id;
                    tonconnectregisterkey.client_id = tonconnectsession.client_id;
                    e2Var.f34448f.sendRequestTyped(tonconnectregisterkey, new a3.b(1), new q(f11Var, b10, a2Var, u1Var, 6));
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
