package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class h2 {
    public final TL_wallet.tonConnectSession f44299a;
    public final int f44300b;
    public final int f44301c;
    public final String d;
    public final String f44302e;
    public final k2 f44303f;
    public final byte[] f44304g;
    public final String h;
    public final String f44305i;
    public final String f44306j;
    public final String f44307k;
    public final int f44308l;
    public boolean f44309m;
    public boolean f44310n;
    public boolean f44311o;
    public boolean f44312p;
    public boolean f44313q;
    public Runnable f44314r;

    public h2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        k2 k2Var;
        this.f44299a = tonconnectpending.session;
        this.f44300b = tonconnectrequest.msg_id;
        this.f44301c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f44305i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f44302e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f44308l = optInt;
        String str2 = null;
        this.f44306j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            k2Var = new k2(jSONObject.getJSONObject("transaction"));
        } else {
            k2Var = null;
        }
        this.f44303f = k2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f44307k = str2;
        this.h = str;
        this.f44304g = (byte[]) bArr.clone();
    }
}
