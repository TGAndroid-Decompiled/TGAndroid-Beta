package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class e7 extends org.telegram.ui.Components.q81 {
    public org.telegram.ui.ActionBar.n1 f33262a;
    public final Context f33263b;
    public final li.i f33264c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final t7 e;

    public e7(t7 t7Var, Context context, li.i iVar, org.telegram.ui.ActionBar.n2 n2Var) {
        this.e = t7Var;
        this.f33263b = context;
        this.f33264c = iVar;
        this.d = n2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.yl0 yl0Var = (org.telegram.ui.Components.yl0) view;
        ArrayList arrayList = this.e.e;
        yl0Var.setAdapter(((s7) arrayList.get(i10)).f37340c);
        if (((s7) arrayList.get(i10)).f37339b != 1 && ((s7) arrayList.get(i10)).f37339b != 4) {
            view.getContext();
            yl0Var.setLayoutManager(new s4.c0());
        } else {
            view.getContext();
            yl0Var.setLayoutManager(new s4.s(3));
        }
        yl0Var.setTag(Integer.valueOf(((s7) arrayList.get(i10)).f37339b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(this.f33263b, null);
        li.i iVar = this.f33264c;
        if (iVar != null) {
            iVar.a(yl0Var);
        }
        s4.j jVar = (s4.j) yl0Var.getItemAnimator();
        jVar.C = false;
        jVar.f43030m = false;
        yl0Var.setClipToPadding(false);
        if (i10 != 1 && i10 != 4 && iVar != null) {
            yl0Var.setSections(false);
        }
        yl0Var.setCaptureSectionsDecoratorAllowed(true);
        t7 t7Var = this.e;
        if (i10 == 1) {
            yl0Var.setPadding(AndroidUtilities.dp(2.0f), t7Var.f37675s, 0, t7Var.v);
        } else {
            yl0Var.setPadding(0, t7Var.f37675s, 0, t7Var.v);
        }
        yl0Var.setOnItemClickListener(new d7(this, yl0Var));
        yl0Var.setOnItemLongClickListener(new b7(this, yl0Var, this.d, 0));
        return yl0Var;
    }

    @Override
    public final int e() {
        return this.e.e.size();
    }

    @Override
    public final int f(int i10) {
        return ((s7) this.e.e.get(i10)).f37339b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((s7) this.e.e.get(i10)).f37338a;
    }

    @Override
    public final int h(int i10) {
        return ((s7) this.e.e.get(i10)).f37339b;
    }
}
