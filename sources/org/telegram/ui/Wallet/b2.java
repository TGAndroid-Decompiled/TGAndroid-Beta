package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class b2 {
    public final TL_wallet.tonConnectSession f34019a;
    public final int f34020b;
    public final int f34021c;
    public final String d;
    public final String e;
    public final e2 f34022f;
    public final byte[] f34023g;
    public final String h;
    public final String f34024i;
    public final String f34025j;
    public final String f34026k;
    public final int f34027l;
    public boolean f34028m;
    public boolean f34029n;
    public boolean f34030o;
    public boolean f34031p;
    public boolean f34032q;
    public Runnable f34033r;

    public b2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        e2 e2Var;
        this.f34019a = tonconnectpending.session;
        this.f34020b = tonconnectrequest.msg_id;
        this.f34021c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f34024i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f34027l = optInt;
        String str2 = null;
        this.f34025j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            e2Var = new e2(jSONObject.getJSONObject("transaction"));
        } else {
            e2Var = null;
        }
        this.f34022f = e2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f34026k = str2;
        this.h = str;
        this.f34023g = (byte[]) bArr.clone();
    }
}
