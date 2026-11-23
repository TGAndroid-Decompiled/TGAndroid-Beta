package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
public final class n implements View.OnLongClickListener {
    public final int f37634a;
    public final Object f37635b;
    public final Object f37636c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i7) {
        this.f37634a = i7;
        this.f37635b = obj;
        this.f37636c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z10;
        int i7;
        gf gfVar;
        int i10;
        boolean z11;
        int i11 = this.f37634a;
        Object obj = this.d;
        Object obj2 = this.f37636c;
        Object obj3 = this.f37635b;
        switch (i11) {
            case 0:
                n0 n0Var = (n0) obj3;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                Context context = (Context) obj;
                if (n0Var.f37644i2 || (n0Var.f37646k2 == null ? n0Var.f37645j2 == null || n0Var.p1() == null : n0Var.o1() == null)) {
                    return false;
                }
                if (n0Var.f37643h2 == org.telegram.messenger.k10.i(n0Var.f30139a).e()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a70 G = a70.G(n0Var.f30145c, h6Var, n0Var.D2);
                G.l(2131231509, org.telegram.messenger.hd.N0(2131745387, null), new a(n0Var, 4), !z10);
                if (z10) {
                    i7 = 2131745318;
                } else {
                    i7 = 2131745663;
                }
                G.c(2131232079, org.telegram.messenger.hd.N0(i7, null), new g(n0Var, context, h6Var, 0), false);
                G.a0();
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj2;
                org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) obj;
                org.telegram.ui.ActionBar.h6 h6Var2 = chatActivityEnterView.M4;
                if (gjVar.F3() || (gfVar = chatActivityEnterView.F0) == null || TextUtils.isEmpty(gfVar.getTextToUse()) || ((bjVar != null && (!bjVar.f23076c || bjVar.f23080i)) || ((i10 = gjVar.D) != 1 && i10 != 3 && i10 != 8))) {
                    return false;
                }
                org.telegram.ui.eg0 eg0Var = new org.telegram.ui.eg0(chatActivityEnterView.getContext(), h6Var2);
                eg0Var.f47244h0 = true;
                ArrayList arrayList = new ArrayList();
                if (bjVar != null) {
                    ArrayList arrayList2 = bjVar.d;
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList2.get(i12);
                        if (i12 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(chatActivityEnterView.y0(gjVar2, z11));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.y0(gjVar, true));
                }
                eg0Var.r(arrayList);
                a70 G2 = a70.G(chatActivityEnterView.f32557c2, h6Var2, chatActivityEnterView.f32701v2);
                va0 va0Var = new va0(chatActivityEnterView.getContext(), 2131624140, org.telegram.messenger.hd.N0(2131752548, null), 2131624139, org.telegram.messenger.hd.N0(2131752547, null), chatActivityEnterView.M4);
                va0Var.a(!chatActivityEnterView.O6, false);
                va0Var.setOnClickListener(new bi.s6(chatActivityEnterView, arrayList, va0Var, eg0Var, 11));
                G2.q(va0Var);
                G2.Z();
                eg0Var.q(G2);
                eg0Var.s(chatActivityEnterView.f32701v2, false, new bi.s6(chatActivityEnterView, bjVar, gjVar, eg0Var, 12));
                eg0Var.show();
                return true;
        }
    }
}
