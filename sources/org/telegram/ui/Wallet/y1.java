package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class y1 {
    public final TL_wallet.tonConnectSession f43456a;
    public final int f43457b;
    public final int f43458c;
    public final String d;
    public final String f43459e;
    public final b2 f43460f;
    public final byte[] f43461g;
    public final String h;
    public final String f43462i;
    public final String f43463j;
    public final String f43464k;
    public final int f43465l;
    public boolean f43466m;
    public boolean f43467n;
    public boolean f43468o;
    public boolean f43469p;
    public boolean f43470q;
    public Runnable f43471r;

    public y1(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        b2 b2Var;
        this.f43456a = tonconnectpending.session;
        this.f43457b = tonconnectrequest.msg_id;
        this.f43458c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f43462i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f43459e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f43465l = optInt;
        String str2 = null;
        this.f43463j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            b2Var = new b2(jSONObject.getJSONObject("transaction"));
        } else {
            b2Var = null;
        }
        this.f43460f = b2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f43464k = str2;
        this.h = str;
        this.f43461g = (byte[]) bArr.clone();
    }
}
