package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class h21 implements org.telegram.messenger.v10 {
    public final int f34201a;
    public final p21 f34202b;

    public h21(p21 p21Var, int i7) {
        this.f34201a = i7;
        this.f34202b = p21Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String M0;
        String str;
        int i7 = this.f34201a;
        final p21 p21Var = this.f34202b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                f41 f41Var = (f41) obj2;
                String[] strArr = p21Var.f36869a2;
                arrayList.add(r31.C(null));
                f41Var.F = 1;
                f41Var.V();
                String str2 = p21Var.W1;
                if (str2 != null) {
                    M0 = e21.K0(e21.O0(str2, null, null));
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131754986, null);
                }
                arrayList.add(j21.j(3, "", M0, null, null));
                arrayList.add(n21.i(4, p21Var.S1, p21Var.f36871c2, new lk(26, p21Var, f41Var), new v70() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(p21.this.f28615b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e21.O0(p21Var.X1, null, null));
                if (p21Var.Y1 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a8.p0.s(new StringBuilder(" ("), strArr[p21Var.Y1], ")");
                }
                sb2.append(str);
                arrayList.add(j21.j(5, "", e21.K0(sb2.toString()), null, new g21(p21Var, 4)));
                arrayList.add(n21.i(6, p21Var.U1, false, null, new v70() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(p21.this.f28615b);
                    }
                }, null));
                f41Var.U();
                arrayList.add(r31.C(null));
                f41Var.V();
                arrayList.add(r31.c(1, 2131232103, org.telegram.messenger.hd.M0(2131743959, null)));
                f41Var.U();
                return;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                p21Var.d2 = -1;
                fi.d dVar = p21Var.R1;
                dVar.setLoading(false);
                if (tL_error != null) {
                    org.telegram.ui.Cells.f1.r(p21Var.E, p21Var.I0, tL_error, false);
                    dVar.setText(org.telegram.messenger.hd.M0(2131747830, null));
                    dVar.setOnClickListener(new g21(p21Var, 0));
                    return;
                } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                    p21Var.U1 = org.telegram.messenger.ij.h0(tL_messages_translateResult.result.get(0), false);
                    p21Var.T1 = false;
                    p21Var.f36870b2.O(true);
                    return;
                } else {
                    dVar.setText(org.telegram.messenger.hd.M0(2131747830, null));
                    dVar.setOnClickListener(new g21(p21Var, 1));
                    return;
                }
        }
    }
}
