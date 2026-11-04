package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
public final class om implements lj {
    public final org.telegram.messenger.u10 f36856a;
    public final ei.x2 f36857b;
    public final org.telegram.ui.ActionBar.d2 f36858c;

    public om(ei.x2 x2Var, org.telegram.messenger.u10 u10Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f36856a = u10Var;
        this.f36857b = x2Var;
        this.f36858c = d2Var;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f36858c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i3, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f36856a.a(new uh.c((String) arrayList.get(0)));
        }
        this.f36857b.a(true);
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i3, long j10) {
        if (!arrayList.isEmpty()) {
            this.f36856a.a(new uh.d((org.telegram.messenger.xy) arrayList.get(0)));
        }
        this.f36857b.a(true);
    }

    @Override
    public final void S() {
    }
}
