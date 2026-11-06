package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class e1 implements v10 {
    public final int f42408a = 1;
    public final f2 f42409b;
    public final TL_wallet.tonConnectSession f42410c;
    public final String d;
    public final byte[] f42411e;
    public final Object f42412f;
    public final Object f42413g;
    public final Object h;

    public e1(f2 f2Var, bi.p5 p5Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.f42409b = f2Var;
        this.f42412f = p5Var;
        this.f42410c = tonconnectsession;
        this.d = str;
        this.f42411e = bArr;
        this.f42413g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f42408a;
        f2 f2Var = this.f42409b;
        switch (i7) {
            case 0:
                t tVar = (t) this.f42412f;
                k0 k0Var = (k0) this.f42413g;
                TL_wallet.tonConnectSession tonconnectsession = this.f42410c;
                String str = this.d;
                byte[] bArr = this.f42411e;
                a2 a2Var = (a2) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.f21333e.c(new bi.n8(f2Var, k0Var, tonconnectsession, str, bArr, a2Var, tonconnectchallenge, tVar, 7));
                    return;
                } else {
                    tVar.a(f2.z(tL_error, "registerKey"));
                    return;
                }
            default:
                bi.p5 p5Var = (bi.p5) this.f42412f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.f42410c;
                String str2 = this.d;
                byte[] bArr2 = this.f42411e;
                JSONArray jSONArray = (JSONArray) this.f42413g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                k0 k0Var2 = (k0) obj;
                String str3 = (String) obj2;
                f2Var.getClass();
                if (str3 == null && k0Var2 != null) {
                    k0 b10 = k0Var2.b();
                    Utilities.f21333e.c(new bi.n8(f2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new v1(1, b10, p5Var), 8));
                    return;
                }
                if (str3 == null) {
                    str3 = "Recovery phrase is unavailable";
                }
                p5Var.a(null, str3);
                return;
        }
    }

    public e1(f2 f2Var, t tVar, k0 k0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, a2 a2Var) {
        this.f42409b = f2Var;
        this.f42412f = tVar;
        this.f42413g = k0Var;
        this.f42410c = tonconnectsession;
        this.d = str;
        this.f42411e = bArr;
        this.h = a2Var;
    }
}
