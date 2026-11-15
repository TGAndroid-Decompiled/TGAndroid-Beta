package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
public final class i implements View.OnLongClickListener {
    public final int f35371a;
    public final Object f35372b;
    public final Object f35373c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i7) {
        this.f35371a = i7;
        this.f35372b = obj;
        this.f35373c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z10;
        int i7;
        xe xeVar;
        boolean z11;
        int i10 = this.f35371a;
        Object obj = this.d;
        Object obj2 = this.f35373c;
        Object obj3 = this.f35372b;
        switch (i10) {
            case 0:
                d0 d0Var = (d0) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                Context context = (Context) obj;
                if (d0Var.f33756i2) {
                    return false;
                }
                if (d0Var.f33758k2 != null) {
                    if (d0Var.l1() == null) {
                        return false;
                    }
                } else if (d0Var.f33757j2 == null || d0Var.m1() == null) {
                    return false;
                }
                if (d0Var.f33755h2 == org.telegram.messenger.m10.i(d0Var.f29679a).e()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m60 F = m60.F(d0Var.f29685c, e6Var, d0Var.B2);
                F.l(2131231508, org.telegram.messenger.hd.M0(2131745583, null), new a(d0Var, 4), !z10);
                if (z10) {
                    i7 = 2131745514;
                } else {
                    i7 = 2131745859;
                }
                F.c(2131232078, org.telegram.messenger.hd.M0(i7, null), new ki.n(d0Var, context, e6Var, 26), false);
                F.Z();
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj2;
                org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) obj;
                org.telegram.ui.ActionBar.e6 e6Var2 = chatActivityEnterView.E4;
                if (gjVar.F3() || (xeVar = chatActivityEnterView.F0) == null || TextUtils.isEmpty(xeVar.getTextToUse())) {
                    return false;
                }
                if (bjVar != null && (!bjVar.f22709c || bjVar.f22713i)) {
                    return false;
                }
                int i11 = gjVar.D;
                if (i11 != 1 && i11 != 3 && i11 != 8) {
                    return false;
                }
                org.telegram.ui.bg0 bg0Var = new org.telegram.ui.bg0(chatActivityEnterView.getContext(), e6Var2);
                bg0Var.f45718h0 = true;
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
                        arrayList.add(chatActivityEnterView.n0(gjVar2, z11));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.n0(gjVar, true));
                }
                bg0Var.r(arrayList);
                m60 F2 = m60.F(chatActivityEnterView.U1, e6Var2, chatActivityEnterView.f32247n2);
                ja0 ja0Var = new ja0(chatActivityEnterView.getContext(), 2131624140, org.telegram.messenger.hd.M0(2131752560, null), 2131624139, org.telegram.messenger.hd.M0(2131752559, null), chatActivityEnterView.E4);
                ja0Var.a(!chatActivityEnterView.f32244m6, false);
                ja0Var.setOnClickListener(new bi.f4(chatActivityEnterView, arrayList, ja0Var, bg0Var, 11));
                F2.q(ja0Var);
                F2.Y();
                bg0Var.q(F2);
                bg0Var.s(chatActivityEnterView.f32247n2, false, new bi.f4(chatActivityEnterView, bjVar, gjVar, bg0Var, 12));
                bg0Var.show();
                return true;
        }
    }
}
