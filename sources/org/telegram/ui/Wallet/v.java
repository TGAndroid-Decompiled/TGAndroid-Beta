package org.telegram.ui.Wallet;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ft;
public final class v implements Utilities.Callback2 {
    public final int f35548a;
    public final boolean f35549b;
    public final Object f35550c;
    public final Object d;
    public final Object f35551e;

    public v(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f35548a = i10;
        this.f35550c = obj;
        this.d = obj2;
        this.f35551e = obj3;
        this.f35549b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        switch (this.f35548a) {
            case 0:
                k0 k0Var = (k0) this.f35550c;
                h0 h0Var = (h0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f35551e;
                boolean z10 = this.f35549b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge == null) {
                    h0Var.close();
                    if (tL_error == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = tL_error.text;
                    }
                    callback2.run(null, str);
                    return;
                }
                int currentTime = ConnectionsManager.getInstance(k0Var.f35117a).getCurrentTime();
                StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                hg.c.u(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                sb2.append(proofchallenge.expires - currentTime);
                sb2.append("s");
                k0.E(sb2.toString());
                Utilities.stageQueue.postRunnable(new ii.s2(k0Var, z10, h0Var, proofchallenge, currentTime, callback2));
                return;
            default:
                d2 d2Var = (d2) this.f35550c;
                o oVar = (o) this.d;
                z1 z1Var = (z1) this.f35551e;
                boolean z11 = this.f35549b;
                h0 h0Var2 = (h0) obj;
                String str2 = (String) obj2;
                if (h0Var2 != null && str2 == null) {
                    h0 b10 = h0Var2.b();
                    ft ftVar = new ft(26, b10, oVar);
                    String str3 = z1Var.f35723e;
                    TL_wallet.tonConnectSession tonconnectsession = z1Var.f35720a;
                    if ("sendTransaction".equals(str3)) {
                        SharedPreferences mainSettings = MessagesController.getMainSettings(d2Var.f34767a);
                        if (mainSettings.contains(d2.j(tonconnectsession.f20299id, z1Var.f35721b) + ".transfer")) {
                            d2Var.z(z1Var, b10, ftVar);
                            return;
                        }
                    }
                    s1 s1Var = new s1(d2Var, z1Var, ftVar, z11, b10);
                    if (tonconnectsession.closed) {
                        s1Var.run(null);
                        return;
                    }
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f20299id;
                    tonconnectregisterkey.client_id = tonconnectsession.client_id;
                    d2Var.f34771f.sendRequestTyped(tonconnectregisterkey, new Object(), new n(ftVar, b10, z1Var, s1Var, 6));
                    return;
                }
                if (str2 == null) {
                    str2 = "Recovery phrase is unavailable";
                }
                oVar.run(str2);
                return;
        }
    }
}
