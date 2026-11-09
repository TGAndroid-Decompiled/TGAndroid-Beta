package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class c1 implements v10 {
    public final int f42297a = 1;
    public final d2 f42298b;
    public final TL_wallet.tonConnectSession f42299c;
    public final String d;
    public final byte[] f42300e;
    public final Object f42301f;
    public final Object f42302g;
    public final Object h;

    public c1(d2 d2Var, bi.p5 p5Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.f42298b = d2Var;
        this.f42301f = p5Var;
        this.f42299c = tonconnectsession;
        this.d = str;
        this.f42300e = bArr;
        this.f42302g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f42297a;
        d2 d2Var = this.f42298b;
        switch (i7) {
            case 0:
                s sVar = (s) this.f42301f;
                i0 i0Var = (i0) this.f42302g;
                TL_wallet.tonConnectSession tonconnectsession = this.f42299c;
                String str = this.d;
                byte[] bArr = this.f42300e;
                y1 y1Var = (y1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                d2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.f21336e.c(new bi.n8(d2Var, i0Var, tonconnectsession, str, bArr, y1Var, tonconnectchallenge, sVar, 7));
                    return;
                } else {
                    sVar.a(d2.z(tL_error, "registerKey"));
                    return;
                }
            default:
                bi.p5 p5Var = (bi.p5) this.f42301f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.f42299c;
                String str2 = this.d;
                byte[] bArr2 = this.f42300e;
                JSONArray jSONArray = (JSONArray) this.f42302g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                i0 i0Var2 = (i0) obj;
                String str3 = (String) obj2;
                d2Var.getClass();
                if (str3 == null && i0Var2 != null) {
                    i0 b10 = i0Var2.b();
                    Utilities.f21336e.c(new bi.n8(d2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new t1(1, b10, p5Var), 8));
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
        this.f42298b = d2Var;
        this.f42301f = sVar;
        this.f42302g = i0Var;
        this.f42299c = tonconnectsession;
        this.d = str;
        this.f42300e = bArr;
        this.h = y1Var;
    }
}
