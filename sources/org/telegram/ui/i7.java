package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class i7 extends org.telegram.ui.Components.d91 {
    public org.telegram.ui.ActionBar.m1 f36737a;
    public final Context f36738b;
    public final org.telegram.ui.ActionBar.m2 f36739c;
    public final w7 d;

    public i7(w7 w7Var, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = w7Var;
        this.f36738b = context;
        this.f36739c = m2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) view;
        ArrayList arrayList = this.d.e;
        mm0Var.setAdapter(((v7) arrayList.get(i10)).f40599c);
        if (((v7) arrayList.get(i10)).f40598b != 1 && ((v7) arrayList.get(i10)).f40598b != 4) {
            view.getContext();
            mm0Var.setLayoutManager(new s4.b0());
        } else {
            view.getContext();
            mm0Var.setLayoutManager(new s4.s(3));
        }
        mm0Var.setTag(Integer.valueOf(((v7) arrayList.get(i10)).f40598b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(this.f36738b, null);
        s4.k kVar = (s4.k) mm0Var.getItemAnimator();
        kVar.C = false;
        kVar.f44872m = false;
        mm0Var.setClipToPadding(false);
        mm0Var.setPadding(0, 0, 0, this.d.f40883s);
        mm0Var.setOnItemClickListener(new h7(this, mm0Var));
        mm0Var.setOnItemLongClickListener(new f7(this, mm0Var, this.f36739c, 0));
        return mm0Var;
    }

    @Override
    public final int e() {
        return this.d.e.size();
    }

    @Override
    public final int f(int i10) {
        return ((v7) this.d.e.get(i10)).f40598b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((v7) this.d.e.get(i10)).f40597a;
    }
}
