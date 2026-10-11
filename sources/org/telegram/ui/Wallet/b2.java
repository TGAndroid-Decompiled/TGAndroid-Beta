package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class b2 {
    public final TL_wallet.tonConnectSession f34710a;
    public final int f34711b;
    public final int f34712c;
    public final String d;
    public final String f34713e;
    public final e2 f34714f;
    public final byte[] f34715g;
    public final String h;
    public final String f34716i;
    public final String f34717j;
    public final String f34718k;
    public final int f34719l;
    public boolean f34720m;
    public boolean f34721n;
    public boolean f34722o;
    public boolean f34723p;
    public boolean f34724q;
    public Runnable f34725r;

    public b2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        e2 e2Var;
        this.f34710a = tonconnectpending.session;
        this.f34711b = tonconnectrequest.msg_id;
        this.f34712c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f34716i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f34713e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f34719l = optInt;
        String str2 = null;
        this.f34717j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            e2Var = new e2(jSONObject.getJSONObject("transaction"));
        } else {
            e2Var = null;
        }
        this.f34714f = e2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f34718k = str2;
        this.h = str;
        this.f34715g = (byte[]) bArr.clone();
    }
}
