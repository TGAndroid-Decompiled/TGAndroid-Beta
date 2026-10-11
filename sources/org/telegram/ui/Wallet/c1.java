package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.et;
public final class c1 implements Utilities.Callback2 {
    public final int f34760a = 1;
    public final f2 f34761b;
    public final TL_wallet.tonConnectSession f34762c;
    public final String d;
    public final byte[] f34763e;
    public final Object f34764f;
    public final Object f34765g;
    public final Object h;

    public c1(f2 f2Var, ai.m0 m0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.f34761b = f2Var;
        this.f34764f = m0Var;
        this.f34762c = tonconnectsession;
        this.d = str;
        this.f34763e = bArr;
        this.f34765g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f34760a;
        f2 f2Var = this.f34761b;
        switch (i10) {
            case 0:
                et etVar = (et) this.f34764f;
                i0 i0Var = (i0) this.f34765g;
                TL_wallet.tonConnectSession tonconnectsession = this.f34762c;
                String str = this.d;
                byte[] bArr = this.f34763e;
                a2 a2Var = (a2) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.globalQueue.postRunnable(new ii.k(f2Var, i0Var, tonconnectsession, str, bArr, a2Var, tonconnectchallenge, etVar, 4));
                    return;
                } else {
                    etVar.run(f2.x(tL_error, "registerKey"));
                    return;
                }
            default:
                ai.m0 m0Var = (ai.m0) this.f34764f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.f34762c;
                String str2 = this.d;
                byte[] bArr2 = this.f34763e;
                JSONArray jSONArray = (JSONArray) this.f34765g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                i0 i0Var2 = (i0) obj;
                String str3 = (String) obj2;
                f2Var.getClass();
                if (str3 == null && i0Var2 != null) {
                    i0 b10 = i0Var2.b();
                    Utilities.globalQueue.postRunnable(new ii.k(f2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new ai.m0(26, b10, m0Var), 5));
                    return;
                }
                if (str3 == null) {
                    str3 = "Recovery phrase is unavailable";
                }
                m0Var.run(null, str3);
                return;
        }
    }

    public c1(f2 f2Var, et etVar, i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, a2 a2Var) {
        this.f34761b = f2Var;
        this.f34764f = etVar;
        this.f34765g = i0Var;
        this.f34762c = tonconnectsession;
        this.d = str;
        this.f34763e = bArr;
        this.h = a2Var;
    }
}
