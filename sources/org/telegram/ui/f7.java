package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class f7 extends org.telegram.ui.Components.x81 {
    public org.telegram.ui.ActionBar.n1 f36208a;
    public final Context f36209b;
    public final li.n f36210c;
    public final a7 d;
    public final org.telegram.ui.Components.aw0 f36211e;
    public final v7 f36212f;

    public f7(v7 v7Var, Context context, li.n nVar, a7 a7Var, org.telegram.ui.Components.aw0 aw0Var) {
        this.f36212f = v7Var;
        this.f36209b = context;
        this.f36210c = nVar;
        this.d = a7Var;
        this.f36211e = aw0Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.zl0 c10 = v7.c(view);
        v7 v7Var = this.f36212f;
        ArrayList arrayList = v7Var.f41580e;
        c10.setAdapter(((t7) arrayList.get(i10)).f40707c);
        if (((t7) arrayList.get(i10)).f40706b != 1 && ((t7) arrayList.get(i10)).f40706b != 4) {
            view.getContext();
            c10.setLayoutManager(new s4.c0());
        } else {
            view.getContext();
            c10.setLayoutManager(new s4.s(3));
        }
        c10.setTag(Integer.valueOf(((t7) arrayList.get(i10)).f40706b));
        view.setTag(Integer.valueOf(((t7) arrayList.get(i10)).f40706b));
        if (this.f36211e != null) {
            ((org.telegram.ui.Components.bm0) v7Var.h).L(view);
        }
    }

    @Override
    public final View d(int i10) {
        Context context = this.f36209b;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        li.n nVar = this.f36210c;
        if (nVar != null) {
            nVar.b(zl0Var);
        }
        s4.j jVar = (s4.j) zl0Var.getItemAnimator();
        jVar.C = false;
        jVar.f46570m = false;
        zl0Var.setClipToPadding(false);
        if (i10 != 1 && i10 != 4 && nVar != null) {
            zl0Var.setSections(false);
        }
        zl0Var.setCaptureSectionsDecoratorAllowed(true);
        v7 v7Var = this.f36212f;
        if (i10 == 1) {
            zl0Var.setPadding(AndroidUtilities.dp(2.0f), 0, 0, v7Var.f41584s);
        } else {
            zl0Var.setPadding(0, 0, 0, v7Var.f41584s);
        }
        zl0Var.setOnItemClickListener(new e7(this, zl0Var));
        zl0Var.setOnItemLongClickListener(new c7(this, zl0Var, this.d, 0));
        if (this.f36211e == null) {
            return zl0Var;
        }
        return new u7(context, zl0Var);
    }

    @Override
    public final int e() {
        return this.f36212f.f41580e.size();
    }

    @Override
    public final int f(int i10) {
        return ((t7) this.f36212f.f41580e.get(i10)).f40706b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((t7) this.f36212f.f41580e.get(i10)).f40705a;
    }

    @Override
    public final int h(int i10) {
        return ((t7) this.f36212f.f41580e.get(i10)).f40706b;
    }
}
