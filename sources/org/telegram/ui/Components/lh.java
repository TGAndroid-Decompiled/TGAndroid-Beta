package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
public final class lh implements nj {
    public final bi f28112a;

    public lh(bi biVar) {
        this.f28112a = biVar;
    }

    @Override
    public final void A() {
        bi biVar = this.f28112a;
        nj njVar = biVar.O1;
        if (njVar != null) {
            njVar.A();
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if (k2Var instanceof nj) {
            ((nj) k2Var).A();
        } else if (k2Var instanceof org.telegram.ui.ll0) {
            org.telegram.ui.ll0 ll0Var = (org.telegram.ui.ll0) k2Var;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                ll0Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    @Override
    public final void S() {
        this.f28112a.o1(true);
    }

    @Override
    public final void m(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        bi biVar = this.f28112a;
        nj njVar = biVar.O1;
        if (njVar != null) {
            njVar.m(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if (k2Var instanceof nj) {
            ((nj) k2Var).m(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
        } else if (k2Var instanceof org.telegram.ui.ll0) {
            org.telegram.ui.ll0 ll0Var = (org.telegram.ui.ll0) k2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ?? obj = new Object();
                obj.f17515c = (String) arrayList.get(i11);
                arrayList4.add(obj);
            }
            ll0Var.J1(arrayList4);
        }
    }

    @Override
    public final void o(ArrayList arrayList, boolean z10, int i10, long j10) {
        bi biVar = this.f28112a;
        nj njVar = biVar.O1;
        if (njVar != null) {
            njVar.o(arrayList, z10, i10, j10);
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            ((org.telegram.ui.un) k2Var).o(arrayList, z10, i10, j10);
        } else if (k2Var instanceof org.telegram.ui.ll0) {
            ((org.telegram.ui.ll0) k2Var).J1(arrayList);
        }
    }
}
