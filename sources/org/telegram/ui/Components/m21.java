package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class m21 implements org.telegram.messenger.v10 {
    public final int f35826a;
    public final u21 f35827b;

    public m21(u21 u21Var, int i7) {
        this.f35826a = i7;
        this.f35827b = u21Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String M0;
        String str;
        int i7 = this.f35826a;
        final u21 u21Var = this.f35827b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                k41 k41Var = (k41) obj2;
                String[] strArr = u21Var.f38483a2;
                arrayList.add(w31.C(null));
                k41Var.F = 1;
                k41Var.V();
                String str2 = u21Var.W1;
                if (str2 != null) {
                    M0 = j21.K0(j21.O0(str2, null, null));
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131754986, null);
                }
                arrayList.add(o21.j(3, "", M0, null, null));
                arrayList.add(s21.i(4, u21Var.S1, u21Var.f38485c2, new lk(26, u21Var, k41Var), new v70() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(u21.this.f28615b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(j21.O0(u21Var.X1, null, null));
                if (u21Var.Y1 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a8.p0.s(new StringBuilder(" ("), strArr[u21Var.Y1], ")");
                }
                sb2.append(str);
                arrayList.add(o21.j(5, "", j21.K0(sb2.toString()), null, new l21(u21Var, 4)));
                arrayList.add(s21.i(6, u21Var.U1, false, null, new v70() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(u21.this.f28615b);
                    }
                }, null));
                k41Var.U();
                arrayList.add(w31.C(null));
                k41Var.V();
                arrayList.add(w31.c(1, 2131232103, org.telegram.messenger.hd.M0(2131743959, null)));
                k41Var.U();
                return;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                u21Var.d2 = -1;
                fi.d dVar = u21Var.R1;
                dVar.setLoading(false);
                if (tL_error != null) {
                    org.telegram.ui.Cells.f1.r(u21Var.E, u21Var.I0, tL_error, false);
                    dVar.setText(org.telegram.messenger.hd.M0(2131747830, null));
                    dVar.setOnClickListener(new l21(u21Var, 0));
                    return;
                } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                    u21Var.U1 = org.telegram.messenger.ij.h0(tL_messages_translateResult.result.get(0), false);
                    u21Var.T1 = false;
                    u21Var.f38484b2.O(true);
                    return;
                } else {
                    dVar.setText(org.telegram.messenger.hd.M0(2131747830, null));
                    dVar.setOnClickListener(new l21(u21Var, 1));
                    return;
                }
        }
    }
}
