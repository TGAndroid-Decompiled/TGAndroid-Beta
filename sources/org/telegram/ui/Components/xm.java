package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
public final class xm implements tj {
    public final org.telegram.messenger.z10 f41717a;
    public final fi.p2 f41718b;
    public final org.telegram.ui.ActionBar.e2 f41719c;

    public xm(fi.p2 p2Var, org.telegram.messenger.z10 z10Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f41717a = z10Var;
        this.f41718b = p2Var;
        this.f41719c = e2Var;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f41719c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f41717a.a(new th.c((String) arrayList.get(0)));
        }
        this.f41718b.a(true);
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
        if (!arrayList.isEmpty()) {
            this.f41717a.a(new th.d((org.telegram.messenger.dz) arrayList.get(0)));
        }
        this.f41718b.a(true);
    }

    @Override
    public final void T() {
    }
}
