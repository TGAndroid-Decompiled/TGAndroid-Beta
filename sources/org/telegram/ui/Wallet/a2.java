package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class a2 {
    public final TL_wallet.tonConnectSession f34274a;
    public final int f34275b;
    public final int f34276c;
    public final String d;
    public final String e;
    public final d2 f34277f;
    public final byte[] f34278g;
    public final String h;
    public final String f34279i;
    public final String f34280j;
    public final String f34281k;
    public final int f34282l;
    public boolean f34283m;
    public boolean f34284n;
    public boolean f34285o;
    public boolean f34286p;
    public boolean f34287q;
    public Runnable f34288r;

    public a2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        d2 d2Var;
        this.f34274a = tonconnectpending.session;
        this.f34275b = tonconnectrequest.msg_id;
        this.f34276c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f34279i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f34282l = optInt;
        String str2 = null;
        this.f34280j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            d2Var = new d2(jSONObject.getJSONObject("transaction"));
        } else {
            d2Var = null;
        }
        this.f34277f = d2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f34281k = str2;
        this.h = str;
        this.f34278g = (byte[]) bArr.clone();
    }
}
