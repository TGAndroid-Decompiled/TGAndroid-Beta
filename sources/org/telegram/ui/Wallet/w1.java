package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
public final class w1 implements v10 {
    public final int f43254a = 0;
    public final boolean f43255b;
    public final byte[] f43256c;
    public final Object d;
    public final Object f43257e;
    public final Object f43258f;
    public final Object f43259g;

    public w1(f2 f2Var, byte[] bArr, b2 b2Var, t tVar, boolean z9, k0 k0Var) {
        this.d = f2Var;
        this.f43256c = bArr;
        this.f43257e = b2Var;
        this.f43258f = tVar;
        this.f43255b = z9;
        this.f43259g = k0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        String str;
        String str2;
        switch (this.f43254a) {
            case 0:
                f2 f2Var = (f2) this.d;
                byte[] bArr = this.f43256c;
                b2 b2Var = (b2) this.f43257e;
                t tVar = (t) this.f43258f;
                boolean z9 = this.f43255b;
                k0 k0Var = (k0) this.f43259g;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    b2Var.f42134o = true;
                    if (!z9 && b2Var.f42131l < 0) {
                        if ("disconnect".equals(b2Var.f42125e)) {
                            f2Var.y(b2Var, k0Var, new JSONObject(), -1, null, tVar);
                            return;
                        } else if ("signData".equals(b2Var.f42125e)) {
                            if (f2Var.A(b2Var) && !f2Var.j(b2Var)) {
                                Utilities.f21333e.c(new g7(f2Var, k0Var, b2Var, tVar, 9));
                                return;
                            } else {
                                f2Var.y(b2Var, k0Var, null, 0, "Request expired or wallet changed", tVar);
                                return;
                            }
                        } else if ("signMessage".equals(b2Var.f42125e)) {
                            WalletEngine2 walletEngine2 = f2Var.f42461b.f42794b;
                            if (walletEngine2 != null && f2Var.A(b2Var) && !f2Var.j(b2Var)) {
                                e2 e2Var = b2Var.f42126f;
                                walletEngine2.signMessage(k0Var, e2Var, "ton-connect:" + b2Var.f42122a.f27214id + ":" + b2Var.f42123b, new r(f2Var, b2Var, k0Var, tVar, 8));
                                return;
                            }
                            f2Var.y(b2Var, k0Var, null, 0, "Wallet unavailable or request expired", tVar);
                            return;
                        } else {
                            f2Var.B(b2Var, k0Var, tVar);
                            return;
                        }
                    }
                    if (z9) {
                        i7 = 300;
                    } else {
                        i7 = b2Var.f42131l;
                    }
                    int i10 = i7;
                    if (z9) {
                        str = "User declined the request";
                    } else {
                        str = b2Var.f42129j;
                    }
                    f2Var.y(b2Var, k0Var, null, i10, str, tVar);
                    return;
                }
                if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                    b2Var.f42133n = true;
                }
                tVar.a(f2.z(tL_error, "claimRequest"));
                return;
            default:
                boolean z10 = this.f43255b;
                org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) this.d;
                TLRPC.WidgetQueryType widgetQueryType = (TLRPC.WidgetQueryType) this.f43257e;
                byte[] bArr2 = this.f43256c;
                int[] iArr = (int[]) this.f43258f;
                org.telegram.utils.twidget.i iVar = (org.telegram.utils.twidget.i) this.f43259g;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!z10 && tL_error2 != null && (str2 = tL_error2.text) != null && (str2.startsWith("INPUT_METHOD_INVALID") || tL_error2.text.startsWith("INPUT_CONSTRUCTOR_INVALID"))) {
                    org.telegram.utils.twidget.p.f52884k[mVar.f52846b] = true;
                    org.telegram.utils.twidget.p.w(mVar, widgetQueryType, bArr2, iArr, iVar);
                    return;
                }
                iVar.a(tL_messages_botWidgetQueryAnswer, tL_error2);
                return;
        }
    }

    public w1(boolean z9, org.telegram.utils.twidget.m mVar, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, org.telegram.utils.twidget.i iVar) {
        this.f43255b = z9;
        this.d = mVar;
        this.f43257e = widgetQueryType;
        this.f43256c = bArr;
        this.f43258f = iArr;
        this.f43259g = iVar;
    }
}
