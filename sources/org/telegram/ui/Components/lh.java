package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
public final class lh implements nj {
    public final bi f28166a;

    public lh(bi biVar) {
        this.f28166a = biVar;
    }

    @Override
    public final void B() {
        bi biVar = this.f28166a;
        nj njVar = biVar.O1;
        if (njVar != null) {
            njVar.B();
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if (k2Var instanceof nj) {
            ((nj) k2Var).B();
        } else if (k2Var instanceof org.telegram.ui.jl0) {
            org.telegram.ui.jl0 jl0Var = (org.telegram.ui.jl0) k2Var;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                jl0Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    @Override
    public final void T() {
        this.f28166a.o1(true);
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        bi biVar = this.f28166a;
        nj njVar = biVar.O1;
        if (njVar != null) {
            njVar.n(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if (k2Var instanceof nj) {
            ((nj) k2Var).n(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
        } else if (k2Var instanceof org.telegram.ui.jl0) {
            org.telegram.ui.jl0 jl0Var = (org.telegram.ui.jl0) k2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ?? obj = new Object();
                obj.f17850c = (String) arrayList.get(i11);
                arrayList4.add(obj);
            }
            jl0Var.K1(arrayList4);
        }
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i10, long j10) {
        bi biVar = this.f28166a;
        nj njVar = biVar.O1;
        if (njVar != null) {
            njVar.p(arrayList, z10, i10, j10);
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            ((org.telegram.ui.un) k2Var).p(arrayList, z10, i10, j10);
        } else if (k2Var instanceof org.telegram.ui.jl0) {
            ((org.telegram.ui.jl0) k2Var).K1(arrayList);
        }
    }
}
