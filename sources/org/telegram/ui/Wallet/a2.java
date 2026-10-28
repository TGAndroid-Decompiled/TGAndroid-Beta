package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class a2 {
    public final TL_wallet.tonConnectSession f36361a;
    public final int f36362b;
    public final int f36363c;
    public final String d;
    public final String e;
    public final d2 f36364f;
    public final byte[] f36365g;
    public final String h;
    public final String f36366i;
    public final String f36367j;
    public final String f36368k;
    public final int f36369l;
    public boolean f36370m;
    public boolean f36371n;
    public boolean f36372o;
    public boolean f36373p;
    public boolean f36374q;
    public Runnable f36375r;

    public a2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        d2 d2Var;
        this.f36361a = tonconnectpending.session;
        this.f36362b = tonconnectrequest.msg_id;
        this.f36363c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f36366i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f36369l = optInt;
        String str2 = null;
        this.f36367j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            d2Var = new d2(jSONObject.getJSONObject("transaction"));
        } else {
            d2Var = null;
        }
        this.f36364f = d2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f36368k = str2;
        this.h = str;
        this.f36365g = (byte[]) bArr.clone();
    }
}
