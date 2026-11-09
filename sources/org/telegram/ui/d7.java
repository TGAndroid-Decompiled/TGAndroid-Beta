package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class d7 extends org.telegram.ui.Components.n61 {
    public org.telegram.ui.ActionBar.g1 f44868a;
    public final Context f44869b;
    public final oi.q f44870c;
    public final y6 d;
    public final org.telegram.ui.Components.jt0 f44871e;
    public final t7 f44872f;

    public d7(t7 t7Var, Context context, oi.q qVar, y6 y6Var, org.telegram.ui.Components.jt0 jt0Var) {
        this.f44872f = t7Var;
        this.f44869b = context;
        this.f44870c = qVar;
        this.d = y6Var;
        this.f44871e = jt0Var;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        t7 t7Var = this.f44872f;
        org.telegram.ui.Components.qj0 c10 = t7Var.c(view);
        ArrayList arrayList = t7Var.f50102f;
        c10.setAdapter(((r7) arrayList.get(i7)).f49312c);
        if (((r7) arrayList.get(i7)).f49311b != 1 && ((r7) arrayList.get(i7)).f49311b != 4) {
            view.getContext();
            c10.setLayoutManager(new v4.b0());
        } else {
            view.getContext();
            c10.setLayoutManager(new v4.s(3));
        }
        c10.setTag(Integer.valueOf(((r7) arrayList.get(i7)).f49311b));
        view.setTag(Integer.valueOf(((r7) arrayList.get(i7)).f49311b));
        if (this.f44871e != null) {
            ((org.telegram.ui.Components.sj0) t7Var.f50103n).L(view);
        }
    }

    @Override
    public final View d(int i7) {
        Context context = this.f44869b;
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        oi.q qVar = this.f44870c;
        if (qVar != null) {
            qVar.b(qj0Var);
        }
        v4.k kVar = (v4.k) qj0Var.getItemAnimator();
        kVar.C = false;
        kVar.f57083m = false;
        qj0Var.setClipToPadding(false);
        if (i7 != 1 && i7 != 4 && qVar != null) {
            qj0Var.setSections(false);
        }
        qj0Var.setCaptureSectionsDecoratorAllowed(true);
        t7 t7Var = this.f44872f;
        if (i7 == 1) {
            qj0Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, 0, t7Var.f50106w);
        } else {
            qj0Var.setPadding(0, 0, 0, t7Var.f50106w);
        }
        qj0Var.setOnItemClickListener(new c7(this, qj0Var));
        qj0Var.setOnItemLongClickListener(new a7(this, qj0Var, this.d, 0));
        if (this.f44871e == null) {
            return qj0Var;
        }
        return new s7(context, qj0Var);
    }

    @Override
    public final int e() {
        return this.f44872f.f50102f.size();
    }

    @Override
    public final int f(int i7) {
        return ((r7) this.f44872f.f50102f.get(i7)).f49311b;
    }

    @Override
    public final CharSequence g(int i7) {
        return ((r7) this.f44872f.f50102f.get(i7)).f49310a;
    }

    @Override
    public final int h(int i7) {
        return ((r7) this.f44872f.f50102f.get(i7)).f49311b;
    }
}
