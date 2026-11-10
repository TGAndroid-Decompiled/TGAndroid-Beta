package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
public final class i implements View.OnLongClickListener {
    public final int f34489a;
    public final Object f34490b;
    public final Object f34491c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i7) {
        this.f34489a = i7;
        this.f34490b = obj;
        this.f34491c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z9;
        int i7;
        we weVar;
        boolean z10;
        int i10 = this.f34489a;
        Object obj = this.d;
        Object obj2 = this.f34491c;
        Object obj3 = this.f34490b;
        switch (i10) {
            case 0:
                f0 f0Var = (f0) obj3;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                Context context = (Context) obj;
                if (f0Var.f33411h2) {
                    return false;
                }
                if (f0Var.f33413j2 != null) {
                    if (f0Var.l1() == null) {
                        return false;
                    }
                } else if (f0Var.f33412i2 == null || f0Var.m1() == null) {
                    return false;
                }
                if (f0Var.f33410g2 == org.telegram.messenger.p10.i(f0Var.f28669a).e()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                k60 F = k60.F(f0Var.f28675c, h6Var, f0Var.A2);
                F.l(2131231508, org.telegram.messenger.id.M0(2131745583, null), new a(f0Var, 4), !z9);
                if (z9) {
                    i7 = 2131745514;
                } else {
                    i7 = 2131745859;
                }
                F.c(2131232077, org.telegram.messenger.id.M0(i7, null), new l2.z0(f0Var, context, h6Var, 25), false);
                F.Z();
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj2;
                org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) obj;
                org.telegram.ui.ActionBar.h6 h6Var2 = chatActivityEnterView.W3;
                if (ijVar.F3() || (weVar = chatActivityEnterView.E0) == null || TextUtils.isEmpty(weVar.getTextToUse())) {
                    return false;
                }
                if (djVar != null && (!djVar.f22040c || djVar.f22044i)) {
                    return false;
                }
                int i11 = ijVar.D;
                if (i11 != 1 && i11 != 3 && i11 != 8) {
                    return false;
                }
                org.telegram.ui.eg0 eg0Var = new org.telegram.ui.eg0(chatActivityEnterView.getContext(), h6Var2);
                eg0Var.f45279g0 = true;
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
                eg0Var.p(arrayList);
                k60 F2 = k60.F(chatActivityEnterView.f31103m1, h6Var2, chatActivityEnterView.F1);
                ha0 ha0Var = new ha0(chatActivityEnterView.getContext(), 2131624139, org.telegram.messenger.id.M0(2131752560, null), 2131624138, org.telegram.messenger.id.M0(2131752559, null), chatActivityEnterView.W3);
                ha0Var.a(!chatActivityEnterView.R4, false);
                ha0Var.setOnClickListener(new di.v3(chatActivityEnterView, arrayList, ha0Var, eg0Var, 10));
                F2.q(ha0Var);
                F2.Y();
                eg0Var.o(F2);
                eg0Var.q(chatActivityEnterView.F1, false, new di.v3(chatActivityEnterView, djVar, ijVar, eg0Var, 11));
                eg0Var.show();
                return true;
        }
    }
}
