package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class h7 extends org.telegram.ui.Components.w81 {
    public org.telegram.ui.ActionBar.m1 f37516a;
    public final Context f37517b;
    public final org.telegram.ui.ActionBar.n2 f37518c;
    public final v7 d;

    public h7(v7 v7Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = v7Var;
        this.f37517b = context;
        this.f37518c = n2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.jm0 jm0Var = (org.telegram.ui.Components.jm0) view;
        ArrayList arrayList = this.d.e;
        jm0Var.setAdapter(((u7) arrayList.get(i10)).f41822c);
        if (((u7) arrayList.get(i10)).f41821b != 1 && ((u7) arrayList.get(i10)).f41821b != 4) {
            view.getContext();
            jm0Var.setLayoutManager(new s4.b0());
        } else {
            view.getContext();
            jm0Var.setLayoutManager(new s4.s(3));
        }
        jm0Var.setTag(Integer.valueOf(((u7) arrayList.get(i10)).f41821b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(this.f37517b, null);
        s4.k kVar = (s4.k) jm0Var.getItemAnimator();
        kVar.C = false;
        kVar.f45951m = false;
        jm0Var.setClipToPadding(false);
        jm0Var.setPadding(0, 0, 0, this.d.f42129s);
        jm0Var.setOnItemClickListener(new g7(this, jm0Var));
        jm0Var.setOnItemLongClickListener(new e7(this, jm0Var, this.f37518c, 0));
        return jm0Var;
    }

    @Override
    public final int e() {
        return this.d.e.size();
    }

    @Override
    public final int f(int i10) {
        return ((u7) this.d.e.get(i10)).f41821b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((u7) this.d.e.get(i10)).f41820a;
    }
}
