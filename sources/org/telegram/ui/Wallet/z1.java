package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class z1 {
    public final TL_wallet.tonConnectSession f43405a;
    public final int f43406b;
    public final int f43407c;
    public final String d;
    public final String f43408e;
    public final c2 f43409f;
    public final byte[] f43410g;
    public final String h;
    public final String f43411i;
    public final String f43412j;
    public final String f43413k;
    public final int f43414l;
    public boolean f43415m;
    public boolean f43416n;
    public boolean f43417o;
    public boolean f43418p;
    public boolean f43419q;
    public Runnable f43420r;

    public z1(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        c2 c2Var;
        this.f43405a = tonconnectpending.session;
        this.f43406b = tonconnectrequest.msg_id;
        this.f43407c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f43411i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f43408e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f43414l = optInt;
        String str2 = null;
        this.f43412j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            c2Var = new c2(jSONObject.getJSONObject("transaction"));
        } else {
            c2Var = null;
        }
        this.f43409f = c2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f43413k = str2;
        this.h = str;
        this.f43410g = (byte[]) bArr.clone();
    }
}
