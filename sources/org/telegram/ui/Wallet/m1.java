package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.a31;
public final class m1 implements p10 {
    public final int f44642a = 1;
    public final m2 f44643b;
    public final TL_wallet.tonConnectSession f44644c;
    public final String d;
    public final byte[] f44645e;
    public final Object f44646f;
    public final Object f44647g;
    public final Object h;

    public m1(m2 m2Var, a31 a31Var, s0 s0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, h2 h2Var) {
        this.f44643b = m2Var;
        this.f44646f = a31Var;
        this.f44647g = s0Var;
        this.f44644c = tonconnectsession;
        this.d = str;
        this.f44645e = bArr;
        this.h = h2Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f44642a;
        m2 m2Var = this.f44643b;
        switch (i7) {
            case 0:
                a31 a31Var = (a31) this.f44646f;
                s0 s0Var = (s0) this.f44647g;
                TL_wallet.tonConnectSession tonconnectsession = this.f44644c;
                String str = this.d;
                byte[] bArr = this.f44645e;
                h2 h2Var = (h2) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                m2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.f22877e.c(new di.j7(m2Var, s0Var, tonconnectsession, str, bArr, h2Var, tonconnectchallenge, a31Var, 7));
                    return;
                } else {
                    a31Var.a(m2.z(tL_error, "registerKey"));
                    return;
                }
            default:
                f0 f0Var = (f0) this.f44646f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.f44644c;
                String str2 = this.d;
                byte[] bArr2 = this.f44645e;
                JSONArray jSONArray = (JSONArray) this.f44647g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                s0 s0Var2 = (s0) obj;
                String str3 = (String) obj2;
                m2Var.getClass();
                if (str3 == null && s0Var2 != null) {
                    s0 b10 = s0Var2.b();
                    Utilities.f22877e.c(new di.j7(m2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new f0(5, b10, f0Var), 8));
                    return;
                }
                if (str3 == null) {
                    str3 = "Recovery phrase is unavailable";
                }
                f0Var.a(null, str3);
                return;
        }
    }

    public m1(m2 m2Var, f0 f0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.f44643b = m2Var;
        this.f44646f = f0Var;
        this.f44644c = tonconnectsession;
        this.d = str;
        this.f44645e = bArr;
        this.f44647g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }
}
