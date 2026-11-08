package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class n21 implements org.telegram.messenger.v10 {
    public final int f36204a;
    public final v21 f36205b;

    public n21(v21 v21Var, int i7) {
        this.f36204a = i7;
        this.f36205b = v21Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String M0;
        String str;
        int i7 = this.f36204a;
        final v21 v21Var = this.f36205b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l41 l41Var = (l41) obj2;
                String[] strArr = v21Var.f38832a2;
                arrayList.add(x31.C(null));
                l41Var.F = 1;
                l41Var.V();
                String str2 = v21Var.W1;
                if (str2 != null) {
                    M0 = k21.K0(k21.O0(str2, null, null));
                } else {
                    M0 = org.telegram.messenger.id.M0(2131754986, null);
                }
                arrayList.add(p21.j(3, "", M0, null, null));
                arrayList.add(t21.i(4, v21Var.S1, v21Var.f38834c2, new lk(26, v21Var, l41Var), new v70() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(v21.this.f28619b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(k21.O0(v21Var.X1, null, null));
                if (v21Var.Y1 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a8.p0.s(new StringBuilder(" ("), strArr[v21Var.Y1], ")");
                }
                sb2.append(str);
                arrayList.add(p21.j(5, "", k21.K0(sb2.toString()), null, new m21(v21Var, 4)));
                arrayList.add(t21.i(6, v21Var.U1, false, null, new v70() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(v21.this.f28619b);
                    }
                }, null));
                l41Var.U();
                arrayList.add(x31.C(null));
                l41Var.V();
                arrayList.add(x31.c(1, 2131232103, org.telegram.messenger.id.M0(2131743961, null)));
                l41Var.U();
                return;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                v21Var.d2 = -1;
                fi.d dVar = v21Var.R1;
                dVar.setLoading(false);
                if (tL_error != null) {
                    org.telegram.ui.Cells.f1.r(v21Var.E, v21Var.I0, tL_error, false);
                    dVar.setText(org.telegram.messenger.id.M0(2131747832, null));
                    dVar.setOnClickListener(new m21(v21Var, 0));
                    return;
                } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                    v21Var.U1 = org.telegram.messenger.ij.h0(tL_messages_translateResult.result.get(0), false);
                    v21Var.T1 = false;
                    v21Var.f38833b2.O(true);
                    return;
                } else {
                    dVar.setText(org.telegram.messenger.id.M0(2131747832, null));
                    dVar.setOnClickListener(new m21(v21Var, 1));
                    return;
                }
        }
    }
}
