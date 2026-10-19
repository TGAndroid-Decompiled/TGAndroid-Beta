package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.bz0;
import org.telegram.ui.Components.x31;
public final class z0 {
    public final int f35154a;
    public final long f35155b;
    public final a1 f35156c;

    public z0(a1 a1Var, int i10, long j10) {
        this.f35156c = a1Var;
        this.f35154a = i10;
        this.f35155b = j10;
    }

    public final void a(tc.u uVar, tc.x xVar, tc.x xVar2, boolean z10) {
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
        AndroidUtilities.runOnUIThread(new bz0(this.f35156c, uVar, this.f35154a, sb2.toString(), 15, false));
    }

    public final void b(tc.u uVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.f35156c.f33962a);
        sb2.append(" generation=");
        int i10 = this.f35154a;
        sb2.append(i10);
        sb2.append(" receive <- ");
        sb2.append(str);
        FileLog.d(sb2.toString());
        try {
            AndroidUtilities.runOnUIThread(new bz0(this, uVar, i10, new JSONObject(str), 16));
        } catch (JSONException unused) {
            AndroidUtilities.runOnUIThread(new x31(this, uVar, i10, 16));
        }
    }
}
