package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.x21;
public final class c1 implements s10 {
    public final int f43552a = 1;
    public final d2 f43553b;
    public final TL_wallet.tonConnectSession f43554c;
    public final String d;
    public final byte[] f43555e;
    public final Object f43556f;
    public final Object f43557g;
    public final Object h;

    public c1(d2 d2Var, x21 x21Var, i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, y1 y1Var) {
        this.f43553b = d2Var;
        this.f43556f = x21Var;
        this.f43557g = i0Var;
        this.f43554c = tonconnectsession;
        this.d = str;
        this.f43555e = bArr;
        this.h = y1Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f43552a;
        d2 d2Var = this.f43553b;
        switch (i7) {
            case 0:
                x21 x21Var = (x21) this.f43556f;
                i0 i0Var = (i0) this.f43557g;
                TL_wallet.tonConnectSession tonconnectsession = this.f43554c;
                String str = this.d;
                byte[] bArr = this.f43555e;
                y1 y1Var = (y1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                d2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.f22416e.c(new di.g7(d2Var, i0Var, tonconnectsession, str, bArr, y1Var, tonconnectchallenge, x21Var, 7));
                    return;
                } else {
                    x21Var.a(d2.z(tL_error, "registerKey"));
                    return;
                }
            default:
                t1 t1Var = (t1) this.f43556f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.f43554c;
                String str2 = this.d;
                byte[] bArr2 = this.f43555e;
                JSONArray jSONArray = (JSONArray) this.f43557g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                i0 i0Var2 = (i0) obj;
                String str3 = (String) obj2;
                d2Var.getClass();
                if (str3 == null && i0Var2 != null) {
                    i0 b10 = i0Var2.b();
                    Utilities.f22416e.c(new di.g7(d2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new t1(2, b10, t1Var), 8));
                    return;
                }
                if (str3 == null) {
                    str3 = "Recovery phrase is unavailable";
                }
                t1Var.a(null, str3);
                return;
        }
    }

    public c1(d2 d2Var, t1 t1Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.f43553b = d2Var;
        this.f43556f = t1Var;
        this.f43554c = tonconnectsession;
        this.d = str;
        this.f43555e = bArr;
        this.f43557g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }
}
