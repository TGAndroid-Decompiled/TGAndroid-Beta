package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class f7 extends org.telegram.ui.Components.y81 {
    public org.telegram.ui.ActionBar.n1 f36217a;
    public final Context f36218b;
    public final li.p f36219c;
    public final a7 d;
    public final org.telegram.ui.Components.bw0 f36220e;
    public final v7 f36221f;

    public f7(v7 v7Var, Context context, li.p pVar, a7 a7Var, org.telegram.ui.Components.bw0 bw0Var) {
        this.f36221f = v7Var;
        this.f36218b = context;
        this.f36219c = pVar;
        this.d = a7Var;
        this.f36220e = bw0Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.zl0 c10 = v7.c(view);
        v7 v7Var = this.f36221f;
        ArrayList arrayList = v7Var.f41621e;
        c10.setAdapter(((t7) arrayList.get(i10)).f40726c);
        if (((t7) arrayList.get(i10)).f40725b != 1 && ((t7) arrayList.get(i10)).f40725b != 4) {
            view.getContext();
            c10.setLayoutManager(new s4.c0());
        } else {
            view.getContext();
            c10.setLayoutManager(new s4.s(3));
        }
        c10.setTag(Integer.valueOf(((t7) arrayList.get(i10)).f40725b));
        view.setTag(Integer.valueOf(((t7) arrayList.get(i10)).f40725b));
        if (this.f36220e != null) {
            ((org.telegram.ui.Components.bm0) v7Var.h).L(view);
        }
    }

    @Override
    public final View d(int i10) {
        Context context = this.f36218b;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        li.p pVar = this.f36219c;
        if (pVar != null) {
            pVar.b(zl0Var);
        }
        s4.j jVar = (s4.j) zl0Var.getItemAnimator();
        jVar.C = false;
        jVar.f46577m = false;
        zl0Var.setClipToPadding(false);
        if (i10 != 1 && i10 != 4 && pVar != null) {
            zl0Var.setSections(false);
        }
        zl0Var.setCaptureSectionsDecoratorAllowed(true);
        v7 v7Var = this.f36221f;
        if (i10 == 1) {
            zl0Var.setPadding(AndroidUtilities.dp(2.0f), 0, 0, v7Var.f41625s);
        } else {
            zl0Var.setPadding(0, 0, 0, v7Var.f41625s);
        }
        zl0Var.setOnItemClickListener(new e7(this, zl0Var));
        zl0Var.setOnItemLongClickListener(new c7(this, zl0Var, this.d, 0));
        if (this.f36220e == null) {
            return zl0Var;
        }
        return new u7(context, zl0Var);
    }

    @Override
    public final int e() {
        return this.f36221f.f41621e.size();
    }

    @Override
    public final int f(int i10) {
        return ((t7) this.f36221f.f41621e.get(i10)).f40725b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((t7) this.f36221f.f41621e.get(i10)).f40724a;
    }

    @Override
    public final int h(int i10) {
        return ((t7) this.f36221f.f41621e.get(i10)).f40725b;
    }
}
