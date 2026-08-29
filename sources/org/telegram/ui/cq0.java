package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class cq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 f37193a;
    public FrameLayout f37194b;
    public org.telegram.ui.ActionBar.l f37195c;
    public org.telegram.ui.Components.jl0 d;
    public int f37196e;
    public final eq0 f37197f;

    public cq0(eq0 eq0Var, Context context) {
        super(context);
        this.f37197f = eq0Var;
    }

    @Override
    public final void setTranslationX(float f9) {
        cq0 cq0Var;
        super.setTranslationX(f9);
        eq0 eq0Var = this.f37197f;
        cq0[] cq0VarArr = eq0Var.f37891n;
        if (eq0Var.f37893s && (cq0Var = cq0VarArr[0]) == this) {
            eq0Var.h.j(Math.abs(cq0Var.getTranslationX()) / cq0VarArr[0].getMeasuredWidth(), cq0VarArr[1].f37196e);
        }
    }
}
