package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class c7 extends org.telegram.ui.Components.g91 {
    public org.telegram.ui.ActionBar.m1 f36615a;
    public final Context f36616b;
    public final org.telegram.ui.ActionBar.m2 f36617c;
    public final q7 d;

    public c7(q7 q7Var, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = q7Var;
        this.f36616b = context;
        this.f36617c = m2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.rm0 rm0Var = (org.telegram.ui.Components.rm0) view;
        ArrayList arrayList = this.d.f41089e;
        rm0Var.setAdapter(((p7) arrayList.get(i10)).f40805c);
        if (((p7) arrayList.get(i10)).f40804b != 1 && ((p7) arrayList.get(i10)).f40804b != 4) {
            view.getContext();
            rm0Var.setLayoutManager(new s4.d0());
        } else {
            view.getContext();
            rm0Var.setLayoutManager(new s4.s(3));
        }
        rm0Var.setTag(Integer.valueOf(((p7) arrayList.get(i10)).f40804b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.rm0 rm0Var = new org.telegram.ui.Components.rm0(this.f36616b, null);
        s4.j jVar = (s4.j) rm0Var.getItemAnimator();
        jVar.C = false;
        jVar.f47822m = false;
        rm0Var.setClipToPadding(false);
        rm0Var.setPadding(0, 0, 0, this.d.f41093s);
        rm0Var.setOnItemClickListener(new b7(this, rm0Var));
        rm0Var.setOnItemLongClickListener(new z6(this, rm0Var, this.f36617c, 0));
        return rm0Var;
    }

    @Override
    public final int e() {
        return this.d.f41089e.size();
    }

    @Override
    public final int f(int i10) {
        return ((p7) this.d.f41089e.get(i10)).f40804b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((p7) this.d.f41089e.get(i10)).f40803a;
    }
}
