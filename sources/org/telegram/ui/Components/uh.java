package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
public final class uh implements tj {
    public final ki f40029a;

    public uh(ki kiVar) {
        this.f40029a = kiVar;
    }

    @Override
    public final void A() {
        ki kiVar = this.f40029a;
        tj tjVar = kiVar.S1;
        if (tjVar != null) {
            tjVar.A();
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36424a2;
        if (e2Var instanceof tj) {
            ((tj) e2Var).A();
        } else if (e2Var instanceof org.telegram.ui.ek0) {
            org.telegram.ui.ek0 ek0Var = (org.telegram.ui.ek0) e2Var;
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
    public final void T() {
        this.f40029a.p1(true);
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        ki kiVar = this.f40029a;
        tj tjVar = kiVar.S1;
        if (tjVar != null) {
            tjVar.n(arrayList, str, arrayList2, arrayList3, z10, i7, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36424a2;
        if (e2Var instanceof tj) {
            ((tj) e2Var).n(arrayList, str, arrayList2, arrayList3, z10, i7, j3, z11, j10);
        } else if (e2Var instanceof org.telegram.ui.ek0) {
            org.telegram.ui.ek0 ek0Var = (org.telegram.ui.ek0) e2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ?? obj = new Object();
                obj.f23196c = (String) arrayList.get(i10);
                arrayList4.add(obj);
            }
            ek0Var.K1(arrayList4);
        }
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
        ki kiVar = this.f40029a;
        tj tjVar = kiVar.S1;
        if (tjVar != null) {
            tjVar.p(arrayList, z10, i7, j3);
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36424a2;
        if (e2Var instanceof org.telegram.ui.an) {
            ((org.telegram.ui.an) e2Var).p(arrayList, z10, i7, j3);
        } else if (e2Var instanceof org.telegram.ui.ek0) {
            ((org.telegram.ui.ek0) e2Var).K1(arrayList);
        }
    }
}
