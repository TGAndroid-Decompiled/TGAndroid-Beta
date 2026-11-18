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
        gf gfVar;
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
                if (m0Var.f37287h2 == org.telegram.messenger.j10.i(m0Var.f30187a).e()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y60 G = y60.G(m0Var.f30193c, i6Var, m0Var.D2);
                G.l(2131231509, org.telegram.messenger.gd.M0(2131745388, null), new a(m0Var, 4), !z10);
                if (z10) {
                    i7 = 2131745319;
                } else {
                    i7 = 2131745664;
                }
                G.c(2131232079, org.telegram.messenger.gd.M0(i7, null), new kg.i0(m0Var, context, i6Var, 29), false);
                G.a0();
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj2;
                org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) obj;
                org.telegram.ui.ActionBar.i6 i6Var2 = chatActivityEnterView.K4;
                if (fjVar.F3() || (gfVar = chatActivityEnterView.F0) == null || TextUtils.isEmpty(gfVar.getTextToUse())) {
                    return false;
                }
                if (ajVar != null && (!ajVar.f22897c || ajVar.f22901i)) {
                    return false;
                }
                int i11 = fjVar.D;
                if (i11 != 1 && i11 != 3 && i11 != 8) {
                    return false;
                }
                org.telegram.ui.fg0 fg0Var = new org.telegram.ui.fg0(chatActivityEnterView.getContext(), i6Var2);
                fg0Var.f47630h0 = true;
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
                        arrayList.add(chatActivityEnterView.u0(fjVar2, z11));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.u0(fjVar, true));
                }
                fg0Var.r(arrayList);
                y60 G2 = y60.G(chatActivityEnterView.f32542a2, i6Var2, chatActivityEnterView.f32686t2);
                ta0 ta0Var = new ta0(chatActivityEnterView.getContext(), 2131624140, org.telegram.messenger.gd.M0(2131752549, null), 2131624139, org.telegram.messenger.gd.M0(2131752548, null), chatActivityEnterView.K4);
                ta0Var.a(!chatActivityEnterView.M6, false);
                ta0Var.setOnClickListener(new bi.m6(chatActivityEnterView, arrayList, ta0Var, fg0Var, 11));
                G2.q(ta0Var);
                G2.Z();
                fg0Var.q(G2);
                fg0Var.s(chatActivityEnterView.f32686t2, false, new bi.m6(chatActivityEnterView, ajVar, fjVar, fg0Var, 12));
                fg0Var.show();
                return true;
        }
    }
}
