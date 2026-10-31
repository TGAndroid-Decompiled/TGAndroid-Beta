package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class a2 {
    public final TL_wallet.tonConnectSession f34162a;
    public final int f34163b;
    public final int f34164c;
    public final String d;
    public final String e;
    public final d2 f34165f;
    public final byte[] f34166g;
    public final String h;
    public final String f34167i;
    public final String f34168j;
    public final String f34169k;
    public final int f34170l;
    public boolean f34171m;
    public boolean f34172n;
    public boolean f34173o;
    public boolean f34174p;
    public boolean f34175q;
    public Runnable f34176r;

    public a2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        d2 d2Var;
        this.f34162a = tonconnectpending.session;
        this.f34163b = tonconnectrequest.msg_id;
        this.f34164c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f34167i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f34170l = optInt;
        String str2 = null;
        this.f34168j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            d2Var = new d2(jSONObject.getJSONObject("transaction"));
        } else {
            d2Var = null;
        }
        this.f34165f = d2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f34169k = str2;
        this.h = str;
        this.f34166g = (byte[]) bArr.clone();
    }
}
