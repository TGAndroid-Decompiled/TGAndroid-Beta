package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class d7 extends org.telegram.ui.Components.l61 {
    public org.telegram.ui.ActionBar.g1 f44971a;
    public final Context f44972b;
    public final oi.q f44973c;
    public final y6 d;
    public final org.telegram.ui.Components.ht0 f44974e;
    public final t7 f44975f;

    public d7(t7 t7Var, Context context, oi.q qVar, y6 y6Var, org.telegram.ui.Components.ht0 ht0Var) {
        this.f44975f = t7Var;
        this.f44972b = context;
        this.f44973c = qVar;
        this.d = y6Var;
        this.f44974e = ht0Var;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        t7 t7Var = this.f44975f;
        org.telegram.ui.Components.pj0 c10 = t7Var.c(view);
        ArrayList arrayList = t7Var.f49968f;
        c10.setAdapter(((r7) arrayList.get(i7)).f49395c);
        if (((r7) arrayList.get(i7)).f49394b != 1 && ((r7) arrayList.get(i7)).f49394b != 4) {
            view.getContext();
            c10.setLayoutManager(new v4.b0());
        } else {
            view.getContext();
            c10.setLayoutManager(new v4.s(3));
        }
        c10.setTag(Integer.valueOf(((r7) arrayList.get(i7)).f49394b));
        view.setTag(Integer.valueOf(((r7) arrayList.get(i7)).f49394b));
        if (this.f44974e != null) {
            ((org.telegram.ui.Components.rj0) t7Var.f49969n).L(view);
        }
    }

    @Override
    public final View d(int i7) {
        Context context = this.f44972b;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        oi.q qVar = this.f44973c;
        if (qVar != null) {
            qVar.b(pj0Var);
        }
        v4.k kVar = (v4.k) pj0Var.getItemAnimator();
        kVar.C = false;
        kVar.f56979m = false;
        pj0Var.setClipToPadding(false);
        if (i7 != 1 && i7 != 4 && qVar != null) {
            pj0Var.setSections(false);
        }
        pj0Var.setCaptureSectionsDecoratorAllowed(true);
        t7 t7Var = this.f44975f;
        if (i7 == 1) {
            pj0Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, 0, t7Var.f49972w);
        } else {
            pj0Var.setPadding(0, 0, 0, t7Var.f49972w);
        }
        pj0Var.setOnItemClickListener(new c7(this, pj0Var));
        pj0Var.setOnItemLongClickListener(new a7(this, pj0Var, this.d, 0));
        if (this.f44974e == null) {
            return pj0Var;
        }
        return new s7(context, pj0Var);
    }

    @Override
    public final int e() {
        return this.f44975f.f49968f.size();
    }

    @Override
    public final int f(int i7) {
        return ((r7) this.f44975f.f49968f.get(i7)).f49394b;
    }

    @Override
    public final CharSequence g(int i7) {
        return ((r7) this.f44975f.f49968f.get(i7)).f49393a;
    }

    @Override
    public final int h(int i7) {
        return ((r7) this.f44975f.f49968f.get(i7)).f49394b;
    }
}
