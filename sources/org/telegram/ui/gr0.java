package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class gr0 extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 f38126a;
    public FrameLayout f38127b;
    public org.telegram.ui.ActionBar.k f38128c;
    public org.telegram.ui.Components.wm0 d;
    public int f38129e;
    public final ir0 f38130f;

    public gr0(ir0 ir0Var, Context context) {
        super(context);
        this.f38130f = ir0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        gr0 gr0Var;
        super.setTranslationX(f7);
        ir0 ir0Var = this.f38130f;
        gr0[] gr0VarArr = ir0Var.f38981n;
        if (ir0Var.f38983s && (gr0Var = gr0VarArr[0]) == this) {
            ir0Var.h.j(Math.abs(gr0Var.getTranslationX()) / gr0VarArr[0].getMeasuredWidth(), gr0VarArr[1].f38129e);
        }
    }
}
