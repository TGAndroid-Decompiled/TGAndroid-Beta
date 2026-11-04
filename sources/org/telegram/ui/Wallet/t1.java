package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.e51;
public final class t1 implements n10 {
    public final int f43191a = 0;
    public final boolean f43192b;
    public final byte[] f43193c;
    public final Object d;
    public final Object f43194e;
    public final Object f43195f;
    public final Object f43196g;

    public t1(c2 c2Var, byte[] bArr, y1 y1Var, e51 e51Var, boolean z10, h0 h0Var) {
        this.d = c2Var;
        this.f43193c = bArr;
        this.f43194e = y1Var;
        this.f43195f = e51Var;
        this.f43192b = z10;
        this.f43196g = h0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i3;
        String str;
        String str2;
        switch (this.f43191a) {
            case 0:
                c2 c2Var = (c2) this.d;
                byte[] bArr = this.f43193c;
                y1 y1Var = (y1) this.f43194e;
                e51 e51Var = (e51) this.f43195f;
                boolean z10 = this.f43192b;
                h0 h0Var = (h0) this.f43196g;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    y1Var.f43468o = true;
                    if (!z10 && y1Var.f43465l < 0) {
                        if ("disconnect".equals(y1Var.f43459e)) {
                            c2Var.y(y1Var, h0Var, new JSONObject(), -1, null, e51Var);
                            return;
                        } else if ("signData".equals(y1Var.f43459e)) {
                            if (c2Var.A(y1Var) && !c2Var.j(y1Var)) {
                                Utilities.f21387e.c(new e7(c2Var, h0Var, y1Var, e51Var, 9));
                                return;
                            } else {
                                c2Var.y(y1Var, h0Var, null, 0, "Request expired or wallet changed", e51Var);
                                return;
                            }
                        } else if ("signMessage".equals(y1Var.f43459e)) {
                            WalletEngine2 walletEngine2 = c2Var.f42378b.f42719b;
                            if (walletEngine2 != null && c2Var.A(y1Var) && !c2Var.j(y1Var)) {
                                b2 b2Var = y1Var.f43460f;
                                walletEngine2.signMessage(h0Var, b2Var, "ton-connect:" + y1Var.f43456a.f27264id + ":" + y1Var.f43457b, new q(c2Var, y1Var, h0Var, e51Var, 8));
                                return;
                            }
                            c2Var.y(y1Var, h0Var, null, 0, "Wallet unavailable or request expired", e51Var);
                            return;
                        } else {
                            c2Var.B(y1Var, h0Var, e51Var);
                            return;
                        }
                    }
                    if (z10) {
                        i3 = 300;
                    } else {
                        i3 = y1Var.f43465l;
                    }
                    int i10 = i3;
                    if (z10) {
                        str = "User declined the request";
                    } else {
                        str = y1Var.f43463j;
                    }
                    c2Var.y(y1Var, h0Var, null, i10, str, e51Var);
                    return;
                }
                if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                    y1Var.f43467n = true;
                }
                e51Var.a(c2.z(tL_error, "claimRequest"));
                return;
            default:
                boolean z11 = this.f43192b;
                org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) this.d;
                TLRPC.WidgetQueryType widgetQueryType = (TLRPC.WidgetQueryType) this.f43194e;
                byte[] bArr2 = this.f43193c;
                int[] iArr = (int[]) this.f43195f;
                org.telegram.utils.twidget.i iVar = (org.telegram.utils.twidget.i) this.f43196g;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!z11 && tL_error2 != null && (str2 = tL_error2.text) != null && (str2.startsWith("INPUT_METHOD_INVALID") || tL_error2.text.startsWith("INPUT_CONSTRUCTOR_INVALID"))) {
                    org.telegram.utils.twidget.p.f52949k[mVar.f52911b] = true;
                    org.telegram.utils.twidget.p.w(mVar, widgetQueryType, bArr2, iArr, iVar);
                    return;
                }
                iVar.a(tL_messages_botWidgetQueryAnswer, tL_error2);
                return;
        }
    }

    public t1(boolean z10, org.telegram.utils.twidget.m mVar, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, org.telegram.utils.twidget.i iVar) {
        this.f43192b = z10;
        this.d = mVar;
        this.f43194e = widgetQueryType;
        this.f43193c = bArr;
        this.f43195f = iArr;
        this.f43196g = iVar;
    }
}
