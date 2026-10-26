package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class a2 {
    public final TL_wallet.tonConnectSession f36337a;
    public final int f36338b;
    public final int f36339c;
    public final String d;
    public final String e;
    public final d2 f36340f;
    public final byte[] f36341g;
    public final String h;
    public final String f36342i;
    public final String f36343j;
    public final String f36344k;
    public final int f36345l;
    public boolean f36346m;
    public boolean f36347n;
    public boolean f36348o;
    public boolean f36349p;
    public boolean f36350q;
    public Runnable f36351r;

    public a2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        d2 d2Var;
        this.f36337a = tonconnectpending.session;
        this.f36338b = tonconnectrequest.msg_id;
        this.f36339c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f36342i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f36345l = optInt;
        String str2 = null;
        this.f36343j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            d2Var = new d2(jSONObject.getJSONObject("transaction"));
        } else {
            d2Var = null;
        }
        this.f36340f = d2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f36344k = str2;
        this.h = str;
        this.f36341g = (byte[]) bArr.clone();
    }
}
