package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
public final class pm implements mj {
    public final org.telegram.messenger.c20 f37038a;
    public final di.u2 f37039b;
    public final org.telegram.ui.ActionBar.f2 f37040c;

    public pm(di.u2 u2Var, org.telegram.messenger.c20 c20Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f37038a = c20Var;
        this.f37039b = u2Var;
        this.f37040c = f2Var;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f37040c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z9, int i7, long j3, boolean z10, long j10) {
        if (!arrayList.isEmpty()) {
            this.f37038a.a(new th.c((String) arrayList.get(0)));
        }
        this.f37039b.a(true);
    }

    @Override
    public final void p(ArrayList arrayList, boolean z9, int i7, long j3) {
        if (!arrayList.isEmpty()) {
            this.f37038a.a(new th.d((org.telegram.messenger.fz) arrayList.get(0)));
        }
        this.f37039b.a(true);
    }

    @Override
    public final void S() {
    }
}
