package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class b2 {
    public final TL_wallet.tonConnectSession f34009a;
    public final int f34010b;
    public final int f34011c;
    public final String d;
    public final String e;
    public final e2 f34012f;
    public final byte[] f34013g;
    public final String h;
    public final String f34014i;
    public final String f34015j;
    public final String f34016k;
    public final int f34017l;
    public boolean f34018m;
    public boolean f34019n;
    public boolean f34020o;
    public boolean f34021p;
    public boolean f34022q;
    public Runnable f34023r;

    public b2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        e2 e2Var;
        this.f34009a = tonconnectpending.session;
        this.f34010b = tonconnectrequest.msg_id;
        this.f34011c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f34014i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f34017l = optInt;
        String str2 = null;
        this.f34015j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            e2Var = new e2(jSONObject.getJSONObject("transaction"));
        } else {
            e2Var = null;
        }
        this.f34012f = e2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f34016k = str2;
        this.h = str;
        this.f34013g = (byte[]) bArr.clone();
    }
}
