package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class b2 {
    public final TL_wallet.tonConnectSession f34015a;
    public final int f34016b;
    public final int f34017c;
    public final String d;
    public final String e;
    public final e2 f34018f;
    public final byte[] f34019g;
    public final String h;
    public final String f34020i;
    public final String f34021j;
    public final String f34022k;
    public final int f34023l;
    public boolean f34024m;
    public boolean f34025n;
    public boolean f34026o;
    public boolean f34027p;
    public boolean f34028q;
    public Runnable f34029r;

    public b2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        e2 e2Var;
        this.f34015a = tonconnectpending.session;
        this.f34016b = tonconnectrequest.msg_id;
        this.f34017c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f34020i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f34023l = optInt;
        String str2 = null;
        this.f34021j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            e2Var = new e2(jSONObject.getJSONObject("transaction"));
        } else {
            e2Var = null;
        }
        this.f34018f = e2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f34022k = str2;
        this.h = str;
        this.f34019g = (byte[]) bArr.clone();
    }
}
