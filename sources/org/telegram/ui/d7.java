package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class d7 extends org.telegram.ui.Components.p71 {
    public org.telegram.ui.ActionBar.k1 f36508a;
    public final Context f36509b;
    public final ei.r f36510c;
    public final y6 d;
    public final org.telegram.ui.Components.lu0 e;
    public final t7 f36511f;

    public d7(t7 t7Var, Context context, ei.r rVar, y6 y6Var, org.telegram.ui.Components.lu0 lu0Var) {
        this.f36511f = t7Var;
        this.f36509b = context;
        this.f36510c = rVar;
        this.d = y6Var;
        this.e = lu0Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        t7 t7Var = this.f36511f;
        org.telegram.ui.Components.uk0 c10 = t7Var.c(view);
        ArrayList arrayList = t7Var.f41559f;
        c10.setAdapter(((r7) arrayList.get(i10)).f40994c);
        if (((r7) arrayList.get(i10)).f40993b != 1 && ((r7) arrayList.get(i10)).f40993b != 4) {
            view.getContext();
            c10.setLayoutManager(new s4.a0());
        } else {
            view.getContext();
            c10.setLayoutManager(new s4.r(3));
        }
        c10.setTag(Integer.valueOf(((r7) arrayList.get(i10)).f40993b));
        view.setTag(Integer.valueOf(((r7) arrayList.get(i10)).f40993b));
        if (this.e != null) {
            ((org.telegram.ui.Components.wk0) t7Var.f41560n).L(view);
        }
    }

    @Override
    public final View d(int i10) {
        Context context = this.f36509b;
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        ei.r rVar = this.f36510c;
        if (rVar != null) {
            rVar.b(uk0Var);
        }
        s4.j jVar = (s4.j) uk0Var.getItemAnimator();
        jVar.C = false;
        jVar.f47938m = false;
        uk0Var.setClipToPadding(false);
        if (i10 != 1 && i10 != 4 && rVar != null) {
            uk0Var.setSections(false);
        }
        uk0Var.setCaptureSectionsDecoratorAllowed(true);
        t7 t7Var = this.f36511f;
        if (i10 == 1) {
            uk0Var.setPadding(org.telegram.messenger.i0.L(2.0f), 0, 0, t7Var.f41563w);
        } else {
            uk0Var.setPadding(0, 0, 0, t7Var.f41563w);
        }
        uk0Var.setOnItemClickListener(new c7(this, uk0Var));
        uk0Var.setOnItemLongClickListener(new a7(this, uk0Var, this.d, 0));
        if (this.e == null) {
            return uk0Var;
        }
        return new s7(context, uk0Var);
    }

    @Override
    public final int e() {
        return this.f36511f.f41559f.size();
    }

    @Override
    public final int f(int i10) {
        return ((r7) this.f36511f.f41559f.get(i10)).f40993b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((r7) this.f36511f.f41559f.get(i10)).f40992a;
    }

    @Override
    public final int h(int i10) {
        return ((r7) this.f36511f.f41559f.get(i10)).f40993b;
    }
}
