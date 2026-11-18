package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class h2 {
    public final TL_wallet.tonConnectSession f44289a;
    public final int f44290b;
    public final int f44291c;
    public final String d;
    public final String f44292e;
    public final k2 f44293f;
    public final byte[] f44294g;
    public final String h;
    public final String f44295i;
    public final String f44296j;
    public final String f44297k;
    public final int f44298l;
    public boolean f44299m;
    public boolean f44300n;
    public boolean f44301o;
    public boolean f44302p;
    public boolean f44303q;
    public Runnable f44304r;

    public h2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        k2 k2Var;
        this.f44289a = tonconnectpending.session;
        this.f44290b = tonconnectrequest.msg_id;
        this.f44291c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f44295i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f44292e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f44298l = optInt;
        String str2 = null;
        this.f44296j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            k2Var = new k2(jSONObject.getJSONObject("transaction"));
        } else {
            k2Var = null;
        }
        this.f44293f = k2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f44297k = str2;
        this.h = str;
        this.f44294g = (byte[]) bArr.clone();
    }
}
