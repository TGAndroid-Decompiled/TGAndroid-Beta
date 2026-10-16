package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.mt;
public final class b1 implements Utilities.Callback2 {
    public final int f32685a = 1;
    public final e2 f32686b;
    public final TL_wallet.tonConnectSession f32687c;
    public final String d;
    public final byte[] e;
    public final Object f32688f;
    public final Object f32689g;
    public final Object h;

    public b1(e2 e2Var, bi.f0 f0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.f32686b = e2Var;
        this.f32688f = f0Var;
        this.f32687c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.f32689g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f32685a;
        e2 e2Var = this.f32686b;
        switch (i10) {
            case 0:
                mt mtVar = (mt) this.f32688f;
                h0 h0Var = (h0) this.f32689g;
                TL_wallet.tonConnectSession tonconnectsession = this.f32687c;
                String str = this.d;
                byte[] bArr = this.e;
                z1 z1Var = (z1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.globalQueue.postRunnable(new ji.k(e2Var, h0Var, tonconnectsession, str, bArr, z1Var, tonconnectchallenge, mtVar, 4));
                    return;
                } else {
                    mtVar.run(e2.x(tL_error, "registerKey"));
                    return;
                }
            default:
                bi.f0 f0Var = (bi.f0) this.f32688f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.f32687c;
                String str2 = this.d;
                byte[] bArr2 = this.e;
                JSONArray jSONArray = (JSONArray) this.f32689g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                h0 h0Var2 = (h0) obj;
                String str3 = (String) obj2;
                e2Var.getClass();
                if (str3 == null && h0Var2 != null) {
                    h0 b10 = h0Var2.b();
                    Utilities.globalQueue.postRunnable(new ji.k(e2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new bi.f0(26, b10, f0Var), 5));
                    return;
                }
                if (str3 == null) {
                    str3 = "Recovery phrase is unavailable";
                }
                f0Var.run(null, str3);
                return;
        }
    }

    public b1(e2 e2Var, mt mtVar, h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, z1 z1Var) {
        this.f32686b = e2Var;
        this.f32688f = mtVar;
        this.f32689g = h0Var;
        this.f32687c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.h = z1Var;
    }
}
