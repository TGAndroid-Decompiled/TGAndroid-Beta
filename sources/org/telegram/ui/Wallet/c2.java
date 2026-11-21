package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.p51;
public final class c2 implements q10 {
    public final int f44020a = 0;
    public final boolean f44021b;
    public final byte[] f44022c;
    public final Object d;
    public final Object f44023e;
    public final Object f44024f;
    public final Object f44025g;

    public c2(l2 l2Var, byte[] bArr, h2 h2Var, p51 p51Var, boolean z10, r0 r0Var) {
        this.d = l2Var;
        this.f44022c = bArr;
        this.f44023e = h2Var;
        this.f44024f = p51Var;
        this.f44021b = z10;
        this.f44025g = r0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        String str;
        String str2;
        switch (this.f44020a) {
            case 0:
                l2 l2Var = (l2) this.d;
                byte[] bArr = this.f44022c;
                h2 h2Var = (h2) this.f44023e;
                p51 p51Var = (p51) this.f44024f;
                boolean z10 = this.f44021b;
                r0 r0Var = (r0) this.f44025g;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    h2Var.f44341o = true;
                    if (!z10 && h2Var.f44338l < 0) {
                        if ("disconnect".equals(h2Var.f44332e)) {
                            l2Var.y(h2Var, r0Var, new JSONObject(), -1, null, p51Var);
                            return;
                        } else if ("signData".equals(h2Var.f44332e)) {
                            if (l2Var.A(h2Var) && !l2Var.j(h2Var)) {
                                Utilities.f22807e.c(new v7(l2Var, r0Var, h2Var, p51Var, 8));
                                return;
                            } else {
                                l2Var.y(h2Var, r0Var, null, 0, "Request expired or wallet changed", p51Var);
                                return;
                            }
                        } else if ("signMessage".equals(h2Var.f44332e)) {
                            WalletEngine2 walletEngine2 = l2Var.f44520b.f45124b;
                            if (walletEngine2 != null && l2Var.A(h2Var) && !l2Var.j(h2Var)) {
                                k2 k2Var = h2Var.f44333f;
                                walletEngine2.signMessage(r0Var, k2Var, "ton-connect:" + h2Var.f44329a.f28693id + ":" + h2Var.f44330b, new s(l2Var, h2Var, r0Var, p51Var, 8));
                                return;
                            }
                            l2Var.y(h2Var, r0Var, null, 0, "Wallet unavailable or request expired", p51Var);
                            return;
                        } else {
                            l2Var.B(h2Var, r0Var, p51Var);
                            return;
                        }
                    }
                    if (z10) {
                        i7 = 300;
                    } else {
                        i7 = h2Var.f44338l;
                    }
                    int i10 = i7;
                    if (z10) {
                        str = "User declined the request";
                    } else {
                        str = h2Var.f44336j;
                    }
                    l2Var.y(h2Var, r0Var, null, i10, str, p51Var);
                    return;
                }
                if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                    h2Var.f44340n = true;
                }
                p51Var.a(l2.z(tL_error, "claimRequest"));
                return;
            default:
                boolean z11 = this.f44021b;
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) this.d;
                TLRPC.WidgetQueryType widgetQueryType = (TLRPC.WidgetQueryType) this.f44023e;
                byte[] bArr2 = this.f44022c;
                int[] iArr = (int[]) this.f44024f;
                ai.e eVar = (ai.e) this.f44025g;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!z11 && tL_error2 != null && (str2 = tL_error2.text) != null && (str2.startsWith("INPUT_METHOD_INVALID") || tL_error2.text.startsWith("INPUT_CONSTRUCTOR_INVALID"))) {
                    org.telegram.utils.twidget.n0.f54895k[k0Var.f54842b] = true;
                    org.telegram.utils.twidget.n0.y(k0Var, widgetQueryType, bArr2, iArr, eVar);
                    return;
                }
                eVar.a(tL_messages_botWidgetQueryAnswer, tL_error2);
                return;
        }
    }

    public c2(boolean z10, org.telegram.utils.twidget.k0 k0Var, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, ai.e eVar) {
        this.f44021b = z10;
        this.d = k0Var;
        this.f44023e = widgetQueryType;
        this.f44022c = bArr;
        this.f44024f = iArr;
        this.f44025g = eVar;
    }
}
