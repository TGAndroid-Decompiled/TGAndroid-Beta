package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.w21;
import org.telegram.ui.ci0;
public final class z0 {
    public final int f35577a;
    public final long f35578b;
    public final a1 f35579c;

    public z0(a1 a1Var, int i10, long j3) {
        this.f35579c = a1Var;
        this.f35577a = i10;
        this.f35578b = j3;
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
        AndroidUtilities.runOnUIThread(new w21(this.f35579c, uVar, this.f35577a, sb2.toString(), 14));
    }

    public final void b(sc.u uVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.f35579c.f34445a);
        sb2.append(" generation=");
        int i10 = this.f35577a;
        sb2.append(i10);
        sb2.append(" receive <- ");
        sb2.append(str);
        FileLog.d(sb2.toString());
        try {
            AndroidUtilities.runOnUIThread(new w21(this, uVar, i10, new JSONObject(str), 15));
        } catch (JSONException unused) {
            AndroidUtilities.runOnUIThread(new ci0(this, uVar, i10, 11));
        }
    }
}
