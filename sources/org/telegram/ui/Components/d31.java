package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class d31 implements org.telegram.messenger.p10 {
    public final int f34205a;
    public final l31 f34206b;

    public d31(l31 l31Var, int i7) {
        this.f34205a = i7;
        this.f34206b = l31Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String N0;
        String str;
        int i7 = this.f34205a;
        final l31 l31Var = this.f34206b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                b51 b51Var = (b51) obj2;
                String[] strArr = l31Var.f37013e2;
                arrayList.add(n41.C(null));
                b51Var.G = 1;
                b51Var.V();
                String str2 = l31Var.f37010a2;
                if (str2 != null) {
                    N0 = a31.L0(a31.P0(str2, null, null));
                } else {
                    N0 = org.telegram.messenger.gd.N0(2131754986, null);
                }
                arrayList.add(f31.j(3, "", N0, null, null));
                arrayList.add(j31.i(4, l31Var.W1, l31Var.f37015g2, new l8(28, l31Var, b51Var), new i80() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(l31.this.f30226b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a31.P0(l31Var.f37011b2, null, null));
                if (l31Var.f37012c2 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a8.p0.s(new StringBuilder(" ("), strArr[l31Var.f37012c2], ")");
                }
                sb2.append(str);
                arrayList.add(f31.j(5, "", a31.L0(sb2.toString()), null, new c31(l31Var, 4)));
                arrayList.add(j31.i(6, l31Var.Y1, false, null, new i80() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(l31.this.f30226b);
                    }
                }, null));
                b51Var.U();
                arrayList.add(n41.C(null));
                b51Var.V();
                arrayList.add(n41.c(1, 2131232108, org.telegram.messenger.gd.N0(2131743711, null)));
                b51Var.U();
                return;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                l31Var.f37016h2 = -1;
                hi.e eVar = l31Var.V1;
                eVar.setLoading(false);
                if (tL_error != null) {
                    org.telegram.ui.Cells.c0.t(l31Var.F, l31Var.J0, tL_error, false);
                    eVar.setText(org.telegram.messenger.gd.N0(2131747637, null));
                    eVar.setOnClickListener(new c31(l31Var, 0));
                    return;
                } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                    l31Var.Y1 = org.telegram.messenger.fj.h0(tL_messages_translateResult.result.get(0), false);
                    l31Var.X1 = false;
                    l31Var.f37014f2.O(true);
                    return;
                } else {
                    eVar.setText(org.telegram.messenger.gd.N0(2131747637, null));
                    eVar.setOnClickListener(new c31(l31Var, 1));
                    return;
                }
        }
    }
}
