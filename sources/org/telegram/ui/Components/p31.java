package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class p31 implements org.telegram.messenger.j20 {
    public final int f29277a;
    public final x31 f29278b;

    public p31(x31 x31Var, int i10) {
        this.f29277a = i10;
        this.f29278b = x31Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String L0;
        String str;
        int i10 = this.f29277a;
        final x31 x31Var = this.f29278b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                p51 p51Var = (p51) obj2;
                String[] strArr = x31Var.a2;
                arrayList.add(a51.C(null));
                p51Var.F = 1;
                p51Var.V();
                String str2 = x31Var.W1;
                if (str2 != null) {
                    L0 = m31.K0(m31.O0(str2, null, null));
                } else {
                    L0 = org.telegram.messenger.cd.L0(2131754986, null);
                }
                arrayList.add(r31.j(3, "", L0, null, null));
                arrayList.add(v31.i(4, x31Var.S1, x31Var.f32307c2, new sr(19, x31Var, p51Var), new o80() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(x31.this.f21586b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m31.O0(x31Var.X1, null, null));
                if (x31Var.Y1 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a1.g.r(new StringBuilder(" ("), strArr[x31Var.Y1], ")");
                }
                sb2.append(str);
                arrayList.add(r31.j(5, "", m31.K0(sb2.toString()), null, new o31(x31Var, 4)));
                arrayList.add(v31.i(6, x31Var.U1, false, null, new o80() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(x31.this.f21586b);
                    }
                }, null));
                p51Var.U();
                arrayList.add(a51.C(null));
                p51Var.V();
                arrayList.add(a51.c(1, 2131232102, org.telegram.messenger.cd.L0(2131743983, null)));
                p51Var.U();
                return;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                x31Var.f32308d2 = -1;
                vh.d dVar = x31Var.R1;
                dVar.setLoading(false);
                if (tL_error != null) {
                    org.telegram.ui.Cells.f1.s(x31Var.E, x31Var.I0, tL_error, false);
                    dVar.setText(org.telegram.messenger.cd.L0(2131747847, null));
                    dVar.setOnClickListener(new o31(x31Var, 0));
                    return;
                } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                    x31Var.U1 = org.telegram.messenger.jj.h0(tL_messages_translateResult.result.get(0), false);
                    x31Var.T1 = false;
                    x31Var.f32306b2.O(true);
                    return;
                } else {
                    dVar.setText(org.telegram.messenger.cd.L0(2131747847, null));
                    dVar.setOnClickListener(new o31(x31Var, 1));
                    return;
                }
        }
    }
}
