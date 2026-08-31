package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class g7 extends org.telegram.ui.Components.e81 {
    public org.telegram.ui.ActionBar.p1 f37105a;
    public final Context f37106b;
    public final org.telegram.ui.ActionBar.p2 f37107c;
    public final u7 d;

    public g7(u7 u7Var, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        this.d = u7Var;
        this.f37106b = context;
        this.f37107c = p2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.tl0 tl0Var = (org.telegram.ui.Components.tl0) view;
        ArrayList arrayList = this.d.f41803e;
        tl0Var.setAdapter(((t7) arrayList.get(i10)).f41512c);
        if (((t7) arrayList.get(i10)).f41511b != 1 && ((t7) arrayList.get(i10)).f41511b != 4) {
            view.getContext();
            tl0Var.setLayoutManager(new f2.j0());
        } else {
            view.getContext();
            tl0Var.setLayoutManager(new f2.w(3));
        }
        tl0Var.setTag(Integer.valueOf(((t7) arrayList.get(i10)).f41511b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(this.f37106b, null);
        f2.l lVar = (f2.l) tl0Var.getItemAnimator();
        lVar.C = false;
        lVar.f5910m = false;
        tl0Var.setClipToPadding(false);
        tl0Var.setPadding(0, 0, 0, this.d.f41807s);
        tl0Var.setOnItemClickListener(new f7(this, tl0Var));
        tl0Var.setOnItemLongClickListener(new d7(this, tl0Var, this.f37107c, 0));
        return tl0Var;
    }

    @Override
    public final int e() {
        return this.d.f41803e.size();
    }

    @Override
    public final int f(int i10) {
        return ((t7) this.d.f41803e.get(i10)).f41511b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((t7) this.d.f41803e.get(i10)).f41510a;
    }
}
