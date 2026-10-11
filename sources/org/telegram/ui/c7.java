package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class c7 extends org.telegram.ui.Components.h91 {
    public org.telegram.ui.ActionBar.m1 f36581a;
    public final Context f36582b;
    public final org.telegram.ui.ActionBar.m2 f36583c;
    public final q7 d;

    public c7(q7 q7Var, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = q7Var;
        this.f36582b = context;
        this.f36583c = m2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.sm0 sm0Var = (org.telegram.ui.Components.sm0) view;
        ArrayList arrayList = this.d.f41055e;
        sm0Var.setAdapter(((p7) arrayList.get(i10)).f40771c);
        if (((p7) arrayList.get(i10)).f40770b != 1 && ((p7) arrayList.get(i10)).f40770b != 4) {
            view.getContext();
            sm0Var.setLayoutManager(new s4.d0());
        } else {
            view.getContext();
            sm0Var.setLayoutManager(new s4.s(3));
        }
        sm0Var.setTag(Integer.valueOf(((p7) arrayList.get(i10)).f40770b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.sm0 sm0Var = new org.telegram.ui.Components.sm0(this.f36582b, null);
        s4.j jVar = (s4.j) sm0Var.getItemAnimator();
        jVar.C = false;
        jVar.f47788m = false;
        sm0Var.setClipToPadding(false);
        sm0Var.setPadding(0, 0, 0, this.d.f41059s);
        sm0Var.setOnItemClickListener(new b7(this, sm0Var));
        sm0Var.setOnItemLongClickListener(new z6(this, sm0Var, this.f36583c, 0));
        return sm0Var;
    }

    @Override
    public final int e() {
        return this.d.f41055e.size();
    }

    @Override
    public final int f(int i10) {
        return ((p7) this.d.f41055e.get(i10)).f40770b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((p7) this.d.f41055e.get(i10)).f40769a;
    }
}
