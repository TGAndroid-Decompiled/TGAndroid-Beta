package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
public final class xm implements nj {
    public final org.telegram.messenger.q20 f32507a;
    public final ag.v f32508b;
    public final org.telegram.ui.ActionBar.k2 f32509c;

    public xm(ag.v vVar, org.telegram.messenger.q20 q20Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f32507a = q20Var;
        this.f32508b = vVar;
        this.f32509c = k2Var;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f32509c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void m(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f32507a.a(new jh.c((String) arrayList.get(0)));
        }
        this.f32508b.a(true);
    }

    @Override
    public final void o(ArrayList arrayList, boolean z10, int i10, long j10) {
        if (!arrayList.isEmpty()) {
            this.f32507a.a(new jh.d((org.telegram.messenger.pz) arrayList.get(0)));
        }
        this.f32508b.a(true);
    }

    @Override
    public final void S() {
    }
}
