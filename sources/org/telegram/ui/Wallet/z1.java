package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class z1 {
    public final TL_wallet.tonConnectSession f44776a;
    public final int f44777b;
    public final int f44778c;
    public final String d;
    public final String f44779e;
    public final c2 f44780f;
    public final byte[] f44781g;
    public final String h;
    public final String f44782i;
    public final String f44783j;
    public final String f44784k;
    public final int f44785l;
    public boolean f44786m;
    public boolean f44787n;
    public boolean f44788o;
    public boolean f44789p;
    public boolean f44790q;
    public Runnable f44791r;

    public z1(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        c2 c2Var;
        this.f44776a = tonconnectpending.session;
        this.f44777b = tonconnectrequest.msg_id;
        this.f44778c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f44782i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f44779e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f44785l = optInt;
        String str2 = null;
        this.f44783j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            c2Var = new c2(jSONObject.getJSONObject("transaction"));
        } else {
            c2Var = null;
        }
        this.f44780f = c2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f44784k = str2;
        this.h = str;
        this.f44781g = (byte[]) bArr.clone();
    }
}
