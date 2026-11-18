package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.kp0;
public final class h1 {
    public final int f44286a;
    public final long f44287b;
    public final i1 f44288c;

    public h1(i1 i1Var, int i7, long j3) {
        this.f44288c = i1Var;
        this.f44286a = i7;
        this.f44287b = j3;
    }

    public final void a(rc.u uVar, rc.x xVar, rc.x xVar2, boolean z10) {
        Integer valueOf;
        StringBuilder sb2 = new StringBuilder("websocket disconnected; closedByServer=");
        sb2.append(z10);
        sb2.append(", serverCloseCode=");
        Object obj = "none";
        if (xVar == null) {
            valueOf = "none";
        } else {
            valueOf = Integer.valueOf(xVar.b());
        }
        sb2.append(valueOf);
        sb2.append(", clientCloseCode=");
        if (xVar2 != null) {
            obj = Integer.valueOf(xVar2.b());
        }
        sb2.append(obj);
        org.telegram.messenger.g0.g3(new kp0(this.f44288c, uVar, this.f44286a, sb2.toString(), 19));
    }

    public final void b(rc.u uVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.f44288c.f44327a);
        sb2.append(" generation=");
        int i7 = this.f44286a;
        sb2.append(i7);
        sb2.append(" receive <- ");
        sb2.append(str);
        org.telegram.messenger.a8.b(sb2.toString());
        try {
            org.telegram.messenger.g0.g3(new kp0(this, uVar, i7, new JSONObject(str), 20));
        } catch (JSONException unused) {
            org.telegram.messenger.g0.g3(new h01(this, uVar, i7, 17));
        }
    }
}
