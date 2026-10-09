package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.x21;
import org.telegram.ui.bi0;
public final class y0 {
    public final int f35643a;
    public final long f35644b;
    public final z0 f35645c;

    public y0(z0 z0Var, int i10, long j3) {
        this.f35645c = z0Var;
        this.f35643a = i10;
        this.f35644b = j3;
    }

    public final void a(sc.u uVar, sc.y yVar, sc.y yVar2, boolean z10) {
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
        AndroidUtilities.runOnUIThread(new x21(this.f35645c, uVar, this.f35643a, sb2.toString(), 13));
    }

    public final void b(sc.u uVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.f35645c.f35679a);
        sb2.append(" generation=");
        int i10 = this.f35643a;
        sb2.append(i10);
        sb2.append(" receive <- ");
        sb2.append(str);
        FileLog.d(sb2.toString());
        try {
            AndroidUtilities.runOnUIThread(new x21(this, uVar, i10, new JSONObject(str), 14));
        } catch (JSONException unused) {
            AndroidUtilities.runOnUIThread(new bi0(this, uVar, i10, 11));
        }
    }
}
