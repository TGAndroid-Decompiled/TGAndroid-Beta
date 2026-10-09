package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class z1 {
    public final TL_wallet.tonConnectSession f35720a;
    public final int f35721b;
    public final int f35722c;
    public final String d;
    public final String f35723e;
    public final c2 f35724f;
    public final byte[] f35725g;
    public final String h;
    public final String f35726i;
    public final String f35727j;
    public final String f35728k;
    public final int f35729l;
    public boolean f35730m;
    public boolean f35731n;
    public boolean f35732o;
    public boolean f35733p;
    public boolean f35734q;
    public Runnable f35735r;

    public z1(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        c2 c2Var;
        this.f35720a = tonconnectpending.session;
        this.f35721b = tonconnectrequest.msg_id;
        this.f35722c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f35726i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f35723e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f35729l = optInt;
        String str2 = null;
        this.f35727j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            c2Var = new c2(jSONObject.getJSONObject("transaction"));
        } else {
            c2Var = null;
        }
        this.f35724f = c2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f35728k = str2;
        this.h = str;
        this.f35725g = (byte[]) bArr.clone();
    }
}
