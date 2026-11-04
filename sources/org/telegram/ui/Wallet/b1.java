package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.e51;
public final class b1 implements n10 {
    public final int f42216a = 1;
    public final c2 f42217b;
    public final TL_wallet.tonConnectSession f42218c;
    public final String d;
    public final byte[] f42219e;
    public final Object f42220f;
    public final Object f42221g;
    public final Object h;

    public b1(c2 c2Var, e51 e51Var, h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, x1 x1Var) {
        this.f42217b = c2Var;
        this.f42220f = e51Var;
        this.f42221g = h0Var;
        this.f42218c = tonconnectsession;
        this.d = str;
        this.f42219e = bArr;
        this.h = x1Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i3 = this.f42216a;
        c2 c2Var = this.f42217b;
        switch (i3) {
            case 0:
                e51 e51Var = (e51) this.f42220f;
                h0 h0Var = (h0) this.f42221g;
                TL_wallet.tonConnectSession tonconnectsession = this.f42218c;
                String str = this.d;
                byte[] bArr = this.f42219e;
                x1 x1Var = (x1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.f21387e.c(new ci.o7(c2Var, h0Var, tonconnectsession, str, bArr, x1Var, tonconnectchallenge, e51Var, 7));
                    return;
                } else {
                    e51Var.a(c2.z(tL_error, "registerKey"));
                    return;
                }
            default:
                s1 s1Var = (s1) this.f42220f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.f42218c;
                String str2 = this.d;
                byte[] bArr2 = this.f42219e;
                JSONArray jSONArray = (JSONArray) this.f42221g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                h0 h0Var2 = (h0) obj;
                String str3 = (String) obj2;
                c2Var.getClass();
                if (str3 == null && h0Var2 != null) {
                    h0 b10 = h0Var2.b();
                    Utilities.f21387e.c(new ci.o7(c2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new s1(2, b10, s1Var), 8));
                    return;
                }
                if (str3 == null) {
                    str3 = "Recovery phrase is unavailable";
                }
                s1Var.a(null, str3);
                return;
        }
    }

    public b1(c2 c2Var, s1 s1Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.f42217b = c2Var;
        this.f42220f = s1Var;
        this.f42218c = tonconnectsession;
        this.d = str;
        this.f42219e = bArr;
        this.f42221g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }
}
