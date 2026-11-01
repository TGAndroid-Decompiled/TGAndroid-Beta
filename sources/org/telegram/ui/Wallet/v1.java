package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.k20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.d01;
public final class v1 implements k20 {
    public final int f35303a = 0;
    public final boolean f35304b;
    public final byte[] f35305c;
    public final Object d;
    public final Object e;
    public final Object f35306f;
    public final Object f35307g;

    public v1(e2 e2Var, byte[] bArr, a2 a2Var, d01 d01Var, boolean z10, h0 h0Var) {
        this.d = e2Var;
        this.f35305c = bArr;
        this.e = a2Var;
        this.f35306f = d01Var;
        this.f35304b = z10;
        this.f35307g = h0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10;
        String str;
        String str2;
        switch (this.f35303a) {
            case 0:
                e2 e2Var = (e2) this.d;
                byte[] bArr = this.f35305c;
                a2 a2Var = (a2) this.e;
                d01 d01Var = (d01) this.f35306f;
                boolean z10 = this.f35304b;
                h0 h0Var = (h0) this.f35307g;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    a2Var.f34180o = true;
                    if (!z10 && a2Var.f34177l < 0) {
                        if ("disconnect".equals(a2Var.e)) {
                            e2Var.y(a2Var, h0Var, new JSONObject(), -1, null, d01Var);
                            return;
                        } else if ("signData".equals(a2Var.e)) {
                            if (e2Var.A(a2Var) && !e2Var.j(a2Var)) {
                                Utilities.e.c(new k7(e2Var, h0Var, a2Var, d01Var, 9));
                                return;
                            } else {
                                e2Var.y(a2Var, h0Var, null, 0, "Request expired or wallet changed", d01Var);
                                return;
                            }
                        } else if ("signMessage".equals(a2Var.e)) {
                            WalletEngine2 walletEngine2 = e2Var.f34451b.f34782b;
                            if (walletEngine2 != null && e2Var.A(a2Var) && !e2Var.j(a2Var)) {
                                d2 d2Var = a2Var.f34172f;
                                walletEngine2.signMessage(h0Var, d2Var, "ton-connect:" + a2Var.f34169a.f20056id + ":" + a2Var.f34170b, new q(e2Var, a2Var, h0Var, d01Var, 8));
                                return;
                            }
                            e2Var.y(a2Var, h0Var, null, 0, "Wallet unavailable or request expired", d01Var);
                            return;
                        } else {
                            e2Var.B(a2Var, h0Var, d01Var);
                            return;
                        }
                    }
                    if (z10) {
                        i10 = 300;
                    } else {
                        i10 = a2Var.f34177l;
                    }
                    int i11 = i10;
                    if (z10) {
                        str = "User declined the request";
                    } else {
                        str = a2Var.f34175j;
                    }
                    e2Var.y(a2Var, h0Var, null, i11, str, d01Var);
                    return;
                }
                if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                    a2Var.f34179n = true;
                }
                d01Var.a(e2.z(tL_error, "claimRequest"));
                return;
            default:
                boolean z11 = this.f35304b;
                org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) this.d;
                TLRPC.WidgetQueryType widgetQueryType = (TLRPC.WidgetQueryType) this.e;
                byte[] bArr2 = this.f35305c;
                int[] iArr = (int[]) this.f35306f;
                org.telegram.utils.twidget.i iVar = (org.telegram.utils.twidget.i) this.f35307g;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!z11 && tL_error2 != null && (str2 = tL_error2.text) != null && (str2.startsWith("INPUT_METHOD_INVALID") || tL_error2.text.startsWith("INPUT_CONSTRUCTOR_INVALID"))) {
                    org.telegram.utils.twidget.p.f44448k[mVar.f44407b] = true;
                    org.telegram.utils.twidget.p.w(mVar, widgetQueryType, bArr2, iArr, iVar);
                    return;
                }
                iVar.a(tL_messages_botWidgetQueryAnswer, tL_error2);
                return;
        }
    }

    public v1(boolean z10, org.telegram.utils.twidget.m mVar, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, org.telegram.utils.twidget.i iVar) {
        this.f35304b = z10;
        this.d = mVar;
        this.e = widgetQueryType;
        this.f35305c = bArr;
        this.f35306f = iArr;
        this.f35307g = iVar;
    }
}
