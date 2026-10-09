package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class d7 extends org.telegram.ui.Components.f91 {
    public org.telegram.ui.ActionBar.n1 f36874a;
    public final Context f36875b;
    public final org.telegram.ui.ActionBar.n2 f36876c;
    public final r7 d;

    public d7(r7 r7Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = r7Var;
        this.f36875b = context;
        this.f36876c = n2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.qm0 qm0Var = (org.telegram.ui.Components.qm0) view;
        ArrayList arrayList = this.d.f41291e;
        qm0Var.setAdapter(((q7) arrayList.get(i10)).f41034c);
        if (((q7) arrayList.get(i10)).f41033b != 1 && ((q7) arrayList.get(i10)).f41033b != 4) {
            view.getContext();
            qm0Var.setLayoutManager(new s4.d0());
        } else {
            view.getContext();
            qm0Var.setLayoutManager(new s4.s(3));
        }
        qm0Var.setTag(Integer.valueOf(((q7) arrayList.get(i10)).f41033b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(this.f36875b, null);
        s4.j jVar = (s4.j) qm0Var.getItemAnimator();
        jVar.C = false;
        jVar.f47698m = false;
        qm0Var.setClipToPadding(false);
        qm0Var.setPadding(0, 0, 0, this.d.f41295s);
        qm0Var.setOnItemClickListener(new c7(this, qm0Var));
        qm0Var.setOnItemLongClickListener(new a7(this, qm0Var, this.f36876c, 0));
        return qm0Var;
    }

    @Override
    public final int e() {
        return this.d.f41291e.size();
    }

    @Override
    public final int f(int i10) {
        return ((q7) this.d.f41291e.get(i10)).f41033b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((q7) this.d.f41291e.get(i10)).f41032a;
    }
}
