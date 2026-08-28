package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class d7 extends org.telegram.ui.Components.e71 {
    public org.telegram.ui.ActionBar.o1 f37425a;
    public final Context f37426b;
    public final org.telegram.ui.ActionBar.o2 f37427c;
    public final r7 d;

    public d7(r7 r7Var, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        this.d = r7Var;
        this.f37426b = context;
        this.f37427c = o2Var;
    }

    @Override
    public final void b(View view, int i9, int i10) {
        org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) view;
        ArrayList arrayList = this.d.f42293e;
        wk0Var.setAdapter(((q7) arrayList.get(i9)).f41699c);
        if (((q7) arrayList.get(i9)).f41698b != 1 && ((q7) arrayList.get(i9)).f41698b != 4) {
            view.getContext();
            wk0Var.setLayoutManager(new f2.m0());
        } else {
            view.getContext();
            wk0Var.setLayoutManager(new f2.y(3));
        }
        wk0Var.setTag(Integer.valueOf(((q7) arrayList.get(i9)).f41698b));
    }

    @Override
    public final View d(int i9) {
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(this.f37426b, null);
        f2.n nVar = (f2.n) wk0Var.getItemAnimator();
        nVar.C = false;
        nVar.f5532m = false;
        wk0Var.setClipToPadding(false);
        wk0Var.setPadding(0, 0, 0, this.d.f42297s);
        wk0Var.setOnItemClickListener(new c7(this, wk0Var));
        wk0Var.setOnItemLongClickListener(new a7(this, wk0Var, this.f37427c, 0));
        return wk0Var;
    }

    @Override
    public final int e() {
        return this.d.f42293e.size();
    }

    @Override
    public final int f(int i9) {
        return ((q7) this.d.f42293e.get(i9)).f41698b;
    }

    @Override
    public final CharSequence g(int i9) {
        return ((q7) this.d.f42293e.get(i9)).f41697a;
    }
}
