package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class gr0 extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 f38122a;
    public FrameLayout f38123b;
    public org.telegram.ui.ActionBar.k f38124c;
    public org.telegram.ui.Components.wm0 d;
    public int f38125e;
    public final ir0 f38126f;

    public gr0(ir0 ir0Var, Context context) {
        super(context);
        this.f38126f = ir0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        gr0 gr0Var;
        super.setTranslationX(f7);
        ir0 ir0Var = this.f38126f;
        gr0[] gr0VarArr = ir0Var.f38979n;
        if (ir0Var.f38981s && (gr0Var = gr0VarArr[0]) == this) {
            ir0Var.h.j(Math.abs(gr0Var.getTranslationX()) / gr0VarArr[0].getMeasuredWidth(), gr0VarArr[1].f38125e);
        }
    }
}
