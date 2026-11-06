package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class b2 {
    public final TL_wallet.tonConnectSession f42097a;
    public final int f42098b;
    public final int f42099c;
    public final String d;
    public final String f42100e;
    public final e2 f42101f;
    public final byte[] f42102g;
    public final String h;
    public final String f42103i;
    public final String f42104j;
    public final String f42105k;
    public final int f42106l;
    public boolean f42107m;
    public boolean f42108n;
    public boolean f42109o;
    public boolean f42110p;
    public boolean f42111q;
    public Runnable f42112r;

    public b2(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        e2 e2Var;
        this.f42097a = tonconnectpending.session;
        this.f42098b = tonconnectrequest.msg_id;
        this.f42099c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.f42103i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.f42100e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.f42106l = optInt;
        String str2 = null;
        this.f42104j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            e2Var = new e2(jSONObject.getJSONObject("transaction"));
        } else {
            e2Var = null;
        }
        this.f42101f = e2Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.f42105k = str2;
        this.h = str;
        this.f42102g = (byte[]) bArr.clone();
    }
}
