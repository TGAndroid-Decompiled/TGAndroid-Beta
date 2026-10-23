package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class c1 implements Utilities.Callback2 {
    public final int f34067a = 1;
    public final f2 f34068b;
    public final TL_wallet.tonConnectSession f34069c;
    public final String d;
    public final byte[] e;
    public final Object f34070f;
    public final Object f34071g;
    public final Object h;

    public c1(f2 f2Var, x xVar, j0 j0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, a2 a2Var) {
        this.f34068b = f2Var;
        this.f34070f = xVar;
        this.f34071g = j0Var;
        this.f34069c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.h = a2Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f34067a;
        f2 f2Var = this.f34068b;
        switch (i10) {
            case 0:
                x xVar = (x) this.f34070f;
                j0 j0Var = (j0) this.f34071g;
                TL_wallet.tonConnectSession tonconnectsession = this.f34069c;
                String str = this.d;
                byte[] bArr = this.e;
                a2 a2Var = (a2) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.globalQueue.postRunnable(new ai.m8(f2Var, j0Var, tonconnectsession, str, bArr, a2Var, tonconnectchallenge, xVar, 6));
                    return;
                } else {
                    xVar.run(f2.x(tL_error, "registerKey"));
                    return;
                }
            default:
                s1 s1Var = (s1) this.f34070f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.f34069c;
                String str2 = this.d;
                byte[] bArr2 = this.e;
                JSONArray jSONArray = (JSONArray) this.f34071g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                j0 j0Var2 = (j0) obj;
                String str3 = (String) obj2;
                f2Var.getClass();
                if (str3 == null && j0Var2 != null) {
                    j0 b10 = j0Var2.b();
                    Utilities.globalQueue.postRunnable(new ai.m8(f2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new s1(1, b10, s1Var), 7));
                    return;
                }
                if (str3 == null) {
                    str3 = "Recovery phrase is unavailable";
                }
                s1Var.run(null, str3);
                return;
        }
    }

    public c1(f2 f2Var, s1 s1Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.f34068b = f2Var;
        this.f34070f = s1Var;
        this.f34069c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.f34071g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }
}
