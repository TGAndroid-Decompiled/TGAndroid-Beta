package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.d10;
public final class z0 {
    public final int f43383a;
    public final long f43384b;
    public final a1 f43385c;

    public z0(a1 a1Var, int i7, long j3) {
        this.f43385c = a1Var;
        this.f43383a = i7;
        this.f43384b = j3;
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
        org.telegram.messenger.g0.h3(new pp0(this.f43385c, uVar, this.f43383a, sb2.toString(), 18));
    }

    public final void b(rc.u uVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.f43385c.f42057a);
        sb2.append(" generation=");
        int i7 = this.f43383a;
        sb2.append(i7);
        sb2.append(" receive <- ");
        sb2.append(str);
        org.telegram.messenger.a8.b(sb2.toString());
        try {
            org.telegram.messenger.g0.h3(new pp0(this, uVar, i7, new JSONObject(str), 19));
        } catch (JSONException unused) {
            org.telegram.messenger.g0.h3(new d10(this, uVar, i7, 13));
        }
    }
}
