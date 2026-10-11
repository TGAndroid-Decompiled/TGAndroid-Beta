package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class b2 {
    public final TL_wallet.tonConnectSession f34676a;
    public final int f34677b;
    public final int f34678c;
    public final String d;
    public final String f34679e;
    public final e2 f34680f;
    public final byte[] f34681g;
    public final String h;
    public final String f34682i;
    public final String f34683j;
    public final String f34684k;
    public final int f34685l;
    public boolean f34686m;
    public boolean f34687n;
    public boolean f34688o;
    public boolean f34689p;
    public boolean f34690q;
    public Runnable f34691r;

    public b2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        e2 e2Var;
        this.f34676a = tonconnectpending.session;
        this.f34677b = tonconnectrequest.msg_id;
        this.f34678c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f34682i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f34679e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f34685l = optInt;
        String str2 = null;
        this.f34683j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            e2Var = new e2(jSONObject.getJSONObject("transaction"));
        } else {
            e2Var = null;
        }
        this.f34680f = e2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f34684k = str2;
        this.h = str;
        this.f34681g = (byte[]) bArr.clone();
    }
}
