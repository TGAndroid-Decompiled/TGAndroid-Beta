package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class b2 {
    public final TL_wallet.tonConnectSession f34020a;
    public final int f34021b;
    public final int f34022c;
    public final String d;
    public final String e;
    public final e2 f34023f;
    public final byte[] f34024g;
    public final String h;
    public final String f34025i;
    public final String f34026j;
    public final String f34027k;
    public final int f34028l;
    public boolean f34029m;
    public boolean f34030n;
    public boolean f34031o;
    public boolean f34032p;
    public boolean f34033q;
    public Runnable f34034r;

    public b2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        e2 e2Var;
        this.f34020a = tonconnectpending.session;
        this.f34021b = tonconnectrequest.msg_id;
        this.f34022c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f34025i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f34028l = optInt;
        String str2 = null;
        this.f34026j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            e2Var = new e2(jSONObject.getJSONObject("transaction"));
        } else {
            e2Var = null;
        }
        this.f34023f = e2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f34027k = str2;
        this.h = str;
        this.f34024g = (byte[]) bArr.clone();
    }
}
