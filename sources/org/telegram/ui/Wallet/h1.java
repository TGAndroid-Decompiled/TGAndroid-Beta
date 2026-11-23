package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.lp0;
public final class h1 {
    public final int f44330a;
    public final long f44331b;
    public final i1 f44332c;

    public h1(i1 i1Var, int i7, long j3) {
        this.f44332c = i1Var;
        this.f44330a = i7;
        this.f44331b = j3;
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
        org.telegram.messenger.g0.g3(new lp0(this.f44332c, uVar, this.f44330a, sb2.toString(), 20));
    }

    public final void b(rc.u uVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.f44332c.f44371a);
        sb2.append(" generation=");
        int i7 = this.f44330a;
        sb2.append(i7);
        sb2.append(" receive <- ");
        sb2.append(str);
        org.telegram.messenger.a8.b(sb2.toString());
        try {
            org.telegram.messenger.g0.g3(new lp0(this, uVar, i7, new JSONObject(str), 21));
        } catch (JSONException unused) {
            org.telegram.messenger.g0.g3(new f21(this, uVar, i7, 16));
        }
    }
}
