package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
public final class u1 implements v10 {
    public final int f43209a = 0;
    public final boolean f43210b;
    public final byte[] f43211c;
    public final Object d;
    public final Object f43212e;
    public final Object f43213f;
    public final Object f43214g;

    public u1(d2 d2Var, byte[] bArr, z1 z1Var, s sVar, boolean z9, i0 i0Var) {
        this.d = d2Var;
        this.f43211c = bArr;
        this.f43212e = z1Var;
        this.f43213f = sVar;
        this.f43210b = z9;
        this.f43214g = i0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        String str;
        String str2;
        switch (this.f43209a) {
            case 0:
                d2 d2Var = (d2) this.d;
                byte[] bArr = this.f43211c;
                z1 z1Var = (z1) this.f43212e;
                s sVar = (s) this.f43213f;
                boolean z9 = this.f43210b;
                i0 i0Var = (i0) this.f43214g;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    z1Var.f43424o = true;
                    if (!z9 && z1Var.f43421l < 0) {
                        if ("disconnect".equals(z1Var.f43415e)) {
                            d2Var.y(z1Var, i0Var, new JSONObject(), -1, null, sVar);
                            return;
                        } else if ("signData".equals(z1Var.f43415e)) {
                            if (d2Var.A(z1Var) && !d2Var.j(z1Var)) {
                                Utilities.f21341e.c(new h7(d2Var, i0Var, z1Var, sVar, 9));
                                return;
                            } else {
                                d2Var.y(z1Var, i0Var, null, 0, "Request expired or wallet changed", sVar);
                                return;
                            }
                        } else if ("signMessage".equals(z1Var.f43415e)) {
                            WalletEngine2 walletEngine2 = d2Var.f42287b.f42750b;
                            if (walletEngine2 != null && d2Var.A(z1Var) && !d2Var.j(z1Var)) {
                                c2 c2Var = z1Var.f43416f;
                                walletEngine2.signMessage(i0Var, c2Var, "ton-connect:" + z1Var.f43412a.f27222id + ":" + z1Var.f43413b, new q(d2Var, z1Var, i0Var, sVar, 8));
                                return;
                            }
                            d2Var.y(z1Var, i0Var, null, 0, "Wallet unavailable or request expired", sVar);
                            return;
                        } else {
                            d2Var.B(z1Var, i0Var, sVar);
                            return;
                        }
                    }
                    if (z9) {
                        i7 = 300;
                    } else {
                        i7 = z1Var.f43421l;
                    }
                    int i10 = i7;
                    if (z9) {
                        str = "User declined the request";
                    } else {
                        str = z1Var.f43419j;
                    }
                    d2Var.y(z1Var, i0Var, null, i10, str, sVar);
                    return;
                }
                if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                    z1Var.f43423n = true;
                }
                sVar.a(d2.z(tL_error, "claimRequest"));
                return;
            default:
                boolean z10 = this.f43210b;
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) this.d;
                TLRPC.WidgetQueryType widgetQueryType = (TLRPC.WidgetQueryType) this.f43212e;
                byte[] bArr2 = this.f43211c;
                int[] iArr = (int[]) this.f43213f;
                org.telegram.utils.twidget.g0 g0Var = (org.telegram.utils.twidget.g0) this.f43214g;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!z10 && tL_error2 != null && (str2 = tL_error2.text) != null && (str2.startsWith("INPUT_METHOD_INVALID") || tL_error2.text.startsWith("INPUT_CONSTRUCTOR_INVALID"))) {
                    org.telegram.utils.twidget.n0.f52936k[k0Var.f52878b] = true;
                    org.telegram.utils.twidget.n0.y(k0Var, widgetQueryType, bArr2, iArr, g0Var);
                    return;
                }
                g0Var.a(tL_messages_botWidgetQueryAnswer, tL_error2);
                return;
        }
    }

    public u1(boolean z9, org.telegram.utils.twidget.k0 k0Var, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, org.telegram.utils.twidget.g0 g0Var) {
        this.f43210b = z9;
        this.d = k0Var;
        this.f43212e = widgetQueryType;
        this.f43211c = bArr;
        this.f43213f = iArr;
        this.f43214g = g0Var;
    }
}
