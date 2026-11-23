package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.a31;
public final class d2 implements p10 {
    public final int f44157a = 0;
    public final boolean f44158b;
    public final byte[] f44159c;
    public final Object d;
    public final Object f44160e;
    public final Object f44161f;
    public final Object f44162g;

    public d2(m2 m2Var, byte[] bArr, i2 i2Var, a31 a31Var, boolean z10, s0 s0Var) {
        this.d = m2Var;
        this.f44159c = bArr;
        this.f44160e = i2Var;
        this.f44161f = a31Var;
        this.f44158b = z10;
        this.f44162g = s0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        String str;
        String str2;
        switch (this.f44157a) {
            case 0:
                m2 m2Var = (m2) this.d;
                byte[] bArr = this.f44159c;
                i2 i2Var = (i2) this.f44160e;
                a31 a31Var = (a31) this.f44161f;
                boolean z10 = this.f44158b;
                s0 s0Var = (s0) this.f44162g;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    i2Var.f44473o = true;
                    if (!z10 && i2Var.f44470l < 0) {
                        if ("disconnect".equals(i2Var.f44464e)) {
                            m2Var.y(i2Var, s0Var, new JSONObject(), -1, null, a31Var);
                            return;
                        } else if ("signData".equals(i2Var.f44464e)) {
                            if (m2Var.A(i2Var) && !m2Var.j(i2Var)) {
                                Utilities.f22877e.c(new w7(m2Var, s0Var, i2Var, a31Var, 8));
                                return;
                            } else {
                                m2Var.y(i2Var, s0Var, null, 0, "Request expired or wallet changed", a31Var);
                                return;
                            }
                        } else if ("signMessage".equals(i2Var.f44464e)) {
                            WalletEngine2 walletEngine2 = m2Var.f44649b.f45256b;
                            if (walletEngine2 != null && m2Var.A(i2Var) && !m2Var.j(i2Var)) {
                                l2 l2Var = i2Var.f44465f;
                                walletEngine2.signMessage(s0Var, l2Var, "ton-connect:" + i2Var.f44461a.f28754id + ":" + i2Var.f44462b, new t(m2Var, i2Var, s0Var, a31Var, 8));
                                return;
                            }
                            m2Var.y(i2Var, s0Var, null, 0, "Wallet unavailable or request expired", a31Var);
                            return;
                        } else {
                            m2Var.B(i2Var, s0Var, a31Var);
                            return;
                        }
                    }
                    if (z10) {
                        i7 = 300;
                    } else {
                        i7 = i2Var.f44470l;
                    }
                    int i10 = i7;
                    if (z10) {
                        str = "User declined the request";
                    } else {
                        str = i2Var.f44468j;
                    }
                    m2Var.y(i2Var, s0Var, null, i10, str, a31Var);
                    return;
                }
                if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                    i2Var.f44472n = true;
                }
                a31Var.a(m2.z(tL_error, "claimRequest"));
                return;
            default:
                boolean z11 = this.f44158b;
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) this.d;
                TLRPC.WidgetQueryType widgetQueryType = (TLRPC.WidgetQueryType) this.f44160e;
                byte[] bArr2 = this.f44159c;
                int[] iArr = (int[]) this.f44161f;
                ai.a aVar = (ai.a) this.f44162g;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!z11 && tL_error2 != null && (str2 = tL_error2.text) != null && (str2.startsWith("INPUT_METHOD_INVALID") || tL_error2.text.startsWith("INPUT_CONSTRUCTOR_INVALID"))) {
                    org.telegram.utils.twidget.n0.f54980k[k0Var.f54927b] = true;
                    org.telegram.utils.twidget.n0.y(k0Var, widgetQueryType, bArr2, iArr, aVar);
                    return;
                }
                aVar.a(tL_messages_botWidgetQueryAnswer, tL_error2);
                return;
        }
    }

    public d2(boolean z10, org.telegram.utils.twidget.k0 k0Var, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, ai.a aVar) {
        this.f44158b = z10;
        this.d = k0Var;
        this.f44160e = widgetQueryType;
        this.f44159c = bArr;
        this.f44161f = iArr;
        this.f44162g = aVar;
    }
}
