package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
public final class om implements lj {
    public final org.telegram.messenger.c20 f36632a;
    public final di.u2 f36633b;
    public final org.telegram.ui.ActionBar.f2 f36634c;

    public om(di.u2 u2Var, org.telegram.messenger.c20 c20Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f36632a = c20Var;
        this.f36633b = u2Var;
        this.f36634c = f2Var;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f36634c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z9, int i7, long j3, boolean z10, long j10) {
        if (!arrayList.isEmpty()) {
            this.f36632a.a(new th.c((String) arrayList.get(0)));
        }
        this.f36633b.a(true);
    }

    @Override
    public final void p(ArrayList arrayList, boolean z9, int i7, long j3) {
        if (!arrayList.isEmpty()) {
            this.f36632a.a(new th.d((org.telegram.messenger.fz) arrayList.get(0)));
        }
        this.f36633b.a(true);
    }

    @Override
    public final void S() {
    }
}
