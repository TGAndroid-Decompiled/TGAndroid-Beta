package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.rw;
public final class w0 {
    public final int f43306a;
    public final long f43307b;
    public final x0 f43308c;

    public w0(x0 x0Var, int i3, long j10) {
        this.f43308c = x0Var;
        this.f43306a = i3;
        this.f43307b = j10;
    }

    public final void a(oc.u uVar, oc.x xVar, oc.x xVar2, boolean z10) {
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
        org.telegram.messenger.g0.h3(new zo0(this.f43308c, uVar, this.f43306a, sb2.toString(), 19));
    }

    public final void b(oc.u uVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.f43308c.f43370a);
        sb2.append(" generation=");
        int i3 = this.f43306a;
        sb2.append(i3);
        sb2.append(" receive <- ");
        sb2.append(str);
        org.telegram.messenger.a8.b(sb2.toString());
        try {
            org.telegram.messenger.g0.h3(new zo0(this, uVar, i3, new JSONObject(str), 20));
        } catch (JSONException unused) {
            org.telegram.messenger.g0.h3(new rw(this, uVar, i3, 14));
        }
    }
}
