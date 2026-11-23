package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
public final class gn implements ck {
    public final org.telegram.messenger.y10 f35638a;
    public final fi.n2 f35639b;
    public final org.telegram.ui.ActionBar.g2 f35640c;

    public gn(fi.n2 n2Var, org.telegram.messenger.y10 y10Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f35638a = y10Var;
        this.f35639b = n2Var;
        this.f35640c = g2Var;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f35640c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f35638a.a(new th.c((String) arrayList.get(0)));
        }
        this.f35639b.a(true);
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
        if (!arrayList.isEmpty()) {
            this.f35638a.a(new th.d((org.telegram.messenger.zy) arrayList.get(0)));
        }
        this.f35639b.a(true);
    }

    @Override
    public final void T() {
    }
}
