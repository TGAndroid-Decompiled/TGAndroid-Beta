package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.k20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.d01;
public final class d1 implements k20 {
    public final int f34368a = 1;
    public final e2 f34369b;
    public final TL_wallet.tonConnectSession f34370c;
    public final String d;
    public final byte[] e;
    public final Object f34371f;
    public final Object f34372g;
    public final Object h;

    public d1(e2 e2Var, ih.s sVar, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.f34369b = e2Var;
        this.f34371f = sVar;
        this.f34370c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.f34372g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10 = this.f34368a;
        e2 e2Var = this.f34369b;
        switch (i10) {
            case 0:
                d01 d01Var = (d01) this.f34371f;
                h0 h0Var = (h0) this.f34372g;
                TL_wallet.tonConnectSession tonconnectsession = this.f34370c;
                String str = this.d;
                byte[] bArr = this.e;
                z1 z1Var = (z1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.e.c(new bi.n(e2Var, h0Var, tonconnectsession, str, bArr, z1Var, tonconnectchallenge, d01Var, 7));
                    return;
                } else {
                    d01Var.a(e2.z(tL_error, "registerKey"));
                    return;
                }
            default:
                ih.s sVar = (ih.s) this.f34371f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.f34370c;
                String str2 = this.d;
                byte[] bArr2 = this.e;
                JSONArray jSONArray = (JSONArray) this.f34372g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                h0 h0Var2 = (h0) obj;
                String str3 = (String) obj2;
                e2Var.getClass();
                if (str3 == null && h0Var2 != null) {
                    h0 b10 = h0Var2.b();
                    Utilities.e.c(new bi.n(e2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new ih.s(25, b10, sVar), 8));
                    return;
                }
                if (str3 == null) {
                    str3 = "Recovery phrase is unavailable";
                }
                sVar.a(null, str3);
                return;
        }
    }

    public d1(e2 e2Var, d01 d01Var, h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, z1 z1Var) {
        this.f34369b = e2Var;
        this.f34371f = d01Var;
        this.f34372g = h0Var;
        this.f34370c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.h = z1Var;
    }
}
