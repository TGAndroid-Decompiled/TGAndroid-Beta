package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class h7 extends org.telegram.ui.Components.d91 {
    public org.telegram.ui.ActionBar.m1 f37766a;
    public final Context f37767b;
    public final org.telegram.ui.ActionBar.o2 f37768c;
    public final v7 d;

    public h7(v7 v7Var, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        this.d = v7Var;
        this.f37767b = context;
        this.f37768c = o2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.lm0 lm0Var = (org.telegram.ui.Components.lm0) view;
        ArrayList arrayList = this.d.f42593f;
        lm0Var.setAdapter(((u7) arrayList.get(i10)).f42337c);
        if (((u7) arrayList.get(i10)).f42336b != 1 && ((u7) arrayList.get(i10)).f42336b != 4) {
            view.getContext();
            lm0Var.setLayoutManager(new s4.b0());
        } else {
            view.getContext();
            lm0Var.setLayoutManager(new s4.s(3));
        }
        lm0Var.setTag(Integer.valueOf(((u7) arrayList.get(i10)).f42336b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(this.f37767b, null);
        s4.k kVar = (s4.k) lm0Var.getItemAnimator();
        kVar.C = false;
        kVar.f46376m = false;
        lm0Var.setClipToPadding(false);
        lm0Var.setPadding(0, 0, 0, this.d.v);
        lm0Var.setOnItemClickListener(new g7(this, lm0Var));
        lm0Var.setOnItemLongClickListener(new e7(this, lm0Var, this.f37768c, 0));
        return lm0Var;
    }

    @Override
    public final int e() {
        return this.d.f42593f.size();
    }

    @Override
    public final int f(int i10) {
        return ((u7) this.d.f42593f.get(i10)).f42336b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((u7) this.d.f42593f.get(i10)).f42335a;
    }
}
