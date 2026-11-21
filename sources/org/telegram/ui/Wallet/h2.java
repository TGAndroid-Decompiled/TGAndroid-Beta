package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class h2 {
    public final TL_wallet.tonConnectSession f44329a;
    public final int f44330b;
    public final int f44331c;
    public final String d;
    public final String f44332e;
    public final k2 f44333f;
    public final byte[] f44334g;
    public final String h;
    public final String f44335i;
    public final String f44336j;
    public final String f44337k;
    public final int f44338l;
    public boolean f44339m;
    public boolean f44340n;
    public boolean f44341o;
    public boolean f44342p;
    public boolean f44343q;
    public Runnable f44344r;

    public h2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        k2 k2Var;
        this.f44329a = tonconnectpending.session;
        this.f44330b = tonconnectrequest.msg_id;
        this.f44331c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f44335i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f44332e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f44338l = optInt;
        String str2 = null;
        this.f44336j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            k2Var = new k2(jSONObject.getJSONObject("transaction"));
        } else {
            k2Var = null;
        }
        this.f44333f = k2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f44337k = str2;
        this.h = str;
        this.f44334g = (byte[]) bArr.clone();
    }
}
