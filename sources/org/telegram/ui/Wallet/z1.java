package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class z1 {
    public final TL_wallet.tonConnectSession f43412a;
    public final int f43413b;
    public final int f43414c;
    public final String d;
    public final String f43415e;
    public final c2 f43416f;
    public final byte[] f43417g;
    public final String h;
    public final String f43418i;
    public final String f43419j;
    public final String f43420k;
    public final int f43421l;
    public boolean f43422m;
    public boolean f43423n;
    public boolean f43424o;
    public boolean f43425p;
    public boolean f43426q;
    public Runnable f43427r;

    public z1(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        c2 c2Var;
        this.f43412a = tonconnectpending.session;
        this.f43413b = tonconnectrequest.msg_id;
        this.f43414c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f43418i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f43415e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f43421l = optInt;
        String str2 = null;
        this.f43419j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            c2Var = new c2(jSONObject.getJSONObject("transaction"));
        } else {
            c2Var = null;
        }
        this.f43416f = c2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f43420k = str2;
        this.h = str;
        this.f43417g = (byte[]) bArr.clone();
    }
}
