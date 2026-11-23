package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class i2 {
    public final TL_wallet.tonConnectSession f44461a;
    public final int f44462b;
    public final int f44463c;
    public final String d;
    public final String f44464e;
    public final l2 f44465f;
    public final byte[] f44466g;
    public final String h;
    public final String f44467i;
    public final String f44468j;
    public final String f44469k;
    public final int f44470l;
    public boolean f44471m;
    public boolean f44472n;
    public boolean f44473o;
    public boolean f44474p;
    public boolean f44475q;
    public Runnable f44476r;

    public i2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        l2 l2Var;
        this.f44461a = tonconnectpending.session;
        this.f44462b = tonconnectrequest.msg_id;
        this.f44463c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f44467i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f44464e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f44470l = optInt;
        String str2 = null;
        this.f44468j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            l2Var = new l2(jSONObject.getJSONObject("transaction"));
        } else {
            l2Var = null;
        }
        this.f44465f = l2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f44469k = str2;
        this.h = str;
        this.f44466g = (byte[]) bArr.clone();
    }
}
