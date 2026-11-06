package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class b2 {
    public final TL_wallet.tonConnectSession f42122a;
    public final int f42123b;
    public final int f42124c;
    public final String d;
    public final String f42125e;
    public final e2 f42126f;
    public final byte[] f42127g;
    public final String h;
    public final String f42128i;
    public final String f42129j;
    public final String f42130k;
    public final int f42131l;
    public boolean f42132m;
    public boolean f42133n;
    public boolean f42134o;
    public boolean f42135p;
    public boolean f42136q;
    public Runnable f42137r;

    public b2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        e2 e2Var;
        this.f42122a = tonconnectpending.session;
        this.f42123b = tonconnectrequest.msg_id;
        this.f42124c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f42128i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f42125e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f42131l = optInt;
        String str2 = null;
        this.f42129j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            e2Var = new e2(jSONObject.getJSONObject("transaction"));
        } else {
            e2Var = null;
        }
        this.f42126f = e2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f42130k = str2;
        this.h = str;
        this.f42127g = (byte[]) bArr.clone();
    }
}
