package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class b2 {
    public final TL_wallet.tonConnectSession f34485a;
    public final int f34486b;
    public final int f34487c;
    public final String d;
    public final String f34488e;
    public final e2 f34489f;
    public final byte[] f34490g;
    public final String h;
    public final String f34491i;
    public final String f34492j;
    public final String f34493k;
    public final int f34494l;
    public boolean f34495m;
    public boolean f34496n;
    public boolean f34497o;
    public boolean f34498p;
    public boolean f34499q;
    public Runnable f34500r;

    public b2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        e2 e2Var;
        this.f34485a = tonconnectpending.session;
        this.f34486b = tonconnectrequest.msg_id;
        this.f34487c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f34491i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f34488e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f34494l = optInt;
        String str2 = null;
        this.f34492j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            e2Var = new e2(jSONObject.getJSONObject("transaction"));
        } else {
            e2Var = null;
        }
        this.f34489f = e2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f34493k = str2;
        this.h = str;
        this.f34490g = (byte[]) bArr.clone();
    }
}
