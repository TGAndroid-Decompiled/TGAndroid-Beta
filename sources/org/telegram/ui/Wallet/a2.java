package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class a2 {
    public final TL_wallet.tonConnectSession f34648a;
    public final int f34649b;
    public final int f34650c;
    public final String d;
    public final String f34651e;
    public final d2 f34652f;
    public final byte[] f34653g;
    public final String h;
    public final String f34654i;
    public final String f34655j;
    public final String f34656k;
    public final int f34657l;
    public boolean f34658m;
    public boolean f34659n;
    public boolean f34660o;
    public boolean f34661p;
    public boolean f34662q;
    public Runnable f34663r;

    public a2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        d2 d2Var;
        this.f34648a = tonconnectpending.session;
        this.f34649b = tonconnectrequest.msg_id;
        this.f34650c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f34654i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f34651e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f34657l = optInt;
        String str2 = null;
        this.f34655j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            d2Var = new d2(jSONObject.getJSONObject("transaction"));
        } else {
            d2Var = null;
        }
        this.f34652f = d2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f34656k = str2;
        this.h = str;
        this.f34653g = (byte[]) bArr.clone();
    }
}
