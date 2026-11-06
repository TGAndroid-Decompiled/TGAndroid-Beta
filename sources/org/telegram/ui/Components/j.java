package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
public final class j implements View.OnLongClickListener {
    public final int f34838a;
    public final Object f34839b;
    public final Object f34840c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i7) {
        this.f34838a = i7;
        this.f34839b = obj;
        this.f34840c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z9;
        int i7;
        xe xeVar;
        boolean z10;
        int i10 = this.f34838a;
        Object obj = this.d;
        Object obj2 = this.f34840c;
        Object obj3 = this.f34839b;
        switch (i10) {
            case 0:
                g0 g0Var = (g0) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                Context context = (Context) obj;
                if (g0Var.f33735e2) {
                    return false;
                }
                if (g0Var.f33737g2 != null) {
                    if (g0Var.l1() == null) {
                        return false;
                    }
                } else if (g0Var.f33736f2 == null || g0Var.m1() == null) {
                    return false;
                }
                if (g0Var.d2 == org.telegram.messenger.p10.i(g0Var.f28612a).e()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                k60 F = k60.F(g0Var.f28618c, f6Var, g0Var.f33754x2);
                F.l(2131231508, org.telegram.messenger.hd.M0(2131745584, null), new a(g0Var, 4), !z9);
                if (z9) {
                    i7 = 2131745515;
                } else {
                    i7 = 2131745860;
                }
                F.c(2131232077, org.telegram.messenger.hd.M0(i7, null), new l2.z0(g0Var, context, f6Var, 25), false);
                F.Z();
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj2;
                org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) obj;
                org.telegram.ui.ActionBar.f6 f6Var2 = chatActivityEnterView.W3;
                if (ijVar.G3() || (xeVar = chatActivityEnterView.E0) == null || TextUtils.isEmpty(xeVar.getTextToUse())) {
                    return false;
                }
                if (djVar != null && (!djVar.f22004c || djVar.f22008i)) {
                    return false;
                }
                int i11 = ijVar.D;
                if (i11 != 1 && i11 != 3 && i11 != 8) {
                    return false;
                }
                org.telegram.ui.bg0 bg0Var = new org.telegram.ui.bg0(chatActivityEnterView.getContext(), f6Var2);
                bg0Var.f44311g0 = true;
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
                bg0Var.p(arrayList);
                k60 F2 = k60.F(chatActivityEnterView.f31082m1, f6Var2, chatActivityEnterView.F1);
                ha0 ha0Var = new ha0(chatActivityEnterView.getContext(), 2131624139, org.telegram.messenger.hd.M0(2131752560, null), 2131624138, org.telegram.messenger.hd.M0(2131752559, null), chatActivityEnterView.W3);
                ha0Var.a(!chatActivityEnterView.R4, false);
                ha0Var.setOnClickListener(new di.u3(chatActivityEnterView, arrayList, ha0Var, bg0Var, 10));
                F2.q(ha0Var);
                F2.Y();
                bg0Var.o(F2);
                bg0Var.q(chatActivityEnterView.F1, false, new di.u3(chatActivityEnterView, djVar, ijVar, bg0Var, 11));
                bg0Var.show();
                return true;
        }
    }
}
