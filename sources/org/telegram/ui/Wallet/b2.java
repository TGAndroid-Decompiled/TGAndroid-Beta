package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class b2 {
    public final TL_wallet.tonConnectSession f34016a;
    public final int f34017b;
    public final int f34018c;
    public final String d;
    public final String e;
    public final e2 f34019f;
    public final byte[] f34020g;
    public final String h;
    public final String f34021i;
    public final String f34022j;
    public final String f34023k;
    public final int f34024l;
    public boolean f34025m;
    public boolean f34026n;
    public boolean f34027o;
    public boolean f34028p;
    public boolean f34029q;
    public Runnable f34030r;

    public b2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        e2 e2Var;
        this.f34016a = tonconnectpending.session;
        this.f34017b = tonconnectrequest.msg_id;
        this.f34018c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f34021i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f34024l = optInt;
        String str2 = null;
        this.f34022j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            e2Var = new e2(jSONObject.getJSONObject("transaction"));
        } else {
            e2Var = null;
        }
        this.f34019f = e2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f34023k = str2;
        this.h = str;
        this.f34020g = (byte[]) bArr.clone();
    }
}
