package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class b1 implements Utilities.Callback2 {
    public final int f36379a = 1;
    public final e2 f36380b;
    public final TL_wallet.tonConnectSession f36381c;
    public final String d;
    public final byte[] e;
    public final Object f36382f;
    public final Object f36383g;
    public final Object h;

    public b1(e2 e2Var, s sVar, i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, z1 z1Var) {
        this.f36380b = e2Var;
        this.f36382f = sVar;
        this.f36383g = i0Var;
        this.f36381c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.h = z1Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f36379a;
        e2 e2Var = this.f36380b;
        switch (i10) {
            case 0:
                s sVar = (s) this.f36382f;
                i0 i0Var = (i0) this.f36383g;
                TL_wallet.tonConnectSession tonconnectsession = this.f36381c;
                String str = this.d;
                byte[] bArr = this.e;
                z1 z1Var = (z1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.globalQueue.postRunnable(new bi.i8(e2Var, i0Var, tonconnectsession, str, bArr, z1Var, tonconnectchallenge, sVar, 6));
                    return;
                } else {
                    sVar.run(e2.x(tL_error, "registerKey"));
                    return;
                }
            default:
                r1 r1Var = (r1) this.f36382f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.f36381c;
                String str2 = this.d;
                byte[] bArr2 = this.e;
                JSONArray jSONArray = (JSONArray) this.f36383g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                i0 i0Var2 = (i0) obj;
                String str3 = (String) obj2;
                e2Var.getClass();
                if (str3 == null && i0Var2 != null) {
                    i0 b10 = i0Var2.b();
                    Utilities.globalQueue.postRunnable(new bi.i8(e2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new r1(1, b10, r1Var), 7));
                    return;
                }
                if (str3 == null) {
                    str3 = "Recovery phrase is unavailable";
                }
                r1Var.run(null, str3);
                return;
        }
    }

    public b1(e2 e2Var, r1 r1Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.f36380b = e2Var;
        this.f36382f = r1Var;
        this.f36381c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.f36383g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }
}
