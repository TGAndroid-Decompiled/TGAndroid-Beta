package org.telegram.ui.Wallet;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class w implements Utilities.Callback2 {
    public final int f37402a;
    public final boolean f37403b;
    public final Object f37404c;
    public final Object d;
    public final Object e;

    public w(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f37402a = i10;
        this.f37404c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f37403b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        switch (this.f37402a) {
            case 0:
                l0 l0Var = (l0) this.f37404c;
                i0 i0Var = (i0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                boolean z10 = this.f37403b;
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
                int currentTime = ConnectionsManager.getInstance(l0Var.f36804a).getCurrentTime();
                StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                c3.h0.q(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                sb2.append(proofchallenge.expires - currentTime);
                sb2.append("s");
                l0.F(sb2.toString());
                Utilities.stageQueue.postRunnable(new li.p2(l0Var, z10, i0Var, proofchallenge, currentTime, callback2));
                return;
            default:
                e2 e2Var = (e2) this.f37404c;
                o oVar = (o) this.d;
                a2 a2Var = (a2) this.e;
                boolean z11 = this.f37403b;
                i0 i0Var2 = (i0) obj;
                String str2 = (String) obj2;
                if (i0Var2 != null && str2 == null) {
                    i0 b10 = i0Var2.b();
                    s sVar = new s(5, b10, oVar);
                    String str3 = a2Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = a2Var.f36334a;
                    if ("sendTransaction".equals(str3)) {
                        SharedPreferences mainSettings = MessagesController.getMainSettings(e2Var.f36503a);
                        if (mainSettings.contains(e2.j(tonconnectsession.f22288id, a2Var.f36335b) + ".transfer")) {
                            e2Var.z(a2Var, b10, sVar);
                            return;
                        }
                    }
                    bi.n3 n3Var = new bi.n3(e2Var, a2Var, sVar, z11, b10);
                    if (tonconnectsession.closed) {
                        n3Var.run(null);
                        return;
                    }
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f22288id;
                    tonconnectregisterkey.client_id = tonconnectsession.client_id;
                    e2Var.f36506f.sendRequestTyped(tonconnectregisterkey, new Object(), new p(sVar, b10, a2Var, n3Var, 6));
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
