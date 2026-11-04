package org.telegram.ui.Wallet;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.e51;
public final class v implements n10 {
    public final int f43275a;
    public final boolean f43276b;
    public final Object f43277c;
    public final Object d;
    public final Object f43278e;

    public v(Object obj, Object obj2, Object obj3, boolean z10, int i3) {
        this.f43275a = i3;
        this.f43277c = obj;
        this.d = obj2;
        this.f43278e = obj3;
        this.f43276b = z10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        switch (this.f43275a) {
            case 0:
                k0 k0Var = (k0) this.f43277c;
                h0 h0Var = (h0) this.d;
                n10 n10Var = (n10) this.f43278e;
                boolean z10 = this.f43276b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge == null) {
                    h0Var.close();
                    if (tL_error == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = tL_error.text;
                    }
                    n10Var.a(null, str);
                    return;
                }
                int currentTime = ConnectionsManager.getInstance(k0Var.f42718a).getCurrentTime();
                StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                com.google.android.recaptcha.internal.a.r(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                sb2.append(proofchallenge.expires - currentTime);
                sb2.append("s");
                k0.H(sb2.toString());
                Utilities.d.c(new mi.q2(k0Var, z10, h0Var, proofchallenge, currentTime, n10Var));
                return;
            default:
                c2 c2Var = (c2) this.f43277c;
                m mVar = (m) this.d;
                y1 y1Var = (y1) this.f43278e;
                boolean z11 = this.f43276b;
                h0 h0Var2 = (h0) obj;
                String str2 = (String) obj2;
                if (h0Var2 != null && str2 == null) {
                    h0 b10 = h0Var2.b();
                    e51 e51Var = new e51(10, b10, mVar);
                    String str3 = y1Var.f43459e;
                    TL_wallet.tonConnectSession tonconnectsession = y1Var.f43456a;
                    if ("sendTransaction".equals(str3)) {
                        SharedPreferences sharedPreferences = hp.s1(c2Var.f42377a).f22999e7;
                        if (sharedPreferences.contains(c2.l(tonconnectsession.f27264id, y1Var.f43457b) + ".transfer")) {
                            c2Var.B(y1Var, b10, e51Var);
                            return;
                        }
                    }
                    ci.a3 a3Var = new ci.a3(c2Var, y1Var, e51Var, z11, b10);
                    if (tonconnectsession.closed) {
                        a3Var.a(null);
                        return;
                    }
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f27264id;
                    tonconnectregisterkey.client_id = tonconnectsession.client_id;
                    c2Var.f42381f.sendRequestTyped(tonconnectregisterkey, new c3.b(1), new q(e51Var, b10, y1Var, a3Var, 6));
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
