package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class b2 {
    public final TL_wallet.tonConnectSession f34007a;
    public final int f34008b;
    public final int f34009c;
    public final String d;
    public final String e;
    public final e2 f34010f;
    public final byte[] f34011g;
    public final String h;
    public final String f34012i;
    public final String f34013j;
    public final String f34014k;
    public final int f34015l;
    public boolean f34016m;
    public boolean f34017n;
    public boolean f34018o;
    public boolean f34019p;
    public boolean f34020q;
    public Runnable f34021r;

    public b2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        e2 e2Var;
        this.f34007a = tonconnectpending.session;
        this.f34008b = tonconnectrequest.msg_id;
        this.f34009c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f34012i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f34015l = optInt;
        String str2 = null;
        this.f34013j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            e2Var = new e2(jSONObject.getJSONObject("transaction"));
        } else {
            e2Var = null;
        }
        this.f34010f = e2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f34014k = str2;
        this.h = str;
        this.f34011g = (byte[]) bArr.clone();
    }
}
