package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class d7 extends org.telegram.ui.Components.o71 {
    public org.telegram.ui.ActionBar.k1 f36630a;
    public final Context f36631b;
    public final ei.r f36632c;
    public final y6 d;
    public final org.telegram.ui.Components.ku0 e;
    public final t7 f36633f;

    public d7(t7 t7Var, Context context, ei.r rVar, y6 y6Var, org.telegram.ui.Components.ku0 ku0Var) {
        this.f36633f = t7Var;
        this.f36631b = context;
        this.f36632c = rVar;
        this.d = y6Var;
        this.e = ku0Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        t7 t7Var = this.f36633f;
        org.telegram.ui.Components.tk0 c10 = t7Var.c(view);
        ArrayList arrayList = t7Var.f41750f;
        c10.setAdapter(((r7) arrayList.get(i10)).f41153c);
        if (((r7) arrayList.get(i10)).f41152b != 1 && ((r7) arrayList.get(i10)).f41152b != 4) {
            view.getContext();
            c10.setLayoutManager(new s4.a0());
        } else {
            view.getContext();
            c10.setLayoutManager(new s4.r(3));
        }
        c10.setTag(Integer.valueOf(((r7) arrayList.get(i10)).f41152b));
        view.setTag(Integer.valueOf(((r7) arrayList.get(i10)).f41152b));
        if (this.e != null) {
            ((org.telegram.ui.Components.vk0) t7Var.f41751n).L(view);
        }
    }

    @Override
    public final View d(int i10) {
        Context context = this.f36631b;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        ei.r rVar = this.f36632c;
        if (rVar != null) {
            rVar.b(tk0Var);
        }
        s4.j jVar = (s4.j) tk0Var.getItemAnimator();
        jVar.C = false;
        jVar.f47927m = false;
        tk0Var.setClipToPadding(false);
        if (i10 != 1 && i10 != 4 && rVar != null) {
            tk0Var.setSections(false);
        }
        tk0Var.setCaptureSectionsDecoratorAllowed(true);
        t7 t7Var = this.f36633f;
        if (i10 == 1) {
            tk0Var.setPadding(org.telegram.messenger.i0.L(2.0f), 0, 0, t7Var.f41754w);
        } else {
            tk0Var.setPadding(0, 0, 0, t7Var.f41754w);
        }
        tk0Var.setOnItemClickListener(new c7(this, tk0Var));
        tk0Var.setOnItemLongClickListener(new a7(this, tk0Var, this.d, 0));
        if (this.e == null) {
            return tk0Var;
        }
        return new s7(context, tk0Var);
    }

    @Override
    public final int e() {
        return this.f36633f.f41750f.size();
    }

    @Override
    public final int f(int i10) {
        return ((r7) this.f36633f.f41750f.get(i10)).f41152b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((r7) this.f36633f.f41750f.get(i10)).f41151a;
    }

    @Override
    public final int h(int i10) {
        return ((r7) this.f36633f.f41750f.get(i10)).f41152b;
    }
}
