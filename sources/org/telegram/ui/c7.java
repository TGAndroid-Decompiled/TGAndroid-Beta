package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class c7 extends org.telegram.ui.Components.b71 {
    public org.telegram.ui.ActionBar.g1 f46456a;
    public final Context f46457b;
    public final ri.q f46458c;
    public final x6 d;
    public final org.telegram.ui.Components.tt0 f46459e;
    public final s7 f46460f;

    public c7(s7 s7Var, Context context, ri.q qVar, x6 x6Var, org.telegram.ui.Components.tt0 tt0Var) {
        this.f46460f = s7Var;
        this.f46457b = context;
        this.f46458c = qVar;
        this.d = x6Var;
        this.f46459e = tt0Var;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        s7 s7Var = this.f46460f;
        org.telegram.ui.Components.ek0 c10 = s7Var.c(view);
        ArrayList arrayList = s7Var.f51923f;
        c10.setAdapter(((q7) arrayList.get(i7)).f51038c);
        if (((q7) arrayList.get(i7)).f51037b != 1 && ((q7) arrayList.get(i7)).f51037b != 4) {
            view.getContext();
            c10.setLayoutManager(new v4.b0());
        } else {
            view.getContext();
            c10.setLayoutManager(new v4.s(3));
        }
        c10.setTag(Integer.valueOf(((q7) arrayList.get(i7)).f51037b));
        view.setTag(Integer.valueOf(((q7) arrayList.get(i7)).f51037b));
        if (this.f46459e != null) {
            ((org.telegram.ui.Components.gk0) s7Var.f51924n).H(view);
        }
    }

    @Override
    public final View d(int i7) {
        Context context = this.f46457b;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        ri.q qVar = this.f46458c;
        if (qVar != null) {
            qVar.b(ek0Var);
        }
        v4.k kVar = (v4.k) ek0Var.getItemAnimator();
        kVar.C = false;
        kVar.f59139m = false;
        ek0Var.setClipToPadding(false);
        if (i7 != 1 && i7 != 4 && qVar != null) {
            ek0Var.setSections(false);
        }
        ek0Var.setCaptureSectionsDecoratorAllowed(true);
        s7 s7Var = this.f46460f;
        if (i7 == 1) {
            ek0Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, 0, s7Var.f51927w);
        } else {
            ek0Var.setPadding(0, 0, 0, s7Var.f51927w);
        }
        ek0Var.setOnItemClickListener(new b7(this, ek0Var));
        ek0Var.setOnItemLongClickListener(new z6(this, ek0Var, this.d, 0));
        if (this.f46459e == null) {
            return ek0Var;
        }
        return new r7(context, ek0Var);
    }

    @Override
    public final int e() {
        return this.f46460f.f51923f.size();
    }

    @Override
    public final int f(int i7) {
        return ((q7) this.f46460f.f51923f.get(i7)).f51037b;
    }

    @Override
    public final CharSequence g(int i7) {
        return ((q7) this.f46460f.f51923f.get(i7)).f51036a;
    }

    @Override
    public final int h(int i7) {
        return ((q7) this.f46460f.f51923f.get(i7)).f51037b;
    }
}
