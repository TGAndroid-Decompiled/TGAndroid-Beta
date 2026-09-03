package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class i7 extends org.telegram.ui.Components.c81 {
    public org.telegram.ui.ActionBar.p1 f34810a;
    public final Context f34811b;
    public final org.telegram.ui.ActionBar.p2 f34812c;
    public final w7 d;

    public i7(w7 w7Var, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        this.d = w7Var;
        this.f34811b = context;
        this.f34812c = p2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.rl0 rl0Var = (org.telegram.ui.Components.rl0) view;
        ArrayList arrayList = this.d.e;
        rl0Var.setAdapter(((v7) arrayList.get(i10)).f39012c);
        if (((v7) arrayList.get(i10)).f39011b != 1 && ((v7) arrayList.get(i10)).f39011b != 4) {
            view.getContext();
            rl0Var.setLayoutManager(new f2.i0());
        } else {
            view.getContext();
            rl0Var.setLayoutManager(new f2.w(3));
        }
        rl0Var.setTag(Integer.valueOf(((v7) arrayList.get(i10)).f39011b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(this.f34811b, null);
        f2.l lVar = (f2.l) rl0Var.getItemAnimator();
        lVar.C = false;
        lVar.f5807m = false;
        rl0Var.setClipToPadding(false);
        rl0Var.setPadding(0, 0, 0, this.d.f39286s);
        rl0Var.setOnItemClickListener(new h7(this, rl0Var));
        rl0Var.setOnItemLongClickListener(new f7(this, rl0Var, this.f34812c, 0));
        return rl0Var;
    }

    @Override
    public final int e() {
        return this.d.e.size();
    }

    @Override
    public final int f(int i10) {
        return ((v7) this.d.e.get(i10)).f39011b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((v7) this.d.e.get(i10)).f39010a;
    }
}
