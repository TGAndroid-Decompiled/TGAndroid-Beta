package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class i21 implements org.telegram.messenger.n10 {
    public final int f34573a;
    public final q21 f34574b;

    public i21(q21 q21Var, int i3) {
        this.f34573a = i3;
        this.f34574b = q21Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String M0;
        String str;
        int i3 = this.f34573a;
        final q21 q21Var = this.f34574b;
        switch (i3) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                f41 f41Var = (f41) obj2;
                String[] strArr = q21Var.f37329b2;
                arrayList.add(r31.C(null));
                f41Var.G = 1;
                f41Var.V();
                String str2 = q21Var.X1;
                if (str2 != null) {
                    M0 = f21.K0(f21.O0(str2, null, null));
                } else {
                    M0 = org.telegram.messenger.bd.M0(2131754986, null);
                }
                arrayList.add(k21.j(3, "", M0, null, null));
                arrayList.add(o21.i(4, q21Var.T1, q21Var.f37330d2, new ux0(2, (Object) q21Var, (Object) f41Var), new r70() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(q21.this.f28586b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f21.O0(q21Var.Y1, null, null));
                if (q21Var.Z1 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a1.g.s(new StringBuilder(" ("), strArr[q21Var.Z1], ")");
                }
                sb2.append(str);
                arrayList.add(k21.j(5, "", f21.K0(sb2.toString()), null, new h21(q21Var, 4)));
                arrayList.add(o21.i(6, q21Var.V1, false, null, new r70() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(q21.this.f28586b);
                    }
                }, null));
                f41Var.U();
                arrayList.add(r31.C(null));
                f41Var.V();
                arrayList.add(r31.c(1, 2131232103, org.telegram.messenger.bd.M0(2131743968, null)));
                f41Var.U();
                return;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                q21Var.f37331e2 = -1;
                gi.d dVar = q21Var.S1;
                dVar.setLoading(false);
                if (tL_error != null) {
                    org.telegram.ui.Cells.f1.v(q21Var.F, q21Var.J0, tL_error, false);
                    dVar.setText(org.telegram.messenger.bd.M0(2131747839, null));
                    dVar.setOnClickListener(new h21(q21Var, 0));
                    return;
                } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                    q21Var.V1 = org.telegram.messenger.zi.h0(tL_messages_translateResult.result.get(0), false);
                    q21Var.U1 = false;
                    q21Var.c2.O(true);
                    return;
                } else {
                    dVar.setText(org.telegram.messenger.bd.M0(2131747839, null));
                    dVar.setOnClickListener(new h21(q21Var, 1));
                    return;
                }
        }
    }
}
