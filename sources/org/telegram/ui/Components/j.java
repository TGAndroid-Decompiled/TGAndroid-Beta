package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
public final class j implements View.OnLongClickListener {
    public final int f27212a;
    public final Object f27213b;
    public final Object f27214c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i10) {
        this.f27212a = i10;
        this.f27213b = obj;
        this.f27214c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z10;
        int i10;
        se seVar;
        boolean z11;
        int i11 = this.f27212a;
        Object obj = this.d;
        Object obj2 = this.f27214c;
        Object obj3 = this.f27213b;
        switch (i11) {
            case 0:
                g0 g0Var = (g0) obj3;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj2;
                Context context = (Context) obj;
                if (g0Var.f26243e2) {
                    return false;
                }
                if (g0Var.f26245g2 != null) {
                    if (g0Var.l1() == null) {
                        return false;
                    }
                } else if (g0Var.f26244f2 == null || g0Var.m1() == null) {
                    return false;
                }
                if (g0Var.f26242d2 == org.telegram.messenger.e20.i(g0Var.f21584a).e()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z60 F = z60.F(g0Var.f21590c, p6Var, g0Var.f26262x2);
                F.l(2131231509, org.telegram.messenger.dd.L0(2131745600, null), new a(g0Var, 4), !z10);
                if (z10) {
                    i10 = 2131745531;
                } else {
                    i10 = 2131745876;
                }
                F.c(2131232076, org.telegram.messenger.dd.L0(i10, null), new li.s(g0Var, context, p6Var, 25), false);
                F.Z();
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) obj2;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                org.telegram.ui.ActionBar.p6 p6Var2 = chatActivityEnterView.W3;
                if (kjVar.F3() || (seVar = chatActivityEnterView.E0) == null || TextUtils.isEmpty(seVar.getTextToUse())) {
                    return false;
                }
                if (fjVar != null && (!fjVar.f15737c || fjVar.f15740i)) {
                    return false;
                }
                int i12 = kjVar.D;
                if (i12 != 1 && i12 != 3 && i12 != 8) {
                    return false;
                }
                org.telegram.ui.ih0 ih0Var = new org.telegram.ui.ih0(chatActivityEnterView.getContext(), p6Var2);
                ih0Var.f38068g0 = true;
                ArrayList arrayList = new ArrayList();
                if (fjVar != null) {
                    ArrayList arrayList2 = fjVar.d;
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList2.get(i13);
                        if (i13 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(chatActivityEnterView.c0(kjVar2, z11));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.c0(kjVar, true));
                }
                ih0Var.p(arrayList);
                z60 F2 = z60.F(chatActivityEnterView.f23747m1, p6Var2, chatActivityEnterView.F1);
                za0 za0Var = new za0(chatActivityEnterView.getContext(), 2131624137, org.telegram.messenger.dd.L0(2131752560, null), 2131624136, org.telegram.messenger.dd.L0(2131752559, null), chatActivityEnterView.W3);
                za0Var.a(!chatActivityEnterView.R4, false);
                za0Var.setOnClickListener(new org.telegram.messenger.video.h(chatActivityEnterView, arrayList, za0Var, ih0Var, 6));
                F2.q(za0Var);
                F2.Y();
                ih0Var.o(F2);
                ih0Var.q(chatActivityEnterView.F1, false, new org.telegram.messenger.video.h(chatActivityEnterView, fjVar, kjVar, ih0Var, 7));
                ih0Var.show();
                return true;
        }
    }
}
