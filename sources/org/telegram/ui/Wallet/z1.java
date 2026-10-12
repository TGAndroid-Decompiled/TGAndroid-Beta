package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class z1 {
    public final TL_wallet.tonConnectSession f33900a;
    public final int f33901b;
    public final int f33902c;
    public final String d;
    public final String e;
    public final c2 f33903f;
    public final byte[] f33904g;
    public final String h;
    public final String f33905i;
    public final String f33906j;
    public final String f33907k;
    public final int f33908l;
    public boolean f33909m;
    public boolean f33910n;
    public boolean f33911o;
    public boolean f33912p;
    public boolean f33913q;
    public Runnable f33914r;

    public z1(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        c2 c2Var;
        this.f33900a = tonconnectpending.session;
        this.f33901b = tonconnectrequest.msg_id;
        this.f33902c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f33905i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f33908l = optInt;
        String str2 = null;
        this.f33906j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            c2Var = new c2(jSONObject.getJSONObject("transaction"));
        } else {
            c2Var = null;
        }
        this.f33903f = c2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f33907k = str2;
        this.h = str;
        this.f33904g = (byte[]) bArr.clone();
    }
}
