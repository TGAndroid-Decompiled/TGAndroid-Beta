package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class d7 extends org.telegram.ui.Components.n61 {
    public org.telegram.ui.ActionBar.g1 f46322a;
    public final Context f46323b;
    public final ri.q f46324c;
    public final y6 d;
    public final org.telegram.ui.Components.it0 f46325e;
    public final t7 f46326f;

    public d7(t7 t7Var, Context context, ri.q qVar, y6 y6Var, org.telegram.ui.Components.it0 it0Var) {
        this.f46326f = t7Var;
        this.f46323b = context;
        this.f46324c = qVar;
        this.d = y6Var;
        this.f46325e = it0Var;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        t7 t7Var = this.f46326f;
        org.telegram.ui.Components.uj0 c10 = t7Var.c(view);
        ArrayList arrayList = t7Var.f51400f;
        c10.setAdapter(((r7) arrayList.get(i7)).f50866c);
        if (((r7) arrayList.get(i7)).f50865b != 1 && ((r7) arrayList.get(i7)).f50865b != 4) {
            view.getContext();
            c10.setLayoutManager(new v4.b0());
        } else {
            view.getContext();
            c10.setLayoutManager(new v4.s(3));
        }
        c10.setTag(Integer.valueOf(((r7) arrayList.get(i7)).f50865b));
        view.setTag(Integer.valueOf(((r7) arrayList.get(i7)).f50865b));
        if (this.f46325e != null) {
            ((org.telegram.ui.Components.wj0) t7Var.f51401n).J(view);
        }
    }

    @Override
    public final View d(int i7) {
        Context context = this.f46323b;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        ri.q qVar = this.f46324c;
        if (qVar != null) {
            qVar.b(uj0Var);
        }
        v4.k kVar = (v4.k) uj0Var.getItemAnimator();
        kVar.C = false;
        kVar.f58564m = false;
        uj0Var.setClipToPadding(false);
        if (i7 != 1 && i7 != 4 && qVar != null) {
            uj0Var.setSections(false);
        }
        uj0Var.setCaptureSectionsDecoratorAllowed(true);
        t7 t7Var = this.f46326f;
        if (i7 == 1) {
            uj0Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, 0, t7Var.f51404w);
        } else {
            uj0Var.setPadding(0, 0, 0, t7Var.f51404w);
        }
        uj0Var.setOnItemClickListener(new c7(this, uj0Var));
        uj0Var.setOnItemLongClickListener(new a7(this, uj0Var, this.d, 0));
        if (this.f46325e == null) {
            return uj0Var;
        }
        return new s7(context, uj0Var);
    }

    @Override
    public final int e() {
        return this.f46326f.f51400f.size();
    }

    @Override
    public final int f(int i7) {
        return ((r7) this.f46326f.f51400f.get(i7)).f50865b;
    }

    @Override
    public final CharSequence g(int i7) {
        return ((r7) this.f46326f.f51400f.get(i7)).f50864a;
    }

    @Override
    public final int h(int i7) {
        return ((r7) this.f46326f.f51400f.get(i7)).f50865b;
    }
}
