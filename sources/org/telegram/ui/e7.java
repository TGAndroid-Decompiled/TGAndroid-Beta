package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class e7 extends org.telegram.ui.Components.o81 {
    public org.telegram.ui.ActionBar.n1 f33187a;
    public final Context f33188b;
    public final li.i f33189c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final t7 e;

    public e7(t7 t7Var, Context context, li.i iVar, org.telegram.ui.ActionBar.n2 n2Var) {
        this.e = t7Var;
        this.f33188b = context;
        this.f33189c = iVar;
        this.d = n2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) view;
        ArrayList arrayList = this.e.e;
        wl0Var.setAdapter(((s7) arrayList.get(i10)).f37209c);
        if (((s7) arrayList.get(i10)).f37208b != 1 && ((s7) arrayList.get(i10)).f37208b != 4) {
            view.getContext();
            wl0Var.setLayoutManager(new s4.c0());
        } else {
            view.getContext();
            wl0Var.setLayoutManager(new s4.s(3));
        }
        wl0Var.setTag(Integer.valueOf(((s7) arrayList.get(i10)).f37208b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(this.f33188b, null);
        li.i iVar = this.f33189c;
        if (iVar != null) {
            iVar.a(wl0Var);
        }
        s4.j jVar = (s4.j) wl0Var.getItemAnimator();
        jVar.C = false;
        jVar.f42964m = false;
        wl0Var.setClipToPadding(false);
        if (i10 != 1 && i10 != 4 && iVar != null) {
            wl0Var.setSections(false);
        }
        wl0Var.setCaptureSectionsDecoratorAllowed(true);
        t7 t7Var = this.e;
        if (i10 == 1) {
            wl0Var.setPadding(AndroidUtilities.dp(2.0f), t7Var.f37592s, 0, t7Var.v);
        } else {
            wl0Var.setPadding(0, t7Var.f37592s, 0, t7Var.v);
        }
        wl0Var.setOnItemClickListener(new d7(this, wl0Var));
        wl0Var.setOnItemLongClickListener(new b7(this, wl0Var, this.d, 0));
        return wl0Var;
    }

    @Override
    public final int e() {
        return this.e.e.size();
    }

    @Override
    public final int f(int i10) {
        return ((s7) this.e.e.get(i10)).f37208b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((s7) this.e.e.get(i10)).f37207a;
    }

    @Override
    public final int h(int i10) {
        return ((s7) this.e.e.get(i10)).f37208b;
    }
}
