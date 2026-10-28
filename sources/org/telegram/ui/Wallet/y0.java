package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.as0;
import org.telegram.ui.fx;
public final class y0 {
    public final int f37514a;
    public final long f37515b;
    public final z0 f37516c;

    public y0(z0 z0Var, int i10, long j10) {
        this.f37516c = z0Var;
        this.f37514a = i10;
        this.f37515b = j10;
    }

    public final void a(uc.u uVar, uc.x xVar, uc.x xVar2, boolean z10) {
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
        AndroidUtilities.runOnUIThread(new as0(this.f37516c, uVar, this.f37514a, sb2.toString(), 18));
    }

    public final void b(uc.u uVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.f37516c.f37561a);
        sb2.append(" generation=");
        int i10 = this.f37514a;
        sb2.append(i10);
        sb2.append(" receive <- ");
        sb2.append(str);
        FileLog.d(sb2.toString());
        try {
            AndroidUtilities.runOnUIThread(new as0(this, uVar, i10, new JSONObject(str), 19));
        } catch (JSONException unused) {
            AndroidUtilities.runOnUIThread(new fx(this, uVar, i10, 15));
        }
    }
}
