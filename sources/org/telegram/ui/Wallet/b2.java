package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class b2 {
    public final TL_wallet.tonConnectSession f42121a;
    public final int f42122b;
    public final int f42123c;
    public final String d;
    public final String f42124e;
    public final e2 f42125f;
    public final byte[] f42126g;
    public final String h;
    public final String f42127i;
    public final String f42128j;
    public final String f42129k;
    public final int f42130l;
    public boolean f42131m;
    public boolean f42132n;
    public boolean f42133o;
    public boolean f42134p;
    public boolean f42135q;
    public Runnable f42136r;

    public b2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        e2 e2Var;
        this.f42121a = tonconnectpending.session;
        this.f42122b = tonconnectrequest.msg_id;
        this.f42123c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f42127i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f42124e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f42130l = optInt;
        String str2 = null;
        this.f42128j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            e2Var = new e2(jSONObject.getJSONObject("transaction"));
        } else {
            e2Var = null;
        }
        this.f42125f = e2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f42129k = str2;
        this.h = str;
        this.f42126g = (byte[]) bArr.clone();
    }
}
