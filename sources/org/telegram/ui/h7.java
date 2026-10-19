package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class h7 extends org.telegram.ui.Components.v81 {
    public org.telegram.ui.ActionBar.m1 f37535a;
    public final Context f37536b;
    public final org.telegram.ui.ActionBar.n2 f37537c;
    public final v7 d;

    public h7(v7 v7Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = v7Var;
        this.f37536b = context;
        this.f37537c = n2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.im0 im0Var = (org.telegram.ui.Components.im0) view;
        ArrayList arrayList = this.d.e;
        im0Var.setAdapter(((u7) arrayList.get(i10)).f41832c);
        if (((u7) arrayList.get(i10)).f41831b != 1 && ((u7) arrayList.get(i10)).f41831b != 4) {
            view.getContext();
            im0Var.setLayoutManager(new s4.b0());
        } else {
            view.getContext();
            im0Var.setLayoutManager(new s4.s(3));
        }
        im0Var.setTag(Integer.valueOf(((u7) arrayList.get(i10)).f41831b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(this.f37536b, null);
        s4.k kVar = (s4.k) im0Var.getItemAnimator();
        kVar.C = false;
        kVar.f45944m = false;
        im0Var.setClipToPadding(false);
        im0Var.setPadding(0, 0, 0, this.d.f42124s);
        im0Var.setOnItemClickListener(new g7(this, im0Var));
        im0Var.setOnItemLongClickListener(new e7(this, im0Var, this.f37537c, 0));
        return im0Var;
    }

    @Override
    public final int e() {
        return this.d.e.size();
    }

    @Override
    public final int f(int i10) {
        return ((u7) this.d.e.get(i10)).f41831b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((u7) this.d.e.get(i10)).f41830a;
    }
}
