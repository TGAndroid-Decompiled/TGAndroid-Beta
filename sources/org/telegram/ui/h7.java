package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class h7 extends org.telegram.ui.Components.u81 {
    public org.telegram.ui.ActionBar.m1 f37422a;
    public final Context f37423b;
    public final org.telegram.ui.ActionBar.n2 f37424c;
    public final v7 d;

    public h7(v7 v7Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = v7Var;
        this.f37423b = context;
        this.f37424c = n2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.im0 im0Var = (org.telegram.ui.Components.im0) view;
        ArrayList arrayList = this.d.e;
        im0Var.setAdapter(((u7) arrayList.get(i10)).f41879c);
        if (((u7) arrayList.get(i10)).f41878b != 1 && ((u7) arrayList.get(i10)).f41878b != 4) {
            view.getContext();
            im0Var.setLayoutManager(new s4.b0());
        } else {
            view.getContext();
            im0Var.setLayoutManager(new s4.s(3));
        }
        im0Var.setTag(Integer.valueOf(((u7) arrayList.get(i10)).f41878b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(this.f37423b, null);
        s4.k kVar = (s4.k) im0Var.getItemAnimator();
        kVar.C = false;
        kVar.f45944m = false;
        im0Var.setClipToPadding(false);
        im0Var.setPadding(0, 0, 0, this.d.f42121s);
        im0Var.setOnItemClickListener(new g7(this, im0Var));
        im0Var.setOnItemLongClickListener(new e7(this, im0Var, this.f37424c, 0));
        return im0Var;
    }

    @Override
    public final int e() {
        return this.d.e.size();
    }

    @Override
    public final int f(int i10) {
        return ((u7) this.d.e.get(i10)).f41878b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((u7) this.d.e.get(i10)).f41877a;
    }
}
