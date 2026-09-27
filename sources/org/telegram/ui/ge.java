package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ge extends FrameLayout {
    public final org.telegram.ui.Components.t61 f33908a;
    public final org.telegram.ui.ActionBar.e6 f33909b;
    public final int f33910c;
    public final int d;
    public final ai.o8 e;
    public final ie f33911f;

    public ge(ie ieVar, Context context, int i10, int i11, int i12, ai.o8 o8Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f33911f = ieVar;
        this.d = i10;
        this.f33910c = i11;
        this.f33909b = e6Var;
        this.e = o8Var;
        org.telegram.ui.Components.t61 t61Var = new org.telegram.ui.Components.t61(context, i11, i12, true, new d5(this, 3), new a1(this, 15), null, e6Var);
        this.f33908a = t61Var;
        addView(t61Var, w7.y5.c(-1.0f, -1));
        t61Var.setOnScrollListener(new ii.n3(1, this, o8Var));
        li.l lVar = ieVar.v.f35647g1;
        if (lVar != null) {
            lVar.b(t61Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33908a.Y2.N(false);
    }
}
