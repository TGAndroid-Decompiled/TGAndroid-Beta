package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.n21;
import org.telegram.ui.c90;
public final class y0 {
    public final int f33599a;
    public final long f33600b;
    public final z0 f33601c;

    public y0(z0 z0Var, int i10, long j10) {
        this.f33601c = z0Var;
        this.f33599a = i10;
        this.f33600b = j10;
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
        AndroidUtilities.runOnUIThread(new n21(this.f33601c, uVar, this.f33599a, sb2.toString(), 14));
    }

    public final void b(tc.u uVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.f33601c.f33635a);
        sb2.append(" generation=");
        int i10 = this.f33599a;
        sb2.append(i10);
        sb2.append(" receive <- ");
        sb2.append(str);
        FileLog.d(sb2.toString());
        try {
            AndroidUtilities.runOnUIThread(new n21(this, uVar, i10, new JSONObject(str), 15));
        } catch (JSONException unused) {
            AndroidUtilities.runOnUIThread(new c90(this, uVar, i10, 12));
        }
    }
}
