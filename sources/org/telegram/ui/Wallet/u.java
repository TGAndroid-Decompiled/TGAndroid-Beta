package org.telegram.ui.Wallet;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.mt;
public final class u implements Utilities.Callback2 {
    public final int f33715a;
    public final boolean f33716b;
    public final Object f33717c;
    public final Object d;
    public final Object e;

    public u(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f33715a = i10;
        this.f33717c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f33716b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        switch (this.f33715a) {
            case 0:
                j0 j0Var = (j0) this.f33717c;
                g0 g0Var = (g0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                boolean z10 = this.f33716b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge == null) {
                    g0Var.close();
                    if (tL_error == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = tL_error.text;
                    }
                    callback2.run(null, str);
                    return;
                }
                int currentTime = ConnectionsManager.getInstance(j0Var.f33319a).getCurrentTime();
                StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                i2.d.u(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                sb2.append(proofchallenge.expires - currentTime);
                sb2.append("s");
                j0.E(sb2.toString());
                Utilities.stageQueue.postRunnable(new ji.r2(j0Var, z10, g0Var, proofchallenge, currentTime, callback2));
                return;
            default:
                d2 d2Var = (d2) this.f33717c;
                o oVar = (o) this.d;
                z1 z1Var = (z1) this.e;
                boolean z11 = this.f33716b;
                g0 g0Var2 = (g0) obj;
                String str2 = (String) obj2;
                if (g0Var2 != null && str2 == null) {
                    g0 b10 = g0Var2.b();
                    mt mtVar = new mt(26, b10, oVar);
                    String str3 = z1Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = z1Var.f33900a;
                    if ("sendTransaction".equals(str3)) {
                        SharedPreferences mainSettings = MessagesController.getMainSettings(d2Var.f33040a);
                        if (mainSettings.contains(d2.j(tonconnectsession.f19475id, z1Var.f33901b) + ".transfer")) {
                            d2Var.z(z1Var, b10, mtVar);
                            return;
                        }
                    }
                    s1 s1Var = new s1(d2Var, z1Var, mtVar, z11, b10);
                    if (tonconnectsession.closed) {
                        s1Var.run(null);
                        return;
                    }
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f19475id;
                    tonconnectregisterkey.client_id = tonconnectsession.client_id;
                    d2Var.f33043f.sendRequestTyped(tonconnectregisterkey, new Object(), new n(mtVar, b10, z1Var, s1Var, 6));
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
