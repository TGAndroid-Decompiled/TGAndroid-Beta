package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
public final class kh implements lj {
    public final bi f35408a;

    public kh(bi biVar) {
        this.f35408a = biVar;
    }

    @Override
    public final void A() {
        bi biVar = this.f35408a;
        lj ljVar = biVar.P1;
        if (ljVar != null) {
            ljVar.A();
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        if (d2Var instanceof lj) {
            ((lj) d2Var).A();
        } else if (d2Var instanceof org.telegram.ui.yj0) {
            org.telegram.ui.yj0 yj0Var = (org.telegram.ui.yj0) d2Var;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                yj0Var.startActivityForResult(intent, 21);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void S() {
        this.f35408a.p1(true);
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i3, long j10, boolean z11, long j11) {
        bi biVar = this.f35408a;
        lj ljVar = biVar.P1;
        if (ljVar != null) {
            ljVar.n(arrayList, str, arrayList2, arrayList3, z10, i3, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        if (d2Var instanceof lj) {
            ((lj) d2Var).n(arrayList, str, arrayList2, arrayList3, z10, i3, j10, z11, j11);
        } else if (d2Var instanceof org.telegram.ui.yj0) {
            org.telegram.ui.yj0 yj0Var = (org.telegram.ui.yj0) d2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ?? obj = new Object();
                obj.f26477c = (String) arrayList.get(i10);
                arrayList4.add(obj);
            }
            yj0Var.K1(arrayList4);
        }
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i3, long j10) {
        bi biVar = this.f35408a;
        lj ljVar = biVar.P1;
        if (ljVar != null) {
            ljVar.p(arrayList, z10, i3, j10);
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            ((org.telegram.ui.wm) d2Var).p(arrayList, z10, i3, j10);
        } else if (d2Var instanceof org.telegram.ui.yj0) {
            ((org.telegram.ui.yj0) d2Var).K1(arrayList);
        }
    }
}
