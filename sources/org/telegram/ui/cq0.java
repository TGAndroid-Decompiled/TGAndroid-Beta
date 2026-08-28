package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class cq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 f37288a;
    public FrameLayout f37289b;
    public org.telegram.ui.ActionBar.k f37290c;
    public org.telegram.ui.Components.wk0 d;
    public int f37291e;
    public final eq0 f37292f;

    public cq0(eq0 eq0Var, Context context) {
        super(context);
        this.f37292f = eq0Var;
    }

    @Override
    public final void setTranslationX(float f10) {
        cq0 cq0Var;
        super.setTranslationX(f10);
        eq0 eq0Var = this.f37292f;
        cq0[] cq0VarArr = eq0Var.f38013n;
        if (eq0Var.f38015s && (cq0Var = cq0VarArr[0]) == this) {
            eq0Var.h.j(Math.abs(cq0Var.getTranslationX()) / cq0VarArr[0].getMeasuredWidth(), cq0VarArr[1].f37291e);
        }
    }
}
