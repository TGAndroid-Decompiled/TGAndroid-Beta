package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b31 implements org.telegram.messenger.q10 {
    public final int f33524a;
    public final k31 f33525b;

    public b31(k31 k31Var, int i7) {
        this.f33524a = i7;
        this.f33525b = k31Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String M0;
        String str;
        int i7 = this.f33524a;
        final k31 k31Var = this.f33525b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                String[] strArr = k31Var.f36668e2;
                arrayList.add(l41.C(null));
                z41Var.G = 1;
                z41Var.V();
                String str2 = k31Var.f36665a2;
                if (str2 != null) {
                    M0 = y21.L0(y21.P0(str2, null, null));
                } else {
                    M0 = org.telegram.messenger.gd.M0(2131754986, null);
                }
                arrayList.add(e31.j(3, "", M0, null, null));
                arrayList.add(i31.i(4, k31Var.W1, k31Var.f36670g2, new c31(0, k31Var, z41Var), new j80() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(k31.this.f30190b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(y21.P0(k31Var.f36666b2, null, null));
                if (k31Var.f36667c2 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a8.p0.s(new StringBuilder(" ("), strArr[k31Var.f36667c2], ")");
                }
                sb2.append(str);
                arrayList.add(e31.j(5, "", y21.L0(sb2.toString()), null, new a31(k31Var, 4)));
                arrayList.add(i31.i(6, k31Var.Y1, false, null, new j80() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(k31.this.f30190b);
                    }
                }, null));
                z41Var.U();
                arrayList.add(l41.C(null));
                z41Var.V();
                arrayList.add(l41.c(1, 2131232105, org.telegram.messenger.gd.M0(2131743721, null)));
                z41Var.U();
                return;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                k31Var.f36671h2 = -1;
                hi.d dVar = k31Var.V1;
                dVar.setLoading(false);
                if (tL_error != null) {
                    org.telegram.ui.Cells.c0.t(k31Var.F, k31Var.J0, tL_error, false);
                    dVar.setText(org.telegram.messenger.gd.M0(2131747638, null));
                    dVar.setOnClickListener(new a31(k31Var, 0));
                    return;
                } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                    k31Var.Y1 = org.telegram.messenger.fj.h0(tL_messages_translateResult.result.get(0), false);
                    k31Var.X1 = false;
                    k31Var.f36669f2.O(true);
                    return;
                } else {
                    dVar.setText(org.telegram.messenger.gd.M0(2131747638, null));
                    dVar.setOnClickListener(new a31(k31Var, 1));
                    return;
                }
        }
    }
}
