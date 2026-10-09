package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class z1 {
    public final TL_wallet.tonConnectSession f35693a;
    public final int f35694b;
    public final int f35695c;
    public final String d;
    public final String f35696e;
    public final c2 f35697f;
    public final byte[] f35698g;
    public final String h;
    public final String f35699i;
    public final String f35700j;
    public final String f35701k;
    public final int f35702l;
    public boolean f35703m;
    public boolean f35704n;
    public boolean f35705o;
    public boolean f35706p;
    public boolean f35707q;
    public Runnable f35708r;

    public z1(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        c2 c2Var;
        this.f35693a = tonconnectpending.session;
        this.f35694b = tonconnectrequest.msg_id;
        this.f35695c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f35699i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f35696e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f35702l = optInt;
        String str2 = null;
        this.f35700j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            c2Var = new c2(jSONObject.getJSONObject("transaction"));
        } else {
            c2Var = null;
        }
        this.f35697f = c2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f35701k = str2;
        this.h = str;
        this.f35698g = (byte[]) bArr.clone();
    }
}
