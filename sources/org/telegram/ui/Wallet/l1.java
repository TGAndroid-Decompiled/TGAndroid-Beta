package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.p51;
public final class l1 implements r10 {
    public final int f44483a = 1;
    public final l2 f44484b;
    public final TL_wallet.tonConnectSession f44485c;
    public final String d;
    public final byte[] f44486e;
    public final Object f44487f;
    public final Object f44488g;
    public final Object h;

    public l1(l2 l2Var, p51 p51Var, r0 r0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, g2 g2Var) {
        this.f44484b = l2Var;
        this.f44487f = p51Var;
        this.f44488g = r0Var;
        this.f44485c = tonconnectsession;
        this.d = str;
        this.f44486e = bArr;
        this.h = g2Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f44483a;
        l2 l2Var = this.f44484b;
        switch (i7) {
            case 0:
                p51 p51Var = (p51) this.f44487f;
                r0 r0Var = (r0) this.f44488g;
                TL_wallet.tonConnectSession tonconnectsession = this.f44485c;
                String str = this.d;
                byte[] bArr = this.f44486e;
                g2 g2Var = (g2) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                l2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.f22774e.c(new di.j7(l2Var, r0Var, tonconnectsession, str, bArr, g2Var, tonconnectchallenge, p51Var, 7));
                    return;
                } else {
                    p51Var.a(l2.z(tL_error, "registerKey"));
                    return;
                }
            default:
                e0 e0Var = (e0) this.f44487f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.f44485c;
                String str2 = this.d;
                byte[] bArr2 = this.f44486e;
                JSONArray jSONArray = (JSONArray) this.f44488g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                r0 r0Var2 = (r0) obj;
                String str3 = (String) obj2;
                l2Var.getClass();
                if (str3 == null && r0Var2 != null) {
                    r0 b10 = r0Var2.b();
                    Utilities.f22774e.c(new di.j7(l2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new e0(5, b10, e0Var), 8));
                    return;
                }
                if (str3 == null) {
                    str3 = "Recovery phrase is unavailable";
                }
                e0Var.a(null, str3);
                return;
        }
    }

    public l1(l2 l2Var, e0 e0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.f44484b = l2Var;
        this.f44487f = e0Var;
        this.f44485c = tonconnectsession;
        this.d = str;
        this.f44486e = bArr;
        this.f44488g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }
}
