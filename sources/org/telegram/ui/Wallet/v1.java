package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.f11;
public final class v1 implements j20 {
    public final int f35297a = 0;
    public final boolean f35298b;
    public final byte[] f35299c;
    public final Object d;
    public final Object e;
    public final Object f35300f;
    public final Object f35301g;

    public v1(e2 e2Var, byte[] bArr, a2 a2Var, f11 f11Var, boolean z10, h0 h0Var) {
        this.d = e2Var;
        this.f35299c = bArr;
        this.e = a2Var;
        this.f35300f = f11Var;
        this.f35298b = z10;
        this.f35301g = h0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10;
        String str;
        String str2;
        switch (this.f35297a) {
            case 0:
                e2 e2Var = (e2) this.d;
                byte[] bArr = this.f35299c;
                a2 a2Var = (a2) this.e;
                f11 f11Var = (f11) this.f35300f;
                boolean z10 = this.f35298b;
                h0 h0Var = (h0) this.f35301g;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    a2Var.f34173o = true;
                    if (!z10 && a2Var.f34170l < 0) {
                        if ("disconnect".equals(a2Var.e)) {
                            e2Var.y(a2Var, h0Var, new JSONObject(), -1, null, f11Var);
                            return;
                        } else if ("signData".equals(a2Var.e)) {
                            if (e2Var.A(a2Var) && !e2Var.j(a2Var)) {
                                Utilities.e.c(new k7(e2Var, h0Var, a2Var, f11Var, 9));
                                return;
                            } else {
                                e2Var.y(a2Var, h0Var, null, 0, "Request expired or wallet changed", f11Var);
                                return;
                            }
                        } else if ("signMessage".equals(a2Var.e)) {
                            WalletEngine2 walletEngine2 = e2Var.f34446b.f34777b;
                            if (walletEngine2 != null && e2Var.A(a2Var) && !e2Var.j(a2Var)) {
                                d2 d2Var = a2Var.f34165f;
                                walletEngine2.signMessage(h0Var, d2Var, "ton-connect:" + a2Var.f34162a.f20055id + ":" + a2Var.f34163b, new q(e2Var, a2Var, h0Var, f11Var, 8));
                                return;
                            }
                            e2Var.y(a2Var, h0Var, null, 0, "Wallet unavailable or request expired", f11Var);
                            return;
                        } else {
                            e2Var.B(a2Var, h0Var, f11Var);
                            return;
                        }
                    }
                    if (z10) {
                        i10 = 300;
                    } else {
                        i10 = a2Var.f34170l;
                    }
                    int i11 = i10;
                    if (z10) {
                        str = "User declined the request";
                    } else {
                        str = a2Var.f34168j;
                    }
                    e2Var.y(a2Var, h0Var, null, i11, str, f11Var);
                    return;
                }
                if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                    a2Var.f34172n = true;
                }
                f11Var.a(e2.z(tL_error, "claimRequest"));
                return;
            default:
                boolean z11 = this.f35298b;
                org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) this.d;
                TLRPC.WidgetQueryType widgetQueryType = (TLRPC.WidgetQueryType) this.e;
                byte[] bArr2 = this.f35299c;
                int[] iArr = (int[]) this.f35300f;
                org.telegram.utils.twidget.i iVar = (org.telegram.utils.twidget.i) this.f35301g;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!z11 && tL_error2 != null && (str2 = tL_error2.text) != null && (str2.startsWith("INPUT_METHOD_INVALID") || tL_error2.text.startsWith("INPUT_CONSTRUCTOR_INVALID"))) {
                    org.telegram.utils.twidget.p.f44437k[mVar.f44396b] = true;
                    org.telegram.utils.twidget.p.w(mVar, widgetQueryType, bArr2, iArr, iVar);
                    return;
                }
                iVar.a(tL_messages_botWidgetQueryAnswer, tL_error2);
                return;
        }
    }

    public v1(boolean z10, org.telegram.utils.twidget.m mVar, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, org.telegram.utils.twidget.i iVar) {
        this.f35298b = z10;
        this.d = mVar;
        this.e = widgetQueryType;
        this.f35299c = bArr;
        this.f35300f = iArr;
        this.f35301g = iVar;
    }
}
