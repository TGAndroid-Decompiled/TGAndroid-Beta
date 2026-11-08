package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
public final class v1 implements v10 {
    public final int f43224a = 0;
    public final boolean f43225b;
    public final byte[] f43226c;
    public final Object d;
    public final Object f43227e;
    public final Object f43228f;
    public final Object f43229g;

    public v1(e2 e2Var, byte[] bArr, a2 a2Var, t tVar, boolean z9, j0 j0Var) {
        this.d = e2Var;
        this.f43226c = bArr;
        this.f43227e = a2Var;
        this.f43228f = tVar;
        this.f43225b = z9;
        this.f43229g = j0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        String str;
        String str2;
        switch (this.f43224a) {
            case 0:
                e2 e2Var = (e2) this.d;
                byte[] bArr = this.f43226c;
                a2 a2Var = (a2) this.f43227e;
                t tVar = (t) this.f43228f;
                boolean z9 = this.f43225b;
                j0 j0Var = (j0) this.f43229g;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    a2Var.f42105o = true;
                    if (!z9 && a2Var.f42102l < 0) {
                        if ("disconnect".equals(a2Var.f42096e)) {
                            e2Var.y(a2Var, j0Var, new JSONObject(), -1, null, tVar);
                            return;
                        } else if ("signData".equals(a2Var.f42096e)) {
                            if (e2Var.A(a2Var) && !e2Var.j(a2Var)) {
                                Utilities.f21336e.c(new f7(e2Var, j0Var, a2Var, tVar, 9));
                                return;
                            } else {
                                e2Var.y(a2Var, j0Var, null, 0, "Request expired or wallet changed", tVar);
                                return;
                            }
                        } else if ("signMessage".equals(a2Var.f42096e)) {
                            WalletEngine2 walletEngine2 = e2Var.f42428b.f42763b;
                            if (walletEngine2 != null && e2Var.A(a2Var) && !e2Var.j(a2Var)) {
                                d2 d2Var = a2Var.f42097f;
                                walletEngine2.signMessage(j0Var, d2Var, "ton-connect:" + a2Var.f42093a.f27218id + ":" + a2Var.f42094b, new r(e2Var, a2Var, j0Var, tVar, 8));
                                return;
                            }
                            e2Var.y(a2Var, j0Var, null, 0, "Wallet unavailable or request expired", tVar);
                            return;
                        } else {
                            e2Var.B(a2Var, j0Var, tVar);
                            return;
                        }
                    }
                    if (z9) {
                        i7 = 300;
                    } else {
                        i7 = a2Var.f42102l;
                    }
                    int i10 = i7;
                    if (z9) {
                        str = "User declined the request";
                    } else {
                        str = a2Var.f42100j;
                    }
                    e2Var.y(a2Var, j0Var, null, i10, str, tVar);
                    return;
                }
                if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                    a2Var.f42104n = true;
                }
                tVar.a(e2.z(tL_error, "claimRequest"));
                return;
            default:
                boolean z10 = this.f43225b;
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) this.d;
                TLRPC.WidgetQueryType widgetQueryType = (TLRPC.WidgetQueryType) this.f43227e;
                byte[] bArr2 = this.f43226c;
                int[] iArr = (int[]) this.f43228f;
                org.telegram.utils.twidget.g0 g0Var = (org.telegram.utils.twidget.g0) this.f43229g;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!z10 && tL_error2 != null && (str2 = tL_error2.text) != null && (str2.startsWith("INPUT_METHOD_INVALID") || tL_error2.text.startsWith("INPUT_CONSTRUCTOR_INVALID"))) {
                    org.telegram.utils.twidget.n0.f52924k[k0Var.f52868b] = true;
                    org.telegram.utils.twidget.n0.y(k0Var, widgetQueryType, bArr2, iArr, g0Var);
                    return;
                }
                g0Var.a(tL_messages_botWidgetQueryAnswer, tL_error2);
                return;
        }
    }

    public v1(boolean z9, org.telegram.utils.twidget.k0 k0Var, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, org.telegram.utils.twidget.g0 g0Var) {
        this.f43225b = z9;
        this.d = k0Var;
        this.f43227e = widgetQueryType;
        this.f43226c = bArr;
        this.f43228f = iArr;
        this.f43229g = g0Var;
    }
}
