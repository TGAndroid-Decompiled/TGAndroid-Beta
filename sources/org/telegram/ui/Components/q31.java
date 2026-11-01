package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class q31 implements org.telegram.messenger.k20 {
    public final int f29627a;
    public final y31 f29628b;

    public q31(y31 y31Var, int i10) {
        this.f29627a = i10;
        this.f29628b = y31Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String L0;
        String str;
        int i10 = this.f29627a;
        final y31 y31Var = this.f29628b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                q51 q51Var = (q51) obj2;
                String[] strArr = y31Var.a2;
                arrayList.add(b51.C(null));
                q51Var.F = 1;
                q51Var.V();
                String str2 = y31Var.W1;
                if (str2 != null) {
                    L0 = n31.K0(n31.O0(str2, null, null));
                } else {
                    L0 = org.telegram.messenger.dd.L0(2131754986, null);
                }
                arrayList.add(s31.j(3, "", L0, null, null));
                arrayList.add(w31.i(4, y31Var.S1, y31Var.f32711c2, new sr(19, y31Var, q51Var), new o80() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(y31.this.f21587b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(n31.O0(y31Var.X1, null, null));
                if (y31Var.Y1 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a1.g.r(new StringBuilder(" ("), strArr[y31Var.Y1], ")");
                }
                sb2.append(str);
                arrayList.add(s31.j(5, "", n31.K0(sb2.toString()), null, new p31(y31Var, 4)));
                arrayList.add(w31.i(6, y31Var.U1, false, null, new o80() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(y31.this.f21587b);
                    }
                }, null));
                q51Var.U();
                arrayList.add(b51.C(null));
                q51Var.V();
                arrayList.add(b51.c(1, 2131232102, org.telegram.messenger.dd.L0(2131743983, null)));
                q51Var.U();
                return;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                y31Var.f32712d2 = -1;
                vh.d dVar = y31Var.R1;
                dVar.setLoading(false);
                if (tL_error != null) {
                    org.telegram.ui.Cells.f1.s(y31Var.E, y31Var.I0, tL_error, false);
                    dVar.setText(org.telegram.messenger.dd.L0(2131747847, null));
                    dVar.setOnClickListener(new p31(y31Var, 0));
                    return;
                } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                    y31Var.U1 = org.telegram.messenger.kj.h0(tL_messages_translateResult.result.get(0), false);
                    y31Var.T1 = false;
                    y31Var.f32710b2.O(true);
                    return;
                } else {
                    dVar.setText(org.telegram.messenger.dd.L0(2131747847, null));
                    dVar.setOnClickListener(new p31(y31Var, 1));
                    return;
                }
        }
    }
}
