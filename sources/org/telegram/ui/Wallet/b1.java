package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ft;
public final class b1 implements Utilities.Callback2 {
    public final int f34695a = 1;
    public final e2 f34696b;
    public final TL_wallet.tonConnectSession f34697c;
    public final String d;
    public final byte[] f34698e;
    public final Object f34699f;
    public final Object f34700g;
    public final Object h;

    public b1(e2 e2Var, ai.m0 m0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.f34696b = e2Var;
        this.f34699f = m0Var;
        this.f34697c = tonconnectsession;
        this.d = str;
        this.f34698e = bArr;
        this.f34700g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f34695a;
        e2 e2Var = this.f34696b;
        switch (i10) {
            case 0:
                ft ftVar = (ft) this.f34699f;
                h0 h0Var = (h0) this.f34700g;
                TL_wallet.tonConnectSession tonconnectsession = this.f34697c;
                String str = this.d;
                byte[] bArr = this.f34698e;
                z1 z1Var = (z1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.globalQueue.postRunnable(new ii.k(e2Var, h0Var, tonconnectsession, str, bArr, z1Var, tonconnectchallenge, ftVar, 4));
                    return;
                } else {
                    ftVar.run(e2.x(tL_error, "registerKey"));
                    return;
                }
            default:
                ai.m0 m0Var = (ai.m0) this.f34699f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.f34697c;
                String str2 = this.d;
                byte[] bArr2 = this.f34698e;
                JSONArray jSONArray = (JSONArray) this.f34700g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                h0 h0Var2 = (h0) obj;
                String str3 = (String) obj2;
                e2Var.getClass();
                if (str3 == null && h0Var2 != null) {
                    h0 b10 = h0Var2.b();
                    Utilities.globalQueue.postRunnable(new ii.k(e2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new ai.m0(26, b10, m0Var), 5));
                    return;
                }
                if (str3 == null) {
                    str3 = "Recovery phrase is unavailable";
                }
                m0Var.run(null, str3);
                return;
        }
    }

    public b1(e2 e2Var, ft ftVar, h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, z1 z1Var) {
        this.f34696b = e2Var;
        this.f34699f = ftVar;
        this.f34700g = h0Var;
        this.f34697c = tonconnectsession;
        this.d = str;
        this.f34698e = bArr;
        this.h = z1Var;
    }
}
