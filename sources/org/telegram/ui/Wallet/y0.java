package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Components.c11;
public final class y0 {
    public final int f35401a;
    public final long f35402b;
    public final z0 f35403c;

    public y0(z0 z0Var, int i10, long j10) {
        this.f35403c = z0Var;
        this.f35401a = i10;
        this.f35402b = j10;
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
        org.telegram.messenger.i0.g3(new c11(this.f35403c, vVar, this.f35401a, sb2.toString(), 13));
    }

    public final void b(lc.v vVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.f35403c.f35435a);
        sb2.append(" generation=");
        int i10 = this.f35401a;
        sb2.append(i10);
        sb2.append(" receive <- ");
        sb2.append(str);
        org.telegram.messenger.f8.b(sb2.toString());
        try {
            org.telegram.messenger.i0.g3(new c11(this, vVar, i10, new JSONObject(str), 14));
        } catch (JSONException unused) {
            org.telegram.messenger.i0.g3(new x0(this, vVar, i10, 0));
        }
    }
}
