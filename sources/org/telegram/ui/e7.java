package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class e7 extends org.telegram.ui.Components.z71 {
    public org.telegram.ui.ActionBar.n1 f32830a;
    public final Context f32831b;
    public final org.telegram.ui.ActionBar.n2 f32832c;
    public final s7 d;

    public e7(s7 s7Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = s7Var;
        this.f32831b = context;
        this.f32832c = n2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.ml0 ml0Var = (org.telegram.ui.Components.ml0) view;
        ArrayList arrayList = this.d.e;
        ml0Var.setAdapter(((r7) arrayList.get(i10)).f36708c);
        if (((r7) arrayList.get(i10)).f36707b != 1 && ((r7) arrayList.get(i10)).f36707b != 4) {
            view.getContext();
            ml0Var.setLayoutManager(new s4.c0());
        } else {
            view.getContext();
            ml0Var.setLayoutManager(new s4.s(3));
        }
        ml0Var.setTag(Integer.valueOf(((r7) arrayList.get(i10)).f36707b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(this.f32831b, null);
        s4.j jVar = (s4.j) ml0Var.getItemAnimator();
        jVar.C = false;
        jVar.f42662m = false;
        ml0Var.setClipToPadding(false);
        ml0Var.setPadding(0, 0, 0, this.d.f37143s);
        ml0Var.setOnItemClickListener(new d7(this, ml0Var));
        ml0Var.setOnItemLongClickListener(new b7(this, ml0Var, this.f32832c, 0));
        return ml0Var;
    }

    @Override
    public final int e() {
        return this.d.e.size();
    }

    @Override
    public final int f(int i10) {
        return ((r7) this.d.e.get(i10)).f36707b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((r7) this.d.e.get(i10)).f36706a;
    }
}
