package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class b2 {
    public final TL_wallet.tonConnectSession f34487a;
    public final int f34488b;
    public final int f34489c;
    public final String d;
    public final String f34490e;
    public final e2 f34491f;
    public final byte[] f34492g;
    public final String h;
    public final String f34493i;
    public final String f34494j;
    public final String f34495k;
    public final int f34496l;
    public boolean f34497m;
    public boolean f34498n;
    public boolean f34499o;
    public boolean f34500p;
    public boolean f34501q;
    public Runnable f34502r;

    public b2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        e2 e2Var;
        this.f34487a = tonconnectpending.session;
        this.f34488b = tonconnectrequest.msg_id;
        this.f34489c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f34493i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f34490e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f34496l = optInt;
        String str2 = null;
        this.f34494j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            e2Var = new e2(jSONObject.getJSONObject("transaction"));
        } else {
            e2Var = null;
        }
        this.f34491f = e2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f34495k = str2;
        this.h = str;
        this.f34492g = (byte[]) bArr.clone();
    }
}
