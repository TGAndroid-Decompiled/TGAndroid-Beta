package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class d7 extends org.telegram.ui.Components.g91 {
    public org.telegram.ui.ActionBar.n1 f36918a;
    public final Context f36919b;
    public final org.telegram.ui.ActionBar.n2 f36920c;
    public final r7 d;

    public d7(r7 r7Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = r7Var;
        this.f36919b = context;
        this.f36920c = n2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.rm0 rm0Var = (org.telegram.ui.Components.rm0) view;
        ArrayList arrayList = this.d.f41335e;
        rm0Var.setAdapter(((q7) arrayList.get(i10)).f41078c);
        if (((q7) arrayList.get(i10)).f41077b != 1 && ((q7) arrayList.get(i10)).f41077b != 4) {
            view.getContext();
            rm0Var.setLayoutManager(new s4.d0());
        } else {
            view.getContext();
            rm0Var.setLayoutManager(new s4.s(3));
        }
        rm0Var.setTag(Integer.valueOf(((q7) arrayList.get(i10)).f41077b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.rm0 rm0Var = new org.telegram.ui.Components.rm0(this.f36919b, null);
        s4.j jVar = (s4.j) rm0Var.getItemAnimator();
        jVar.C = false;
        jVar.f47742m = false;
        rm0Var.setClipToPadding(false);
        rm0Var.setPadding(0, 0, 0, this.d.f41339s);
        rm0Var.setOnItemClickListener(new c7(this, rm0Var));
        rm0Var.setOnItemLongClickListener(new a7(this, rm0Var, this.f36920c, 0));
        return rm0Var;
    }

    @Override
    public final int e() {
        return this.d.f41335e.size();
    }

    @Override
    public final int f(int i10) {
        return ((q7) this.d.f41335e.get(i10)).f41077b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((q7) this.d.f41335e.get(i10)).f41076a;
    }
}
