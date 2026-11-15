package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class s21 implements org.telegram.messenger.s10 {
    public final int f39170a;
    public final a31 f39171b;

    public s21(a31 a31Var, int i7) {
        this.f39170a = i7;
        this.f39171b = a31Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String M0;
        String str;
        int i7 = this.f39170a;
        final a31 a31Var = this.f39171b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                p41 p41Var = (p41) obj2;
                String[] strArr = a31Var.f32838e2;
                arrayList.add(b41.C(null));
                p41Var.G = 1;
                p41Var.V();
                String str2 = a31Var.f32835a2;
                if (str2 != null) {
                    M0 = p21.K0(p21.O0(str2, null, null));
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131754986, null);
                }
                arrayList.add(u21.j(3, "", M0, null, null));
                arrayList.add(y21.i(4, a31Var.W1, a31Var.f32840g2, new vv0(4, a31Var, p41Var), new y70() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(a31.this.f29682b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(p21.O0(a31Var.f32836b2, null, null));
                if (a31Var.f32837c2 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a8.p0.s(new StringBuilder(" ("), strArr[a31Var.f32837c2], ")");
                }
                sb2.append(str);
                arrayList.add(u21.j(5, "", p21.K0(sb2.toString()), null, new r21(a31Var, 4)));
                arrayList.add(y21.i(6, a31Var.Y1, false, null, new y70() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(a31.this.f29682b);
                    }
                }, null));
                p41Var.U();
                arrayList.add(b41.C(null));
                p41Var.V();
                arrayList.add(b41.c(1, 2131232104, org.telegram.messenger.hd.M0(2131743958, null)));
                p41Var.U();
                return;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                a31Var.f32841h2 = -1;
                hi.d dVar = a31Var.V1;
                dVar.setLoading(false);
                if (tL_error != null) {
                    org.telegram.ui.Cells.y0.q(a31Var.F, a31Var.J0, tL_error, false);
                    dVar.setText(org.telegram.messenger.hd.M0(2131747831, null));
                    dVar.setOnClickListener(new r21(a31Var, 0));
                    return;
                } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                    a31Var.Y1 = org.telegram.messenger.gj.h0(tL_messages_translateResult.result.get(0), false);
                    a31Var.X1 = false;
                    a31Var.f32839f2.O(true);
                    return;
                } else {
                    dVar.setText(org.telegram.messenger.hd.M0(2131747831, null));
                    dVar.setOnClickListener(new r21(a31Var, 1));
                    return;
                }
        }
    }
}
