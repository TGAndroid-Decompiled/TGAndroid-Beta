package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class e7 extends org.telegram.ui.Components.n81 {
    public org.telegram.ui.ActionBar.m1 f33283a;
    public final Context f33284b;
    public final org.telegram.ui.ActionBar.m2 f33285c;
    public final s7 d;

    public e7(s7 s7Var, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = s7Var;
        this.f33284b = context;
        this.f33285c = m2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) view;
        ArrayList arrayList = this.d.e;
        wl0Var.setAdapter(((r7) arrayList.get(i10)).f37196c);
        if (((r7) arrayList.get(i10)).f37195b != 1 && ((r7) arrayList.get(i10)).f37195b != 4) {
            view.getContext();
            wl0Var.setLayoutManager(new s4.c0());
        } else {
            view.getContext();
            wl0Var.setLayoutManager(new s4.s(3));
        }
        wl0Var.setTag(Integer.valueOf(((r7) arrayList.get(i10)).f37195b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(this.f33284b, null);
        s4.j jVar = (s4.j) wl0Var.getItemAnimator();
        jVar.C = false;
        jVar.f42996m = false;
        wl0Var.setClipToPadding(false);
        wl0Var.setPadding(0, 0, 0, this.d.f37614s);
        wl0Var.setOnItemClickListener(new d7(this, wl0Var));
        wl0Var.setOnItemLongClickListener(new b7(this, wl0Var, this.f33285c, 0));
        return wl0Var;
    }

    @Override
    public final int e() {
        return this.d.e.size();
    }

    @Override
    public final int f(int i10) {
        return ((r7) this.d.e.get(i10)).f37195b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((r7) this.d.e.get(i10)).f37194a;
    }
}
