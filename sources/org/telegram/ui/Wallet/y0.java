package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.ez0;
public final class y0 {
    public final int f35427a;
    public final long f35428b;
    public final z0 f35429c;

    public y0(z0 z0Var, int i10, long j10) {
        this.f35429c = z0Var;
        this.f35427a = i10;
        this.f35428b = j10;
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
        AndroidUtilities.runOnUIThread(new ez0(this.f35429c, uVar, this.f35427a, sb2.toString(), 16));
    }

    public final void b(tc.u uVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.f35429c.f35471a);
        sb2.append(" generation=");
        int i10 = this.f35427a;
        sb2.append(i10);
        sb2.append(" receive <- ");
        sb2.append(str);
        FileLog.d(sb2.toString());
        try {
            AndroidUtilities.runOnUIThread(new ez0(this, uVar, i10, new JSONObject(str), 17));
        } catch (JSONException unused) {
            AndroidUtilities.runOnUIThread(new b41(this, uVar, i10, 16));
        }
    }
}
