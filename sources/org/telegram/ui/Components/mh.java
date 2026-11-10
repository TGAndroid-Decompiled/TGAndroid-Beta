package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
public final class mh implements lj {
    public final ci f35960a;

    public mh(ci ciVar) {
        this.f35960a = ciVar;
    }

    @Override
    public final void A() {
        ci ciVar = this.f35960a;
        lj ljVar = ciVar.R1;
        if (ljVar != null) {
            ljVar.A();
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
        if (f2Var instanceof lj) {
            ((lj) f2Var).A();
        } else if (f2Var instanceof org.telegram.ui.ek0) {
            org.telegram.ui.ek0 ek0Var = (org.telegram.ui.ek0) f2Var;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                ek0Var.startActivityForResult(intent, 21);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void S() {
        this.f35960a.p1(true);
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z9, int i7, long j3, boolean z10, long j10) {
        ci ciVar = this.f35960a;
        lj ljVar = ciVar.R1;
        if (ljVar != null) {
            ljVar.n(arrayList, str, arrayList2, arrayList3, z9, i7, j3, z10, j10);
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
        if (f2Var instanceof lj) {
            ((lj) f2Var).n(arrayList, str, arrayList2, arrayList3, z9, i7, j3, z10, j10);
        } else if (f2Var instanceof org.telegram.ui.ek0) {
            org.telegram.ui.ek0 ek0Var = (org.telegram.ui.ek0) f2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ?? obj = new Object();
                obj.f22516c = (String) arrayList.get(i10);
                arrayList4.add(obj);
            }
            ek0Var.K1(arrayList4);
        }
    }

    @Override
    public final void p(ArrayList arrayList, boolean z9, int i7, long j3) {
        ci ciVar = this.f35960a;
        lj ljVar = ciVar.R1;
        if (ljVar != null) {
            ljVar.p(arrayList, z9, i7, j3);
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            ((org.telegram.ui.cn) f2Var).p(arrayList, z9, i7, j3);
        } else if (f2Var instanceof org.telegram.ui.ek0) {
            ((org.telegram.ui.ek0) f2Var).K1(arrayList);
        }
    }
}
