package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
public final class ei implements ck {
    public final ui f34814a;

    public ei(ui uiVar) {
        this.f34814a = uiVar;
    }

    @Override
    public final void A() {
        ui uiVar = this.f34814a;
        ck ckVar = uiVar.S1;
        if (ckVar != null) {
            ckVar.A();
            return;
        }
        org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40367a2;
        if (g2Var instanceof ck) {
            ((ck) g2Var).A();
        } else if (g2Var instanceof org.telegram.ui.hk0) {
            org.telegram.ui.hk0 hk0Var = (org.telegram.ui.hk0) g2Var;
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
        this.f34814a.q1(true);
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        ui uiVar = this.f34814a;
        ck ckVar = uiVar.S1;
        if (ckVar != null) {
            ckVar.n(arrayList, str, arrayList2, arrayList3, z10, i7, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40367a2;
        if (g2Var instanceof ck) {
            ((ck) g2Var).n(arrayList, str, arrayList2, arrayList3, z10, i7, j3, z11, j10);
        } else if (g2Var instanceof org.telegram.ui.hk0) {
            org.telegram.ui.hk0 hk0Var = (org.telegram.ui.hk0) g2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ?? obj = new Object();
                obj.f28407c = (String) arrayList.get(i10);
                arrayList4.add(obj);
            }
            hk0Var.K1(arrayList4);
        }
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
        ui uiVar = this.f34814a;
        ck ckVar = uiVar.S1;
        if (ckVar != null) {
            ckVar.p(arrayList, z10, i7, j3);
            return;
        }
        org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40367a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            ((org.telegram.ui.bn) g2Var).p(arrayList, z10, i7, j3);
        } else if (g2Var instanceof org.telegram.ui.hk0) {
            ((org.telegram.ui.hk0) g2Var).K1(arrayList);
        }
    }
}
