package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
public final class m implements View.OnLongClickListener {
    public final int f37278a;
    public final Object f37279b;
    public final Object f37280c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i7) {
        this.f37278a = i7;
        this.f37279b = obj;
        this.f37280c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z10;
        int i7;
        hf hfVar;
        boolean z11;
        int i10 = this.f37278a;
        Object obj = this.d;
        Object obj2 = this.f37280c;
        Object obj3 = this.f37279b;
        switch (i10) {
            case 0:
                m0 m0Var = (m0) obj3;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                Context context = (Context) obj;
                if (m0Var.f37288i2) {
                    return false;
                }
                if (m0Var.f37290k2 != null) {
                    if (m0Var.o1() == null) {
                        return false;
                    }
                } else if (m0Var.f37289j2 == null || m0Var.p1() == null) {
                    return false;
                }
                if (m0Var.f37287h2 == org.telegram.messenger.i10.i(m0Var.f30223a).e()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x60 G = x60.G(m0Var.f30229c, i6Var, m0Var.D2);
                G.l(2131231512, org.telegram.messenger.gd.N0(2131745387, null), new a(m0Var, 4), !z10);
                if (z10) {
                    i7 = 2131745318;
                } else {
                    i7 = 2131745663;
                }
                G.c(2131232082, org.telegram.messenger.gd.N0(i7, null), new org.telegram.ui.Cells.fa(m0Var, context, i6Var, 1), false);
                G.a0();
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj2;
                org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) obj;
                org.telegram.ui.ActionBar.i6 i6Var2 = chatActivityEnterView.M4;
                if (fjVar.F3() || (hfVar = chatActivityEnterView.F0) == null || TextUtils.isEmpty(hfVar.getTextToUse())) {
                    return false;
                }
                if (ajVar != null && (!ajVar.f23008c || ajVar.f23012i)) {
                    return false;
                }
                int i11 = fjVar.D;
                if (i11 != 1 && i11 != 3 && i11 != 8) {
                    return false;
                }
                org.telegram.ui.dg0 dg0Var = new org.telegram.ui.dg0(chatActivityEnterView.getContext(), i6Var2);
                dg0Var.f47103h0 = true;
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
                dg0Var.r(arrayList);
                x60 G2 = x60.G(chatActivityEnterView.f32655c2, i6Var2, chatActivityEnterView.f32799v2);
                sa0 sa0Var = new sa0(chatActivityEnterView.getContext(), 2131624140, org.telegram.messenger.gd.N0(2131752548, null), 2131624139, org.telegram.messenger.gd.N0(2131752547, null), chatActivityEnterView.M4);
                sa0Var.a(!chatActivityEnterView.O6, false);
                sa0Var.setOnClickListener(new bi.s6(chatActivityEnterView, arrayList, sa0Var, dg0Var, 11));
                G2.q(sa0Var);
                G2.Z();
                dg0Var.q(G2);
                dg0Var.s(chatActivityEnterView.f32799v2, false, new bi.s6(chatActivityEnterView, ajVar, fjVar, dg0Var, 12));
                dg0Var.show();
                return true;
        }
    }
}
