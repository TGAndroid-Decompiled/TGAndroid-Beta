package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class d1 implements v10 {
    public final int f42378a = 1;
    public final e2 f42379b;
    public final TL_wallet.tonConnectSession f42380c;
    public final String d;
    public final byte[] f42381e;
    public final Object f42382f;
    public final Object f42383g;
    public final Object h;

    public d1(e2 e2Var, bi.p5 p5Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.f42379b = e2Var;
        this.f42382f = p5Var;
        this.f42380c = tonconnectsession;
        this.d = str;
        this.f42381e = bArr;
        this.f42383g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f42378a;
        e2 e2Var = this.f42379b;
        switch (i7) {
            case 0:
                t tVar = (t) this.f42382f;
                j0 j0Var = (j0) this.f42383g;
                TL_wallet.tonConnectSession tonconnectsession = this.f42380c;
                String str = this.d;
                byte[] bArr = this.f42381e;
                z1 z1Var = (z1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.f21336e.c(new bi.n8(e2Var, j0Var, tonconnectsession, str, bArr, z1Var, tonconnectchallenge, tVar, 7));
                    return;
                } else {
                    tVar.a(e2.z(tL_error, "registerKey"));
                    return;
                }
            default:
                bi.p5 p5Var = (bi.p5) this.f42382f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.f42380c;
                String str2 = this.d;
                byte[] bArr2 = this.f42381e;
                JSONArray jSONArray = (JSONArray) this.f42383g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                j0 j0Var2 = (j0) obj;
                String str3 = (String) obj2;
                e2Var.getClass();
                if (str3 == null && j0Var2 != null) {
                    j0 b10 = j0Var2.b();
                    Utilities.f21336e.c(new bi.n8(e2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new u1(1, b10, p5Var), 8));
                    return;
                }
                if (str3 == null) {
                    str3 = "Recovery phrase is unavailable";
                }
                p5Var.a(null, str3);
                return;
        }
    }

    public d1(e2 e2Var, t tVar, j0 j0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, z1 z1Var) {
        this.f42379b = e2Var;
        this.f42382f = tVar;
        this.f42383g = j0Var;
        this.f42380c = tonconnectsession;
        this.d = str;
        this.f42381e = bArr;
        this.h = z1Var;
    }
}
