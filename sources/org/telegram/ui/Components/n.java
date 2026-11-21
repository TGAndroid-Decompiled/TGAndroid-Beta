package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
public final class n implements View.OnLongClickListener {
    public final int f37681a;
    public final Object f37682b;
    public final Object f37683c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i7) {
        this.f37681a = i7;
        this.f37682b = obj;
        this.f37683c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z10;
        int i7;
        gf gfVar;
        int i10;
        boolean z11;
        int i11 = this.f37681a;
        Object obj = this.d;
        Object obj2 = this.f37683c;
        Object obj3 = this.f37682b;
        switch (i11) {
            case 0:
                n0 n0Var = (n0) obj3;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                Context context = (Context) obj;
                if (n0Var.f37691i2 || (n0Var.f37693k2 == null ? n0Var.f37692j2 == null || n0Var.p1() == null : n0Var.o1() == null)) {
                    return false;
                }
                if (n0Var.f37690h2 == org.telegram.messenger.j10.i(n0Var.f30170a).e()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a70 G = a70.G(n0Var.f30176c, h6Var, n0Var.D2);
                G.l(2131231509, org.telegram.messenger.gd.N0(2131745387, null), new a(n0Var, 4), !z10);
                if (z10) {
                    i7 = 2131745318;
                } else {
                    i7 = 2131745663;
                }
                G.c(2131232079, org.telegram.messenger.gd.N0(i7, null), new g(n0Var, context, h6Var, 0), false);
                G.a0();
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj2;
                org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) obj;
                org.telegram.ui.ActionBar.h6 h6Var2 = chatActivityEnterView.M4;
                if (fjVar.F3() || (gfVar = chatActivityEnterView.F0) == null || TextUtils.isEmpty(gfVar.getTextToUse()) || ((ajVar != null && (!ajVar.f22925c || ajVar.f22929i)) || ((i10 = fjVar.D) != 1 && i10 != 3 && i10 != 8))) {
                    return false;
                }
                org.telegram.ui.eg0 eg0Var = new org.telegram.ui.eg0(chatActivityEnterView.getContext(), h6Var2);
                eg0Var.f47271h0 = true;
                ArrayList arrayList = new ArrayList();
                if (ajVar != null) {
                    ArrayList arrayList2 = ajVar.d;
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList2.get(i12);
                        if (i12 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(chatActivityEnterView.y0(fjVar2, z11));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.y0(fjVar, true));
                }
                eg0Var.r(arrayList);
                a70 G2 = a70.G(chatActivityEnterView.f32588c2, h6Var2, chatActivityEnterView.f32732v2);
                va0 va0Var = new va0(chatActivityEnterView.getContext(), 2131624140, org.telegram.messenger.gd.N0(2131752548, null), 2131624139, org.telegram.messenger.gd.N0(2131752547, null), chatActivityEnterView.M4);
                va0Var.a(!chatActivityEnterView.O6, false);
                va0Var.setOnClickListener(new bi.q6(chatActivityEnterView, arrayList, va0Var, eg0Var, 11));
                G2.q(va0Var);
                G2.Z();
                eg0Var.q(G2);
                eg0Var.s(chatActivityEnterView.f32732v2, false, new bi.q6(chatActivityEnterView, ajVar, fjVar, eg0Var, 12));
                eg0Var.show();
                return true;
        }
    }
}
