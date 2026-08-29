package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class c7 extends org.telegram.ui.Components.q71 {
    public org.telegram.ui.ActionBar.o1 f37009a;
    public final Context f37010b;
    public final org.telegram.ui.ActionBar.o2 f37011c;
    public final q7 d;

    public c7(q7 q7Var, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        this.d = q7Var;
        this.f37010b = context;
        this.f37011c = o2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.jl0 jl0Var = (org.telegram.ui.Components.jl0) view;
        ArrayList arrayList = this.d.f41550e;
        jl0Var.setAdapter(((p7) arrayList.get(i10)).f41309c);
        if (((p7) arrayList.get(i10)).f41308b != 1 && ((p7) arrayList.get(i10)).f41308b != 4) {
            view.getContext();
            jl0Var.setLayoutManager(new f2.j0());
        } else {
            view.getContext();
            jl0Var.setLayoutManager(new f2.w(3));
        }
        jl0Var.setTag(Integer.valueOf(((p7) arrayList.get(i10)).f41308b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(this.f37010b, null);
        f2.l lVar = (f2.l) jl0Var.getItemAnimator();
        lVar.C = false;
        lVar.f6463m = false;
        jl0Var.setClipToPadding(false);
        jl0Var.setPadding(0, 0, 0, this.d.f41554s);
        jl0Var.setOnItemClickListener(new b7(this, jl0Var));
        jl0Var.setOnItemLongClickListener(new z6(this, jl0Var, this.f37011c, 0));
        return jl0Var;
    }

    @Override
    public final int e() {
        return this.d.f41550e.size();
    }

    @Override
    public final int f(int i10) {
        return ((p7) this.d.f41550e.get(i10)).f41308b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((p7) this.d.f41550e.get(i10)).f41307a;
    }
}
