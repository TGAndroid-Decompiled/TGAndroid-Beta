package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class d7 extends org.telegram.ui.Components.c71 {
    public org.telegram.ui.ActionBar.g1 f46960a;
    public final Context f46961b;
    public final ri.q f46962c;
    public final y6 d;
    public final org.telegram.ui.Components.st0 f46963e;
    public final t7 f46964f;

    public d7(t7 t7Var, Context context, ri.q qVar, y6 y6Var, org.telegram.ui.Components.st0 st0Var) {
        this.f46964f = t7Var;
        this.f46961b = context;
        this.f46962c = qVar;
        this.d = y6Var;
        this.f46963e = st0Var;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        t7 t7Var = this.f46964f;
        org.telegram.ui.Components.ek0 c10 = t7Var.c(view);
        ArrayList arrayList = t7Var.f52278f;
        c10.setAdapter(((r7) arrayList.get(i7)).f51641c);
        if (((r7) arrayList.get(i7)).f51640b != 1 && ((r7) arrayList.get(i7)).f51640b != 4) {
            view.getContext();
            c10.setLayoutManager(new v4.c0());
        } else {
            view.getContext();
            c10.setLayoutManager(new v4.t(3));
        }
        c10.setTag(Integer.valueOf(((r7) arrayList.get(i7)).f51640b));
        view.setTag(Integer.valueOf(((r7) arrayList.get(i7)).f51640b));
        if (this.f46963e != null) {
            ((org.telegram.ui.Components.gk0) t7Var.f52279n).J(view);
        }
    }

    @Override
    public final View d(int i7) {
        Context context = this.f46961b;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        ri.q qVar = this.f46962c;
        if (qVar != null) {
            qVar.b(ek0Var);
        }
        v4.l lVar = (v4.l) ek0Var.getItemAnimator();
        lVar.C = false;
        lVar.f59274m = false;
        ek0Var.setClipToPadding(false);
        if (i7 != 1 && i7 != 4 && qVar != null) {
            ek0Var.setSections(false);
        }
        ek0Var.setCaptureSectionsDecoratorAllowed(true);
        t7 t7Var = this.f46964f;
        if (i7 == 1) {
            ek0Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, 0, t7Var.f52282w);
        } else {
            ek0Var.setPadding(0, 0, 0, t7Var.f52282w);
        }
        ek0Var.setOnItemClickListener(new c7(this, ek0Var));
        ek0Var.setOnItemLongClickListener(new a7(this, ek0Var, this.d, 0));
        if (this.f46963e == null) {
            return ek0Var;
        }
        return new s7(context, ek0Var);
    }

    @Override
    public final int e() {
        return this.f46964f.f52278f.size();
    }

    @Override
    public final int f(int i7) {
        return ((r7) this.f46964f.f52278f.get(i7)).f51640b;
    }

    @Override
    public final CharSequence g(int i7) {
        return ((r7) this.f46964f.f52278f.get(i7)).f51639a;
    }

    @Override
    public final int h(int i7) {
        return ((r7) this.f46964f.f52278f.get(i7)).f51640b;
    }
}
