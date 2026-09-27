package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class g7 extends org.telegram.ui.Components.p81 {
    public org.telegram.ui.ActionBar.o1 f33834a;
    public final Context f33835b;
    public final li.l f33836c;
    public final org.telegram.ui.ActionBar.o2 d;
    public final v7 e;

    public g7(v7 v7Var, Context context, li.l lVar, org.telegram.ui.ActionBar.o2 o2Var) {
        this.e = v7Var;
        this.f33835b = context;
        this.f33836c = lVar;
        this.d = o2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.yl0 yl0Var = (org.telegram.ui.Components.yl0) view;
        ArrayList arrayList = this.e.e;
        yl0Var.setAdapter(((u7) arrayList.get(i10)).f38137c);
        if (((u7) arrayList.get(i10)).f38136b != 1 && ((u7) arrayList.get(i10)).f38136b != 4) {
            view.getContext();
            yl0Var.setLayoutManager(new s4.c0());
        } else {
            view.getContext();
            yl0Var.setLayoutManager(new s4.s(3));
        }
        yl0Var.setTag(Integer.valueOf(((u7) arrayList.get(i10)).f38136b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(this.f33835b, null);
        li.l lVar = this.f33836c;
        if (lVar != null) {
            lVar.b(yl0Var);
        }
        s4.j jVar = (s4.j) yl0Var.getItemAnimator();
        jVar.C = false;
        jVar.f43040m = false;
        yl0Var.setClipToPadding(false);
        if (i10 != 1 && i10 != 4 && lVar != null) {
            yl0Var.setSections(false);
        }
        yl0Var.setCaptureSectionsDecoratorAllowed(true);
        v7 v7Var = this.e;
        if (i10 == 1) {
            yl0Var.setPadding(AndroidUtilities.dp(2.0f), v7Var.f38469s, 0, v7Var.v);
        } else {
            yl0Var.setPadding(0, v7Var.f38469s, 0, v7Var.v);
        }
        yl0Var.setOnItemClickListener(new f7(this, yl0Var));
        yl0Var.setOnItemLongClickListener(new d7(this, yl0Var, this.d, 0));
        return yl0Var;
    }

    @Override
    public final int e() {
        return this.e.e.size();
    }

    @Override
    public final int f(int i10) {
        return ((u7) this.e.e.get(i10)).f38136b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((u7) this.e.e.get(i10)).f38135a;
    }

    @Override
    public final int h(int i10) {
        return ((u7) this.e.e.get(i10)).f38136b;
    }
}
