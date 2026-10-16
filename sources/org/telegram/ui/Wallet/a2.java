package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class a2 {
    public final TL_wallet.tonConnectSession f32617a;
    public final int f32618b;
    public final int f32619c;
    public final String d;
    public final String e;
    public final d2 f32620f;
    public final byte[] f32621g;
    public final String h;
    public final String f32622i;
    public final String f32623j;
    public final String f32624k;
    public final int f32625l;
    public boolean f32626m;
    public boolean f32627n;
    public boolean f32628o;
    public boolean f32629p;
    public boolean f32630q;
    public Runnable f32631r;

    public a2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        d2 d2Var;
        this.f32617a = tonconnectpending.session;
        this.f32618b = tonconnectrequest.msg_id;
        this.f32619c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f32622i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f32625l = optInt;
        String str2 = null;
        this.f32623j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            d2Var = new d2(jSONObject.getJSONObject("transaction"));
        } else {
            d2Var = null;
        }
        this.f32620f = d2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f32624k = str2;
        this.h = str;
        this.f32621g = (byte[]) bArr.clone();
    }
}
