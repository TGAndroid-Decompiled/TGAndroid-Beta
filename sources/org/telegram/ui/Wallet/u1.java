package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.x21;
public final class u1 implements s10 {
    public final int f44544a = 0;
    public final boolean f44545b;
    public final byte[] f44546c;
    public final Object d;
    public final Object f44547e;
    public final Object f44548f;
    public final Object f44549g;

    public u1(d2 d2Var, byte[] bArr, z1 z1Var, x21 x21Var, boolean z10, i0 i0Var) {
        this.d = d2Var;
        this.f44546c = bArr;
        this.f44547e = z1Var;
        this.f44548f = x21Var;
        this.f44545b = z10;
        this.f44549g = i0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        String str;
        String str2;
        switch (this.f44544a) {
            case 0:
                d2 d2Var = (d2) this.d;
                byte[] bArr = this.f44546c;
                z1 z1Var = (z1) this.f44547e;
                x21 x21Var = (x21) this.f44548f;
                boolean z10 = this.f44545b;
                i0 i0Var = (i0) this.f44549g;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    z1Var.f44788o = true;
                    if (!z10 && z1Var.f44785l < 0) {
                        if ("disconnect".equals(z1Var.f44779e)) {
                            d2Var.y(z1Var, i0Var, new JSONObject(), -1, null, x21Var);
                            return;
                        } else if ("signData".equals(z1Var.f44779e)) {
                            if (d2Var.A(z1Var) && !d2Var.j(z1Var)) {
                                Utilities.f22416e.c(new g7(d2Var, i0Var, z1Var, x21Var, 9));
                                return;
                            } else {
                                d2Var.y(z1Var, i0Var, null, 0, "Request expired or wallet changed", x21Var);
                                return;
                            }
                        } else if ("signMessage".equals(z1Var.f44779e)) {
                            WalletEngine2 walletEngine2 = d2Var.f43730b.f44079b;
                            if (walletEngine2 != null && d2Var.A(z1Var) && !d2Var.j(z1Var)) {
                                c2 c2Var = z1Var.f44780f;
                                walletEngine2.signMessage(i0Var, c2Var, "ton-connect:" + z1Var.f44776a.f28313id + ":" + z1Var.f44777b, new q(d2Var, z1Var, i0Var, x21Var, 8));
                                return;
                            }
                            d2Var.y(z1Var, i0Var, null, 0, "Wallet unavailable or request expired", x21Var);
                            return;
                        } else {
                            d2Var.B(z1Var, i0Var, x21Var);
                            return;
                        }
                    }
                    if (z10) {
                        i7 = 300;
                    } else {
                        i7 = z1Var.f44785l;
                    }
                    int i10 = i7;
                    if (z10) {
                        str = "User declined the request";
                    } else {
                        str = z1Var.f44783j;
                    }
                    d2Var.y(z1Var, i0Var, null, i10, str, x21Var);
                    return;
                }
                if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                    z1Var.f44787n = true;
                }
                x21Var.a(d2.z(tL_error, "claimRequest"));
                return;
            default:
                boolean z11 = this.f44545b;
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) this.d;
                TLRPC.WidgetQueryType widgetQueryType = (TLRPC.WidgetQueryType) this.f44547e;
                byte[] bArr2 = this.f44546c;
                int[] iArr = (int[]) this.f44548f;
                org.telegram.utils.twidget.g0 g0Var = (org.telegram.utils.twidget.g0) this.f44549g;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!z11 && tL_error2 != null && (str2 = tL_error2.text) != null && (str2.startsWith("INPUT_METHOD_INVALID") || tL_error2.text.startsWith("INPUT_CONSTRUCTOR_INVALID"))) {
                    org.telegram.utils.twidget.n0.f54346k[k0Var.f54267b] = true;
                    org.telegram.utils.twidget.n0.y(k0Var, widgetQueryType, bArr2, iArr, g0Var);
                    return;
                }
                g0Var.a(tL_messages_botWidgetQueryAnswer, tL_error2);
                return;
        }
    }

    public u1(boolean z10, org.telegram.utils.twidget.k0 k0Var, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, org.telegram.utils.twidget.g0 g0Var) {
        this.f44545b = z10;
        this.d = k0Var;
        this.f44547e = widgetQueryType;
        this.f44546c = bArr;
        this.f44548f = iArr;
        this.f44549g = g0Var;
    }
}
