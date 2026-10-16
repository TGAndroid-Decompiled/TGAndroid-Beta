package org.telegram.ui.Wallet;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.mt;
public final class v implements Utilities.Callback2 {
    public final int f33487a;
    public final boolean f33488b;
    public final Object f33489c;
    public final Object d;
    public final Object e;

    public v(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f33487a = i10;
        this.f33489c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f33488b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        switch (this.f33487a) {
            case 0:
                k0 k0Var = (k0) this.f33489c;
                h0 h0Var = (h0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                boolean z10 = this.f33488b;
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
                int currentTime = ConnectionsManager.getInstance(k0Var.f33092a).getCurrentTime();
                StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                i2.d.w(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                sb2.append(proofchallenge.expires - currentTime);
                sb2.append("s");
                k0.E(sb2.toString());
                Utilities.stageQueue.postRunnable(new ji.r2(k0Var, z10, h0Var, proofchallenge, currentTime, callback2));
                return;
            default:
                e2 e2Var = (e2) this.f33489c;
                p pVar = (p) this.d;
                a2 a2Var = (a2) this.e;
                boolean z11 = this.f33488b;
                h0 h0Var2 = (h0) obj;
                String str2 = (String) obj2;
                if (h0Var2 != null && str2 == null) {
                    h0 b10 = h0Var2.b();
                    mt mtVar = new mt(26, b10, pVar);
                    String str3 = a2Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = a2Var.f32617a;
                    if ("sendTransaction".equals(str3)) {
                        SharedPreferences mainSettings = MessagesController.getMainSettings(e2Var.f32817a);
                        if (mainSettings.contains(e2.j(tonconnectsession.f19175id, a2Var.f32618b) + ".transfer")) {
                            e2Var.z(a2Var, b10, mtVar);
                            return;
                        }
                    }
                    t1 t1Var = new t1(e2Var, a2Var, mtVar, z11, b10);
                    if (tonconnectsession.closed) {
                        t1Var.run(null);
                        return;
                    }
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f19175id;
                    tonconnectregisterkey.client_id = tonconnectsession.client_id;
                    e2Var.f32820f.sendRequestTyped(tonconnectregisterkey, new Object(), new o(mtVar, b10, a2Var, t1Var, 6));
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
