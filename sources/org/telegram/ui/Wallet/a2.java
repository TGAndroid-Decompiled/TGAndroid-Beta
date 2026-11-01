package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class a2 {
    public final TL_wallet.tonConnectSession f34169a;
    public final int f34170b;
    public final int f34171c;
    public final String d;
    public final String e;
    public final d2 f34172f;
    public final byte[] f34173g;
    public final String h;
    public final String f34174i;
    public final String f34175j;
    public final String f34176k;
    public final int f34177l;
    public boolean f34178m;
    public boolean f34179n;
    public boolean f34180o;
    public boolean f34181p;
    public boolean f34182q;
    public Runnable f34183r;

    public a2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        d2 d2Var;
        this.f34169a = tonconnectpending.session;
        this.f34170b = tonconnectrequest.msg_id;
        this.f34171c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f34174i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f34177l = optInt;
        String str2 = null;
        this.f34175j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            d2Var = new d2(jSONObject.getJSONObject("transaction"));
        } else {
            d2Var = null;
        }
        this.f34172f = d2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f34176k = str2;
        this.h = str;
        this.f34173g = (byte[]) bArr.clone();
    }
}
