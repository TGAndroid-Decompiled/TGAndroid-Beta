package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
public final class ci implements ak {
    public final si f34015a;

    public ci(si siVar) {
        this.f34015a = siVar;
    }

    @Override
    public final void A() {
        si siVar = this.f34015a;
        ak akVar = siVar.S1;
        if (akVar != null) {
            akVar.A();
            return;
        }
        org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
        if (h2Var instanceof ak) {
            ((ak) h2Var).A();
        } else if (h2Var instanceof org.telegram.ui.hk0) {
            org.telegram.ui.hk0 hk0Var = (org.telegram.ui.hk0) h2Var;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                hk0Var.startActivityForResult(intent, 21);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void T() {
        this.f34015a.q1(true);
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        si siVar = this.f34015a;
        ak akVar = siVar.S1;
        if (akVar != null) {
            akVar.n(arrayList, str, arrayList2, arrayList3, z10, i7, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
        if (h2Var instanceof ak) {
            ((ak) h2Var).n(arrayList, str, arrayList2, arrayList3, z10, i7, j3, z11, j10);
        } else if (h2Var instanceof org.telegram.ui.hk0) {
            org.telegram.ui.hk0 hk0Var = (org.telegram.ui.hk0) h2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ?? obj = new Object();
                obj.f28211c = (String) arrayList.get(i10);
                arrayList4.add(obj);
            }
            hk0Var.K1(arrayList4);
        }
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
        si siVar = this.f34015a;
        ak akVar = siVar.S1;
        if (akVar != null) {
            akVar.p(arrayList, z10, i7, j3);
            return;
        }
        org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            ((org.telegram.ui.bn) h2Var).p(arrayList, z10, i7, j3);
        } else if (h2Var instanceof org.telegram.ui.hk0) {
            ((org.telegram.ui.hk0) h2Var).K1(arrayList);
        }
    }
}
