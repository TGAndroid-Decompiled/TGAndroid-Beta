package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.mp0;
public final class h1 {
    public final int f44326a;
    public final long f44327b;
    public final i1 f44328c;

    public h1(i1 i1Var, int i7, long j3) {
        this.f44328c = i1Var;
        this.f44326a = i7;
        this.f44327b = j3;
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
        org.telegram.messenger.g0.g3(new mp0(this.f44328c, uVar, this.f44326a, sb2.toString(), 19));
    }

    public final void b(rc.u uVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.f44328c.f44367a);
        sb2.append(" generation=");
        int i7 = this.f44326a;
        sb2.append(i7);
        sb2.append(" receive <- ");
        sb2.append(str);
        org.telegram.messenger.a8.b(sb2.toString());
        try {
            org.telegram.messenger.g0.g3(new mp0(this, uVar, i7, new JSONObject(str), 20));
        } catch (JSONException unused) {
            org.telegram.messenger.g0.g3(new j01(this, uVar, i7, 17));
        }
    }
}
