package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class b2 {
    public final TL_wallet.tonConnectSession f33997a;
    public final int f33998b;
    public final int f33999c;
    public final String d;
    public final String e;
    public final e2 f34000f;
    public final byte[] f34001g;
    public final String h;
    public final String f34002i;
    public final String f34003j;
    public final String f34004k;
    public final int f34005l;
    public boolean f34006m;
    public boolean f34007n;
    public boolean f34008o;
    public boolean f34009p;
    public boolean f34010q;
    public Runnable f34011r;

    public b2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        e2 e2Var;
        this.f33997a = tonconnectpending.session;
        this.f33998b = tonconnectrequest.msg_id;
        this.f33999c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f34002i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f34005l = optInt;
        String str2 = null;
        this.f34003j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            e2Var = new e2(jSONObject.getJSONObject("transaction"));
        } else {
            e2Var = null;
        }
        this.f34000f = e2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f34004k = str2;
        this.h = str;
        this.f34001g = (byte[]) bArr.clone();
    }
}
