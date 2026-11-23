package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e31 implements org.telegram.messenger.r10 {
    public final int f34663a;
    public final m31 f34664b;

    public e31(m31 m31Var, int i7) {
        this.f34663a = i7;
        this.f34664b = m31Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String N0;
        String str;
        int i7 = this.f34663a;
        final m31 m31Var = this.f34664b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                c51 c51Var = (c51) obj2;
                String[] strArr = m31Var.f37365e2;
                arrayList.add(o41.C(null));
                c51Var.G = 1;
                c51Var.V();
                String str2 = m31Var.f37362a2;
                if (str2 != null) {
                    N0 = b31.L0(b31.P0(str2, null, null));
                } else {
                    N0 = org.telegram.messenger.hd.N0(2131754986, null);
                }
                arrayList.add(g31.j(3, "", N0, null, null));
                arrayList.add(k31.i(4, m31Var.W1, m31Var.f37367g2, new m8(28, m31Var, c51Var), new l80() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(m31.this.f30142b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(b31.P0(m31Var.f37363b2, null, null));
                if (m31Var.f37364c2 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a8.p0.s(new StringBuilder(" ("), strArr[m31Var.f37364c2], ")");
                }
                sb2.append(str);
                arrayList.add(g31.j(5, "", b31.L0(sb2.toString()), null, new d31(m31Var, 4)));
                arrayList.add(k31.i(6, m31Var.Y1, false, null, new l80() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(m31.this.f30142b);
                    }
                }, null));
                c51Var.U();
                arrayList.add(o41.C(null));
                c51Var.V();
                arrayList.add(o41.c(1, 2131232105, org.telegram.messenger.hd.N0(2131743715, null)));
                c51Var.U();
                return;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                m31Var.f37368h2 = -1;
                hi.d dVar = m31Var.V1;
                dVar.setLoading(false);
                if (tL_error != null) {
                    org.telegram.ui.Cells.c0.t(m31Var.F, m31Var.J0, tL_error, false);
                    dVar.setText(org.telegram.messenger.hd.N0(2131747637, null));
                    dVar.setOnClickListener(new d31(m31Var, 0));
                    return;
                } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                    m31Var.Y1 = org.telegram.messenger.gj.h0(tL_messages_translateResult.result.get(0), false);
                    m31Var.X1 = false;
                    m31Var.f37366f2.O(true);
                    return;
                } else {
                    dVar.setText(org.telegram.messenger.hd.N0(2131747637, null));
                    dVar.setOnClickListener(new d31(m31Var, 1));
                    return;
                }
        }
    }
}
