package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
public final class en implements bk {
    public final org.telegram.messenger.w10 f34805a;
    public final fi.n2 f34806b;
    public final org.telegram.ui.ActionBar.g2 f34807c;

    public en(fi.n2 n2Var, org.telegram.messenger.w10 w10Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f34805a = w10Var;
        this.f34806b = n2Var;
        this.f34807c = g2Var;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f34807c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f34805a.a(new th.c((String) arrayList.get(0)));
        }
        this.f34806b.a(true);
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
        if (!arrayList.isEmpty()) {
            this.f34805a.a(new th.d((org.telegram.messenger.yy) arrayList.get(0)));
        }
        this.f34806b.a(true);
    }

    @Override
    public final void T() {
    }
}
