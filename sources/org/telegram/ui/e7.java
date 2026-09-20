package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class e7 extends org.telegram.ui.Components.o81 {
    public org.telegram.ui.ActionBar.n1 f33242a;
    public final Context f33243b;
    public final li.i f33244c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final t7 e;

    public e7(t7 t7Var, Context context, li.i iVar, org.telegram.ui.ActionBar.n2 n2Var) {
        this.e = t7Var;
        this.f33243b = context;
        this.f33244c = iVar;
        this.d = n2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.vl0 vl0Var = (org.telegram.ui.Components.vl0) view;
        ArrayList arrayList = this.e.e;
        vl0Var.setAdapter(((s7) arrayList.get(i10)).f37318c);
        if (((s7) arrayList.get(i10)).f37317b != 1 && ((s7) arrayList.get(i10)).f37317b != 4) {
            view.getContext();
            vl0Var.setLayoutManager(new s4.c0());
        } else {
            view.getContext();
            vl0Var.setLayoutManager(new s4.s(3));
        }
        vl0Var.setTag(Integer.valueOf(((s7) arrayList.get(i10)).f37317b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(this.f33243b, null);
        li.i iVar = this.f33244c;
        if (iVar != null) {
            iVar.a(vl0Var);
        }
        s4.j jVar = (s4.j) vl0Var.getItemAnimator();
        jVar.C = false;
        jVar.f43009m = false;
        vl0Var.setClipToPadding(false);
        if (i10 != 1 && i10 != 4 && iVar != null) {
            vl0Var.setSections(false);
        }
        vl0Var.setCaptureSectionsDecoratorAllowed(true);
        t7 t7Var = this.e;
        if (i10 == 1) {
            vl0Var.setPadding(AndroidUtilities.dp(2.0f), t7Var.f37651s, 0, t7Var.v);
        } else {
            vl0Var.setPadding(0, t7Var.f37651s, 0, t7Var.v);
        }
        vl0Var.setOnItemClickListener(new d7(this, vl0Var));
        vl0Var.setOnItemLongClickListener(new b7(this, vl0Var, this.d, 0));
        return vl0Var;
    }

    @Override
    public final int e() {
        return this.e.e.size();
    }

    @Override
    public final int f(int i10) {
        return ((s7) this.e.e.get(i10)).f37317b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((s7) this.e.e.get(i10)).f37316a;
    }

    @Override
    public final int h(int i10) {
        return ((s7) this.e.e.get(i10)).f37317b;
    }
}
