package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class e7 extends org.telegram.ui.Components.p81 {
    public org.telegram.ui.ActionBar.m1 f33365a;
    public final Context f33366b;
    public final org.telegram.ui.ActionBar.m2 f33367c;
    public final s7 d;

    public e7(s7 s7Var, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = s7Var;
        this.f33366b = context;
        this.f33367c = m2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.zl0 zl0Var = (org.telegram.ui.Components.zl0) view;
        ArrayList arrayList = this.d.e;
        zl0Var.setAdapter(((r7) arrayList.get(i10)).f37297c);
        if (((r7) arrayList.get(i10)).f37296b != 1 && ((r7) arrayList.get(i10)).f37296b != 4) {
            view.getContext();
            zl0Var.setLayoutManager(new s4.c0());
        } else {
            view.getContext();
            zl0Var.setLayoutManager(new s4.s(3));
        }
        zl0Var.setTag(Integer.valueOf(((r7) arrayList.get(i10)).f37296b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(this.f33366b, null);
        s4.j jVar = (s4.j) zl0Var.getItemAnimator();
        jVar.C = false;
        jVar.f43103m = false;
        zl0Var.setClipToPadding(false);
        zl0Var.setPadding(0, 0, 0, this.d.f37709s);
        zl0Var.setOnItemClickListener(new d7(this, zl0Var));
        zl0Var.setOnItemLongClickListener(new b7(this, zl0Var, this.f33367c, 0));
        return zl0Var;
    }

    @Override
    public final int e() {
        return this.d.e.size();
    }

    @Override
    public final int f(int i10) {
        return ((r7) this.d.e.get(i10)).f37296b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((r7) this.d.e.get(i10)).f37295a;
    }
}
