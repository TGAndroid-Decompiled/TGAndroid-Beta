package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class d7 extends org.telegram.ui.Components.n81 {
    public org.telegram.ui.ActionBar.p1 f31848a;
    public final Context f31849b;
    public final org.telegram.ui.ActionBar.p2 f31850c;
    public final r7 d;

    public d7(r7 r7Var, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        this.d = r7Var;
        this.f31849b = context;
        this.f31850c = p2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.vl0 vl0Var = (org.telegram.ui.Components.vl0) view;
        ArrayList arrayList = this.d.e;
        vl0Var.setAdapter(((q7) arrayList.get(i10)).f35986c);
        if (((q7) arrayList.get(i10)).f35985b != 1 && ((q7) arrayList.get(i10)).f35985b != 4) {
            view.getContext();
            vl0Var.setLayoutManager(new s4.c0());
        } else {
            view.getContext();
            vl0Var.setLayoutManager(new s4.s(3));
        }
        vl0Var.setTag(Integer.valueOf(((q7) arrayList.get(i10)).f35985b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(this.f31849b, null);
        s4.j jVar = (s4.j) vl0Var.getItemAnimator();
        jVar.C = false;
        jVar.f41645m = false;
        vl0Var.setClipToPadding(false);
        vl0Var.setPadding(0, 0, 0, this.d.f36249s);
        vl0Var.setOnItemClickListener(new c7(this, vl0Var));
        vl0Var.setOnItemLongClickListener(new a7(this, vl0Var, this.f31850c, 0));
        return vl0Var;
    }

    @Override
    public final int e() {
        return this.d.e.size();
    }

    @Override
    public final int f(int i10) {
        return ((q7) this.d.e.get(i10)).f35985b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((q7) this.d.e.get(i10)).f35984a;
    }
}
