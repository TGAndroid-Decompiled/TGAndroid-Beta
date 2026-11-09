package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
public final class j implements View.OnLongClickListener {
    public final int f34888a;
    public final Object f34889b;
    public final Object f34890c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i7) {
        this.f34888a = i7;
        this.f34889b = obj;
        this.f34890c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z9;
        int i7;
        xe xeVar;
        boolean z10;
        int i10 = this.f34888a;
        Object obj = this.d;
        Object obj2 = this.f34890c;
        Object obj3 = this.f34889b;
        switch (i10) {
            case 0:
                g0 g0Var = (g0) obj3;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                Context context = (Context) obj;
                if (g0Var.f33810e2) {
                    return false;
                }
                if (g0Var.f33812g2 != null) {
                    if (g0Var.l1() == null) {
                        return false;
                    }
                } else if (g0Var.f33811f2 == null || g0Var.m1() == null) {
                    return false;
                }
                if (g0Var.d2 == org.telegram.messenger.p10.i(g0Var.f28621a).e()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                l60 F = l60.F(g0Var.f28627c, g6Var, g0Var.f33829x2);
                F.l(2131231508, org.telegram.messenger.id.M0(2131745583, null), new a(g0Var, 4), !z9);
                if (z9) {
                    i7 = 2131745514;
                } else {
                    i7 = 2131745859;
                }
                F.c(2131232077, org.telegram.messenger.id.M0(i7, null), new l2.z0(g0Var, context, g6Var, 25), false);
                F.Z();
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj2;
                org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) obj;
                org.telegram.ui.ActionBar.g6 g6Var2 = chatActivityEnterView.W3;
                if (ijVar.F3() || (xeVar = chatActivityEnterView.E0) == null || TextUtils.isEmpty(xeVar.getTextToUse())) {
                    return false;
                }
                if (djVar != null && (!djVar.f22036c || djVar.f22040i)) {
                    return false;
                }
                int i11 = ijVar.D;
                if (i11 != 1 && i11 != 3 && i11 != 8) {
                    return false;
                }
                org.telegram.ui.dg0 dg0Var = new org.telegram.ui.dg0(chatActivityEnterView.getContext(), g6Var2);
                dg0Var.f44958g0 = true;
                ArrayList arrayList = new ArrayList();
                if (djVar != null) {
                    ArrayList arrayList2 = djVar.d;
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList2.get(i12);
                        if (i12 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        arrayList.add(chatActivityEnterView.d0(ijVar2, z10));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.d0(ijVar, true));
                }
                dg0Var.p(arrayList);
                l60 F2 = l60.F(chatActivityEnterView.f31092m1, g6Var2, chatActivityEnterView.F1);
                ia0 ia0Var = new ia0(chatActivityEnterView.getContext(), 2131624139, org.telegram.messenger.id.M0(2131752560, null), 2131624138, org.telegram.messenger.id.M0(2131752559, null), chatActivityEnterView.W3);
                ia0Var.a(!chatActivityEnterView.R4, false);
                ia0Var.setOnClickListener(new di.v3(chatActivityEnterView, arrayList, ia0Var, dg0Var, 10));
                F2.q(ia0Var);
                F2.Y();
                dg0Var.o(F2);
                dg0Var.q(chatActivityEnterView.F1, false, new di.v3(chatActivityEnterView, djVar, ijVar, dg0Var, 11));
                dg0Var.show();
                return true;
        }
    }
}
