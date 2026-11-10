package org.telegram.ui.Wallet;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class w implements v10 {
    public final int f43272a;
    public final boolean f43273b;
    public final Object f43274c;
    public final Object d;
    public final Object f43275e;

    public w(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.f43272a = i7;
        this.f43274c = obj;
        this.d = obj2;
        this.f43275e = obj3;
        this.f43273b = z9;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        switch (this.f43272a) {
            case 0:
                l0 l0Var = (l0) this.f43274c;
                i0 i0Var = (i0) this.d;
                v10 v10Var = (v10) this.f43275e;
                boolean z9 = this.f43273b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge == null) {
                    i0Var.close();
                    if (tL_error == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = tL_error.text;
                    }
                    v10Var.a(null, str);
                    return;
                }
                int currentTime = ConnectionsManager.getInstance(l0Var.f42749a).getCurrentTime();
                StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                jg.g.x(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                sb2.append(proofchallenge.expires - currentTime);
                sb2.append("s");
                l0.H(sb2.toString());
                Utilities.d.c(new li.p2(l0Var, z9, i0Var, proofchallenge, currentTime, v10Var));
                return;
            default:
                d2 d2Var = (d2) this.f43274c;
                m mVar = (m) this.d;
                z1 z1Var = (z1) this.f43275e;
                boolean z10 = this.f43273b;
                i0 i0Var2 = (i0) obj;
                String str2 = (String) obj2;
                if (i0Var2 != null && str2 == null) {
                    i0 b10 = i0Var2.b();
                    s sVar = new s(7, b10, mVar);
                    String str3 = z1Var.f43415e;
                    TL_wallet.tonConnectSession tonconnectsession = z1Var.f43412a;
                    if ("sendTransaction".equals(str3)) {
                        SharedPreferences sharedPreferences = qp.s1(d2Var.f42286a).f24778e7;
                        if (sharedPreferences.contains(d2.l(tonconnectsession.f27222id, z1Var.f43413b) + ".transfer")) {
                            d2Var.B(z1Var, b10, sVar);
                            return;
                        }
                    }
                    bi.n3 n3Var = new bi.n3(d2Var, z1Var, sVar, z10, b10);
                    if (tonconnectsession.closed) {
                        n3Var.a(null);
                        return;
                    }
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f27222id;
                    tonconnectregisterkey.client_id = tonconnectsession.client_id;
                    d2Var.f42290f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new q(sVar, b10, z1Var, n3Var, 6));
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
