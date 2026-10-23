package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class h7 extends org.telegram.ui.Components.d91 {
    public org.telegram.ui.ActionBar.m1 f37761a;
    public final Context f37762b;
    public final org.telegram.ui.ActionBar.o2 f37763c;
    public final v7 d;

    public h7(v7 v7Var, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        this.d = v7Var;
        this.f37762b = context;
        this.f37763c = o2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) view;
        ArrayList arrayList = this.d.f42625f;
        mm0Var.setAdapter(((u7) arrayList.get(i10)).f42290c);
        if (((u7) arrayList.get(i10)).f42289b != 1 && ((u7) arrayList.get(i10)).f42289b != 4) {
            view.getContext();
            mm0Var.setLayoutManager(new s4.b0());
        } else {
            view.getContext();
            mm0Var.setLayoutManager(new s4.s(3));
        }
        mm0Var.setTag(Integer.valueOf(((u7) arrayList.get(i10)).f42289b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(this.f37762b, null);
        s4.k kVar = (s4.k) mm0Var.getItemAnimator();
        kVar.C = false;
        kVar.f46377m = false;
        mm0Var.setClipToPadding(false);
        mm0Var.setPadding(0, 0, 0, this.d.v);
        mm0Var.setOnItemClickListener(new g7(this, mm0Var));
        mm0Var.setOnItemLongClickListener(new e7(this, mm0Var, this.f37763c, 0));
        return mm0Var;
    }

    @Override
    public final int e() {
        return this.d.f42625f.size();
    }

    @Override
    public final int f(int i10) {
        return ((u7) this.d.f42625f.get(i10)).f42289b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((u7) this.d.f42625f.get(i10)).f42288a;
    }
}
