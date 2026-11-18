package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class c7 extends org.telegram.ui.Components.y61 {
    public org.telegram.ui.ActionBar.h1 f46437a;
    public final Context f46438b;
    public final ri.q f46439c;
    public final x6 d;
    public final org.telegram.ui.Components.qt0 f46440e;
    public final s7 f46441f;

    public c7(s7 s7Var, Context context, ri.q qVar, x6 x6Var, org.telegram.ui.Components.qt0 qt0Var) {
        this.f46441f = s7Var;
        this.f46438b = context;
        this.f46439c = qVar;
        this.d = x6Var;
        this.f46440e = qt0Var;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        s7 s7Var = this.f46441f;
        org.telegram.ui.Components.ck0 c10 = s7Var.c(view);
        ArrayList arrayList = s7Var.f51910f;
        c10.setAdapter(((q7) arrayList.get(i7)).f51057c);
        if (((q7) arrayList.get(i7)).f51056b != 1 && ((q7) arrayList.get(i7)).f51056b != 4) {
            view.getContext();
            c10.setLayoutManager(new v4.c0());
        } else {
            view.getContext();
            c10.setLayoutManager(new v4.t(3));
        }
        c10.setTag(Integer.valueOf(((q7) arrayList.get(i7)).f51056b));
        view.setTag(Integer.valueOf(((q7) arrayList.get(i7)).f51056b));
        if (this.f46440e != null) {
            ((org.telegram.ui.Components.ek0) s7Var.f51911n).H(view);
        }
    }

    @Override
    public final View d(int i7) {
        Context context = this.f46438b;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        ri.q qVar = this.f46439c;
        if (qVar != null) {
            qVar.b(ck0Var);
        }
        v4.k kVar = (v4.k) ck0Var.getItemAnimator();
        kVar.C = false;
        kVar.f59152m = false;
        ck0Var.setClipToPadding(false);
        if (i7 != 1 && i7 != 4 && qVar != null) {
            ck0Var.setSections(false);
        }
        ck0Var.setCaptureSectionsDecoratorAllowed(true);
        s7 s7Var = this.f46441f;
        if (i7 == 1) {
            ck0Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, 0, s7Var.f51914w);
        } else {
            ck0Var.setPadding(0, 0, 0, s7Var.f51914w);
        }
        ck0Var.setOnItemClickListener(new b7(this, ck0Var));
        ck0Var.setOnItemLongClickListener(new z6(this, ck0Var, this.d, 0));
        if (this.f46440e == null) {
            return ck0Var;
        }
        return new r7(context, ck0Var);
    }

    @Override
    public final int e() {
        return this.f46441f.f51910f.size();
    }

    @Override
    public final int f(int i7) {
        return ((q7) this.f46441f.f51910f.get(i7)).f51056b;
    }

    @Override
    public final CharSequence g(int i7) {
        return ((q7) this.f46441f.f51910f.get(i7)).f51055a;
    }

    @Override
    public final int h(int i7) {
        return ((q7) this.f46441f.f51910f.get(i7)).f51056b;
    }
}
