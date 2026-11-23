package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class h2 {
    public final TL_wallet.tonConnectSession f44333a;
    public final int f44334b;
    public final int f44335c;
    public final String d;
    public final String f44336e;
    public final k2 f44337f;
    public final byte[] f44338g;
    public final String h;
    public final String f44339i;
    public final String f44340j;
    public final String f44341k;
    public final int f44342l;
    public boolean f44343m;
    public boolean f44344n;
    public boolean f44345o;
    public boolean f44346p;
    public boolean f44347q;
    public Runnable f44348r;

    public h2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        k2 k2Var;
        this.f44333a = tonconnectpending.session;
        this.f44334b = tonconnectrequest.msg_id;
        this.f44335c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f44339i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f44336e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f44342l = optInt;
        String str2 = null;
        this.f44340j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            k2Var = new k2(jSONObject.getJSONObject("transaction"));
        } else {
            k2Var = null;
        }
        this.f44337f = k2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f44341k = str2;
        this.h = str;
        this.f44338g = (byte[]) bArr.clone();
    }
}
