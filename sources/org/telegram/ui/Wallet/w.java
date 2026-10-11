package org.telegram.ui.Wallet;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.et;
public final class w implements Utilities.Callback2 {
    public final int f35678a;
    public final boolean f35679b;
    public final Object f35680c;
    public final Object d;
    public final Object f35681e;

    public w(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f35678a = i10;
        this.f35680c = obj;
        this.d = obj2;
        this.f35681e = obj3;
        this.f35679b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        switch (this.f35678a) {
            case 0:
                l0 l0Var = (l0) this.f35680c;
                i0 i0Var = (i0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f35681e;
                boolean z10 = this.f35679b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge == null) {
                    i0Var.close();
                    if (tL_error == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = tL_error.text;
                    }
                    callback2.run(null, str);
                    return;
                }
                int currentTime = ConnectionsManager.getInstance(l0Var.f35219a).getCurrentTime();
                StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                hg.c.u(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                sb2.append(proofchallenge.expires - currentTime);
                sb2.append("s");
                l0.E(sb2.toString());
                Utilities.stageQueue.postRunnable(new ii.s2(l0Var, z10, i0Var, proofchallenge, currentTime, callback2));
                return;
            default:
                f2 f2Var = (f2) this.f35680c;
                q qVar = (q) this.d;
                b2 b2Var = (b2) this.f35681e;
                boolean z11 = this.f35679b;
                i0 i0Var2 = (i0) obj;
                String str2 = (String) obj2;
                if (i0Var2 != null && str2 == null) {
                    i0 b10 = i0Var2.b();
                    et etVar = new et(26, b10, qVar);
                    String str3 = b2Var.f34713e;
                    TL_wallet.tonConnectSession tonconnectsession = b2Var.f34710a;
                    if ("sendTransaction".equals(str3)) {
                        SharedPreferences mainSettings = MessagesController.getMainSettings(f2Var.f34924a);
                        if (mainSettings.contains(f2.j(tonconnectsession.f20329id, b2Var.f34711b) + ".transfer")) {
                            f2Var.z(b2Var, b10, etVar);
                            return;
                        }
                    }
                    u1 u1Var = new u1(f2Var, b2Var, etVar, z11, b10);
                    if (tonconnectsession.closed) {
                        u1Var.run(null);
                        return;
                    }
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f20329id;
                    tonconnectregisterkey.client_id = tonconnectsession.client_id;
                    f2Var.f34928f.sendRequestTyped(tonconnectregisterkey, new Object(), new p(etVar, b10, b2Var, u1Var, 6));
                    return;
                }
                if (str2 == null) {
                    str2 = "Recovery phrase is unavailable";
                }
                qVar.run(str2);
                return;
        }
    }
}
