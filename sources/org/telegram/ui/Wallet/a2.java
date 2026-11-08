package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class a2 {
    public final TL_wallet.tonConnectSession f42093a;
    public final int f42094b;
    public final int f42095c;
    public final String d;
    public final String f42096e;
    public final d2 f42097f;
    public final byte[] f42098g;
    public final String h;
    public final String f42099i;
    public final String f42100j;
    public final String f42101k;
    public final int f42102l;
    public boolean f42103m;
    public boolean f42104n;
    public boolean f42105o;
    public boolean f42106p;
    public boolean f42107q;
    public Runnable f42108r;

    public a2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        d2 d2Var;
        this.f42093a = tonconnectpending.session;
        this.f42094b = tonconnectrequest.msg_id;
        this.f42095c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f42099i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f42096e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f42102l = optInt;
        String str2 = null;
        this.f42100j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            d2Var = new d2(jSONObject.getJSONObject("transaction"));
        } else {
            d2Var = null;
        }
        this.f42097f = d2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f42101k = str2;
        this.h = str;
        this.f42098g = (byte[]) bArr.clone();
    }
}
