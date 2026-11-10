package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class c1 implements v10 {
    public final int f42203a = 1;
    public final d2 f42204b;
    public final TL_wallet.tonConnectSession f42205c;
    public final String d;
    public final byte[] f42206e;
    public final Object f42207f;
    public final Object f42208g;
    public final Object h;

    public c1(d2 d2Var, bi.p5 p5Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.f42204b = d2Var;
        this.f42207f = p5Var;
        this.f42205c = tonconnectsession;
        this.d = str;
        this.f42206e = bArr;
        this.f42208g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f42203a;
        d2 d2Var = this.f42204b;
        switch (i7) {
            case 0:
                s sVar = (s) this.f42207f;
                i0 i0Var = (i0) this.f42208g;
                TL_wallet.tonConnectSession tonconnectsession = this.f42205c;
                String str = this.d;
                byte[] bArr = this.f42206e;
                y1 y1Var = (y1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                d2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.f21341e.c(new bi.n8(d2Var, i0Var, tonconnectsession, str, bArr, y1Var, tonconnectchallenge, sVar, 7));
                    return;
                } else {
                    sVar.a(d2.z(tL_error, "registerKey"));
                    return;
                }
            default:
                bi.p5 p5Var = (bi.p5) this.f42207f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.f42205c;
                String str2 = this.d;
                byte[] bArr2 = this.f42206e;
                JSONArray jSONArray = (JSONArray) this.f42208g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                i0 i0Var2 = (i0) obj;
                String str3 = (String) obj2;
                d2Var.getClass();
                if (str3 == null && i0Var2 != null) {
                    i0 b10 = i0Var2.b();
                    Utilities.f21341e.c(new bi.n8(d2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new t1(1, b10, p5Var), 8));
                    return;
                }
                if (str3 == null) {
                    str3 = "Recovery phrase is unavailable";
                }
                p5Var.a(null, str3);
                return;
        }
    }

    public c1(d2 d2Var, s sVar, i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, y1 y1Var) {
        this.f42204b = d2Var;
        this.f42207f = sVar;
        this.f42208g = i0Var;
        this.f42205c = tonconnectsession;
        this.d = str;
        this.f42206e = bArr;
        this.h = y1Var;
    }
}
