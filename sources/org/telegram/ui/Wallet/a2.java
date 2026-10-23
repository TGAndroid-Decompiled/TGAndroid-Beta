package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class a2 {
    public final TL_wallet.tonConnectSession f34272a;
    public final int f34273b;
    public final int f34274c;
    public final String d;
    public final String e;
    public final d2 f34275f;
    public final byte[] f34276g;
    public final String h;
    public final String f34277i;
    public final String f34278j;
    public final String f34279k;
    public final int f34280l;
    public boolean f34281m;
    public boolean f34282n;
    public boolean f34283o;
    public boolean f34284p;
    public boolean f34285q;
    public Runnable f34286r;

    public a2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        d2 d2Var;
        this.f34272a = tonconnectpending.session;
        this.f34273b = tonconnectrequest.msg_id;
        this.f34274c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f34277i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f34280l = optInt;
        String str2 = null;
        this.f34278j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            d2Var = new d2(jSONObject.getJSONObject("transaction"));
        } else {
            d2Var = null;
        }
        this.f34275f = d2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f34279k = str2;
        this.h = str;
        this.f34276g = (byte[]) bArr.clone();
    }
}
