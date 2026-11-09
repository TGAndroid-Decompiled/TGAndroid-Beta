package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class o21 implements org.telegram.messenger.v10 {
    public final int f36611a;
    public final w21 f36612b;

    public o21(w21 w21Var, int i7) {
        this.f36611a = i7;
        this.f36612b = w21Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String M0;
        String str;
        int i7 = this.f36611a;
        final w21 w21Var = this.f36612b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                m41 m41Var = (m41) obj2;
                String[] strArr = w21Var.f39880a2;
                arrayList.add(y31.C(null));
                m41Var.F = 1;
                m41Var.V();
                String str2 = w21Var.W1;
                if (str2 != null) {
                    M0 = l21.K0(l21.O0(str2, null, null));
                } else {
                    M0 = org.telegram.messenger.id.M0(2131754986, null);
                }
                arrayList.add(q21.j(3, "", M0, null, null));
                arrayList.add(u21.i(4, w21Var.S1, w21Var.f39882c2, new lk(26, w21Var, m41Var), new w70() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(w21.this.f28624b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(l21.O0(w21Var.X1, null, null));
                if (w21Var.Y1 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a8.p0.s(new StringBuilder(" ("), strArr[w21Var.Y1], ")");
                }
                sb2.append(str);
                arrayList.add(q21.j(5, "", l21.K0(sb2.toString()), null, new n21(w21Var, 4)));
                arrayList.add(u21.i(6, w21Var.U1, false, null, new w70() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(w21.this.f28624b);
                    }
                }, null));
                m41Var.U();
                arrayList.add(y31.C(null));
                m41Var.V();
                arrayList.add(y31.c(1, 2131232103, org.telegram.messenger.id.M0(2131743958, null)));
                m41Var.U();
                return;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                w21Var.d2 = -1;
                fi.d dVar = w21Var.R1;
                dVar.setLoading(false);
                if (tL_error != null) {
                    org.telegram.ui.Cells.f1.r(w21Var.E, w21Var.I0, tL_error, false);
                    dVar.setText(org.telegram.messenger.id.M0(2131747831, null));
                    dVar.setOnClickListener(new n21(w21Var, 0));
                    return;
                } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                    w21Var.U1 = org.telegram.messenger.ij.h0(tL_messages_translateResult.result.get(0), false);
                    w21Var.T1 = false;
                    w21Var.f39881b2.O(true);
                    return;
                } else {
                    dVar.setText(org.telegram.messenger.id.M0(2131747831, null));
                    dVar.setOnClickListener(new n21(w21Var, 1));
                    return;
                }
        }
    }
}
