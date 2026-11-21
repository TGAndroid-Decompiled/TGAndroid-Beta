package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class c7 extends org.telegram.ui.Components.b71 {
    public org.telegram.ui.ActionBar.g1 f46469a;
    public final Context f46470b;
    public final ri.q f46471c;
    public final x6 d;
    public final org.telegram.ui.Components.tt0 f46472e;
    public final s7 f46473f;

    public c7(s7 s7Var, Context context, ri.q qVar, x6 x6Var, org.telegram.ui.Components.tt0 tt0Var) {
        this.f46473f = s7Var;
        this.f46470b = context;
        this.f46471c = qVar;
        this.d = x6Var;
        this.f46472e = tt0Var;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        s7 s7Var = this.f46473f;
        org.telegram.ui.Components.ek0 c10 = s7Var.c(view);
        ArrayList arrayList = s7Var.f51950f;
        c10.setAdapter(((q7) arrayList.get(i7)).f51103c);
        if (((q7) arrayList.get(i7)).f51102b != 1 && ((q7) arrayList.get(i7)).f51102b != 4) {
            view.getContext();
            c10.setLayoutManager(new v4.c0());
        } else {
            view.getContext();
            c10.setLayoutManager(new v4.t(3));
        }
        c10.setTag(Integer.valueOf(((q7) arrayList.get(i7)).f51102b));
        view.setTag(Integer.valueOf(((q7) arrayList.get(i7)).f51102b));
        if (this.f46472e != null) {
            ((org.telegram.ui.Components.gk0) s7Var.f51951n).H(view);
        }
    }

    @Override
    public final View d(int i7) {
        Context context = this.f46470b;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        ri.q qVar = this.f46471c;
        if (qVar != null) {
            qVar.b(ek0Var);
        }
        v4.k kVar = (v4.k) ek0Var.getItemAnimator();
        kVar.C = false;
        kVar.f59190m = false;
        ek0Var.setClipToPadding(false);
        if (i7 != 1 && i7 != 4 && qVar != null) {
            ek0Var.setSections(false);
        }
        ek0Var.setCaptureSectionsDecoratorAllowed(true);
        s7 s7Var = this.f46473f;
        if (i7 == 1) {
            ek0Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, 0, s7Var.f51954w);
        } else {
            ek0Var.setPadding(0, 0, 0, s7Var.f51954w);
        }
        ek0Var.setOnItemClickListener(new b7(this, ek0Var));
        ek0Var.setOnItemLongClickListener(new z6(this, ek0Var, this.d, 0));
        if (this.f46472e == null) {
            return ek0Var;
        }
        return new r7(context, ek0Var);
    }

    @Override
    public final int e() {
        return this.f46473f.f51950f.size();
    }

    @Override
    public final int f(int i7) {
        return ((q7) this.f46473f.f51950f.get(i7)).f51102b;
    }

    @Override
    public final CharSequence g(int i7) {
        return ((q7) this.f46473f.f51950f.get(i7)).f51101a;
    }

    @Override
    public final int h(int i7) {
        return ((q7) this.f46473f.f51950f.get(i7)).f51102b;
    }
}
