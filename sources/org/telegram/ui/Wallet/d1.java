package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.f11;
public final class d1 implements j20 {
    public final int f34367a = 1;
    public final e2 f34368b;
    public final TL_wallet.tonConnectSession f34369c;
    public final String d;
    public final byte[] e;
    public final Object f34370f;
    public final Object f34371g;
    public final Object h;

    public d1(e2 e2Var, ih.s sVar, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.f34368b = e2Var;
        this.f34370f = sVar;
        this.f34369c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.f34371g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10 = this.f34367a;
        e2 e2Var = this.f34368b;
        switch (i10) {
            case 0:
                f11 f11Var = (f11) this.f34370f;
                h0 h0Var = (h0) this.f34371g;
                TL_wallet.tonConnectSession tonconnectsession = this.f34369c;
                String str = this.d;
                byte[] bArr = this.e;
                z1 z1Var = (z1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.e.c(new bi.n(e2Var, h0Var, tonconnectsession, str, bArr, z1Var, tonconnectchallenge, f11Var, 7));
                    return;
                } else {
                    f11Var.a(e2.z(tL_error, "registerKey"));
                    return;
                }
            default:
                ih.s sVar = (ih.s) this.f34370f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.f34369c;
                String str2 = this.d;
                byte[] bArr2 = this.e;
                JSONArray jSONArray = (JSONArray) this.f34371g;
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

    public d1(e2 e2Var, f11 f11Var, h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, z1 z1Var) {
        this.f34368b = e2Var;
        this.f34370f = f11Var;
        this.f34371g = h0Var;
        this.f34369c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.h = z1Var;
    }
}
