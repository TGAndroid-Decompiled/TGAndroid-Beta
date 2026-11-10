package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class d7 extends org.telegram.ui.Components.m61 {
    public org.telegram.ui.ActionBar.g1 f44911a;
    public final Context f44912b;
    public final oi.q f44913c;
    public final y6 d;
    public final org.telegram.ui.Components.it0 f44914e;
    public final t7 f44915f;

    public d7(t7 t7Var, Context context, oi.q qVar, y6 y6Var, org.telegram.ui.Components.it0 it0Var) {
        this.f44915f = t7Var;
        this.f44912b = context;
        this.f44913c = qVar;
        this.d = y6Var;
        this.f44914e = it0Var;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        t7 t7Var = this.f44915f;
        org.telegram.ui.Components.pj0 c10 = t7Var.c(view);
        ArrayList arrayList = t7Var.f50155f;
        c10.setAdapter(((r7) arrayList.get(i7)).f49278c);
        if (((r7) arrayList.get(i7)).f49277b != 1 && ((r7) arrayList.get(i7)).f49277b != 4) {
            view.getContext();
            c10.setLayoutManager(new v4.b0());
        } else {
            view.getContext();
            c10.setLayoutManager(new v4.s(3));
        }
        c10.setTag(Integer.valueOf(((r7) arrayList.get(i7)).f49277b));
        view.setTag(Integer.valueOf(((r7) arrayList.get(i7)).f49277b));
        if (this.f44914e != null) {
            ((org.telegram.ui.Components.rj0) t7Var.f50156n).L(view);
        }
    }

    @Override
    public final View d(int i7) {
        Context context = this.f44912b;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        oi.q qVar = this.f44913c;
        if (qVar != null) {
            qVar.b(pj0Var);
        }
        v4.k kVar = (v4.k) pj0Var.getItemAnimator();
        kVar.C = false;
        kVar.f57079m = false;
        pj0Var.setClipToPadding(false);
        if (i7 != 1 && i7 != 4 && qVar != null) {
            pj0Var.setSections(false);
        }
        pj0Var.setCaptureSectionsDecoratorAllowed(true);
        t7 t7Var = this.f44915f;
        if (i7 == 1) {
            pj0Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, 0, t7Var.f50159w);
        } else {
            pj0Var.setPadding(0, 0, 0, t7Var.f50159w);
        }
        pj0Var.setOnItemClickListener(new c7(this, pj0Var));
        pj0Var.setOnItemLongClickListener(new a7(this, pj0Var, this.d, 0));
        if (this.f44914e == null) {
            return pj0Var;
        }
        return new s7(context, pj0Var);
    }

    @Override
    public final int e() {
        return this.f44915f.f50155f.size();
    }

    @Override
    public final int f(int i7) {
        return ((r7) this.f44915f.f50155f.get(i7)).f49277b;
    }

    @Override
    public final CharSequence g(int i7) {
        return ((r7) this.f44915f.f50155f.get(i7)).f49276a;
    }

    @Override
    public final int h(int i7) {
        return ((r7) this.f44915f.f50155f.get(i7)).f49277b;
    }
}
