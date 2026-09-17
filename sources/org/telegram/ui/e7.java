package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class e7 extends org.telegram.ui.Components.a81 {
    public org.telegram.ui.ActionBar.n1 f35981a;
    public final Context f35982b;
    public final org.telegram.ui.ActionBar.n2 f35983c;
    public final s7 d;

    public e7(s7 s7Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = s7Var;
        this.f35982b = context;
        this.f35983c = n2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.ll0 ll0Var = (org.telegram.ui.Components.ll0) view;
        ArrayList arrayList = this.d.f40357e;
        ll0Var.setAdapter(((r7) arrayList.get(i10)).f40111c);
        if (((r7) arrayList.get(i10)).f40110b != 1 && ((r7) arrayList.get(i10)).f40110b != 4) {
            view.getContext();
            ll0Var.setLayoutManager(new s4.c0());
        } else {
            view.getContext();
            ll0Var.setLayoutManager(new s4.s(3));
        }
        ll0Var.setTag(Integer.valueOf(((r7) arrayList.get(i10)).f40110b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(this.f35982b, null);
        s4.j jVar = (s4.j) ll0Var.getItemAnimator();
        jVar.C = false;
        jVar.f45806m = false;
        ll0Var.setClipToPadding(false);
        ll0Var.setPadding(0, 0, 0, this.d.f40361s);
        ll0Var.setOnItemClickListener(new d7(this, ll0Var));
        ll0Var.setOnItemLongClickListener(new b7(this, ll0Var, this.f35983c, 0));
        return ll0Var;
    }

    @Override
    public final int e() {
        return this.d.f40357e.size();
    }

    @Override
    public final int f(int i10) {
        return ((r7) this.d.f40357e.get(i10)).f40110b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((r7) this.d.f40357e.get(i10)).f40109a;
    }
}
