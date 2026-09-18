package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class gr0 extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 f34035a;
    public FrameLayout f34036b;
    public org.telegram.ui.ActionBar.k f34037c;
    public org.telegram.ui.Components.ml0 d;
    public int e;
    public final ir0 f34038f;

    public gr0(ir0 ir0Var, Context context) {
        super(context);
        this.f34038f = ir0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        gr0 gr0Var;
        super.setTranslationX(f7);
        ir0 ir0Var = this.f34038f;
        gr0[] gr0VarArr = ir0Var.f34666n;
        if (ir0Var.f34668s && (gr0Var = gr0VarArr[0]) == this) {
            ir0Var.h.j(Math.abs(gr0Var.getTranslationX()) / gr0VarArr[0].getMeasuredWidth(), gr0VarArr[1].e);
        }
    }
}
