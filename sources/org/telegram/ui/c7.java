package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class c7 extends org.telegram.ui.Components.y61 {
    public org.telegram.ui.ActionBar.h1 f46446a;
    public final Context f46447b;
    public final ri.q f46448c;
    public final x6 d;
    public final org.telegram.ui.Components.qt0 f46449e;
    public final s7 f46450f;

    public c7(s7 s7Var, Context context, ri.q qVar, x6 x6Var, org.telegram.ui.Components.qt0 qt0Var) {
        this.f46450f = s7Var;
        this.f46447b = context;
        this.f46448c = qVar;
        this.d = x6Var;
        this.f46449e = qt0Var;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        s7 s7Var = this.f46450f;
        org.telegram.ui.Components.ck0 c10 = s7Var.c(view);
        ArrayList arrayList = s7Var.f51921f;
        c10.setAdapter(((q7) arrayList.get(i7)).f51129c);
        if (((q7) arrayList.get(i7)).f51128b != 1 && ((q7) arrayList.get(i7)).f51128b != 4) {
            view.getContext();
            c10.setLayoutManager(new v4.c0());
        } else {
            view.getContext();
            c10.setLayoutManager(new v4.t(3));
        }
        c10.setTag(Integer.valueOf(((q7) arrayList.get(i7)).f51128b));
        view.setTag(Integer.valueOf(((q7) arrayList.get(i7)).f51128b));
        if (this.f46449e != null) {
            ((org.telegram.ui.Components.ek0) s7Var.f51922n).H(view);
        }
    }

    @Override
    public final View d(int i7) {
        Context context = this.f46447b;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        ri.q qVar = this.f46448c;
        if (qVar != null) {
            qVar.b(ck0Var);
        }
        v4.k kVar = (v4.k) ck0Var.getItemAnimator();
        kVar.C = false;
        kVar.f59151m = false;
        ck0Var.setClipToPadding(false);
        if (i7 != 1 && i7 != 4 && qVar != null) {
            ck0Var.setSections(false);
        }
        ck0Var.setCaptureSectionsDecoratorAllowed(true);
        s7 s7Var = this.f46450f;
        if (i7 == 1) {
            ck0Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, 0, s7Var.f51925w);
        } else {
            ck0Var.setPadding(0, 0, 0, s7Var.f51925w);
        }
        ck0Var.setOnItemClickListener(new b7(this, ck0Var));
        ck0Var.setOnItemLongClickListener(new z6(this, ck0Var, this.d, 0));
        if (this.f46449e == null) {
            return ck0Var;
        }
        return new r7(context, ck0Var);
    }

    @Override
    public final int e() {
        return this.f46450f.f51921f.size();
    }

    @Override
    public final int f(int i7) {
        return ((q7) this.f46450f.f51921f.get(i7)).f51128b;
    }

    @Override
    public final CharSequence g(int i7) {
        return ((q7) this.f46450f.f51921f.get(i7)).f51127a;
    }

    @Override
    public final int h(int i7) {
        return ((q7) this.f46450f.f51921f.get(i7)).f51128b;
    }
}
