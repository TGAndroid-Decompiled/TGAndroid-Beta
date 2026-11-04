package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
public final class j implements View.OnLongClickListener {
    public final int f34872a;
    public final Object f34873b;
    public final Object f34874c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i3) {
        this.f34872a = i3;
        this.f34873b = obj;
        this.f34874c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z10;
        int i3;
        ve veVar;
        boolean z11;
        int i10 = this.f34872a;
        Object obj = this.d;
        Object obj2 = this.f34874c;
        Object obj3 = this.f34873b;
        switch (i10) {
            case 0:
                e0 e0Var = (e0) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                Context context = (Context) obj;
                if (e0Var.f33238f2) {
                    return false;
                }
                if (e0Var.f33240h2 != null) {
                    if (e0Var.l1() == null) {
                        return false;
                    }
                } else if (e0Var.f33239g2 == null || e0Var.m1() == null) {
                    return false;
                }
                if (e0Var.f33237e2 == org.telegram.messenger.h10.i(e0Var.f28583a).e()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f60 F = f60.F(e0Var.f28589c, e6Var, e0Var.f33257y2);
                F.l(2131231508, org.telegram.messenger.bd.M0(2131745593, null), new a(e0Var, 4), !z10);
                if (z10) {
                    i3 = 2131745524;
                } else {
                    i3 = 2131745869;
                }
                F.c(2131232077, org.telegram.messenger.bd.M0(i3, null), new lg.y(e0Var, context, e6Var, 29), false);
                F.Z();
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj2;
                org.telegram.messenger.ui uiVar = (org.telegram.messenger.ui) obj;
                org.telegram.ui.ActionBar.e6 e6Var2 = chatActivityEnterView.X3;
                if (ziVar.G3() || (veVar = chatActivityEnterView.F0) == null || TextUtils.isEmpty(veVar.getTextToUse())) {
                    return false;
                }
                if (uiVar != null && (!uiVar.f25701c || uiVar.f25705i)) {
                    return false;
                }
                int i11 = ziVar.D;
                if (i11 != 1 && i11 != 3 && i11 != 8) {
                    return false;
                }
                org.telegram.ui.vf0 vf0Var = new org.telegram.ui.vf0(chatActivityEnterView.getContext(), e6Var2);
                vf0Var.f50484h0 = true;
                ArrayList arrayList = new ArrayList();
                if (uiVar != null) {
                    ArrayList arrayList2 = uiVar.d;
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList2.get(i12);
                        if (i12 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(chatActivityEnterView.d0(ziVar2, z11));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.d0(ziVar, true));
                }
                vf0Var.p(arrayList);
                f60 F2 = f60.F(chatActivityEnterView.f31163n1, e6Var2, chatActivityEnterView.G1);
                ca0 ca0Var = new ca0(chatActivityEnterView.getContext(), 2131624139, org.telegram.messenger.bd.M0(2131752560, null), 2131624138, org.telegram.messenger.bd.M0(2131752559, null), chatActivityEnterView.X3);
                ca0Var.a(!chatActivityEnterView.S4, false);
                ca0Var.setOnClickListener(new ai.r4(chatActivityEnterView, arrayList, ca0Var, vf0Var, 11));
                F2.q(ca0Var);
                F2.Y();
                vf0Var.o(F2);
                vf0Var.q(chatActivityEnterView.G1, false, new ai.r4(chatActivityEnterView, uiVar, ziVar, vf0Var, 12));
                vf0Var.show();
                return true;
        }
    }
}
