package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class e7 extends org.telegram.ui.Components.o81 {
    public org.telegram.ui.ActionBar.m1 f33281a;
    public final Context f33282b;
    public final org.telegram.ui.ActionBar.m2 f33283c;
    public final s7 d;

    public e7(s7 s7Var, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = s7Var;
        this.f33282b = context;
        this.f33283c = m2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.xl0 xl0Var = (org.telegram.ui.Components.xl0) view;
        ArrayList arrayList = this.d.e;
        xl0Var.setAdapter(((r7) arrayList.get(i10)).f37194c);
        if (((r7) arrayList.get(i10)).f37193b != 1 && ((r7) arrayList.get(i10)).f37193b != 4) {
            view.getContext();
            xl0Var.setLayoutManager(new s4.c0());
        } else {
            view.getContext();
            xl0Var.setLayoutManager(new s4.s(3));
        }
        xl0Var.setTag(Integer.valueOf(((r7) arrayList.get(i10)).f37193b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.xl0 xl0Var = new org.telegram.ui.Components.xl0(this.f33282b, null);
        s4.j jVar = (s4.j) xl0Var.getItemAnimator();
        jVar.C = false;
        jVar.f42994m = false;
        xl0Var.setClipToPadding(false);
        xl0Var.setPadding(0, 0, 0, this.d.f37612s);
        xl0Var.setOnItemClickListener(new d7(this, xl0Var));
        xl0Var.setOnItemLongClickListener(new b7(this, xl0Var, this.f33283c, 0));
        return xl0Var;
    }

    @Override
    public final int e() {
        return this.d.e.size();
    }

    @Override
    public final int f(int i10) {
        return ((r7) this.d.e.get(i10)).f37193b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((r7) this.d.e.get(i10)).f37192a;
    }
}
