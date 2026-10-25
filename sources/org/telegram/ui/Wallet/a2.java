package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class a2 {
    public final TL_wallet.tonConnectSession f36334a;
    public final int f36335b;
    public final int f36336c;
    public final String d;
    public final String e;
    public final d2 f36337f;
    public final byte[] f36338g;
    public final String h;
    public final String f36339i;
    public final String f36340j;
    public final String f36341k;
    public final int f36342l;
    public boolean f36343m;
    public boolean f36344n;
    public boolean f36345o;
    public boolean f36346p;
    public boolean f36347q;
    public Runnable f36348r;

    public a2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        d2 d2Var;
        this.f36334a = tonconnectpending.session;
        this.f36335b = tonconnectrequest.msg_id;
        this.f36336c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f36339i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f36342l = optInt;
        String str2 = null;
        this.f36340j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            d2Var = new d2(jSONObject.getJSONObject("transaction"));
        } else {
            d2Var = null;
        }
        this.f36337f = d2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f36341k = str2;
        this.h = str;
        this.f36338g = (byte[]) bArr.clone();
    }
}
