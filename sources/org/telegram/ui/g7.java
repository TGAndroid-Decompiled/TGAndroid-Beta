package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class g7 extends org.telegram.ui.Components.l91 {
    public org.telegram.ui.ActionBar.m1 f37959a;
    public final Context f37960b;
    public final org.telegram.ui.ActionBar.m2 f37961c;
    public final u7 d;

    public g7(u7 u7Var, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = u7Var;
        this.f37960b = context;
        this.f37961c = m2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.wm0 wm0Var = (org.telegram.ui.Components.wm0) view;
        ArrayList arrayList = this.d.f42383e;
        wm0Var.setAdapter(((t7) arrayList.get(i10)).f42114c);
        if (((t7) arrayList.get(i10)).f42113b != 1 && ((t7) arrayList.get(i10)).f42113b != 4) {
            view.getContext();
            wm0Var.setLayoutManager(new s4.d0());
        } else {
            view.getContext();
            wm0Var.setLayoutManager(new s4.s(3));
        }
        wm0Var.setTag(Integer.valueOf(((t7) arrayList.get(i10)).f42113b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(this.f37960b, null);
        s4.j jVar = (s4.j) wm0Var.getItemAnimator();
        jVar.C = false;
        jVar.f47937m = false;
        wm0Var.setClipToPadding(false);
        wm0Var.setPadding(0, 0, 0, this.d.f42387s);
        wm0Var.setOnItemClickListener(new f7(this, wm0Var));
        wm0Var.setOnItemLongClickListener(new d7(this, wm0Var, this.f37961c, 0));
        return wm0Var;
    }

    @Override
    public final int e() {
        return this.d.f42383e.size();
    }

    @Override
    public final int f(int i10) {
        return ((t7) this.d.f42383e.get(i10)).f42113b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((t7) this.d.f42383e.get(i10)).f42112a;
    }
}
