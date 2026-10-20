package org.telegram.ui.Wallet;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class w implements Utilities.Callback2 {
    public final int f35047a;
    public final boolean f35048b;
    public final Object f35049c;
    public final Object d;
    public final Object e;

    public w(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f35047a = i10;
        this.f35049c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f35048b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        switch (this.f35047a) {
            case 0:
                m0 m0Var = (m0) this.f35049c;
                j0 j0Var = (j0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                boolean z10 = this.f35048b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge == null) {
                    j0Var.close();
                    if (tL_error == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = tL_error.text;
                    }
                    callback2.run(null, str);
                    return;
                }
                int currentTime = ConnectionsManager.getInstance(m0Var.f34476a).getCurrentTime();
                StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                i2.e.w(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                sb2.append(proofchallenge.expires - currentTime);
                sb2.append("s");
                m0.F(sb2.toString());
                Utilities.stageQueue.postRunnable(new ki.r2(m0Var, z10, j0Var, proofchallenge, currentTime, callback2));
                return;
            default:
                f2 f2Var = (f2) this.f35049c;
                p pVar = (p) this.d;
                b2 b2Var = (b2) this.e;
                boolean z11 = this.f35048b;
                j0 j0Var2 = (j0) obj;
                String str2 = (String) obj2;
                if (j0Var2 != null && str2 == null) {
                    j0 b10 = j0Var2.b();
                    x xVar = new x(3, b10, pVar);
                    String str3 = b2Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = b2Var.f34015a;
                    if ("sendTransaction".equals(str3)) {
                        SharedPreferences mainSettings = MessagesController.getMainSettings(f2Var.f34194a);
                        if (mainSettings.contains(f2.j(tonconnectsession.f20534id, b2Var.f34016b) + ".transfer")) {
                            f2Var.z(b2Var, b10, xVar);
                            return;
                        }
                    }
                    ai.r3 r3Var = new ai.r3(f2Var, b2Var, xVar, z11, b10);
                    if (tonconnectsession.closed) {
                        r3Var.run(null);
                        return;
                    }
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f20534id;
                    tonconnectregisterkey.client_id = tonconnectsession.client_id;
                    f2Var.f34197f.sendRequestTyped(tonconnectregisterkey, new Object(), new q(xVar, b10, b2Var, r3Var, 6));
                    return;
                }
                if (str2 == null) {
                    str2 = "Recovery phrase is unavailable";
                }
                pVar.run(str2);
                return;
        }
    }
}
