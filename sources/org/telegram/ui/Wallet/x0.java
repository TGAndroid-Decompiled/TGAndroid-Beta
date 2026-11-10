package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.h10;
public final class x0 {
    public final int f43315a;
    public final long f43316b;
    public final y0 f43317c;

    public x0(y0 y0Var, int i7, long j3) {
        this.f43317c = y0Var;
        this.f43315a = i7;
        this.f43316b = j3;
    }

    public final void a(rc.u uVar, rc.x xVar, rc.x xVar2, boolean z9) {
        Integer valueOf;
        StringBuilder sb2 = new StringBuilder("websocket disconnected; closedByServer=");
        sb2.append(z9);
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
        org.telegram.messenger.g0.h3(new pp0(this.f43317c, uVar, this.f43315a, sb2.toString(), 18));
    }

    public final void b(rc.u uVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.f43317c.f43360a);
        sb2.append(" generation=");
        int i7 = this.f43315a;
        sb2.append(i7);
        sb2.append(" receive <- ");
        sb2.append(str);
        org.telegram.messenger.a8.b(sb2.toString());
        try {
            org.telegram.messenger.g0.h3(new pp0(this, uVar, i7, new JSONObject(str), 19));
        } catch (JSONException unused) {
            org.telegram.messenger.g0.h3(new h10(this, uVar, i7, 13));
        }
    }
}
