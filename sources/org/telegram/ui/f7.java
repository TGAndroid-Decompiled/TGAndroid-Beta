package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class f7 extends org.telegram.ui.Components.x81 {
    public org.telegram.ui.ActionBar.n1 f36203a;
    public final Context f36204b;
    public final li.m f36205c;
    public final a7 d;
    public final org.telegram.ui.Components.aw0 f36206e;
    public final v7 f36207f;

    public f7(v7 v7Var, Context context, li.m mVar, a7 a7Var, org.telegram.ui.Components.aw0 aw0Var) {
        this.f36207f = v7Var;
        this.f36204b = context;
        this.f36205c = mVar;
        this.d = a7Var;
        this.f36206e = aw0Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.zl0 c10 = v7.c(view);
        v7 v7Var = this.f36207f;
        ArrayList arrayList = v7Var.f41573e;
        c10.setAdapter(((t7) arrayList.get(i10)).f40701c);
        if (((t7) arrayList.get(i10)).f40700b != 1 && ((t7) arrayList.get(i10)).f40700b != 4) {
            view.getContext();
            c10.setLayoutManager(new s4.c0());
        } else {
            view.getContext();
            c10.setLayoutManager(new s4.s(3));
        }
        c10.setTag(Integer.valueOf(((t7) arrayList.get(i10)).f40700b));
        view.setTag(Integer.valueOf(((t7) arrayList.get(i10)).f40700b));
        if (this.f36206e != null) {
            ((org.telegram.ui.Components.bm0) v7Var.h).L(view);
        }
    }

    @Override
    public final View d(int i10) {
        Context context = this.f36204b;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        li.m mVar = this.f36205c;
        if (mVar != null) {
            mVar.b(zl0Var);
        }
        s4.j jVar = (s4.j) zl0Var.getItemAnimator();
        jVar.C = false;
        jVar.f46563m = false;
        zl0Var.setClipToPadding(false);
        if (i10 != 1 && i10 != 4 && mVar != null) {
            zl0Var.setSections(false);
        }
        zl0Var.setCaptureSectionsDecoratorAllowed(true);
        v7 v7Var = this.f36207f;
        if (i10 == 1) {
            zl0Var.setPadding(AndroidUtilities.dp(2.0f), 0, 0, v7Var.f41577s);
        } else {
            zl0Var.setPadding(0, 0, 0, v7Var.f41577s);
        }
        zl0Var.setOnItemClickListener(new e7(this, zl0Var));
        zl0Var.setOnItemLongClickListener(new c7(this, zl0Var, this.d, 0));
        if (this.f36206e == null) {
            return zl0Var;
        }
        return new u7(context, zl0Var);
    }

    @Override
    public final int e() {
        return this.f36207f.f41573e.size();
    }

    @Override
    public final int f(int i10) {
        return ((t7) this.f36207f.f41573e.get(i10)).f40700b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((t7) this.f36207f.f41573e.get(i10)).f40699a;
    }

    @Override
    public final int h(int i10) {
        return ((t7) this.f36207f.f41573e.get(i10)).f40700b;
    }
}
