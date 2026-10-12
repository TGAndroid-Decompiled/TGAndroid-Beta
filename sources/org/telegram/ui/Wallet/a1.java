package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.mt;
public final class a1 implements Utilities.Callback2 {
    public final int f32913a = 1;
    public final d2 f32914b;
    public final TL_wallet.tonConnectSession f32915c;
    public final String d;
    public final byte[] e;
    public final Object f32916f;
    public final Object f32917g;
    public final Object h;

    public a1(d2 d2Var, bi.f0 f0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.f32914b = d2Var;
        this.f32916f = f0Var;
        this.f32915c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.f32917g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f32913a;
        d2 d2Var = this.f32914b;
        switch (i10) {
            case 0:
                mt mtVar = (mt) this.f32916f;
                g0 g0Var = (g0) this.f32917g;
                TL_wallet.tonConnectSession tonconnectsession = this.f32915c;
                String str = this.d;
                byte[] bArr = this.e;
                y1 y1Var = (y1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                d2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.globalQueue.postRunnable(new ji.k(d2Var, g0Var, tonconnectsession, str, bArr, y1Var, tonconnectchallenge, mtVar, 4));
                    return;
                } else {
                    mtVar.run(d2.x(tL_error, "registerKey"));
                    return;
                }
            default:
                bi.f0 f0Var = (bi.f0) this.f32916f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.f32915c;
                String str2 = this.d;
                byte[] bArr2 = this.e;
                JSONArray jSONArray = (JSONArray) this.f32917g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                g0 g0Var2 = (g0) obj;
                String str3 = (String) obj2;
                d2Var.getClass();
                if (str3 == null && g0Var2 != null) {
                    g0 b10 = g0Var2.b();
                    Utilities.globalQueue.postRunnable(new ji.k(d2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new bi.f0(26, b10, f0Var), 5));
                    return;
                }
                if (str3 == null) {
                    str3 = "Recovery phrase is unavailable";
                }
                f0Var.run(null, str3);
                return;
        }
    }

    public a1(d2 d2Var, mt mtVar, g0 g0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, y1 y1Var) {
        this.f32914b = d2Var;
        this.f32916f = mtVar;
        this.f32917g = g0Var;
        this.f32915c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.h = y1Var;
    }
}
