package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Components.d11;
public final class y0 {
    public final int f35407a;
    public final long f35408b;
    public final z0 f35409c;

    public y0(z0 z0Var, int i10, long j10) {
        this.f35409c = z0Var;
        this.f35407a = i10;
        this.f35408b = j10;
    }

    public final void a(lc.v vVar, lc.y yVar, lc.y yVar2, boolean z10) {
        Integer valueOf;
        StringBuilder sb2 = new StringBuilder("websocket disconnected; closedByServer=");
        sb2.append(z10);
        sb2.append(", serverCloseCode=");
        Object obj = "none";
        if (yVar == null) {
            valueOf = "none";
        } else {
            valueOf = Integer.valueOf(yVar.b());
        }
        sb2.append(valueOf);
        sb2.append(", clientCloseCode=");
        if (yVar2 != null) {
            obj = Integer.valueOf(yVar2.b());
        }
        sb2.append(obj);
        org.telegram.messenger.i0.g3(new d11(this.f35409c, vVar, this.f35407a, sb2.toString(), 13));
    }

    public final void b(lc.v vVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.f35409c.f35438a);
        sb2.append(" generation=");
        int i10 = this.f35407a;
        sb2.append(i10);
        sb2.append(" receive <- ");
        sb2.append(str);
        org.telegram.messenger.f8.b(sb2.toString());
        try {
            org.telegram.messenger.i0.g3(new d11(this, vVar, i10, new JSONObject(str), 14));
        } catch (JSONException unused) {
            org.telegram.messenger.i0.g3(new x0(this, vVar, i10, 0));
        }
    }
}
